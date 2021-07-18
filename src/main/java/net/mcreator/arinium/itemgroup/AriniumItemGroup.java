
package net.mcreator.arinium.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.arinium.item.AriniumdustItem;
import net.mcreator.arinium.AriniumModElements;

@AriniumModElements.ModElement.Tag
public class AriniumItemGroup extends AriniumModElements.ModElement {
	public AriniumItemGroup(AriniumModElements instance) {
		super(instance, 265);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabarinium") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(AriniumdustItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
