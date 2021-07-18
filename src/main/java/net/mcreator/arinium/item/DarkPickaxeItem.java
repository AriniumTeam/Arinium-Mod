
package net.mcreator.arinium.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.arinium.itemgroup.DarkAriniumItemGroup;
import net.mcreator.arinium.AriniumModElements;

@AriniumModElements.ModElement.Tag
public class DarkPickaxeItem extends AriniumModElements.ModElement {
	@ObjectHolder("arinium:dark_pickaxe")
	public static final Item block = null;
	public DarkPickaxeItem(AriniumModElements instance) {
		super(instance, 19);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 50000;
			}

			public float getEfficiency() {
				return 12f;
			}

			public float getAttackDamage() {
				return 3.5f;
			}

			public int getHarvestLevel() {
				return 4;
			}

			public int getEnchantability() {
				return 20;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(DarkAriniumIngotItem.block, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(DarkAriniumItemGroup.tab)) {
		}.setRegistryName("dark_pickaxe"));
	}
}
