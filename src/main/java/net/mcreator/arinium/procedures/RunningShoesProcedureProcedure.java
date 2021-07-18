package net.mcreator.arinium.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.arinium.AriniumModElements;
import net.mcreator.arinium.AriniumMod;

import java.util.Map;

@AriniumModElements.ModElement.Tag
public class RunningShoesProcedureProcedure extends AriniumModElements.ModElement {
	public RunningShoesProcedureProcedure(AriniumModElements instance) {
		super(instance, 159);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				AriniumMod.LOGGER.warn("Failed to load dependency entity for procedure RunningShoesProcedure!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SPEED, (int) 60, (int) 1, (false), (false)));
	}
}
