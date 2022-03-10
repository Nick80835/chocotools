package com.nick80835.chocotools.items.chocolate_tools;

import com.nick80835.chocotools.materials.ChocolateToolMaterial;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.AxeItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import static com.nick80835.chocotools.ChocoToolsEntry.SUGAR_HIGH;

public class ChocolateAxeItem extends AxeItem {
    public ChocolateAxeItem() {
        super(
                new ChocolateToolMaterial(),
                7,
                -3f,
                new FabricItemSettings()
                        .group(ItemGroup.TOOLS)
                        .food((new FoodComponent.Builder())
                                .hunger(6)
                                .saturationModifier(0.4F)
                                .statusEffect(new StatusEffectInstance(SUGAR_HIGH, 1200, 0), 1.0F)
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
