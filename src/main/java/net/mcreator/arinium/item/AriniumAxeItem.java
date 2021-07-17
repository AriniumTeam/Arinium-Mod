
package net.mcreator.arinium.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import net.mcreator.arinium.itemgroup.AriniumItemGroup;
import net.mcreator.arinium.AriniumModElements;

@AriniumModElements.ModElement.Tag
public class AriniumAxeItem extends AriniumModElements.ModElement {
	@ObjectHolder("arinium:arinium_axe")
	public static final Item block = null;
	public AriniumAxeItem(AriniumModElements instance) {
		super(instance, 7);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 50000;
			}

			public float getEfficiency() {
				return 12f;
			}

			public float getAttackDamage() {
				return 10.5f;
			}

			public int getHarvestLevel() {
				return 4;
			}

			public int getEnchantability() {
				return 20;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(AriniumingotItem.block, (int) (1)));
			}
		}, 1, -3.4f, new Item.Properties().group(AriniumItemGroup.tab)) {
		}.setRegistryName("arinium_axe"));
	}
}
