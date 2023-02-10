
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package pokey.alex.mod.init;

import pokey.alex.mod.client.renderer.ThecreatorRenderer;
import pokey.alex.mod.client.renderer.CheeseRenderer;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class PokeyAlexModModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(PokeyAlexModModEntities.THECREATOR.get(), ThecreatorRenderer::new);
		event.registerEntityRenderer(PokeyAlexModModEntities.THECREATOR_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PokeyAlexModModEntities.CHEESE.get(), CheeseRenderer::new);
	}
}
