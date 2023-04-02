
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package pokey.alex.mod.init;

import pokey.alex.mod.item.WoodlogarmorItem;
import pokey.alex.mod.item.TungstenswordItem;
import pokey.alex.mod.item.TungstenshovelItem;
import pokey.alex.mod.item.TungstenpickaxeItem;
import pokey.alex.mod.item.TungsteningotItem;
import pokey.alex.mod.item.TungstenhoeItem;
import pokey.alex.mod.item.TungstenaxeItem;
import pokey.alex.mod.item.TungstenarmorItem;
import pokey.alex.mod.item.TheOhHellosSoldierpoetkingItem;
import pokey.alex.mod.item.TestItem;
import pokey.alex.mod.item.TLTitsrainingmenremixItem;
import pokey.alex.mod.item.SaltItem;
import pokey.alex.mod.item.SXCREDMANEAotKBphonkItem;
import pokey.alex.mod.item.RichaadEBDevilTriggerItem;
import pokey.alex.mod.item.RicebowlfoodItem;
import pokey.alex.mod.item.RiceItem;
import pokey.alex.mod.item.ReinforcedtungsteningotItem;
import pokey.alex.mod.item.ReinforcedtungstenArmorItem;
import pokey.alex.mod.item.RawpotatoarmorItem;
import pokey.alex.mod.item.PabattonstickItem;
import pokey.alex.mod.item.OnenolyandSXMPRAStepbackItem;
import pokey.alex.mod.item.LuminisonmnuggetrawItem;
import pokey.alex.mod.item.LuminisomSwordItem;
import pokey.alex.mod.item.LuminisomShovelItem;
import pokey.alex.mod.item.LuminisomPickaxeItem;
import pokey.alex.mod.item.LuminisomIngotItem;
import pokey.alex.mod.item.LuminisomHoeItem;
import pokey.alex.mod.item.LuminisomAxeItem;
import pokey.alex.mod.item.LuminisomArmorItem;
import pokey.alex.mod.item.LighttungstenswordItem;
import pokey.alex.mod.item.LighttungstenpickaxeItem;
import pokey.alex.mod.item.LighttungstenhoeItem;
import pokey.alex.mod.item.LighttungstenaxeItem;
import pokey.alex.mod.item.LighttungstenarmorItem;
import pokey.alex.mod.item.LightfluidbucketItem;
import pokey.alex.mod.item.LeafyarmorItem;
import pokey.alex.mod.item.ImprovisedcakeItem;
import pokey.alex.mod.item.DrowningpoolbodiesItem;
import pokey.alex.mod.item.DripstonearmorItem;
import pokey.alex.mod.item.CucumberItem;
import pokey.alex.mod.item.CookedpotatoarmorItem;
import pokey.alex.mod.item.CookedimprovisedcakeItem;
import pokey.alex.mod.item.CobblestonearmorItem;
import pokey.alex.mod.item.ChickenfeatheringotItem;
import pokey.alex.mod.item.CheeseunpesturisedItem;
import pokey.alex.mod.item.CheeseitemItem;
import pokey.alex.mod.PokeyAlexModMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

