
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package pokey.alex.mod.init;

import pokey.alex.mod.entity.ThecreatorEntityProjectile;
import pokey.alex.mod.entity.ThecreatorEntity;
import pokey.alex.mod.entity.CheeseEntity;
import pokey.alex.mod.PokeyAlexModMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PokeyAlexModModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, PokeyAlexModMod.MODID);
	public static final RegistryObject<EntityType<ThecreatorEntity>> THECREATOR = register("thecreator",
			EntityType.Builder.<ThecreatorEntity>of(ThecreatorEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(68).setUpdateInterval(3).setCustomClientFactory(ThecreatorEntity::new).fireImmune().sized(1f, 2f));
	public static final RegistryObject<EntityType<ThecreatorEntityProjectile>> THECREATOR_PROJECTILE = register("projectile_thecreator",
			EntityType.Builder.<ThecreatorEntityProjectile>of(ThecreatorEntityProjectile::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(1).setCustomClientFactory(ThecreatorEntityProjectile::new).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<CheeseEntity>> CHEESE = register("cheese",
			EntityType.Builder.<CheeseEntity>of(CheeseEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(CheeseEntity::new)

					.sized(1f, 1f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			ThecreatorEntity.init();
			CheeseEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(THECREATOR.get(), ThecreatorEntity.createAttributes().build());
		event.put(CHEESE.get(), CheeseEntity.createAttributes().build());
	}
}
