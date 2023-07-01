
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package pokeys.mod.reborn.init;

import pokeys.mod.reborn.fluid.types.LightfluidblockFluidType;
import pokeys.mod.reborn.PokeyModRebornMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

public class PokeyModRebornModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, PokeyModRebornMod.MODID);
	public static final RegistryObject<FluidType> LIGHTFLUIDBLOCK_TYPE = REGISTRY.register("lightfluidblock", () -> new LightfluidblockFluidType());
}
