
package pokey.alex.mod.client.renderer;

import pokey.alex.mod.entity.CheeseEntity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.SlimeModel;

public class CheeseRenderer extends MobRenderer<CheeseEntity, SlimeModel<CheeseEntity>> {
	public CheeseRenderer(EntityRendererProvider.Context context) {
		super(context, new SlimeModel(context.bakeLayer(ModelLayers.SLIME)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(CheeseEntity entity) {
		return new ResourceLocation("pokey_alex_mod:textures/entities/slime.png");
	}
}
