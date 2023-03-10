// Made with Blockbench 4.5.1
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelsyrenge<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "syrenge"), "main");
	private final ModelPart body;

	public Modelsyrenge(ModelPart root) {
		this.body = root.getChild("body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -1.5F, -2.0F, 3.0F, 3.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 21.5F, 0.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition liquid = body.addOrReplaceChild("liquid",
				CubeListBuilder.create().texOffs(24, 0)
						.addBox(1.575F, -0.5025F, -2.0F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(24, 0)
						.addBox(-1.525F, -0.5025F, -2.0F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(14, 5)
						.addBox(-0.525F, -1.5025F, -2.0F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(14, 5)
						.addBox(-0.525F, 1.5075F, -2.0F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.025F, 0.0025F, 1.0F));

		PartDefinition handle = body.addOrReplaceChild("handle", CubeListBuilder.create().texOffs(0, 9).addBox(-3.5F,
				-2.5F, -1.0F, 6.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.5F, 0.0F, 5.0F));

		PartDefinition tip = body.addOrReplaceChild("tip", CubeListBuilder.create().texOffs(12, 0).addBox(2.0F, -2.0F,
				-4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.5F, 1.5F, -2.0F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}