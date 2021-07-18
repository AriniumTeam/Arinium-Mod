
package net.mcreator.arinium.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import net.mcreator.arinium.itemgroup.UtilitiesItemGroup;
import net.mcreator.arinium.AriniumModElements;

@AriniumModElements.ModElement.Tag
public class AmethystAxeItem extends AriniumModElements.ModElement {
	@ObjectHolder("arinium:amethyst_axe")
	public static final Item block = null;
	public AmethystAxeItem(AriniumModElements instance) {
		super(instance, 28);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 7000;
			}

			public float getEfficiency() {
				return 9.5f;
			}

			public float getAttackDamage() {
				return 1.5f;
			}

			public int getHarvestLevel() {
				return 3;
			}

			public int getEnchantability() {
				return 11;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(AmethystItem.block, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(UtilitiesItemGroup.tab)) {
		}.setRegistryName("amethyst_axe"));
	}
}
