package com.nick80835.chocotools.statuseffects;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.AttributeContainer;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.player.PlayerEntity;

import java.util.UUID;

public class SugarHighEffect extends StatusEffect {
    public SugarHighEffect() {
        super(StatusEffectCategory.BENEFICIAL, 0xf78a65);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }

    @Override
    public void onApplied(LivingEntity entity, AttributeContainer attributes, int amplifier) {
        if (entity instanceof PlayerEntity) {
            EntityAttributeModifier thisModifier = new EntityAttributeModifier(
                    UUID.fromString("91aa5d61-cb51-42d9-b629-b6c5c80fcde3"),
                    "sugar_high_modifier",
                    0.04f * (amplifier + 1),
                    EntityAttributeModifier.Operation.ADDITION);

            entity.getAttributeInstance(EntityAttributes.GENERIC_MOVEMENT_SPEED).addPersistentModifier(thisModifier);
            entity.getAttributeInstance(EntityAttributes.GENERIC_ATTACK_SPEED).addPersistentModifier(thisModifier);
        }
    }

    @Override
    public void onRemoved(LivingEntity entity, AttributeContainer attributes, int amplifier) {
        super.onRemoved(entity, attributes, amplifier);
        entity.getAttributeInstance(EntityAttributes.GENERIC_MOVEMENT_SPEED).removeModifier(UUID.fromString("91aa5d61-cb51-42d9-b629-b6c5c80fcde3"));
        entity.getAttributeInstance(EntityAttributes.GENERIC_ATTACK_SPEED).removeModifier(UUID.fromString("91aa5d61-cb51-42d9-b629-b6c5c80fcde3"));
    }
}
