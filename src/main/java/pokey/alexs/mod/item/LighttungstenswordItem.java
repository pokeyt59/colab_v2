
package pokey.alexs.mod.item;

import pokey.alexs.mod.init.PokeyAlexsModModTabs;
import pokey.alexs.mod.init.PokeyAlexsModModItems;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class LighttungstenswordItem extends SwordItem {
	public LighttungstenswordItem() {
		super(new Tier() {
			public int getUses() {
				return 3140;
			}

			public float getSpeed() {
				return 12f;
			}

			public float getAttackDamageBonus() {
				return 28f;
			}

			public int getLevel() {
				return 10;
			}

			public int getEnchantmentValue() {
				return 70;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(PokeyAlexsModModItems.CHICKENFEATHERINGOT.get()),
						new ItemStack(PokeyAlexsModModItems.TUNGSTENINGOT.get()));
			}
		}, 3, -3.6f, new Item.Properties().tab(PokeyAlexsModModTabs.TAB_P_AMOD));
	}
}
