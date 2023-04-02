
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package pokey.alex.mod.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class PokeyAlexModModTabs {
	public static CreativeModeTab TAB_P_AMOD;
	public static CreativeModeTab TAB_MUSICDICSLIST;

	public static void load() {
		TAB_P_AMOD = new CreativeModeTab("tabp_amod") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(PokeyAlexModModItems.LUMINISONMNUGGETRAW.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_MUSICDICSLIST = new CreativeModeTab("tabmusicdicslist") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(PokeyAlexModModItems.ONENOLYAND_SXMPRA_STEPBACK.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
