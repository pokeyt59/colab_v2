
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package pokeys.mod.reborn.init;

import pokeys.mod.reborn.PokeyModRebornMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

public class PokeyModRebornModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, PokeyModRebornMod.MODID);
	public static final RegistryObject<SimpleParticleType> TESTNOTPERM = REGISTRY.register("testnotperm", () -> new SimpleParticleType(true));
	public static final RegistryObject<SimpleParticleType> LIGHTLIQUIDPARTICAL = REGISTRY.register("lightliquidpartical",
			() -> new SimpleParticleType(false));
}
