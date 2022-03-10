package com.nick80835.chocotools.items.misc;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

import static com.nick80835.chocotools.ChocoToolsEntry.SUGAR_HIGH;

public class CosmicBrownieItem extends Item {
    public CosmicBrownieItem() {
        super(
                new FabricItemSettings()
                        .group(ItemGroup.MATERIALS)
                        .food((new FoodComponent.Builder())
                                .hunger(10)
                                .saturationModifier(0.8F)
                                .statusEffect(new StatusEffectInstance(SUGAR_HIGH, 3200, 1), 1.0F)
                                .alwaysEdible()
                                .build())
        );
    }
}
