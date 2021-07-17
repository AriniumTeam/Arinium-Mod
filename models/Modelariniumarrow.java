// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class Modelariniumarrow extends EntityModel<Entity> {
	private final ModelRenderer arrow;
	private final ModelRenderer bone;

	public Modelariniumarrow() {
		textureWidth = 32;
		textureHeight = 32;

		arrow = new ModelRenderer(this);
		arrow.setRotationPoint(0.0F, 24.0F, 0.0F);
		arrow.setTextureOffset(0, 0).addBox(-8.0F, -5.0F, 0.0F, 16.0F, 5.0F, 0.0F, 0.0F, false);
		arrow.setTextureOffset(0, 0).addBox(-7.0F, -5.0F, -2.5F, 0.0F, 5.0F, 5.0F, 0.0F, false);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, -2.5F, 0.0F);
		arrow.addChild(bone);
		setRotationAngle(bone, 1.5708F, 0.0F, 0.0F);
		bone.setTextureOffset(0, 0).addBox(-8.0F, -2.5F, 0.0F, 16.0F, 5.0F, 0.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		arrow.render(matrixStack, buffer, packedLight, packedOverlay);
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