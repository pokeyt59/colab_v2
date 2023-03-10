
package pokey.alex.mod.item;

import pokey.alex.mod.init.PokeyAlexModModTabs;

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

public abstract class DripstonearmorItem extends ArmorItem {
	public DripstonearmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 30;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{4, 12, 10, 4}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 18;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Blocks.POINTED_DRIPSTONE));
			}

			@Override
			public String getName() {
				return "dripstonearmor";
			}

			@Override
			public float getToughness() {
				return 1.6f;
			}

			@Override
			public float getKnockbackResistance() {
				return 2.7f;
			}
		}, slot, properties);
	}

	public static class Helmet extends DripstonearmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(PokeyAlexModModTabs.TAB_P_AMOD));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "pokey_alex_mod:textures/models/armor/drip_armor_layer_1.png";
		}
	}

	public static class Chestplate extends DripstonearmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(PokeyAlexModModTabs.TAB_P_AMOD));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "pokey_alex_mod:textures/models/armor/drip_armor_layer_1.png";
		}
	}

	public static class Leggings extends DripstonearmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(PokeyAlexModModTabs.TAB_P_AMOD));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "pokey_alex_mod:textures/models/armor/drip_armor_layer_2.png";
		}
	}

	public static class Boots extends DripstonearmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(PokeyAlexModModTabs.TAB_P_AMOD));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "pokey_alex_mod:textures/models/armor/drip_armor_layer_1.png";
		}
	}
}
