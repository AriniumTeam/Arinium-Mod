package net.mcreator.arinium.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.arinium.AriniumModElements;
import net.mcreator.arinium.AriniumMod;

import java.util.Map;

@AriniumModElements.ModElement.Tag
public class AmethystHammerProcedure2Procedure extends AriniumModElements.ModElement {
	public AmethystHammerProcedure2Procedure(AriniumModElements instance) {
		super(instance, 249);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				AriniumMod.LOGGER.warn("Failed to load dependency entity for procedure AmethystHammerProcedure2!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				AriniumMod.LOGGER.warn("Failed to load dependency itemstack for procedure AmethystHammerProcedure2!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SPEED, (int) 200, (int) 1, (false), (false)));
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.HASTE, (int) 200, (int) 2, (false), (false)));
		if (entity instanceof PlayerEntity)
			((PlayerEntity) entity).getCooldownTracker().setCooldown(((itemstack)).getItem(), (int) 1000);
	}
}
