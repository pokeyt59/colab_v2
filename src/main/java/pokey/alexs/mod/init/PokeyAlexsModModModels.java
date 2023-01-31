
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package pokey.alexs.mod.init;

import pokey.alexs.mod.client.model.Modelsyrenge;
import pokey.alexs.mod.client.model.Modelpokeythecreator;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class PokeyAlexsModModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelsyrenge.LAYER_LOCATION, Modelsyrenge::createBodyLayer);
		event.registerLayerDefinition(Modelpokeythecreator.LAYER_LOCATION, Modelpokeythecreator::createBodyLayer);
	}
}
