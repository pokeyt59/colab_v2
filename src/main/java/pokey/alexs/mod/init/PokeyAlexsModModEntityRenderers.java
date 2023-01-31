
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package pokey.alexs.mod.init;

import pokey.alexs.mod.client.renderer.ThecreatorRenderer;
import pokey.alexs.mod.client.renderer.CheeseRenderer;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class PokeyAlexsModModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(PokeyAlexsModModEntities.THECREATOR.get(), ThecreatorRenderer::new);
		event.registerEntityRenderer(PokeyAlexsModModEntities.THECREATOR_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PokeyAlexsModModEntities.CHEESE.get(), CheeseRenderer::new);
	}
}
