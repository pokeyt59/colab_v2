package pokey.alexs.mod.client.renderer;

import pokey.alexs.mod.entity.CrusaderscrossbowEntity;
import pokey.alexs.mod.client.model.Modelpokeysyrenge;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import com.mojang.math.Vector3f;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class CrusaderscrossbowRenderer extends EntityRenderer<CrusaderscrossbowEntity> {
	private static final ResourceLocation texture = new ResourceLocation("pokey_and_alexs_mod:textures/entities/syrenge.png");
	private final Modelpokeysyrenge model;

	public CrusaderscrossbowRenderer(EntityRendererProvider.Context context) {
		super(context);
		model = new Modelpokeysyrenge(context.bakeLayer(Modelpokeysyrenge.LAYER_LOCATION));
	}

	@Override
	public void render(CrusaderscrossbowEntity entityIn, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource bufferIn,
			int packedLightIn) {
		VertexConsumer vb = bufferIn.getBuffer(RenderType.entityCutout(this.getTextureLocation(entityIn)));
		poseStack.pushPose();
		poseStack.mulPose(Vector3f.YP.rotationDegrees(Mth.lerp(partialTicks, entityIn.yRotO, entityIn.getYRot()) - 90));
		poseStack.mulPose(Vector3f.ZP.rotationDegrees(90 + Mth.lerp(partialTicks, entityIn.xRotO, entityIn.getXRot())));
		model.renderToBuffer(poseStack, vb, packedLightIn, OverlayTexture.NO_OVERLAY, 1, 1, 1, 0.0625f);
		poseStack.popPose();
		super.render(entityIn, entityYaw, partialTicks, poseStack, bufferIn, packedLightIn);
	}

	@Override
	public ResourceLocation getTextureLocation(CrusaderscrossbowEntity entity) {
		return texture;
	}
}
