
package pokey.alexs.mod.item;

import pokey.alexs.mod.procedures.Light_as_a_featherProcedure;
import pokey.alexs.mod.init.PokeyAndAlexsModModTabs;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;

public class ChickenfeatheringotItem extends Item {
	public ChickenfeatheringotItem() {
		super(new Item.Properties().tab(PokeyAndAlexsModModTabs.TAB_P_AMOD).stacksTo(64).rarity(Rarity.UNCOMMON));
	}

	@Override
	public int getEnchantmentValue() {
		return 1;
	}

	@Override
	public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
		return 0.8F;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		if (selected)
			Light_as_a_featherProcedure.execute(entity);
	}
}
