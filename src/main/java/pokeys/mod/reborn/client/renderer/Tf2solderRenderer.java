
package pokeys.mod.reborn.client.renderer;

import pokeys.mod.reborn.entity.Tf2solderEntity;
import pokeys.mod.reborn.client.model.Modelcustom_model;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class Tf2solderRenderer extends MobRenderer<Tf2solderEntity, Modelcustom_model<Tf2solderEntity>> {
	public Tf2solderRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(Tf2solderEntity entity) {
		return new ResourceLocation("pokey_mod_reborn:textures/entities/soldier.png");
	}
}
