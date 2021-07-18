
package net.mcreator.arinium.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.arinium.item.DarkAriniumIngotItem;
import net.mcreator.arinium.AriniumModElements;

@AriniumModElements.ModElement.Tag
public class DarkAriniumItemGroup extends AriniumModElements.ModElement {
	public DarkAriniumItemGroup(AriniumModElements instance) {
		super(instance, 344);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabdark_arinium") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(DarkAriniumIngotItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
