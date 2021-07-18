
package net.mcreator.arinium.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;

import net.mcreator.arinium.itemgroup.UtilitiesItemGroup;
import net.mcreator.arinium.AriniumModElements;

@AriniumModElements.ModElement.Tag
public class CornItem extends AriniumModElements.ModElement {
	@ObjectHolder("arinium:corn")
	public static final Item block = null;
	public CornItem(AriniumModElements instance) {
		super(instance, 40);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(UtilitiesItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(0).saturation(0f).build()));
			setRegistryName("corn");
		}

		@Override
		public int getUseDuration(ItemStack stack) {
			return 3;
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}
	}
}
