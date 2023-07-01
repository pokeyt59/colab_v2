
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package pokeys.mod.reborn.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber
public class PokeyModRebornModFuels {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		ItemStack itemstack = event.getItemStack();
		if (itemstack.getItem() == PokeyModRebornModItems.WOODLOGARMOR_HELMET.get())
			event.setBurnTime(1600);
		else if (itemstack.getItem() == PokeyModRebornModItems.WOODLOGARMOR_CHESTPLATE.get())
			event.setBurnTime(6000);
		else if (itemstack.getItem() == PokeyModRebornModItems.WOODLOGARMOR_LEGGINGS.get())
			event.setBurnTime(3000);
		else if (itemstack.getItem() == PokeyModRebornModItems.WOODLOGARMOR_BOOTS.get())
			event.setBurnTime(3000);
		else if (itemstack.getItem() == PokeyModRebornModItems.LEAFYARMOR_HELMET.get())
			event.setBurnTime(1650);
		else if (itemstack.getItem() == PokeyModRebornModItems.LEAFYARMOR_CHESTPLATE.get())
			event.setBurnTime(5000);
		else if (itemstack.getItem() == PokeyModRebornModItems.LEAFYARMOR_LEGGINGS.get())
			event.setBurnTime(4940);
		else if (itemstack.getItem() == PokeyModRebornModItems.LEAFYARMOR_BOOTS.get())
			event.setBurnTime(2000);
		else if (itemstack.getItem() == PokeyModRebornModItems.LUMINISONMNUGGETRAW.get())
			event.setBurnTime(10000);
		else if (itemstack.getItem() == Items.AXOLOTL_BUCKET)
			event.setBurnTime(1600);
	}
}
