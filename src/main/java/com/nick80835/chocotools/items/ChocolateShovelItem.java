package com.nick80835.chocotools.items;

import com.nick80835.chocotools.materials.ChocolateToolMaterial;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ShovelItem;

import static com.nick80835.chocotools.ChocoToolsEntry.SUGAR_HIGH;

public class ChocolateShovelItem extends ShovelItem {
    public ChocolateShovelItem() {
        super(
                new ChocolateToolMaterial(),
                2,
                -3.0f,
                new FabricItemSettings()
                        .group(ItemGroup.TOOLS)
                        .food((new FoodComponent.Builder())
                                .hunger(9)
                                .saturationModifier(0.6F)
                                .statusEffect(new StatusEffectInstance(SUGAR_HIGH, 1200, 0), 1.0F)
                                .alwaysEdible()
                                .build()
                        )
        );
    }
}
