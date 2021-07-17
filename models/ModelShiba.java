// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class ModelShiba extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer upperBody;
	private final ModelRenderer leg0;
	private final ModelRenderer leg1;
	private final ModelRenderer leg2;
	private final ModelRenderer leg3;
	private final ModelRenderer tail;
	private final ModelRenderer tail_r1;

	public ModelShiba() {
		textureWidth = 64;
		textureHeight = 32;

		head = new ModelRenderer(this);
		head.setRotationPoint(1.0F, 13.5F, -7.0F);
		head.setTextureOffset(0, 0).addBox(-3.0F, -3.0F, -2.0F, 6.0F, 6.0F, 4.0F, 0.0F, true);
		head.setTextureOffset(16, 14).addBox(1.0F, -5.0F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F, true);
		head.setTextureOffset(16, 14).addBox(-3.0F, -5.0F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F, true);
		head.setTextureOffset(0, 10).addBox(-1.5F, -0.02F, -5.0F, 3.0F, 3.0F, 4.0F, 0.0F, true);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 14.0F, 2.0F);
		body.setTextureOffset(19, 13).addBox(-2.0F, -2.0F, -5.0F, 6.0F, 7.0F, 10.0F, 0.0F, true);

		upperBody = new ModelRenderer(this);
		upperBody.setRotationPoint(1.0F, 14.0F, 2.0F);
		upperBody.setTextureOffset(21, 0).addBox(-4.0F, -3.0F, -7.0F, 8.0F, 6.0F, 7.0F, 0.0F, true);

		leg0 = new ModelRenderer(this);
		leg0.setRotationPoint(2.5F, 16.0F, 7.0F);
		leg0.setTextureOffset(0, 18).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 8.0F, 2.0F, 0.0F, true);

		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(-0.5F, 16.0F, 7.0F);
		leg1.setTextureOffset(0, 18).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 8.0F, 2.0F, 0.0F, true);

		leg2 = new ModelRenderer(this);
		leg2.setRotationPoint(2.5F, 16.0F, -4.0F);
		leg2.setTextureOffset(0, 18).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, true);

		leg3 = new ModelRenderer(this);
		leg3.setRotationPoint(-0.5F, 16.0F, -4.0F);
		leg3.setTextureOffset(0, 18).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, true);

		tail = new ModelRenderer(this);
		tail.setRotationPoint(1.0F, 12.0F, 8.0F);

		tail_r1 = new ModelRenderer(this);
		tail_r1.setRotationPoint(-1.0F, 7.0F, 12.0F);
		tail.addChild(tail_r1);
		setRotationAngle(tail_r1, 1.8762F, 0.0F, 0.0F);
		tail_r1.setTextureOffset(9, 18).addBox(0.0F, -12.0F, 7.0F, 2.0F, 8.0F, 2.0F, 0.0F, true);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		upperBody.render(matrixStack, buffer, packedLight, packedOverlay);
		leg0.render(matrixStack, buffer, packedLight, packedOverlay);
		leg1.render(matrixStack, buffer, packedLight, packedOverlay);
		leg2.render(matrixStack, buffer, packedLight, packedOverlay);
		leg3.render(matrixStack, buffer, packedLight, packedOverlay);
		tail.render(matrixStack, buffer, packedLight, packedOverlay);
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
		this.leg0.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.leg1.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.leg2.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.leg3.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}