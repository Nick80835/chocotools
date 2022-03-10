package com.nick80835.chocotools;

import com.nick80835.chocotools.items.*;
import com.nick80835.chocotools.statuseffects.SugarHighEffect;
import net.fabricmc.api.ModInitializer;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.item.Item;
import net.minecraft.item.ToolItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ChocoToolsEntry implements ModInitializer {
	// status effects
	public static final StatusEffect SUGAR_HIGH = new SugarHighEffect();

	// tools
	public static final ToolItem CHOCOLATE_AXE = new ChocolateAxeItem();
	public static final ToolItem CHOCOLATE_HOE = new ChocolateHoeItem();
	public static final ToolItem CHOCOLATE_PICKAXE = new ChocolatePickaxeItem();
	public static final ToolItem CHOCOLATE_SHOVEL = new ChocolateShovelItem();
	public static final ToolItem CHOCOLATE_SWORD = new ChocolateSwordItem();

	// crafting materials
	public static final Item CHOCOLATE_GLOB = new ChocolateGlobItem();
	public static final Item ROASTED_COCOA_BEANS = new RoastedCocoaBeansItem();

	@Override
	public void onInitialize() {
		// status effects
		Registry.register(Registry.STATUS_EFFECT, new Identifier("chocotools", "sugar_high"), SUGAR_HIGH);

		// tools
		Registry.register(Registry.ITEM, new Identifier("chocotools", "chocolate_axe"), CHOCOLATE_AXE);
		Registry.register(Registry.ITEM, new Identifier("chocotools", "chocolate_hoe"), CHOCOLATE_HOE);
		Registry.register(Registry.ITEM, new Identifier("chocotools", "chocolate_pickaxe"), CHOCOLATE_PICKAXE);
		Registry.register(Registry.ITEM, new Identifier("chocotools", "chocolate_shovel"), CHOCOLATE_SHOVEL);
		Registry.register(Registry.ITEM, new Identifier("chocotools", "chocolate_sword"), CHOCOLATE_SWORD);

		// crafting materials
		Registry.register(Registry.ITEM, new Identifier("chocotools", "chocolate_glob"), CHOCOLATE_GLOB);
		Registry.register(Registry.ITEM, new Identifier("chocotools", "roasted_cocoa_beans"), ROASTED_COCOA_BEANS);
	}
}
