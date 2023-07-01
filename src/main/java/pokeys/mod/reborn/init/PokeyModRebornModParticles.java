
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package pokeys.mod.reborn.init;

import pokeys.mod.reborn.client.particle.TestnotpermParticle;
import pokeys.mod.reborn.client.particle.LightliquidparticalParticle;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class PokeyModRebornModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.register(PokeyModRebornModParticleTypes.TESTNOTPERM.get(), TestnotpermParticle::provider);
		event.register(PokeyModRebornModParticleTypes.LIGHTLIQUIDPARTICAL.get(), LightliquidparticalParticle::provider);
	}
}
