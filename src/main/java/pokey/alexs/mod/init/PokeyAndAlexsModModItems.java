
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package pokey.alexs.mod.init;

import pokey.alexs.mod.item.Wood_log_armorArmorItem;
import pokey.alexs.mod.item.TungstenswordItem;
import pokey.alexs.mod.item.TungstenshovelItem;
import pokey.alexs.mod.item.TungstenpickaxeItem;
import pokey.alexs.mod.item.TungsteningotItem;
import pokey.alexs.mod.item.TungstenhoeItem;
import pokey.alexs.mod.item.TungstenaxeItem;
import pokey.alexs.mod.item.Tungsten_armorArmorItem;
import pokey.alexs.mod.item.TestItem;
import pokey.alexs.mod.item.SaltItem;
import pokey.alexs.mod.item.RicebowlfoodItem;
import pokey.alexs.mod.item.RiceItem;
import pokey.alexs.mod.item.ReinforcedtungsteningotItem;
import pokey.alexs.mod.item.ReinforcedtungstenArmorItem;
import pokey.alexs.mod.item.Raw_potato_armorArmorItem;
import pokey.alexs.mod.item.LuminisonmnuggetrawItem;
import pokey.alexs.mod.item.LuminisomSwordItem;
import pokey.alexs.mod.item.LuminisomShovelItem;
import pokey.alexs.mod.item.LuminisomPickaxeItem;
import pokey.alexs.mod.item.LuminisomIngotItem;
import pokey.alexs.mod.item.LuminisomHoeItem;
import pokey.alexs.mod.item.LuminisomAxeItem;
import pokey.alexs.mod.item.LuminisomArmorItem;
import pokey.alexs.mod.item.LighttungstenswordItem;
import pokey.alexs.mod.item.LighttungstenpickaxeItem;
import pokey.alexs.mod.item.LighttungstenhoeItem;
import pokey.alexs.mod.item.LighttungstenaxeItem;
import pokey.alexs.mod.item.LightfluidbucketItem;
import pokey.alexs.mod.item.Light_tungsten_armorArmorItem;
import pokey.alexs.mod.item.Leafy_armorArmorItem;
import pokey.alexs.mod.item.ImprovisedcakeItem;
import pokey.alexs.mod.item.Drip_armorArmorItem;
import pokey.alexs.mod.item.CucumberItem;
import pokey.alexs.mod.item.CookedimprovisedcakeItem;
import pokey.alexs.mod.item.Cooked_potato_armor_legacyArmorItem;
import pokey.alexs.mod.item.Cobble_stone_armorArmorItem;
import pokey.alexs.mod.item.ChickenfeatheringotItem;
import pokey.alexs.mod.PokeyAndAlexsModMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

