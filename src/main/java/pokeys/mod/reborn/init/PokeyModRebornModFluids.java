
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package pokeys.mod.reborn.init;

import pokeys.mod.reborn.fluid.LightfluidblockFluid;
import pokeys.mod.reborn.PokeyModRebornMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

public class PokeyModRebornModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, PokeyModRebornMod.MODID);
	public static final RegistryObject<FlowingFluid> LIGHTFLUIDBLOCK = REGISTRY.register("lightfluidblock", () -> new LightfluidblockFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_LIGHTFLUIDBLOCK = REGISTRY.register("flowing_lightfluidblock",
			() -> new LightfluidblockFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(LIGHTFLUIDBLOCK.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_LIGHTFLUIDBLOCK.get(), RenderType.translucent());
		}
	}
}
