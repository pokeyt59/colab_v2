
package pokey.alex.mod.item;

import pokey.alex.mod.procedures.Heavy_like_regretProcedure;
import pokey.alex.mod.init.PokeyAlexModModTabs;
import pokey.alex.mod.init.PokeyAlexModModItems;

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

public abstract class TungstenarmorItem extends ArmorItem {
	public TungstenarmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 150;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{18, 44, 43, 20}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 90;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(PokeyAlexModModItems.TUNGSTENINGOT.get()));
			}

			@Override
			public String getName() {
				return "tungstenarmor";
			}

			@Override
			public float getToughness() {
				return 4f;
			}

			@Override
			public float getKnockbackResistance() {
				return 1f;
			}
		}, slot, properties);
	}

	public static class Helmet extends TungstenarmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(PokeyAlexModModTabs.TAB_P_AMOD).fireResistant());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "pokey_alex_mod:textures/models/armor/tungsten_armor____layer_1.png";
		}
	}

	public static class Chestplate extends TungstenarmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(PokeyAlexModModTabs.TAB_P_AMOD).fireResistant());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "pokey_alex_mod:textures/models/armor/tungsten_armor____layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			Heavy_like_regretProcedure.execute(entity);
		}
	}

	public static class Leggings extends TungstenarmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(PokeyAlexModModTabs.TAB_P_AMOD).fireResistant());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "pokey_alex_mod:textures/models/armor/tungsten_armor____layer_2.png";
		}
	}

	public static class Boots extends TungstenarmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(PokeyAlexModModTabs.TAB_P_AMOD).fireResistant());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "pokey_alex_mod:textures/models/armor/tungsten_armor____layer_1.png";
		}
	}
}
