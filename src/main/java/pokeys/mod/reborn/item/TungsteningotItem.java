
package pokeys.mod.reborn.item;

import pokeys.mod.reborn.init.PokeyModRebornModTabs;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import java.util.List;

public class TungsteningotItem extends Item {
	public TungsteningotItem() {
		super(new Item.Properties().tab(PokeyModRebornModTabs.TAB_P_AMOD).stacksTo(64).fireResistant().rarity(Rarity.RARE));
	}

	@Override
	public int getEnchantmentValue() {
		return 20;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("do not eat"));
	}
}
