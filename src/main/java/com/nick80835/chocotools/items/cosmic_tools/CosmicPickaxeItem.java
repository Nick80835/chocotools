package com.nick80835.chocotools.items.cosmic_tools;

import com.nick80835.chocotools.materials.CosmicToolMaterial;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import net.minecraft.world.World;

import static com.nick80835.chocotools.ChocoToolsEntry.SUGAR_HIGH;

public class CosmicPickaxeItem extends PickaxeItem {
    public CosmicPickaxeItem() {
        super(
                new CosmicToolMaterial(),
                1,
                -2.5f,
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

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        ItemStack consumedStack = user.eatFood(world, stack.copy());
        stack.setDamage(stack.getDamage() + stack.getMaxDamage() / 3);
        return stack.getDamage() >= stack.getMaxDamage() ? consumedStack : stack;
    }
}
