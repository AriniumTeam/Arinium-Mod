
package net.mcreator.arinium;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;

import net.mcreator.arinium.item.SupremiumIngotItem;
import net.mcreator.arinium.item.KILLPOTIONItem;

@AriniumModElements.ModElement.Tag
public class KILLPOTIONRECIBrewingRecipe extends AriniumModElements.ModElement {
	public KILLPOTIONRECIBrewingRecipe(AriniumModElements instance) {
		super(instance, 290);
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		BrewingRecipeRegistry.addRecipe(Ingredient.fromStacks(new ItemStack(Items.POTION, (int) (1))),
				Ingredient.fromStacks(new ItemStack(SupremiumIngotItem.block, (int) (1))), new ItemStack(KILLPOTIONItem.block, (int) (1)));
	}
}
