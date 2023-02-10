
package pokey.alex.mod.item;

import pokey.alex.mod.init.PokeyAlexModModTabs;
import pokey.alex.mod.init.PokeyAlexModModItems;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class LuminisomSwordItem extends SwordItem {
	public LuminisomSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 902;
			}

			public float getSpeed() {
				return 10f;
			}

			public float getAttackDamageBonus() {
				return 13f;
			}

			public int getLevel() {
				return 5;
			}

			public int getEnchantmentValue() {
				return 35;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(PokeyAlexModModItems.LUMINISOM_INGOT.get()));
			}
		}, 3, -3f, new Item.Properties().tab(PokeyAlexModModTabs.TAB_P_AMOD));
	}
}
