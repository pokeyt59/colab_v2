
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package pokeys.mod.reborn.init;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.block.ComposterBlock;
import net.minecraft.world.item.Items;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PokeyModRebornModCompostableItems {
	@SubscribeEvent
	public static void addComposterItems(FMLCommonSetupEvent event) {
		ComposterBlock.COMPOSTABLES.put(PokeyModRebornModItems.WOODLOGARMOR_HELMET.get(), 1f);
		ComposterBlock.COMPOSTABLES.put(PokeyModRebornModItems.WOODLOGARMOR_CHESTPLATE.get(), 1f);
		ComposterBlock.COMPOSTABLES.put(PokeyModRebornModItems.WOODLOGARMOR_LEGGINGS.get(), 1f);
		ComposterBlock.COMPOSTABLES.put(PokeyModRebornModItems.WOODLOGARMOR_BOOTS.get(), 1f);
		ComposterBlock.COMPOSTABLES.put(PokeyModRebornModItems.LEAFYARMOR_LEGGINGS.get(), 1f);
		ComposterBlock.COMPOSTABLES.put(Items.AXOLOTL_BUCKET, 1f);
		ComposterBlock.COMPOSTABLES.put(Items.ROTTEN_FLESH, 0.99f);
	}
}