public class PokeyAndAlexsModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, PokeyAndAlexsModMod.MODID);
	public static final RegistryObject<Item> COOKEDIMPROVISEDCAKE = REGISTRY.register("cookedimprovisedcake", () -> new CookedimprovisedcakeItem());
	public static final RegistryObject<Item> IMPROVISEDCAKE = REGISTRY.register("improvisedcake", () -> new ImprovisedcakeItem());
	public static final RegistryObject<Item> LUMINISOM_INGOT = REGISTRY.register("luminisom_ingot", () -> new LuminisomIngotItem());
	public static final RegistryObject<Item> LUMINISONMNUGGETRAW = REGISTRY.register("luminisonmnuggetraw", () -> new LuminisonmnuggetrawItem());
	public static final RegistryObject<Item> RICE = REGISTRY.register("rice", () -> new RiceItem());
	public static final RegistryObject<Item> RICEBOWLFOOD = REGISTRY.register("ricebowlfood", () -> new RicebowlfoodItem());
	public static final RegistryObject<Item> TEST = REGISTRY.register("test", () -> new TestItem());
	public static final RegistryObject<Item> LIGHTFLUIDBUCKET = REGISTRY.register("lightfluidbucket", () -> new LightfluidbucketItem());
	public static final RegistryObject<Item> LUMINISOM_ARMOR_HELMET = REGISTRY.register("luminisom_armor_helmet",
			() -> new LuminisomArmorItem.Helmet());
	public static final RegistryObject<Item> LUMINISOM_ARMOR_CHESTPLATE = REGISTRY.register("luminisom_armor_chestplate",
			() -> new LuminisomArmorItem.Chestplate());
	public static final RegistryObject<Item> LUMINISOM_ARMOR_LEGGINGS = REGISTRY.register("luminisom_armor_leggings",
			() -> new LuminisomArmorItem.Leggings());
	public static final RegistryObject<Item> LUMINISOM_ARMOR_BOOTS = REGISTRY.register("luminisom_armor_boots", () -> new LuminisomArmorItem.Boots());
	public static final RegistryObject<Item> COOKED_POTATO_ARMOR_LEGACY_ARMOR_HELMET = REGISTRY.register("cooked_potato_armor_legacy_armor_helmet",
			() -> new Cooked_potato_armor_legacyArmorItem.Helmet());
	public static final RegistryObject<Item> COOKED_POTATO_ARMOR_LEGACY_ARMOR_CHESTPLATE = REGISTRY
			.register("cooked_potato_armor_legacy_armor_chestplate", () -> new Cooked_potato_armor_legacyArmorItem.Chestplate());
	public static final RegistryObject<Item> COOKED_POTATO_ARMOR_LEGACY_ARMOR_LEGGINGS = REGISTRY
			.register("cooked_potato_armor_legacy_armor_leggings", () -> new Cooked_potato_armor_legacyArmorItem.Leggings());
	public static final RegistryObject<Item> COOKED_POTATO_ARMOR_LEGACY_ARMOR_BOOTS = REGISTRY.register("cooked_potato_armor_legacy_armor_boots",
			() -> new Cooked_potato_armor_legacyArmorItem.Boots());
	public static final RegistryObject<Item> LEAFY_ARMOR_ARMOR_HELMET = REGISTRY.register("leafy_armor_armor_helmet",
			() -> new Leafy_armorArmorItem.Helmet());
	public static final RegistryObject<Item> LEAFY_ARMOR_ARMOR_CHESTPLATE = REGISTRY.register("leafy_armor_armor_chestplate",
			() -> new Leafy_armorArmorItem.Chestplate());
	public static final RegistryObject<Item> LEAFY_ARMOR_ARMOR_LEGGINGS = REGISTRY.register("leafy_armor_armor_leggings",
			() -> new Leafy_armorArmorItem.Leggings());
	public static final RegistryObject<Item> LEAFY_ARMOR_ARMOR_BOOTS = REGISTRY.register("leafy_armor_armor_boots",
			() -> new Leafy_armorArmorItem.Boots());
	public static final RegistryObject<Item> DRIP_ARMOR_ARMOR_HELMET = REGISTRY.register("drip_armor_armor_helmet",
			() -> new Drip_armorArmorItem.Helmet());
	public static final RegistryObject<Item> DRIP_ARMOR_ARMOR_CHESTPLATE = REGISTRY.register("drip_armor_armor_chestplate",
			() -> new Drip_armorArmorItem.Chestplate());
	public static final RegistryObject<Item> DRIP_ARMOR_ARMOR_LEGGINGS = REGISTRY.register("drip_armor_armor_leggings",
			() -> new Drip_armorArmorItem.Leggings());
	public static final RegistryObject<Item> DRIP_ARMOR_ARMOR_BOOTS = REGISTRY.register("drip_armor_armor_boots",
			() -> new Drip_armorArmorItem.Boots());
	public static final RegistryObject<Item> WOOD_LOG_ARMOR_ARMOR_HELMET = REGISTRY.register("wood_log_armor_armor_helmet",
			() -> new Wood_log_armorArmorItem.Helmet());
	public static final RegistryObject<Item> WOOD_LOG_ARMOR_ARMOR_CHESTPLATE = REGISTRY.register("wood_log_armor_armor_chestplate",
			() -> new Wood_log_armorArmorItem.Chestplate());
	public static final RegistryObject<Item> WOOD_LOG_ARMOR_ARMOR_LEGGINGS = REGISTRY.register("wood_log_armor_armor_leggings",
			() -> new Wood_log_armorArmorItem.Leggings());
	public static final RegistryObject<Item> WOOD_LOG_ARMOR_ARMOR_BOOTS = REGISTRY.register("wood_log_armor_armor_boots",
			() -> new Wood_log_armorArmorItem.Boots());
	public static final RegistryObject<Item> RAW_POTATO_ARMOR_ARMOR_HELMET = REGISTRY.register("raw_potato_armor_armor_helmet",
			() -> new Raw_potato_armorArmorItem.Helmet());
	public static final RegistryObject<Item> RAW_POTATO_ARMOR_ARMOR_CHESTPLATE = REGISTRY.register("raw_potato_armor_armor_chestplate",
			() -> new Raw_potato_armorArmorItem.Chestplate());
	public static final RegistryObject<Item> RAW_POTATO_ARMOR_ARMOR_LEGGINGS = REGISTRY.register("raw_potato_armor_armor_leggings",
			() -> new Raw_potato_armorArmorItem.Leggings());
	public static final RegistryObject<Item> RAW_POTATO_ARMOR_ARMOR_BOOTS = REGISTRY.register("raw_potato_armor_armor_boots",
			() -> new Raw_potato_armorArmorItem.Boots());
	public static final RegistryObject<Item> COBBLE_STONE_ARMOR_ARMOR_HELMET = REGISTRY.register("cobble_stone_armor_armor_helmet",
			() -> new Cobble_stone_armorArmorItem.Helmet());
	public static final RegistryObject<Item> COBBLE_STONE_ARMOR_ARMOR_CHESTPLATE = REGISTRY.register("cobble_stone_armor_armor_chestplate",
			() -> new Cobble_stone_armorArmorItem.Chestplate());
	public static final RegistryObject<Item> COBBLE_STONE_ARMOR_ARMOR_LEGGINGS = REGISTRY.register("cobble_stone_armor_armor_leggings",
			() -> new Cobble_stone_armorArmorItem.Leggings());
	public static final RegistryObject<Item> COBBLE_STONE_ARMOR_ARMOR_BOOTS = REGISTRY.register("cobble_stone_armor_armor_boots",
			() -> new Cobble_stone_armorArmorItem.Boots());
	public static final RegistryObject<Item> TUNGSTEN_ARMOR_ARMOR_HELMET = REGISTRY.register("tungsten_armor_armor_helmet",
			() -> new Tungsten_armorArmorItem.Helmet());
	public static final RegistryObject<Item> TUNGSTEN_ARMOR_ARMOR_CHESTPLATE = REGISTRY.register("tungsten_armor_armor_chestplate",
			() -> new Tungsten_armorArmorItem.Chestplate());
	public static final RegistryObject<Item> TUNGSTEN_ARMOR_ARMOR_LEGGINGS = REGISTRY.register("tungsten_armor_armor_leggings",
			() -> new Tungsten_armorArmorItem.Leggings());
	public static final RegistryObject<Item> TUNGSTEN_ARMOR_ARMOR_BOOTS = REGISTRY.register("tungsten_armor_armor_boots",
			() -> new Tungsten_armorArmorItem.Boots());
	public static final RegistryObject<Item> LIGHT_TUNGSTEN_ARMOR_ARMOR_HELMET = REGISTRY.register("light_tungsten_armor_armor_helmet",
			() -> new Light_tungsten_armorArmorItem.Helmet());
	public static final RegistryObject<Item> LIGHT_TUNGSTEN_ARMOR_ARMOR_CHESTPLATE = REGISTRY.register("light_tungsten_armor_armor_chestplate",
			() -> new Light_tungsten_armorArmorItem.Chestplate());
	public static final RegistryObject<Item> LIGHT_TUNGSTEN_ARMOR_ARMOR_LEGGINGS = REGISTRY.register("light_tungsten_armor_armor_leggings",
			() -> new Light_tungsten_armorArmorItem.Leggings());
	public static final RegistryObject<Item> LIGHT_TUNGSTEN_ARMOR_ARMOR_BOOTS = REGISTRY.register("light_tungsten_armor_armor_boots",
			() -> new Light_tungsten_armorArmorItem.Boots());
	public static final RegistryObject<Item> LUMINISOM_SWORD = REGISTRY.register("luminisom_sword", () -> new LuminisomSwordItem());
	public static final RegistryObject<Item> LUMINISOM_BLOCK = block(PokeyAndAlexsModModBlocks.LUMINISOM_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> LUMINISOM_ORE = block(PokeyAndAlexsModModBlocks.LUMINISOM_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> LUMINISOM_PICKAXE = REGISTRY.register("luminisom_pickaxe", () -> new LuminisomPickaxeItem());
	public static final RegistryObject<Item> LUMINISOM_AXE = REGISTRY.register("luminisom_axe", () -> new LuminisomAxeItem());
	public static final RegistryObject<Item> LUMINISOM_HOE = REGISTRY.register("luminisom_hoe", () -> new LuminisomHoeItem());
	public static final RegistryObject<Item> LUMINISOM_SHOVEL = REGISTRY.register("luminisom_shovel", () -> new LuminisomShovelItem());
	public static final RegistryObject<Item> RICEPLANT = block(PokeyAndAlexsModModBlocks.RICEPLANT, CreativeModeTab.TAB_TOOLS);
	public static final RegistryObject<Item> REINFORCEDTUNGSTENINGOT = REGISTRY.register("reinforcedtungsteningot",
			() -> new ReinforcedtungsteningotItem());
	public static final RegistryObject<Item> TUNGSTENINGOT = REGISTRY.register("tungsteningot", () -> new TungsteningotItem());
	public static final RegistryObject<Item> CHICKENFEATHERINGOT = REGISTRY.register("chickenfeatheringot", () -> new ChickenfeatheringotItem());
	public static final RegistryObject<Item> REINFORCEDTUNGSTEN_ARMOR_HELMET = REGISTRY.register("reinforcedtungsten_armor_helmet",
			() -> new ReinforcedtungstenArmorItem.Helmet());
	public static final RegistryObject<Item> REINFORCEDTUNGSTEN_ARMOR_CHESTPLATE = REGISTRY.register("reinforcedtungsten_armor_chestplate",
			() -> new ReinforcedtungstenArmorItem.Chestplate());
	public static final RegistryObject<Item> REINFORCEDTUNGSTEN_ARMOR_LEGGINGS = REGISTRY.register("reinforcedtungsten_armor_leggings",
			() -> new ReinforcedtungstenArmorItem.Leggings());
	public static final RegistryObject<Item> REINFORCEDTUNGSTEN_ARMOR_BOOTS = REGISTRY.register("reinforcedtungsten_armor_boots",
			() -> new ReinforcedtungstenArmorItem.Boots());
	public static final RegistryObject<Item> TUNGSTENORE = block(PokeyAndAlexsModModBlocks.TUNGSTENORE, PokeyAndAlexsModModTabs.TAB_P_AMOD);
	public static final RegistryObject<Item> REINFORCEDTUNGSTENORE = block(PokeyAndAlexsModModBlocks.REINFORCEDTUNGSTENORE,
			PokeyAndAlexsModModTabs.TAB_P_AMOD);
	public static final RegistryObject<Item> CUCUMBERPLANT = doubleBlock(PokeyAndAlexsModModBlocks.CUCUMBERPLANT, PokeyAndAlexsModModTabs.TAB_P_AMOD);
	public static final RegistryObject<Item> CUCUMBER = REGISTRY.register("cucumber", () -> new CucumberItem());
	public static final RegistryObject<Item> SALT = REGISTRY.register("salt", () -> new SaltItem());
	public static final RegistryObject<Item> SALTORE = block(PokeyAndAlexsModModBlocks.SALTORE, PokeyAndAlexsModModTabs.TAB_P_AMOD);
	public static final RegistryObject<Item> CHEESE = REGISTRY.register("cheese_spawn_egg",
			() -> new ForgeSpawnEggItem(PokeyAndAlexsModModEntities.CHEESE, -13369549, -13259467,
					new Item.Properties().tab(PokeyAndAlexsModModTabs.TAB_P_AMOD)));
	public static final RegistryObject<Item> TUNGSTENPICKAXE = REGISTRY.register("tungstenpickaxe", () -> new TungstenpickaxeItem());
	public static final RegistryObject<Item> THECREATOR = REGISTRY.register("thecreator_spawn_egg",
			() -> new ForgeSpawnEggItem(PokeyAndAlexsModModEntities.THECREATOR, -16711681, -13519942,
					new Item.Properties().tab(PokeyAndAlexsModModTabs.TAB_P_AMOD)));
	public static final RegistryObject<Item> TUNGSTENAXE = REGISTRY.register("tungstenaxe", () -> new TungstenaxeItem());
	public static final RegistryObject<Item> TUNGSTENSWORD = REGISTRY.register("tungstensword", () -> new TungstenswordItem());
	public static final RegistryObject<Item> TUNGSTENSHOVEL = REGISTRY.register("tungstenshovel", () -> new TungstenshovelItem());
	public static final RegistryObject<Item> TUNGSTENHOE = REGISTRY.register("tungstenhoe", () -> new TungstenhoeItem());
	public static final RegistryObject<Item> LIGHTTUNGSTENPICKAXE = REGISTRY.register("lighttungstenpickaxe", () -> new LighttungstenpickaxeItem());
	public static final RegistryObject<Item> LIGHTTUNGSTENAXE = REGISTRY.register("lighttungstenaxe", () -> new LighttungstenaxeItem());
	public static final RegistryObject<Item> LIGHTTUNGSTENSWORD = REGISTRY.register("lighttungstensword", () -> new LighttungstenswordItem());
	public static final RegistryObject<Item> LIGHTTUNGSTENHOE = REGISTRY.register("lighttungstenhoe", () -> new LighttungstenhoeItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
