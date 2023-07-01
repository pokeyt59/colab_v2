
package pokeys.mod.reborn.item;

import pokeys.mod.reborn.init.PokeyModRebornModTabs;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class OnenolyandSXMPRAStepbackItem extends RecordItem {
	public OnenolyandSXMPRAStepbackItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("pokey_mod_reborn:onenoly")),
				new Item.Properties().tab(PokeyModRebornModTabs.TAB_MUSICDICSLIST).stacksTo(1).rarity(Rarity.RARE), 100);
	}
}
