
package pokey.alex.mod.item;

import pokey.alex.mod.init.PokeyAlexModModSounds;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;

public class DrowningpoolbodiesItem extends RecordItem {
	public DrowningpoolbodiesItem() {
		super(0, PokeyAlexModModSounds.REGISTRY.get(new ResourceLocation("pokey_alex_mod:drowning_pool")),
				new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1).rarity(Rarity.RARE));
	}
}
