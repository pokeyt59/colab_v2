
package pokeys.mod.reborn.item;

import pokeys.mod.reborn.procedures.Light_as_a_featherProcedure;
import pokeys.mod.reborn.init.PokeyModRebornModTabs;
import pokeys.mod.reborn.init.PokeyModRebornModItems;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

public abstract class LighttungstenarmorItem extends ArmorItem {
	public LighttungstenarmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 15;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{2, 6, 5, 2}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 9;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(PokeyModRebornModItems.CHICKENFEATHERINGOT.get()));
			}

			@Override
			public String getName() {
				return "lighttungstenarmor";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, slot, properties);
	}

	public static class Helmet extends LighttungstenarmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(PokeyModRebornModTabs.TAB_P_AMOD));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "pokey_mod_reborn:textures/models/armor/light_tungsten_armor_layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			Light_as_a_featherProcedure.execute(entity);
		}
	}

	public static class Chestplate extends LighttungstenarmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(PokeyModRebornModTabs.TAB_P_AMOD).fireResistant());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "pokey_mod_reborn:textures/models/armor/light_tungsten_armor_layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			Light_as_a_featherProcedure.execute(entity);
		}
	}

	public static class Leggings extends LighttungstenarmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(PokeyModRebornModTabs.TAB_P_AMOD));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "pokey_mod_reborn:textures/models/armor/light_tungsten_armor_layer_2.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			Light_as_a_featherProcedure.execute(entity);
		}
	}

	public static class Boots extends LighttungstenarmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(PokeyModRebornModTabs.TAB_P_AMOD));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "pokey_mod_reborn:textures/models/armor/light_tungsten_armor_layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			Light_as_a_featherProcedure.execute(entity);
		}
	}
}
