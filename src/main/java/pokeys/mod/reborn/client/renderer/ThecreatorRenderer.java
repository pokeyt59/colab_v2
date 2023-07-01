
package pokeys.mod.reborn.client.renderer;

import pokeys.mod.reborn.entity.ThecreatorEntity;
import pokeys.mod.reborn.client.model.Modelpokeythecreator;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class ThecreatorRenderer extends MobRenderer<ThecreatorEntity, Modelpokeythecreator<ThecreatorEntity>> {
	public ThecreatorRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelpokeythecreator(context.bakeLayer(Modelpokeythecreator.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ThecreatorEntity entity) {
		return new ResourceLocation("pokey_mod_reborn:textures/entities/pokey_yt_whith_mask.png");
	}
}
