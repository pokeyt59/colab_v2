
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package pokey.alexs.mod.init;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.block.ComposterBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PokeyAlexsModModCompostableItems {
	@SubscribeEvent
	public static void addComposterItems(FMLCommonSetupEvent event) {
		ComposterBlock.COMPOSTABLES.put(PokeyAlexsModModItems.WOODLOGARMOR_HELMET.get(), 1f);
		ComposterBlock.COMPOSTABLES.put(PokeyAlexsModModItems.WOODLOGARMOR_CHESTPLATE.get(), 1f);
		ComposterBlock.COMPOSTABLES.put(PokeyAlexsModModItems.WOODLOGARMOR_LEGGINGS.get(), 1f);
		ComposterBlock.COMPOSTABLES.put(PokeyAlexsModModItems.WOODLOGARMOR_BOOTS.get(), 1f);
		ComposterBlock.COMPOSTABLES.put(PokeyAlexsModModItems.LEAFYARMOR_LEGGINGS.get(), 1f);
		ComposterBlock.COMPOSTABLES.put(Items.AXOLOTL_BUCKET, 1f);
		ComposterBlock.COMPOSTABLES.put(Items.ROTTEN_FLESH, 0.99f);
		ComposterBlock.COMPOSTABLES.put(Blocks.ZOMBIE_HEAD.asItem(), 1f);
		ComposterBlock.COMPOSTABLES.put(Blocks.PLAYER_HEAD.asItem(), 1f);
		ComposterBlock.COMPOSTABLES.put(Blocks.CREEPER_HEAD.asItem(), 1f);
		ComposterBlock.COMPOSTABLES.put(Blocks.ZOMBIE_WALL_HEAD.asItem(), 1f);
		ComposterBlock.COMPOSTABLES.put(Blocks.DRAGON_HEAD.asItem(), 1f);
		ComposterBlock.COMPOSTABLES.put(Blocks.DRAGON_HEAD.asItem(), 1f);
		ComposterBlock.COMPOSTABLES.put(Blocks.PLAYER_WALL_HEAD.asItem(), 1f);
		ComposterBlock.COMPOSTABLES.put(Blocks.CREEPER_WALL_HEAD.asItem(), 1f);
		ComposterBlock.COMPOSTABLES.put(Blocks.DRAGON_WALL_HEAD.asItem(), 1f);
	}
}
