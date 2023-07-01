
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package pokeys.mod.reborn.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class PokeyModRebornModTabs {
	public static CreativeModeTab TAB_P_AMOD;
	public static CreativeModeTab TAB_MUSICDICSLIST;

	public static void load() {
		TAB_P_AMOD = new CreativeModeTab("tabp_amod") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(PokeyModRebornModItems.LUMINISONMNUGGETRAW.get());
			}

			@Override
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_MUSICDICSLIST = new CreativeModeTab("tabmusicdicslist") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(PokeyModRebornModItems.ONENOLYAND_SXMPRA_STEPBACK.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
