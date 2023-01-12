
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package pokey.alexs.mod.init;

import pokey.alexs.mod.client.model.Modelpokeysyrenge;
import pokey.alexs.mod.client.model.Modelcustom_model;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class PokeyAndAlexsModModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelpokeysyrenge.LAYER_LOCATION, Modelpokeysyrenge::createBodyLayer);
		event.registerLayerDefinition(Modelcustom_model.LAYER_LOCATION, Modelcustom_model::createBodyLayer);
	}
}
