
package pokeys.mod.reborn.item;

import pokeys.mod.reborn.init.PokeyModRebornModTabs;
import pokeys.mod.reborn.init.PokeyModRebornModItems;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

public class LighttungstenhoeItem extends HoeItem {
	public LighttungstenhoeItem() {
		super(new Tier() {
			public int getUses() {
				return 3140;
			}

			public float getSpeed() {
				return 12f;
			}

			public float getAttackDamageBonus() {
				return 8f;
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
		}, 0, -3f, new Item.Properties().tab(PokeyModRebornModTabs.TAB_P_AMOD));
	}
}
