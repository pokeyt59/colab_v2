
package pokey.alexs.mod.item;

import pokey.alexs.mod.init.PokeyAlexsModModTabs;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

public abstract class WoodlogarmorItem extends ArmorItem {
	public WoodlogarmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 40;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{4, 4, 4, 9}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 5;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Blocks.OAK_LOG));
			}

			@Override
			public String getName() {
				return "woodlogarmor";
			}

			@Override
			public float getToughness() {
				return 1f;
			}

			@Override
			public float getKnockbackResistance() {
				return 1f;
			}
		}, slot, properties);
	}

	public static class Helmet extends WoodlogarmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(PokeyAlexsModModTabs.TAB_P_AMOD));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "pokey_alexs_mod:textures/models/armor/wood_armor_v2__layer_1.png";
		}
	}

	public static class Chestplate extends WoodlogarmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(PokeyAlexsModModTabs.TAB_P_AMOD));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "pokey_alexs_mod:textures/models/armor/wood_armor_v2__layer_1.png";
		}
	}

	public static class Leggings extends WoodlogarmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(PokeyAlexsModModTabs.TAB_P_AMOD));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "pokey_alexs_mod:textures/models/armor/wood_armor_v2__layer_2.png";
		}
	}

	public static class Boots extends WoodlogarmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(PokeyAlexsModModTabs.TAB_P_AMOD));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "pokey_alexs_mod:textures/models/armor/wood_armor_v2__layer_1.png";
		}
	}
}
