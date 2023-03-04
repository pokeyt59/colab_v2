
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package pokey.alex.mod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber
public class PokeyAlexModModFuels {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		ItemStack itemstack = event.getItemStack();
		if (itemstack.getItem() == PokeyAlexModModItems.WOODLOGARMOR_HELMET.get())
			event.setBurnTime(1600);
		else if (itemstack.getItem() == PokeyAlexModModItems.WOODLOGARMOR_CHESTPLATE.get())
			event.setBurnTime(6000);
		else if (itemstack.getItem() == PokeyAlexModModItems.WOODLOGARMOR_LEGGINGS.get())
			event.setBurnTime(3000);
		else if (itemstack.getItem() == PokeyAlexModModItems.WOODLOGARMOR_BOOTS.get())
			event.setBurnTime(3000);
		else if (itemstack.getItem() == PokeyAlexModModItems.LEAFYARMOR_HELMET.get())
			event.setBurnTime(1650);
		else if (itemstack.getItem() == PokeyAlexModModItems.LEAFYARMOR_CHESTPLATE.get())
			event.setBurnTime(5000);
		else if (itemstack.getItem() == PokeyAlexModModItems.LEAFYARMOR_LEGGINGS.get())
			event.setBurnTime(4940);
		else if (itemstack.getItem() == PokeyAlexModModItems.LEAFYARMOR_BOOTS.get())
			event.setBurnTime(2000);
		else if (itemstack.getItem() == PokeyAlexModModItems.LUMINISONMNUGGETRAW.get())
			event.setBurnTime(10000);
		else if (itemstack.getItem() == Items.AXOLOTL_BUCKET)
			event.setBurnTime(1600);
	}
}
