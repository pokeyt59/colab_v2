
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package pokeys.mod.reborn.init;

import pokeys.mod.reborn.client.renderer.ThecreatorRenderer;
import pokeys.mod.reborn.client.renderer.Tf2solderRenderer;
import pokeys.mod.reborn.client.renderer.CheeseRenderer;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class PokeyModRebornModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(PokeyModRebornModEntities.THECREATOR.get(), ThecreatorRenderer::new);
		event.registerEntityRenderer(PokeyModRebornModEntities.THECREATOR_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PokeyModRebornModEntities.CHEESE.get(), CheeseRenderer::new);
		event.registerEntityRenderer(PokeyModRebornModEntities.TF_2SOLDER.get(), Tf2solderRenderer::new);
	}
}
