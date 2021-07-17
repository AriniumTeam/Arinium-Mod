package net.mcreator.arinium.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.arinium.entity.RedEndermanEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class RedEndermanRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(RedEndermanEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelredenderman(), 0.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("arinium:textures/redenderman.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.7.5
	// Exported for Minecraft version 1.15
	// Paste this class into your mod and generate all required imports
	public static class Modelredenderman extends EntityModel<Entity> {
		private final ModelRenderer body;
		private final ModelRenderer head;
		private final ModelRenderer hat;
		private final ModelRenderer rightArm;
		private final ModelRenderer rightArm_r1;
		private final ModelRenderer rightArm_r2;
		private final ModelRenderer leftArm;
		private final ModelRenderer rightLeg;
		private final ModelRenderer leftLeg;
		public Modelredenderman() {
			textureWidth = 64;
			textureHeight = 32;
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, -14.0F, 0.0F);
			body.setTextureOffset(32, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, true);
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 0.0F, 0.0F);
			head.setTextureOffset(0, 0).addBox(-4.0F, -22.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, true);
			hat = new ModelRenderer(this);
			hat.setRotationPoint(0.0F, -14.0F, 0.0F);
			head.addChild(hat);
			hat.setTextureOffset(0, 16).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, -0.5F, true);
			rightArm = new ModelRenderer(this);
			rightArm.setRotationPoint(3.0F, -12.0F, 0.0F);
			rightArm.setTextureOffset(56, 0).addBox(1.0F, 7.0F, -1.0F, 2.0F, 21.0F, 2.0F, 0.0F, true);
			rightArm_r1 = new ModelRenderer(this);
			rightArm_r1.setRotationPoint(-10.0F, -2.0F, 9.0F);
			rightArm.addChild(rightArm_r1);
			setRotationAngle(rightArm_r1, 2.0508F, 0.0F, 0.0F);
			rightArm_r1.setTextureOffset(56, 0).addBox(2.0F, -21.0F, -1.0F, 2.0F, 13.0F, 2.0F, 0.0F, true);
			rightArm_r2 = new ModelRenderer(this);
			rightArm_r2.setRotationPoint(-1.0F, -2.0F, 9.0F);
			rightArm.addChild(rightArm_r2);
			setRotationAngle(rightArm_r2, 2.0508F, 0.0436F, 0.0F);
			rightArm_r2.setTextureOffset(56, 0).addBox(2.0F, -20.0F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, true);
			leftArm = new ModelRenderer(this);
			leftArm.setRotationPoint(-5.0F, -12.0F, 0.0F);
			leftArm.setTextureOffset(56, 0).addBox(-1.0F, 6.0F, -1.0F, 2.0F, 22.0F, 2.0F, 0.0F, false);
			rightLeg = new ModelRenderer(this);
			rightLeg.setRotationPoint(2.0F, -2.0F, 0.0F);
			rightLeg.setTextureOffset(56, 0).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 30.0F, 2.0F, 0.0F, true);
			leftLeg = new ModelRenderer(this);
			leftLeg.setRotationPoint(-2.0F, -2.0F, 0.0F);
			leftLeg.setTextureOffset(56, 0).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 30.0F, 2.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			rightArm.render(matrixStack, buffer, packedLight, packedOverlay);
			leftArm.render(matrixStack, buffer, packedLight, packedOverlay);
			rightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
			leftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
		}
	}
}
