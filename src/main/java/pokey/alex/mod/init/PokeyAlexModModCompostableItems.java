
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package pokey.alex.mod.init;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.block.ComposterBlock;
import net.minecraft.world.item.Items;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PokeyAlexModModCompostableItems {
	@SubscribeEvent
	public static void addComposterItems(FMLCommonSetupEvent event) {
		ComposterBlock.COMPOSTABLES.put(PokeyAlexModModItems.WOODLOGARMOR_HELMET.get(), 1f);
		ComposterBlock.COMPOSTABLES.put(PokeyAlexModModItems.WOODLOGARMOR_CHESTPLATE.get(), 1f);
		ComposterBlock.COMPOSTABLES.put(PokeyAlexModModItems.WOODLOGARMOR_LEGGINGS.get(), 1f);
		ComposterBlock.COMPOSTABLES.put(PokeyAlexModModItems.WOODLOGARMOR_BOOTS.get(), 1f);
		ComposterBlock.COMPOSTABLES.put(PokeyAlexModModItems.LEAFYARMOR_LEGGINGS.get(), 1f);
		ComposterBlock.COMPOSTABLES.put(Items.AXOLOTL_BUCKET, 1f);
		ComposterBlock.COMPOSTABLES.put(Items.ROTTEN_FLESH, 0.99f);
	}
}
