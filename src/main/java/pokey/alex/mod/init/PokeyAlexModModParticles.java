
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package pokey.alex.mod.init;

import pokey.alex.mod.client.particle.TestnotpermParticle;
import pokey.alex.mod.client.particle.LightliquidparticalParticle;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ParticleFactoryRegisterEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.client.Minecraft;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class PokeyAlexModModParticles {
	@SubscribeEvent
	public static void registerParticles(ParticleFactoryRegisterEvent event) {
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) PokeyAlexModModParticleTypes.TESTNOTPERM.get(),
				TestnotpermParticle::provider);
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) PokeyAlexModModParticleTypes.LIGHTLIQUIDPARTICAL.get(),
				LightliquidparticalParticle::provider);
	}
}
