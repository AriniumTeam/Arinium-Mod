// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class Modelgreenenderman extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer head;
	private final ModelRenderer hat;
	private final ModelRenderer rightArm;
	private final ModelRenderer leftArm;
	private final ModelRenderer rightLeg;
	private final ModelRenderer leftLeg;
	private final ModelRenderer bb_main;
	private final ModelRenderer bb_main2;

	public Modelgreenenderman() {
		textureWidth = 64;
		textureHeight = 32;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -14.0F, 0.0F);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.setTextureOffset(0, 0).addBox(5.0F, -24.0F, -5.0F, 8.0F, 8.0F, 8.0F, 0.0F, true);
		head.setTextureOffset(0, 0).addBox(-13.0F, -24.0F, -5.0F, 8.0F, 8.0F, 8.0F, 0.0F, true);
		head.setTextureOffset(39, 25).addBox(-11.0F, -15.0F, 0.0F, 11.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(40, 29).addBox(0.0F, -15.0F, 0.0F, 11.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(54, 29).addBox(-11.0F, -16.0F, 0.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(50, 26).addBox(7.0F, -16.0F, 0.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		hat = new ModelRenderer(this);
		hat.setRotationPoint(0.0F, -14.0F, 0.0F);
		hat.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, -0.5F, true);

		rightArm = new ModelRenderer(this);
		rightArm.setRotationPoint(3.0F, -12.0F, 0.0F);
		rightArm.setTextureOffset(45, 0).addBox(8.0F, -2.0F, -1.0F, 4.0F, 30.0F, 2.0F, 0.0F, true);

		leftArm = new ModelRenderer(this);
		leftArm.setRotationPoint(-5.0F, -12.0F, 0.0F);
		leftArm.setTextureOffset(46, 0).addBox(-10.0F, -2.0F, -1.0F, 4.0F, 30.0F, 2.0F, 0.0F, false);
		leftArm.setTextureOffset(0, 0).addBox(-1.0F, 3.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		rightLeg = new ModelRenderer(this);
		rightLeg.setRotationPoint(2.0F, -2.0F, 0.0F);
		rightLeg.setTextureOffset(36, 2).addBox(-1.0F, 6.0F, -1.0F, 7.0F, 20.0F, 2.0F, 0.0F, true);

		leftLeg = new ModelRenderer(this);
		leftLeg.setRotationPoint(-2.0F, -2.0F, 0.0F);
		leftLeg.setTextureOffset(43, 0).addBox(-6.0F, 6.0F, -1.0F, 7.0F, 20.0F, 2.0F, 0.0F, false);

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.setTextureOffset(20, 6).addBox(-8.0F, -36.0F, -3.0F, 16.0F, 20.0F, 6.0F, 0.0F, false);
		bb_main.setTextureOffset(42, 9).addBox(-11.0F, -35.0F, 0.0F, 5.0F, 3.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(32, 9).addBox(8.0F, -35.0F, 0.0F, 5.0F, 3.0F, 1.0F, 0.0F, false);

		bb_main2 = new ModelRenderer(this);
		bb_main2.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main2.setTextureOffset(0, 0).addBox(-2.0F, -38.0F, -2.0F, 3.0F, 2.0F, 4.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		hat.render(matrixStack, buffer, packedLight, packedOverlay);
		rightArm.render(matrixStack, buffer, packedLight, packedOverlay);
		leftArm.render(matrixStack, buffer, packedLight, packedOverlay);
		rightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
		leftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
		bb_main.render(matrixStack, buffer, packedLight, packedOverlay);
		bb_main2.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
	}
}