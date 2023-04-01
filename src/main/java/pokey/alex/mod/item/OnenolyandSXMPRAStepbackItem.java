
package pokey.alex.mod.item;

import pokey.alex.mod.init.PokeyAlexModModTabs;
import pokey.alex.mod.init.PokeyAlexModModSounds;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class OnenolyandSXMPRAStepbackItem extends RecordItem {
	public OnenolyandSXMPRAStepbackItem() {
		super(0, PokeyAlexModModSounds.REGISTRY.get(new ResourceLocation("pokey_alex_mod:onenoly")),
				new Item.Properties().tab(PokeyAlexModModTabs.TAB_MUSICDICSLIST).stacksTo(1).rarity(Rarity.RARE));
	}
}