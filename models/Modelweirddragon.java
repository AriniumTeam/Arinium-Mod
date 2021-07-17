// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class Modelweirddragon extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer mirrored;
	private final ModelRenderer spine;
	private final ModelRenderer jaw;
	private final ModelRenderer body;
	private final ModelRenderer left_wing;
	private final ModelRenderer left_wing_tip;
	private final ModelRenderer right_wing;
	private final ModelRenderer right_wing_tip;
	private final ModelRenderer front_left_leg;
	private final ModelRenderer front_left_shin;
	private final ModelRenderer front_left_foot;
	private final ModelRenderer back_left_leg;
	private final ModelRenderer back_left_shin;
	private final ModelRenderer back_left_foot;
	private final ModelRenderer front_right_leg;
	private final ModelRenderer front_right_shin;
	private final ModelRenderer front_right_foot;
	private final ModelRenderer back_right_leg;
	private final ModelRenderer back_right_shin;
	private final ModelRenderer back_right_foot;

	public Modelweirddragon() {
		textureWidth = 512;
		textureHeight = 512;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 18.0F, -24.0F);
		head.setTextureOffset(0, 88).addBox(-6.0F, -1.0F, -24.0F, 12.0F, 5.0F, 16.0F, 0.0F, false);
		head.setTextureOffset(0, 200).addBox(-8.0F, -8.0F, -10.0F, 16.0F, 16.0F, 16.0F, 0.0F, false);
		head.setTextureOffset(176, 184).addBox(-8.0F, -8.0F, -10.0F, 16.0F, 16.0F, 16.0F, 0.0F, false);
		head.setTextureOffset(0, 88).addBox(3.0F, -12.0F, -4.0F, 2.0F, 4.0F, 6.0F, 0.0F, false);
		head.setTextureOffset(0, 6).addBox(3.0F, -3.0F, -22.0F, 2.0F, 2.0F, 4.0F, 0.0F, false);

		mirrored = new ModelRenderer(this);
		mirrored.setRotationPoint(0.0F, 6.0F, 24.0F);
		head.addChild(mirrored);
		mirrored.setTextureOffset(36, 44).addBox(-5.0F, -18.0F, -28.0F, 2.0F, 4.0F, 6.0F, 0.0F, false);
		mirrored.setTextureOffset(0, 0).addBox(-5.0F, -9.0F, -46.0F, 2.0F, 2.0F, 4.0F, 0.0F, false);

		spine = new ModelRenderer(this);
		spine.setRotationPoint(0.0F, 19.0F, -13.0F);
		spine.setTextureOffset(216, 92).addBox(-5.0F, -5.0F, -5.0F, 10.0F, 10.0F, 10.0F, 0.0F, false);
		spine.setTextureOffset(36, 0).addBox(-1.0F, -9.0F, -3.0F, 2.0F, 4.0F, 6.0F, 0.0F, false);

		jaw = new ModelRenderer(this);
		jaw.setRotationPoint(0.0F, 22.0F, -32.0F);
		jaw.setTextureOffset(0, 109).addBox(-6.0F, 0.0F, -16.0F, 12.0F, 4.0F, 16.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 4.0F, 8.0F);
		body.setTextureOffset(0, 168).addBox(-12.0F, 0.0F, -16.0F, 24.0F, 24.0F, 64.0F, 0.0F, false);
		body.setTextureOffset(232, 204).addBox(-1.0F, -6.0F, -10.0F, 2.0F, 6.0F, 12.0F, 0.0F, false);
		body.setTextureOffset(228, 62).addBox(-1.0F, -6.0F, 10.0F, 2.0F, 6.0F, 12.0F, 0.0F, false);
		body.setTextureOffset(228, 32).addBox(-1.0F, -6.0F, 30.0F, 2.0F, 6.0F, 12.0F, 0.0F, false);

		left_wing = new ModelRenderer(this);
		left_wing.setRotationPoint(-12.0F, 5.0F, 2.0F);
		left_wing.setTextureOffset(168, 0).addBox(24.0F, -4.0F, -4.0F, 56.0F, 8.0F, 8.0F, 0.0F, false);
		left_wing.setTextureOffset(112, 112).addBox(24.0F, 0.0F, 2.0F, 56.0F, 0.0F, 56.0F, 0.0F, false);

		left_wing_tip = new ModelRenderer(this);
		left_wing_tip.setRotationPoint(-68.0F, 5.0F, 2.0F);
		left_wing_tip.setTextureOffset(168, 24).addBox(136.0F, -2.0F, -2.0F, 56.0F, 4.0F, 4.0F, 0.0F, false);
		left_wing_tip.setTextureOffset(0, 112).addBox(136.0F, 0.0F, 2.0F, 56.0F, 0.0F, 56.0F, 0.0F, false);

		right_wing = new ModelRenderer(this);
		right_wing.setRotationPoint(12.0F, 5.0F, 2.0F);
		right_wing.setTextureOffset(0, 56).addBox(-80.0F, 0.0F, 2.0F, 56.0F, 0.0F, 56.0F, 0.0F, false);
		right_wing.setTextureOffset(112, 168).addBox(-80.0F, -4.0F, -4.0F, 56.0F, 8.0F, 8.0F, 0.0F, false);

		right_wing_tip = new ModelRenderer(this);
		right_wing_tip.setRotationPoint(68.0F, 5.0F, 2.0F);
		right_wing_tip.setTextureOffset(0, 0).addBox(-192.0F, 0.0F, 2.0F, 56.0F, 0.0F, 56.0F, 0.0F, false);
		right_wing_tip.setTextureOffset(168, 16).addBox(-192.0F, -2.0F, -2.0F, 56.0F, 4.0F, 4.0F, 0.0F, false);

		front_left_leg = new ModelRenderer(this);
		front_left_leg.setRotationPoint(-12.0F, 20.0F, 2.0F);
		front_left_leg.setTextureOffset(208, 216).addBox(20.0F, -4.0F, -4.0F, 8.0F, 24.0F, 8.0F, 0.0F, false);

		front_left_shin = new ModelRenderer(this);
		front_left_shin.setRotationPoint(-12.0F, 41.0F, 2.0F);
		front_left_shin.setTextureOffset(240, 168).addBox(21.0F, -1.0F, -3.0F, 6.0F, 24.0F, 6.0F, 0.0F, false);

		front_left_foot = new ModelRenderer(this);
		front_left_foot.setRotationPoint(-11.0F, 64.0F, 2.0F);
		front_left_foot.setTextureOffset(168, 92).addBox(19.0F, 0.0F, -12.0F, 8.0F, 4.0F, 16.0F, 0.0F, false);

		back_left_leg = new ModelRenderer(this);
		back_left_leg.setRotationPoint(-16.0F, 16.0F, 42.0F);
		back_left_leg.setTextureOffset(112, 184).addBox(24.0F, -4.0F, -8.0F, 16.0F, 32.0F, 16.0F, 0.0F, false);

		back_left_shin = new ModelRenderer(this);
		back_left_shin.setRotationPoint(-16.0F, 46.0F, 36.0F);
		back_left_shin.setTextureOffset(0, 44).addBox(26.0F, -2.0F, 0.0F, 12.0F, 32.0F, 12.0F, 0.0F, false);

		back_left_foot = new ModelRenderer(this);
		back_left_foot.setRotationPoint(-16.0F, 76.0F, 44.0F);
		back_left_foot.setTextureOffset(168, 62).addBox(23.0F, 0.0F, -20.0F, 18.0F, 6.0F, 24.0F, 0.0F, false);

		front_right_leg = new ModelRenderer(this);
		front_right_leg.setRotationPoint(12.0F, 20.0F, 2.0F);
		front_right_leg.setTextureOffset(176, 216).addBox(-28.0F, -4.0F, -4.0F, 8.0F, 24.0F, 8.0F, 0.0F, false);

		front_right_shin = new ModelRenderer(this);
		front_right_shin.setRotationPoint(12.0F, 41.0F, 2.0F);
		front_right_shin.setTextureOffset(240, 240).addBox(-27.0F, -1.0F, -3.0F, 6.0F, 24.0F, 6.0F, 0.0F, false);

		front_right_foot = new ModelRenderer(this);
		front_right_foot.setRotationPoint(12.0F, 64.0F, 2.0F);
		front_right_foot.setTextureOffset(0, 129).addBox(-28.0F, 0.0F, -12.0F, 8.0F, 4.0F, 16.0F, 0.0F, false);

		back_right_leg = new ModelRenderer(this);
		back_right_leg.setRotationPoint(16.0F, 16.0F, 42.0F);
		back_right_leg.setTextureOffset(0, 152).addBox(-40.0F, -4.0F, -8.0F, 16.0F, 32.0F, 16.0F, 0.0F, false);

		back_right_shin = new ModelRenderer(this);
		back_right_shin.setRotationPoint(16.0F, 46.0F, 36.0F);
		back_right_shin.setTextureOffset(0, 0).addBox(-38.0F, -2.0F, 0.0F, 12.0F, 32.0F, 12.0F, 0.0F, false);

		back_right_foot = new ModelRenderer(this);
		back_right_foot.setRotationPoint(16.0F, 76.0F, 44.0F);
		back_right_foot.setTextureOffset(168, 32).addBox(-41.0F, 0.0F, -20.0F, 18.0F, 6.0F, 24.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		spine.render(matrixStack, buffer, packedLight, packedOverlay);
		jaw.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		left_wing.render(matrixStack, buffer, packedLight, packedOverlay);
		left_wing_tip.render(matrixStack, buffer, packedLight, packedOverlay);
		right_wing.render(matrixStack, buffer, packedLight, packedOverlay);
		right_wing_tip.render(matrixStack, buffer, packedLight, packedOverlay);
		front_left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		front_left_shin.render(matrixStack, buffer, packedLight, packedOverlay);
		front_left_foot.render(matrixStack, buffer, packedLight, packedOverlay);
		back_left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		back_left_shin.render(matrixStack, buffer, packedLight, packedOverlay);
		back_left_foot.render(matrixStack, buffer, packedLight, packedOverlay);
		front_right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		front_right_shin.render(matrixStack, buffer, packedLight, packedOverlay);
		front_right_foot.render(matrixStack, buffer, packedLight, packedOverlay);
		back_right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		back_right_shin.render(matrixStack, buffer, packedLight, packedOverlay);
		back_right_foot.render(matrixStack, buffer, packedLight, packedOverlay);
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