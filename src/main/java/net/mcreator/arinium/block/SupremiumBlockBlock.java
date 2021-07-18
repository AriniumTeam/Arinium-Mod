
package net.mcreator.arinium.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.common.ToolType;

import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.arinium.itemgroup.UtilitiesItemGroup;
import net.mcreator.arinium.AriniumModElements;

import java.util.List;
import java.util.Collections;

@AriniumModElements.ModElement.Tag
public class SupremiumBlockBlock extends AriniumModElements.ModElement {
	@ObjectHolder("arinium:supremium_block")
	public static final Block block = null;
	public SupremiumBlockBlock(AriniumModElements instance) {
		super(instance, 94);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(UtilitiesItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.IRON).sound(SoundType.METAL).hardnessAndResistance(8f, 40f).setLightLevel(s -> 0).harvestLevel(5)
					.harvestTool(ToolType.PICKAXE).setRequiresTool().slipperiness(1.5f));
			setRegistryName("supremium_block");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}
	}
}
