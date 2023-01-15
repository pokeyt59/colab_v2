
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package pokey.alexs.mod.init;

import pokey.alexs.mod.client.renderer.ThecreatorRenderer;
import pokey.alexs.mod.client.renderer.CrusaderscrossbowRenderer;
import pokey.alexs.mod.client.renderer.CheeseRenderer;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class PokeyAndAlexsModModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(PokeyAndAlexsModModEntities.CHEESE.get(), CheeseRenderer::new);
		event.registerEntityRenderer(PokeyAndAlexsModModEntities.THECREATOR.get(), ThecreatorRenderer::new);
		event.registerEntityRenderer(PokeyAndAlexsModModEntities.CRUSADERSCROSSBOW.get(), CrusaderscrossbowRenderer::new);
	}
}
