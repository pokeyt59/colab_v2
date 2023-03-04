
package pokey.alex.mod.item;

import pokey.alex.mod.init.PokeyAlexModModTabs;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import java.util.List;

public class CheeseitemItem extends Item {
	public CheeseitemItem() {
		super(new Item.Properties().tab(PokeyAlexModModTabs.TAB_P_AMOD).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(6).saturationMod(7.699999999999999f)

						.meat().build()));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("it's cheese"));
		list.add(new TextComponent("enritched with iron"));
	}
}
