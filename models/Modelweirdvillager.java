// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class Modelweirdvillager extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer nose;
	private final ModelRenderer body;
	private final ModelRenderer leg0;
	private final ModelRenderer leg1;
	private final ModelRenderer arms;
	private final ModelRenderer arms_r1;
	private final ModelRenderer arms_r1_r1;
	private final ModelRenderer arms_r2;
	private final ModelRenderer arms_r2_r1;
	private final ModelRenderer bb_main;

	public Modelweirdvillager() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.setTextureOffset(0, 0).addBox(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, 0.0F, true);

		nose = new ModelRenderer(this);
		nose.setRotationPoint(0.0F, -2.0F, 0.0F);
		nose.setTextureOffset(24, 0).addBox(-1.0F, -2.0F, -6.0F, 2.0F, 4.0F, 2.0F, 0.0F, true);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.setTextureOffset(16, 20).addBox(-4.0F, 0.0F, -3.0F, 8.0F, 8.0F, 6.0F, 0.0F, true);

		leg0 = new ModelRenderer(this);
		leg0.setRotationPoint(2.0F, 12.0F, 0.0F);
		leg0.setTextureOffset(0, 18).addBox(-2.0F, -4.0F, -2.0F, 4.0F, 16.0F, 4.0F, 0.0F, true);

		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(-2.0F, 12.0F, 0.0F);
		leg1.setTextureOffset(0, 18).addBox(-2.0F, -4.0F, -2.0F, 4.0F, 16.0F, 4.0F, 0.0F, true);

		arms = new ModelRenderer(this);
		arms.setRotationPoint(0.0F, 2.0F, 0.0F);

		arms_r1 = new ModelRenderer(this);
		arms_r1.setRotationPoint(-12.0F, 22.0F, 0.0F);
		arms.addChild(arms_r1);
		setRotationAngle(arms_r1, 0.0F, 0.0F, 0.6545F);

		arms_r1_r1 = new ModelRenderer(this);
		arms_r1_r1.setRotationPoint(12.0F, 0.0F, 0.0F);
		arms_r1.addChild(arms_r1_r1);
		setRotationAngle(arms_r1_r1, 0.0F, 0.0F, -0.6545F);
		arms_r1_r1.setTextureOffset(44, 18).addBox(-5.0F, -30.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, true);

		arms_r2 = new ModelRenderer(this);
		arms_r2.setRotationPoint(12.0F, 22.0F, 0.0F);
		arms.addChild(arms_r2);
		setRotationAngle(arms_r2, 0.0F, 0.0F, -0.6545F);

		arms_r2_r1 = new ModelRenderer(this);
		arms_r2_r1.setRotationPoint(-12.0F, 0.0F, 0.0F);
		arms_r2.addChild(arms_r2_r1);
		setRotationAngle(arms_r2_r1, 0.0F, 0.0F, 0.6545F);
		arms_r2_r1.setTextureOffset(44, 18).addBox(1.4101F, -30.1178F, -2.5497F, 4.0F, 12.0F, 4.0F, 0.0F, true);

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.setTextureOffset(45, 2).addBox(-2.0F, -35.0F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
		bb_main.setTextureOffset(56, 0).addBox(-3.0F, -35.0F, -2.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		nose.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		leg0.render(matrixStack, buffer, packedLight, packedOverlay);
		leg1.render(matrixStack, buffer, packedLight, packedOverlay);
		arms.render(matrixStack, buffer, packedLight, packedOverlay);
		bb_main.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.leg0.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.leg1.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.arms_r2.rotateAngleY = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.arms_r1_r1.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
		this.arms_r2_r1.rotateAngleY = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.arms_r1.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
	}
}