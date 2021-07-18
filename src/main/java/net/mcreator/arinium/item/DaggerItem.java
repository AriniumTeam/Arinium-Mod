
package net.mcreator.arinium.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.Hand;
import net.minecraft.util.ActionResult;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.entity.player.PlayerEntity;

import net.mcreator.arinium.procedures.DaggerProcedureProcedure;
import net.mcreator.arinium.itemgroup.UtilitiesItemGroup;
import net.mcreator.arinium.AriniumModElements;

import java.util.Map;
import java.util.HashMap;

@AriniumModElements.ModElement.Tag
public class DaggerItem extends AriniumModElements.ModElement {
	@ObjectHolder("arinium:dagger")
	public static final Item block = null;
	public DaggerItem(AriniumModElements instance) {
		super(instance, 72);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 65;
			}

			public float getEfficiency() {
				return 4.5f;
			}

			public float getAttackDamage() {
				return 0.5f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 4;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(SteelItem.block, (int) (1)));
			}
		}, 3, -3f, new Item.Properties().group(UtilitiesItemGroup.tab)) {
			@Override
			public ActionResult<ItemStack> onItemRightClick(World world, PlayerEntity entity, Hand hand) {
				ActionResult<ItemStack> retval = super.onItemRightClick(world, entity, hand);
				ItemStack itemstack = retval.getResult();
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					DaggerProcedureProcedure.executeProcedure($_dependencies);
				}
				return retval;
			}
		}.setRegistryName("dagger"));
	}
}
