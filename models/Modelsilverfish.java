// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class Modelsilverfish extends EntityModel<Entity> {
	private final ModelRenderer bodyPart_2;
	private final ModelRenderer bodyPart_0;
	private final ModelRenderer bodyPart_1;
	private final ModelRenderer bodyLayer_2;
	private final ModelRenderer bodyPart_3;
	private final ModelRenderer bodyPart_4;
	private final ModelRenderer bodyLayer_1;
	private final ModelRenderer bodyPart_5;
	private final ModelRenderer bodyPart_6;
	private final ModelRenderer bodyLayer_0;

	public Modelsilverfish() {
		textureWidth = 64;
		textureHeight = 32;

		bodyPart_2 = new ModelRenderer(this);
		bodyPart_2.setRotationPoint(0.0F, 20.0F, 1.0F);
		bodyPart_2.setTextureOffset(0, 9).addBox(-3.0F, 0.0F, -1.5F, 6.0F, 4.0F, 3.0F, 0.0F, false);

		bodyPart_0 = new ModelRenderer(this);
		bodyPart_0.setRotationPoint(0.0F, 2.0F, -4.5F);
		bodyPart_2.addChild(bodyPart_0);
		bodyPart_0.setTextureOffset(0, 0).addBox(-1.5F, 0.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);

		bodyPart_1 = new ModelRenderer(this);
		bodyPart_1.setRotationPoint(0.0F, 1.0F, -2.5F);
		bodyPart_2.addChild(bodyPart_1);
		bodyPart_1.setTextureOffset(0, 4).addBox(-2.0F, 0.0F, -1.0F, 4.0F, 3.0F, 2.0F, 0.0F, false);

		bodyLayer_2 = new ModelRenderer(this);
		bodyLayer_2.setRotationPoint(0.0F, -2.0F, 0.0F);
		bodyPart_1.addChild(bodyLayer_2);
		bodyLayer_2.setTextureOffset(20, 18).addBox(-3.0F, 0.0F, -1.5F, 6.0F, 5.0F, 2.0F, 0.0F, false);

		bodyPart_3 = new ModelRenderer(this);
		bodyPart_3.setRotationPoint(0.0F, 1.0F, 3.0F);
		bodyPart_2.addChild(bodyPart_3);
		bodyPart_3.setTextureOffset(0, 16).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);

		bodyPart_4 = new ModelRenderer(this);
		bodyPart_4.setRotationPoint(0.0F, 2.0F, 6.0F);
		bodyPart_2.addChild(bodyPart_4);
		bodyPart_4.setTextureOffset(0, 22).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 2.0F, 3.0F, 0.0F, false);

		bodyLayer_1 = new ModelRenderer(this);
		bodyLayer_1.setRotationPoint(0.0F, -2.0F, 0.0F);
		bodyPart_4.addChild(bodyLayer_1);
		bodyLayer_1.setTextureOffset(20, 11).addBox(-3.0F, 0.0F, -1.5F, 6.0F, 4.0F, 3.0F, 0.0F, false);

		bodyPart_5 = new ModelRenderer(this);
		bodyPart_5.setRotationPoint(0.0F, 3.0F, 8.5F);
		bodyPart_2.addChild(bodyPart_5);
		bodyPart_5.setTextureOffset(11, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		bodyPart_6 = new ModelRenderer(this);
		bodyPart_6.setRotationPoint(0.0F, 3.0F, 10.5F);
		bodyPart_2.addChild(bodyPart_6);
		bodyPart_6.setTextureOffset(13, 4).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		bodyLayer_0 = new ModelRenderer(this);
		bodyLayer_0.setRotationPoint(0.0F, -4.0F, 0.0F);
		bodyPart_2.addChild(bodyLayer_0);
		bodyLayer_0.setTextureOffset(20, 0).addBox(-5.0F, 0.0F, -1.5F, 10.0F, 8.0F, 3.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		bodyPart_2.render(matrixStack, buffer, packedLight, packedOverlay);
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