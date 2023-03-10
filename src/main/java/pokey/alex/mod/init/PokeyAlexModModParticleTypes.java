
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package pokey.alex.mod.init;

import pokey.alex.mod.PokeyAlexModMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

public class PokeyAlexModModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, PokeyAlexModMod.MODID);
	public static final RegistryObject<ParticleType<?>> TESTNOTPERM = REGISTRY.register("testnotperm", () -> new SimpleParticleType(true));
	public static final RegistryObject<ParticleType<?>> LIGHTLIQUIDPARTICAL = REGISTRY.register("lightliquidpartical",
			() -> new SimpleParticleType(false));
}
