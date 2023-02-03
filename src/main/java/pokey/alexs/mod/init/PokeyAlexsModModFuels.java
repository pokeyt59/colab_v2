
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package pokey.alexs.mod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber
public class PokeyAlexsModModFuels {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		ItemStack itemstack = event.getItemStack();
		if (itemstack.getItem() == PokeyAlexsModModItems.WOODLOGARMOR_HELMET.get())
			event.setBurnTime(1600);
		else if (itemstack.getItem() == PokeyAlexsModModItems.WOODLOGARMOR_CHESTPLATE.get())
			event.setBurnTime(6000);
		else if (itemstack.getItem() == PokeyAlexsModModItems.WOODLOGARMOR_LEGGINGS.get())
			event.setBurnTime(3000);
		else if (itemstack.getItem() == PokeyAlexsModModItems.WOODLOGARMOR_BOOTS.get())
			event.setBurnTime(3000);
		else if (itemstack.getItem() == PokeyAlexsModModItems.LEAFYARMOR_HELMET.get())
			event.setBurnTime(1650);
		else if (itemstack.getItem() == PokeyAlexsModModItems.LEAFYARMOR_CHESTPLATE.get())
			event.setBurnTime(5000);
		else if (itemstack.getItem() == PokeyAlexsModModItems.LEAFYARMOR_LEGGINGS.get())
			event.setBurnTime(4940);
		else if (itemstack.getItem() == PokeyAlexsModModItems.LEAFYARMOR_BOOTS.get())
			event.setBurnTime(2000);
		else if (itemstack.getItem() == PokeyAlexsModModItems.LUMINISONMNUGGETRAW.get())
			event.setBurnTime(10000);
		else if (itemstack.getItem() == Items.AXOLOTL_BUCKET)
			event.setBurnTime(1600);
		else if (itemstack.getItem() == Blocks.ZOMBIE_HEAD.asItem())
			event.setBurnTime(1600);
		else if (itemstack.getItem() == Blocks.PLAYER_HEAD.asItem())
			event.setBurnTime(1600);
		else if (itemstack.getItem() == Blocks.CREEPER_HEAD.asItem())
			event.setBurnTime(1600);
		else if (itemstack.getItem() == Blocks.ZOMBIE_WALL_HEAD.asItem())
			event.setBurnTime(1600);
		else if (itemstack.getItem() == Blocks.DRAGON_HEAD.asItem())
			event.setBurnTime(1600);
	}
}
