package com.nick80835.chocotools;

import com.nick80835.chocotools.items.chocolate_tools.*;
import com.nick80835.chocotools.items.cosmic_tools.*;
import com.nick80835.chocotools.items.misc.ChocolateGlobItem;
import com.nick80835.chocotools.items.misc.CosmicBrownieItem;
import com.nick80835.chocotools.items.misc.CosmicGlobItem;
import com.nick80835.chocotools.items.misc.RoastedCocoaBeansItem;
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

	// chocolate tools
	public static final ToolItem CHOCOLATE_AXE = new ChocolateAxeItem();
	public static final ToolItem CHOCOLATE_HOE = new ChocolateHoeItem();
	public static final ToolItem CHOCOLATE_PICKAXE = new ChocolatePickaxeItem();
	public static final ToolItem CHOCOLATE_SHOVEL = new ChocolateShovelItem();
	public static final ToolItem CHOCOLATE_SWORD = new ChocolateSwordItem();

	// cosmic tools
	public static final ToolItem COSMIC_AXE = new CosmicAxeItem();
	public static final ToolItem COSMIC_HOE = new CosmicHoeItem();
	public static final ToolItem COSMIC_PICKAXE = new CosmicPickaxeItem();
	public static final ToolItem COSMIC_SHOVEL = new CosmicShovelItem();
	public static final ToolItem COSMIC_SWORD = new CosmicSwordItem();

	// crafting materials
	public static final Item CHOCOLATE_GLOB = new ChocolateGlobItem();
	public static final Item COSMIC_BROWNIE = new CosmicBrownieItem();
	public static final Item COSMIC_GLOB = new CosmicGlobItem();
	public static final Item ROASTED_COCOA_BEANS = new RoastedCocoaBeansItem();

	@Override
	public void onInitialize() {
		// status effects
		Registry.register(Registry.STATUS_EFFECT, new Identifier("chocotools", "sugar_high"), SUGAR_HIGH);

		// chocolate tools
		Registry.register(Registry.ITEM, new Identifier("chocotools", "chocolate_axe"), CHOCOLATE_AXE);
		Registry.register(Registry.ITEM, new Identifier("chocotools", "chocolate_hoe"), CHOCOLATE_HOE);
		Registry.register(Registry.ITEM, new Identifier("chocotools", "chocolate_pickaxe"), CHOCOLATE_PICKAXE);
		Registry.register(Registry.ITEM, new Identifier("chocotools", "chocolate_shovel"), CHOCOLATE_SHOVEL);
		Registry.register(Registry.ITEM, new Identifier("chocotools", "chocolate_sword"), CHOCOLATE_SWORD);

		// cosmic tools
		Registry.register(Registry.ITEM, new Identifier("chocotools", "cosmic_axe"), COSMIC_AXE);
		Registry.register(Registry.ITEM, new Identifier("chocotools", "cosmic_hoe"), COSMIC_HOE);
		Registry.register(Registry.ITEM, new Identifier("chocotools", "cosmic_pickaxe"), COSMIC_PICKAXE);
		Registry.register(Registry.ITEM, new Identifier("chocotools", "cosmic_shovel"), COSMIC_SHOVEL);
		Registry.register(Registry.ITEM, new Identifier("chocotools", "cosmic_sword"), COSMIC_SWORD);

		// misc
		Registry.register(Registry.ITEM, new Identifier("chocotools", "chocolate_glob"), CHOCOLATE_GLOB);
		Registry.register(Registry.ITEM, new Identifier("chocotools", "cosmic_brownie"), COSMIC_BROWNIE);
		Registry.register(Registry.ITEM, new Identifier("chocotools", "cosmic_glob"), COSMIC_GLOB);
		Registry.register(Registry.ITEM, new Identifier("chocotools", "roasted_cocoa_beans"), ROASTED_COCOA_BEANS);
	}
}
