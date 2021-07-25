
package net.mcreator.arinium.block;

import net.minecraft.block.material.Material;

@AriniumModElements.ModElement.Tag
public class AquaBricksBlock extends AriniumModElements.ModElement {

	@ObjectHolder("arinium:aqua_bricks")
	public static final Block block = null;

	public AquaBricksBlock(AriniumModElements instance) {
		super(instance, 353);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(AriniumItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends Block {

		public CustomBlock() {
			super(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(1f, 10f).setLightLevel(s -> 0));

			setRegistryName("aqua_bricks");
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
