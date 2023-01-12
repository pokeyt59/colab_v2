
package pokey.alexs.mod.client.renderer;

import pokey.alexs.mod.entity.ThecreatorEntity;
import pokey.alexs.mod.client.model.Modelcustom_model;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class ThecreatorRenderer extends MobRenderer<ThecreatorEntity, Modelcustom_model<ThecreatorEntity>> {
	public ThecreatorRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ThecreatorEntity entity) {
		return new ResourceLocation("pokey_and_alexs_mod:textures/entities/pokey_yt_whith_mask.png");
	}
}
