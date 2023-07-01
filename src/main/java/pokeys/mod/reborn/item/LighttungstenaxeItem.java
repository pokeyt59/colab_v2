
package pokeys.mod.reborn.item;

import pokeys.mod.reborn.init.PokeyModRebornModTabs;
import pokeys.mod.reborn.init.PokeyModRebornModItems;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

public class LighttungstenaxeItem extends AxeItem {
	public LighttungstenaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 3140;
			}

			public float getSpeed() {
				return 13f;
			}

			public float getAttackDamageBonus() {
				return 48f;
			}

			public int getLevel() {
				return 10;
			}

			public int getEnchantmentValue() {
				return 70;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(PokeyModRebornModItems.CHICKENFEATHERINGOT.get()),
						new ItemStack(PokeyModRebornModItems.TUNGSTENINGOT.get()));
			}
		}, 1, -3f, new Item.Properties().tab(PokeyModRebornModTabs.TAB_P_AMOD));
	}
}
