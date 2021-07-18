
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
public class SupremiumAxeItem extends AriniumModElements.ModElement {
	@ObjectHolder("arinium:supremium_axe")
	public static final Item block = null;
	public SupremiumAxeItem(AriniumModElements instance) {
		super(instance, 97);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 120000;
			}

			public float getEfficiency() {
				return 12f;
			}

			public float getAttackDamage() {
				return 20f;
			}

			public int getHarvestLevel() {
				return 6;
			}

			public int getEnchantability() {
				return 20;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(SupremiumIngotItem.block, (int) (1)));
			}
		}, 1, -3.4f, new Item.Properties().group(UtilitiesItemGroup.tab)) {
		}.setRegistryName("supremium_axe"));
	}
}
