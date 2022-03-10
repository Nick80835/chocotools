package com.nick80835.chocotools.materials;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

import static com.nick80835.chocotools.ChocoToolsEntry.COSMIC_BROWNIE;

public class CosmicToolMaterial implements ToolMaterial {
    @Override
    public int getDurability() {
        return 456;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 5f;
    }

    @Override
    public float getAttackDamage() {
        return 1f;
    }

    @Override
    public int getMiningLevel() {
        return 4;
    }

    @Override
    public int getEnchantability() {
        return 20;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(COSMIC_BROWNIE);
    }
}
