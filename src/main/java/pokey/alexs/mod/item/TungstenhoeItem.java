
package pokey.alexs.mod.item;

import pokey.alexs.mod.init.PokeyAlexsModModTabs;
import pokey.alexs.mod.init.PokeyAlexsModModItems;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

public class TungstenhoeItem extends HoeItem {
	public TungstenhoeItem() {
		super(new Tier() {
			public int getUses() {
				return 6280;
			}

			public float getSpeed() {
				return 24f;
			}

			public float getAttackDamageBonus() {
				return 18f;
			}

			public int getLevel() {
				return 20;
			}

			public int getEnchantmentValue() {
				return 140;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(PokeyAlexsModModItems.TUNGSTENINGOT.get()));
			}
		}, 0, -3f, new Item.Properties().tab(PokeyAlexsModModTabs.TAB_P_AMOD));
	}
}
