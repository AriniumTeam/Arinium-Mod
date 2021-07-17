
package net.mcreator.arinium.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;

import net.mcreator.arinium.itemgroup.UtilitiesItemGroup;
import net.mcreator.arinium.AriniumModElements;

@AriniumModElements.ModElement.Tag
public class BlueBirdItem extends AriniumModElements.ModElement {
	@ObjectHolder("arinium:blue_bird")
	public static final Item block = null;
	public BlueBirdItem(AriniumModElements instance) {
		super(instance, 52);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, AriniumModElements.sounds.get(new ResourceLocation("arinium:bluebird")),
					new Item.Properties().group(UtilitiesItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("blue_bird");
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public boolean hasEffect(ItemStack itemstack) {
			return true;
		}
	}
}
