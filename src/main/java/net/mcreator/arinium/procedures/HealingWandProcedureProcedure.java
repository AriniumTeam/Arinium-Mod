package net.mcreator.arinium.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.IWorld;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.arinium.particle.UwuParticleParticle;
import net.mcreator.arinium.AriniumModElements;
import net.mcreator.arinium.AriniumMod;

import java.util.Map;

@AriniumModElements.ModElement.Tag
public class HealingWandProcedureProcedure extends AriniumModElements.ModElement {
	public HealingWandProcedureProcedure(AriniumModElements instance) {
		super(instance, 189);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				AriniumMod.LOGGER.warn("Failed to load dependency entity for procedure HealingWandProcedure!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				AriniumMod.LOGGER.warn("Failed to load dependency itemstack for procedure HealingWandProcedure!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				AriniumMod.LOGGER.warn("Failed to load dependency x for procedure HealingWandProcedure!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				AriniumMod.LOGGER.warn("Failed to load dependency y for procedure HealingWandProcedure!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				AriniumMod.LOGGER.warn("Failed to load dependency z for procedure HealingWandProcedure!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				AriniumMod.LOGGER.warn("Failed to load dependency world for procedure HealingWandProcedure!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).setHealth((float) 20);
		if (entity instanceof PlayerEntity)
			((PlayerEntity) entity).getCooldownTracker().setCooldown(((itemstack)).getItem(), (int) 400);
		if (world instanceof ServerWorld) {
			((ServerWorld) world).spawnParticle(UwuParticleParticle.particle, x, y, z, (int) 100, 3, 3, 3, 1);
		}
	}
}
