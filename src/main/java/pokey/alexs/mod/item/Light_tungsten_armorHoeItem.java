
package pokey.alexs.mod.item;

import pokey.alexs.mod.init.PokeyAndAlexsModModItems;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.CreativeModeTab;

public class Light_tungsten_armorHoeItem extends HoeItem {
	public Light_tungsten_armorHoeItem() {
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
				return Ingredient.of(new ItemStack(PokeyAndAlexsModModItems.CHICKENFEATHERINGOT.get()),
						new ItemStack(PokeyAndAlexsModModItems.TUNGSTENINGOT.get()));
			}
		}, 0, -3f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));
	}
}
