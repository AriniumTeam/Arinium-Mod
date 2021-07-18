
package net.mcreator.arinium.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.arinium.item.IronRodItem;
import net.mcreator.arinium.AriniumModElements;

@AriniumModElements.ModElement.Tag
public class UtilitiesItemGroup extends AriniumModElements.ModElement {
	public UtilitiesItemGroup(AriniumModElements instance) {
		super(instance, 266);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabutilities") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(IronRodItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
