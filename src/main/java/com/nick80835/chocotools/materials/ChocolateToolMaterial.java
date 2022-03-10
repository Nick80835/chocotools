package com.nick80835.chocotools.materials;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

import static com.nick80835.chocotools.ChocoToolsEntry.CHOCOLATE_GLOB;

public class ChocolateToolMaterial implements ToolMaterial {
    @Override
    public int getDurability() {
        return 220;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 4f;
    }

    @Override
    public float getAttackDamage() {
        return 1f;
    }

    @Override
    public int getMiningLevel() {
        return 2;
    }

    @Override
    public int getEnchantability() {
        return 18;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(CHOCOLATE_GLOB);
    }
}