public class PokeyAlexModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, PokeyAlexModMod.MODID);
	public static final RegistryObject<Item> COOKEDIMPROVISEDCAKE = REGISTRY.register("cookedimprovisedcake", () -> new CookedimprovisedcakeItem());
	public static final RegistryObject<Item> IMPROVISEDCAKE = REGISTRY.register("improvisedcake", () -> new ImprovisedcakeItem());
	public static final RegistryObject<Item> LUMINISOM_INGOT = REGISTRY.register("luminisom_ingot", () -> new LuminisomIngotItem());
	public static final RegistryObject<Item> LUMINISONMNUGGETRAW = REGISTRY.register("luminisonmnuggetraw", () -> new LuminisonmnuggetrawItem());
	public static final RegistryObject<Item> RICE = REGISTRY.register("rice", () -> new RiceItem());
	public static final RegistryObject<Item> RICEBOWLFOOD = REGISTRY.register("ricebowlfood", () -> new RicebowlfoodItem());
	public static final RegistryObject<Item> TEST = REGISTRY.register("test", () -> new TestItem());
	public static final RegistryObject<Item> LIGHTFLUIDBUCKET = REGISTRY.register("lightfluidbucket", () -> new LightfluidbucketItem());
	public static final RegistryObject<Item> CUCUMBER = REGISTRY.register("cucumber", () -> new CucumberItem());
	public static final RegistryObject<Item> SALT = REGISTRY.register("salt", () -> new SaltItem());
	public static final RegistryObject<Item> LUMINISOM_ARMOR_HELMET = REGISTRY.register("luminisom_armor_helmet",
			() -> new LuminisomArmorItem.Helmet());
	public static final RegistryObject<Item> LUMINISOM_ARMOR_CHESTPLATE = REGISTRY.register("luminisom_armor_chestplate",
			() -> new LuminisomArmorItem.Chestplate());
	public static final RegistryObject<Item> LUMINISOM_ARMOR_LEGGINGS = REGISTRY.register("luminisom_armor_leggings",
			() -> new LuminisomArmorItem.Leggings());
	public static final RegistryObject<Item> LUMINISOM_ARMOR_BOOTS = REGISTRY.register("luminisom_armor_boots", () -> new LuminisomArmorItem.Boots());
	public static final RegistryObject<Item> LIGHTTUNGSTENARMOR_HELMET = REGISTRY.register("lighttungstenarmor_helmet",
			() -> new LighttungstenarmorItem.Helmet());
	public static final RegistryObject<Item> LIGHTTUNGSTENARMOR_CHESTPLATE = REGISTRY.register("lighttungstenarmor_chestplate",
			() -> new LighttungstenarmorItem.Chestplate());
	public static final RegistryObject<Item> LIGHTTUNGSTENARMOR_LEGGINGS = REGISTRY.register("lighttungstenarmor_leggings",
			() -> new LighttungstenarmorItem.Leggings());
	public static final RegistryObject<Item> LIGHTTUNGSTENARMOR_BOOTS = REGISTRY.register("lighttungstenarmor_boots",
			() -> new LighttungstenarmorItem.Boots());
	public static final RegistryObject<Item> COBBLESTONEARMOR_HELMET = REGISTRY.register("cobblestonearmor_helmet",
			() -> new CobblestonearmorItem.Helmet());
	public static final RegistryObject<Item> COBBLESTONEARMOR_CHESTPLATE = REGISTRY.register("cobblestonearmor_chestplate",
			() -> new CobblestonearmorItem.Chestplate());
	public static final RegistryObject<Item> COBBLESTONEARMOR_LEGGINGS = REGISTRY.register("cobblestonearmor_leggings",
			() -> new CobblestonearmorItem.Leggings());
	public static final RegistryObject<Item> COBBLESTONEARMOR_BOOTS = REGISTRY.register("cobblestonearmor_boots",
			() -> new CobblestonearmorItem.Boots());
	public static final RegistryObject<Item> DRIPSTONEARMOR_HELMET = REGISTRY.register("dripstonearmor_helmet",
			() -> new DripstonearmorItem.Helmet());
	public static final RegistryObject<Item> DRIPSTONEARMOR_CHESTPLATE = REGISTRY.register("dripstonearmor_chestplate",
			() -> new DripstonearmorItem.Chestplate());
	public static final RegistryObject<Item> DRIPSTONEARMOR_LEGGINGS = REGISTRY.register("dripstonearmor_leggings",
			() -> new DripstonearmorItem.Leggings());
	public static final RegistryObject<Item> DRIPSTONEARMOR_BOOTS = REGISTRY.register("dripstonearmor_boots", () -> new DripstonearmorItem.Boots());
	public static final RegistryObject<Item> TUNGSTENARMOR_HELMET = REGISTRY.register("tungstenarmor_helmet", () -> new TungstenarmorItem.Helmet());
	public static final RegistryObject<Item> TUNGSTENARMOR_CHESTPLATE = REGISTRY.register("tungstenarmor_chestplate",
			() -> new TungstenarmorItem.Chestplate());
	public static final RegistryObject<Item> TUNGSTENARMOR_LEGGINGS = REGISTRY.register("tungstenarmor_leggings",
			() -> new TungstenarmorItem.Leggings());
	public static final RegistryObject<Item> TUNGSTENARMOR_BOOTS = REGISTRY.register("tungstenarmor_boots", () -> new TungstenarmorItem.Boots());
	public static final RegistryObject<Item> REINFORCEDTUNGSTEN_ARMOR_HELMET = REGISTRY.register("reinforcedtungsten_armor_helmet",
			() -> new ReinforcedtungstenArmorItem.Helmet());
	public static final RegistryObject<Item> REINFORCEDTUNGSTEN_ARMOR_CHESTPLATE = REGISTRY.register("reinforcedtungsten_armor_chestplate",
			() -> new ReinforcedtungstenArmorItem.Chestplate());
	public static final RegistryObject<Item> REINFORCEDTUNGSTEN_ARMOR_LEGGINGS = REGISTRY.register("reinforcedtungsten_armor_leggings",
			() -> new ReinforcedtungstenArmorItem.Leggings());
	public static final RegistryObject<Item> REINFORCEDTUNGSTEN_ARMOR_BOOTS = REGISTRY.register("reinforcedtungsten_armor_boots",
			() -> new ReinforcedtungstenArmorItem.Boots());
	public static final RegistryObject<Item> LEAFYARMOR_HELMET = REGISTRY.register("leafyarmor_helmet", () -> new LeafyarmorItem.Helmet());
	public static final RegistryObject<Item> LEAFYARMOR_CHESTPLATE = REGISTRY.register("leafyarmor_chestplate",
			() -> new LeafyarmorItem.Chestplate());
	public static final RegistryObject<Item> LEAFYARMOR_LEGGINGS = REGISTRY.register("leafyarmor_leggings", () -> new LeafyarmorItem.Leggings());
	public static final RegistryObject<Item> LEAFYARMOR_BOOTS = REGISTRY.register("leafyarmor_boots", () -> new LeafyarmorItem.Boots());
	public static final RegistryObject<Item> WOODLOGARMOR_HELMET = REGISTRY.register("woodlogarmor_helmet", () -> new WoodlogarmorItem.Helmet());
	public static final RegistryObject<Item> WOODLOGARMOR_CHESTPLATE = REGISTRY.register("woodlogarmor_chestplate",
			() -> new WoodlogarmorItem.Chestplate());
	public static final RegistryObject<Item> WOODLOGARMOR_LEGGINGS = REGISTRY.register("woodlogarmor_leggings",
			() -> new WoodlogarmorItem.Leggings());
	public static final RegistryObject<Item> WOODLOGARMOR_BOOTS = REGISTRY.register("woodlogarmor_boots", () -> new WoodlogarmorItem.Boots());
	public static final RegistryObject<Item> COOKEDPOTATOARMOR_HELMET = REGISTRY.register("cookedpotatoarmor_helmet",
			() -> new CookedpotatoarmorItem.Helmet());
	public static final RegistryObject<Item> COOKEDPOTATOARMOR_CHESTPLATE = REGISTRY.register("cookedpotatoarmor_chestplate",
			() -> new CookedpotatoarmorItem.Chestplate());
	public static final RegistryObject<Item> COOKEDPOTATOARMOR_LEGGINGS = REGISTRY.register("cookedpotatoarmor_leggings",
			() -> new CookedpotatoarmorItem.Leggings());
	public static final RegistryObject<Item> COOKEDPOTATOARMOR_BOOTS = REGISTRY.register("cookedpotatoarmor_boots",
			() -> new CookedpotatoarmorItem.Boots());
	public static final RegistryObject<Item> RAWPOTATOARMOR_HELMET = REGISTRY.register("rawpotatoarmor_helmet",
			() -> new RawpotatoarmorItem.Helmet());
	public static final RegistryObject<Item> RAWPOTATOARMOR_CHESTPLATE = REGISTRY.register("rawpotatoarmor_chestplate",
			() -> new RawpotatoarmorItem.Chestplate());
	public static final RegistryObject<Item> RAWPOTATOARMOR_LEGGINGS = REGISTRY.register("rawpotatoarmor_leggings",
			() -> new RawpotatoarmorItem.Leggings());
	public static final RegistryObject<Item> RAWPOTATOARMOR_BOOTS = REGISTRY.register("rawpotatoarmor_boots", () -> new RawpotatoarmorItem.Boots());
	public static final RegistryObject<Item> LUMINISOM_SWORD = REGISTRY.register("luminisom_sword", () -> new LuminisomSwordItem());
	public static final RegistryObject<Item> LUMINISOM_PICKAXE = REGISTRY.register("luminisom_pickaxe", () -> new LuminisomPickaxeItem());
	public static final RegistryObject<Item> LUMINISOM_AXE = REGISTRY.register("luminisom_axe", () -> new LuminisomAxeItem());
	public static final RegistryObject<Item> LUMINISOM_HOE = REGISTRY.register("luminisom_hoe", () -> new LuminisomHoeItem());
	public static final RegistryObject<Item> LUMINISOM_SHOVEL = REGISTRY.register("luminisom_shovel", () -> new LuminisomShovelItem());
	public static final RegistryObject<Item> TUNGSTENPICKAXE = REGISTRY.register("tungstenpickaxe", () -> new TungstenpickaxeItem());
	public static final RegistryObject<Item> TUNGSTENAXE = REGISTRY.register("tungstenaxe", () -> new TungstenaxeItem());
	public static final RegistryObject<Item> TUNGSTENSWORD = REGISTRY.register("tungstensword", () -> new TungstenswordItem());
	public static final RegistryObject<Item> TUNGSTENSHOVEL = REGISTRY.register("tungstenshovel", () -> new TungstenshovelItem());
	public static final RegistryObject<Item> TUNGSTENHOE = REGISTRY.register("tungstenhoe", () -> new TungstenhoeItem());
	public static final RegistryObject<Item> LIGHTTUNGSTENPICKAXE = REGISTRY.register("lighttungstenpickaxe", () -> new LighttungstenpickaxeItem());
	public static final RegistryObject<Item> LIGHTTUNGSTENAXE = REGISTRY.register("lighttungstenaxe", () -> new LighttungstenaxeItem());
	public static final RegistryObject<Item> LIGHTTUNGSTENSWORD = REGISTRY.register("lighttungstensword", () -> new LighttungstenswordItem());
	public static final RegistryObject<Item> LIGHTTUNGSTENHOE = REGISTRY.register("lighttungstenhoe", () -> new LighttungstenhoeItem());
	public static final RegistryObject<Item> REINFORCEDTUNGSTENINGOT = REGISTRY.register("reinforcedtungsteningot",
			() -> new ReinforcedtungsteningotItem());
	public static final RegistryObject<Item> TUNGSTENINGOT = REGISTRY.register("tungsteningot", () -> new TungsteningotItem());
	public static final RegistryObject<Item> CHICKENFEATHERINGOT = REGISTRY.register("chickenfeatheringot", () -> new ChickenfeatheringotItem());
	public static final RegistryObject<Item> TUNGSTENORE = block(PokeyAlexModModBlocks.TUNGSTENORE, PokeyAlexModModTabs.TAB_P_AMOD);
	public static final RegistryObject<Item> REINFORCEDTUNGSTENORE = block(PokeyAlexModModBlocks.REINFORCEDTUNGSTENORE,
			PokeyAlexModModTabs.TAB_P_AMOD);
	public static final RegistryObject<Item> SALTORE = block(PokeyAlexModModBlocks.SALTORE, PokeyAlexModModTabs.TAB_P_AMOD);
	public static final RegistryObject<Item> THECREATOR = REGISTRY.register("thecreator_spawn_egg",
			() -> new ForgeSpawnEggItem(PokeyAlexModModEntities.THECREATOR, -16711681, -13519942,
					new Item.Properties().tab(PokeyAlexModModTabs.TAB_P_AMOD)));
	public static final RegistryObject<Item> CHEESE = REGISTRY.register("cheese_spawn_egg",
			() -> new ForgeSpawnEggItem(PokeyAlexModModEntities.CHEESE, -13369549, -13259467,
					new Item.Properties().tab(PokeyAlexModModTabs.TAB_P_AMOD)));
	public static final RegistryObject<Item> CUCUMBERPLANT = block(PokeyAlexModModBlocks.CUCUMBERPLANT, PokeyAlexModModTabs.TAB_P_AMOD);
	public static final RegistryObject<Item> LUMINISOM_BLOCK = block(PokeyAlexModModBlocks.LUMINISOM_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> LUMINISOM_ORE = block(PokeyAlexModModBlocks.LUMINISOM_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> RICEPLANT = block(PokeyAlexModModBlocks.RICEPLANT, CreativeModeTab.TAB_TOOLS);
	public static final RegistryObject<Item> CHEESEITEM = REGISTRY.register("cheeseitem", () -> new CheeseitemItem());
	public static final RegistryObject<Item> TL_TITSRAININGMENREMIX = REGISTRY.register("tl_titsrainingmenremix",
			() -> new TLTitsrainingmenremixItem());
	public static final RegistryObject<Item> DROWNINGPOOLBODIES = REGISTRY.register("drowningpoolbodies", () -> new DrowningpoolbodiesItem());
	public static final RegistryObject<Item> THE_OH_HELLOS_SOLDIERPOETKING = REGISTRY.register("the_oh_hellos_soldierpoetking",
			() -> new TheOhHellosSoldierpoetkingItem());
	public static final RegistryObject<Item> RICHAAD_EB_DEVIL_TRIGGER = REGISTRY.register("richaad_eb_devil_trigger",
			() -> new RichaadEBDevilTriggerItem());
	public static final RegistryObject<Item> ONENOLYAND_SXMPRA_STEPBACK = REGISTRY.register("onenolyand_sxmpra_stepback",
			() -> new OnenolyandSXMPRAStepbackItem());
	public static final RegistryObject<Item> SXCREDMANE_AOT_K_BPHONK = REGISTRY.register("sxcredmane_aot_k_bphonk",
			() -> new SXCREDMANEAotKBphonkItem());
	public static final RegistryObject<Item> CHEESEUNPESTURISED = REGISTRY.register("cheeseunpesturised", () -> new CheeseunpesturisedItem());
	public static final RegistryObject<Item> TF_2SOLDER = REGISTRY.register("tf_2solder_spawn_egg",
			() -> new ForgeSpawnEggItem(PokeyAlexModModEntities.TF_2SOLDER, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> PABATTONSTICK = REGISTRY.register("pabattonstick", () -> new PabattonstickItem());
	public static final RegistryObject<Item> PABATTBLOCK = block(PokeyAlexModModBlocks.PABATTBLOCK, PokeyAlexModModTabs.TAB_P_AMOD);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
