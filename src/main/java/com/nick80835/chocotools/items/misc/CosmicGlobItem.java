package com.nick80835.chocotools.items.misc;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

import static com.nick80835.chocotools.ChocoToolsEntry.SUGAR_HIGH;

public class CosmicGlobItem extends Item {
    public CosmicGlobItem() {
        super(
                new FabricItemSettings()
                        .group(ItemGroup.MATERIALS)
                        .food((new FoodComponent.Builder())
                                .hunger(8)
                                .saturationModifier(0.6F)
                                .statusEffect(new StatusEffectInstance(SUGAR_HIGH, 2400, 1), 1.0F)
                                .alwaysEdible()
                                .build())
        );
    }
}
