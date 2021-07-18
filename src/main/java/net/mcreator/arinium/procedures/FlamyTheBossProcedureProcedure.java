package net.mcreator.arinium.procedures;

import net.minecraftforge.fml.server.ServerLifecycleHooks;

import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ChatType;
import net.minecraft.util.Util;
import net.minecraft.server.MinecraftServer;

import net.mcreator.arinium.AriniumModElements;
import net.mcreator.arinium.AriniumMod;

import java.util.Map;

@AriniumModElements.ModElement.Tag
public class FlamyTheBossProcedureProcedure extends AriniumModElements.ModElement {
	public FlamyTheBossProcedureProcedure(AriniumModElements instance) {
		super(instance, 200);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				AriniumMod.LOGGER.warn("Failed to load dependency world for procedure FlamyTheBossProcedure!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		if (!world.isRemote()) {
			MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
			if (mcserv != null)
				mcserv.getPlayerList().func_232641_a_(new StringTextComponent("NOOOOOOO You can't kill me I'm Flamy The Boss, I'm Invincible ..."),
						ChatType.SYSTEM, Util.DUMMY_UUID);
		}
	}
}
