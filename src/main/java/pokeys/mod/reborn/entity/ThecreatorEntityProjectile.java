
package pokeys.mod.reborn.entity;

import pokeys.mod.reborn.init.PokeyModRebornModEntities;

import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.network.protocol.Packet;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class ThecreatorEntityProjectile extends AbstractArrow implements ItemSupplier {
	public ThecreatorEntityProjectile(PlayMessages.SpawnEntity packet, Level world) {
		super(PokeyModRebornModEntities.THECREATOR_PROJECTILE.get(), world);
	}

	public ThecreatorEntityProjectile(EntityType<? extends ThecreatorEntityProjectile> type, Level world) {
		super(type, world);
	}

	public ThecreatorEntityProjectile(EntityType<? extends ThecreatorEntityProjectile> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public ThecreatorEntityProjectile(EntityType<? extends ThecreatorEntityProjectile> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void doPostHurtEffects(LivingEntity livingEntity) {
		super.doPostHurtEffects(livingEntity);
		livingEntity.setArrowCount(livingEntity.getArrowCount() - 1);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return new ItemStack(Items.BOW);
	}

	@Override
	protected ItemStack getPickupItem() {
		return new ItemStack(Items.BOW);
	}
}
