
package pokey.alexs.mod.item;

import pokey.alexs.mod.procedures.Hot_handsProcedure;
import pokey.alexs.mod.init.PokeyAndAlexsModModItems;
import pokey.alexs.mod.init.PokeyAndAlexsModModBlocks;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

public abstract class LuminisomArmorItem extends ArmorItem {
	public LuminisomArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 17;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{3, 6, 5, 5}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 20;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(PokeyAndAlexsModModItems.LUMINISOM_INGOT.get()),
						new ItemStack(PokeyAndAlexsModModBlocks.LUMINISOM_BLOCK.get()));
			}

			@Override
			public String getName() {
				return "luminisom_armor";
			}

			@Override
			public float getToughness() {
				return 1.05f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.51f;
			}
		}, slot, properties);
	}

	public static class Helmet extends LuminisomArmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).fireResistant());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "pokey_and_alexs_mod:textures/models/armor/luminisom_layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			Hot_handsProcedure.execute(entity);
		}
	}

	public static class Chestplate extends LuminisomArmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).fireResistant());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "pokey_and_alexs_mod:textures/models/armor/luminisom_layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			Hot_handsProcedure.execute(entity);
		}
	}

	public static class Leggings extends LuminisomArmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).fireResistant());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "pokey_and_alexs_mod:textures/models/armor/luminisom_layer_2.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			Hot_handsProcedure.execute(entity);
		}
	}

	public static class Boots extends LuminisomArmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).fireResistant());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "pokey_and_alexs_mod:textures/models/armor/luminisom_layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			Hot_handsProcedure.execute(entity);
		}
	}
}
