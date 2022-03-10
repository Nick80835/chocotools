package com.nick80835.chocotools.items.cosmic_tools;

import com.nick80835.chocotools.materials.CosmicToolMaterial;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ShovelItem;

import static com.nick80835.chocotools.ChocoToolsEntry.SUGAR_HIGH;

public class CosmicShovelItem extends ShovelItem {
    public CosmicShovelItem() {
        super(
                new CosmicToolMaterial(),
                2,
                -3.0f,
                new FabricItemSettings()
                        .group(ItemGroup.TOOLS)
                        .food((new FoodComponent.Builder())
                                .hunger(10)
                                .saturationModifier(0.8F)
                                .statusEffect(new StatusEffectInstance(SUGAR_HIGH, 3200, 1), 1.0F)
                                .alwaysEdible()
                                .build())
        );
    }
}
