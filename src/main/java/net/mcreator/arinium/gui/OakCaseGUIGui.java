
package net.mcreator.arinium.gui;

import net.minecraftforge.items.SlotItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.fml.network.NetworkEvent;
import net.minecraftforge.fml.network.IContainerFactory;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.DeferredWorkQueue;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.network.PacketBuffer;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.container.Slot;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.inventory.container.Container;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.client.gui.ScreenManager;

import net.mcreator.arinium.AriniumModElements;
import net.mcreator.arinium.AriniumMod;

import java.util.function.Supplier;
import java.util.Map;
import java.util.HashMap;

@AriniumModElements.ModElement.Tag
public class OakCaseGUIGui extends AriniumModElements.ModElement {
	public static HashMap guistate = new HashMap();
	private static ContainerType<GuiContainerMod> containerType = null;
	public OakCaseGUIGui(AriniumModElements instance) {
		super(instance, 137);
		elements.addNetworkMessage(ButtonPressedMessage.class, ButtonPressedMessage::buffer, ButtonPressedMessage::new,
				ButtonPressedMessage::handler);
		elements.addNetworkMessage(GUISlotChangedMessage.class, GUISlotChangedMessage::buffer, GUISlotChangedMessage::new,
				GUISlotChangedMessage::handler);
		containerType = new ContainerType<>(new GuiContainerModFactory());
		FMLJavaModLoadingContext.get().getModEventBus().register(new ContainerRegisterHandler());
	}
	private static class ContainerRegisterHandler {
		@SubscribeEvent
		public void registerContainer(RegistryEvent.Register<ContainerType<?>> event) {
			event.getRegistry().register(containerType.setRegistryName("oak_case_gui"));
		}
	}
	@OnlyIn(Dist.CLIENT)
	public void initElements() {
		DeferredWorkQueue.runLater(() -> ScreenManager.registerFactory(containerType, OakCaseGUIGuiWindow::new));
	}
	public static class GuiContainerModFactory implements IContainerFactory {
		public GuiContainerMod create(int id, PlayerInventory inv, PacketBuffer extraData) {
			return new GuiContainerMod(id, inv, extraData);
		}
	}

	public static class GuiContainerMod extends Container implements Supplier<Map<Integer, Slot>> {
		World world;
		PlayerEntity entity;
		int x, y, z;
		private IItemHandler internal;
		private Map<Integer, Slot> customSlots = new HashMap<>();
		private boolean bound = false;
		public GuiContainerMod(int id, PlayerInventory inv, PacketBuffer extraData) {
			super(containerType, id);
			this.entity = inv.player;
			this.world = inv.player.world;
			this.internal = new ItemStackHandler(64);
			BlockPos pos = null;
			if (extraData != null) {
				pos = extraData.readBlockPos();
				this.x = pos.getX();
				this.y = pos.getY();
				this.z = pos.getZ();
			}
			if (pos != null) {
				if (extraData.readableBytes() == 1) { // bound to item
					byte hand = extraData.readByte();
					ItemStack itemstack;
					if (hand == 0)
						itemstack = this.entity.getHeldItemMainhand();
					else
						itemstack = this.entity.getHeldItemOffhand();
					itemstack.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						this.internal = capability;
						this.bound = true;
					});
				} else if (extraData.readableBytes() > 1) {
					extraData.readByte(); // drop padding
					Entity entity = world.getEntityByID(extraData.readVarInt());
					if (entity != null)
						entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							this.internal = capability;
							this.bound = true;
						});
				} else { // might be bound to block
					TileEntity ent = inv.player != null ? inv.player.world.getTileEntity(pos) : null;
					if (ent != null) {
						ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							this.internal = capability;
							this.bound = true;
						});
					}
				}
			}
			this.customSlots.put(0, this.addSlot(new SlotItemHandler(internal, 0, 6, 6) {
			}));
			this.customSlots.put(1, this.addSlot(new SlotItemHandler(internal, 1, 24, 6) {
			}));
			this.customSlots.put(2, this.addSlot(new SlotItemHandler(internal, 2, 42, 6) {
			}));
			this.customSlots.put(3, this.addSlot(new SlotItemHandler(internal, 3, 60, 6) {
			}));
			this.customSlots.put(4, this.addSlot(new SlotItemHandler(internal, 4, 78, 6) {
			}));
			this.customSlots.put(5, this.addSlot(new SlotItemHandler(internal, 5, 96, 6) {
			}));
			this.customSlots.put(6, this.addSlot(new SlotItemHandler(internal, 6, 114, 6) {
			}));
			this.customSlots.put(7, this.addSlot(new SlotItemHandler(internal, 7, 132, 6) {
			}));
			this.customSlots.put(8, this.addSlot(new SlotItemHandler(internal, 8, 150, 6) {
			}));
			this.customSlots.put(9, this.addSlot(new SlotItemHandler(internal, 9, 168, 6) {
			}));
			this.customSlots.put(10, this.addSlot(new SlotItemHandler(internal, 10, 186, 6) {
			}));
			this.customSlots.put(11, this.addSlot(new SlotItemHandler(internal, 11, 204, 6) {
			}));
			this.customSlots.put(12, this.addSlot(new SlotItemHandler(internal, 12, 222, 6) {
			}));
			this.customSlots.put(13, this.addSlot(new SlotItemHandler(internal, 13, 276, 6) {
			}));
			this.customSlots.put(14, this.addSlot(new SlotItemHandler(internal, 14, 6, 24) {
			}));
			this.customSlots.put(15, this.addSlot(new SlotItemHandler(internal, 15, 24, 24) {
			}));
			this.customSlots.put(16, this.addSlot(new SlotItemHandler(internal, 16, 42, 24) {
			}));
			this.customSlots.put(17, this.addSlot(new SlotItemHandler(internal, 17, 60, 24) {
			}));
			this.customSlots.put(18, this.addSlot(new SlotItemHandler(internal, 18, 78, 24) {
			}));
			this.customSlots.put(19, this.addSlot(new SlotItemHandler(internal, 19, 96, 24) {
			}));
			this.customSlots.put(20, this.addSlot(new SlotItemHandler(internal, 20, 114, 24) {
			}));
			this.customSlots.put(21, this.addSlot(new SlotItemHandler(internal, 21, 132, 24) {
			}));
			this.customSlots.put(22, this.addSlot(new SlotItemHandler(internal, 22, 150, 24) {
			}));
			this.customSlots.put(23, this.addSlot(new SlotItemHandler(internal, 23, 168, 24) {
			}));
			this.customSlots.put(24, this.addSlot(new SlotItemHandler(internal, 24, 186, 24) {
			}));
			this.customSlots.put(25, this.addSlot(new SlotItemHandler(internal, 25, 204, 24) {
			}));
			this.customSlots.put(26, this.addSlot(new SlotItemHandler(internal, 26, 222, 24) {
			}));
			this.customSlots.put(27, this.addSlot(new SlotItemHandler(internal, 27, 276, 24) {
			}));
			this.customSlots.put(28, this.addSlot(new SlotItemHandler(internal, 28, 6, 42) {
			}));
			this.customSlots.put(29, this.addSlot(new SlotItemHandler(internal, 29, 24, 42) {
			}));
			this.customSlots.put(30, this.addSlot(new SlotItemHandler(internal, 30, 42, 42) {
			}));
			this.customSlots.put(31, this.addSlot(new SlotItemHandler(internal, 31, 60, 42) {
			}));
			this.customSlots.put(32, this.addSlot(new SlotItemHandler(internal, 32, 78, 42) {
			}));
			this.customSlots.put(33, this.addSlot(new SlotItemHandler(internal, 33, 96, 42) {
			}));
			this.customSlots.put(34, this.addSlot(new SlotItemHandler(internal, 34, 114, 42) {
			}));
			this.customSlots.put(35, this.addSlot(new SlotItemHandler(internal, 35, 132, 42) {
			}));
			this.customSlots.put(36, this.addSlot(new SlotItemHandler(internal, 36, 150, 42) {
			}));
			this.customSlots.put(37, this.addSlot(new SlotItemHandler(internal, 37, 168, 42) {
			}));
			this.customSlots.put(38, this.addSlot(new SlotItemHandler(internal, 38, 186, 42) {
			}));
			this.customSlots.put(39, this.addSlot(new SlotItemHandler(internal, 39, 204, 42) {
			}));
			this.customSlots.put(40, this.addSlot(new SlotItemHandler(internal, 40, 222, 42) {
			}));
			this.customSlots.put(41, this.addSlot(new SlotItemHandler(internal, 41, 276, 42) {
			}));
			this.customSlots.put(42, this.addSlot(new SlotItemHandler(internal, 42, 6, 60) {
			}));
			this.customSlots.put(43, this.addSlot(new SlotItemHandler(internal, 43, 24, 60) {
			}));
			this.customSlots.put(44, this.addSlot(new SlotItemHandler(internal, 44, 42, 60) {
			}));
			this.customSlots.put(45, this.addSlot(new SlotItemHandler(internal, 45, 60, 60) {
			}));
			this.customSlots.put(46, this.addSlot(new SlotItemHandler(internal, 46, 78, 60) {
			}));
			this.customSlots.put(47, this.addSlot(new SlotItemHandler(internal, 47, 96, 60) {
			}));
			this.customSlots.put(48, this.addSlot(new SlotItemHandler(internal, 48, 114, 60) {
			}));
			this.customSlots.put(49, this.addSlot(new SlotItemHandler(internal, 49, 132, 60) {
			}));
			this.customSlots.put(50, this.addSlot(new SlotItemHandler(internal, 50, 150, 60) {
			}));
			this.customSlots.put(51, this.addSlot(new SlotItemHandler(internal, 51, 168, 60) {
			}));
			this.customSlots.put(52, this.addSlot(new SlotItemHandler(internal, 52, 186, 60) {
			}));
			this.customSlots.put(53, this.addSlot(new SlotItemHandler(internal, 53, 204, 60) {
			}));
			this.customSlots.put(54, this.addSlot(new SlotItemHandler(internal, 54, 222, 60) {
			}));
			this.customSlots.put(55, this.addSlot(new SlotItemHandler(internal, 55, 276, 60) {
			}));
			this.customSlots.put(57, this.addSlot(new SlotItemHandler(internal, 57, 258, 24) {
			}));
			this.customSlots.put(58, this.addSlot(new SlotItemHandler(internal, 58, 258, 42) {
			}));
			this.customSlots.put(59, this.addSlot(new SlotItemHandler(internal, 59, 258, 60) {
			}));
			this.customSlots.put(56, this.addSlot(new SlotItemHandler(internal, 56, 258, 6) {
			}));
			this.customSlots.put(60, this.addSlot(new SlotItemHandler(internal, 60, 240, 6) {
			}));
			this.customSlots.put(61, this.addSlot(new SlotItemHandler(internal, 61, 240, 24) {
			}));
			this.customSlots.put(62, this.addSlot(new SlotItemHandler(internal, 62, 240, 42) {
			}));
			this.customSlots.put(63, this.addSlot(new SlotItemHandler(internal, 63, 240, 60) {
			}));
			int si;
			int sj;
			for (si = 0; si < 3; ++si)
				for (sj = 0; sj < 9; ++sj)
					this.addSlot(new Slot(inv, sj + (si + 1) * 9, 64 + 8 + sj * 18, 20 + 84 + si * 18));
			for (si = 0; si < 9; ++si)
				this.addSlot(new Slot(inv, si, 64 + 8 + si * 18, 20 + 142));
		}

		public Map<Integer, Slot> get() {
			return customSlots;
		}

		@Override
		public boolean canInteractWith(PlayerEntity player) {
			return true;
		}

		@Override
		public ItemStack transferStackInSlot(PlayerEntity playerIn, int index) {
			ItemStack itemstack = ItemStack.EMPTY;
			Slot slot = (Slot) this.inventorySlots.get(index);
			if (slot != null && slot.getHasStack()) {
				ItemStack itemstack1 = slot.getStack();
				itemstack = itemstack1.copy();
				if (index < 64) {
					if (!this.mergeItemStack(itemstack1, 64, this.inventorySlots.size(), true)) {
						return ItemStack.EMPTY;
					}
					slot.onSlotChange(itemstack1, itemstack);
				} else if (!this.mergeItemStack(itemstack1, 0, 64, false)) {
					if (index < 64 + 27) {
						if (!this.mergeItemStack(itemstack1, 64 + 27, this.inventorySlots.size(), true)) {
							return ItemStack.EMPTY;
						}
					} else {
						if (!this.mergeItemStack(itemstack1, 64, 64 + 27, false)) {
							return ItemStack.EMPTY;
						}
					}
					return ItemStack.EMPTY;
				}
				if (itemstack1.getCount() == 0) {
					slot.putStack(ItemStack.EMPTY);
				} else {
					slot.onSlotChanged();
				}
				if (itemstack1.getCount() == itemstack.getCount()) {
					return ItemStack.EMPTY;
				}
				slot.onTake(playerIn, itemstack1);
			}
			return itemstack;
		}

		@Override /**
					 * Merges provided ItemStack with the first avaliable one in the
					 * container/player inventor between minIndex (included) and maxIndex
					 * (excluded). Args : stack, minIndex, maxIndex, negativDirection. /!\ the
					 * Container implementation do not check if the item is valid for the slot
					 */
		protected boolean mergeItemStack(ItemStack stack, int startIndex, int endIndex, boolean reverseDirection) {
			boolean flag = false;
			int i = startIndex;
			if (reverseDirection) {
				i = endIndex - 1;
			}
			if (stack.isStackable()) {
				while (!stack.isEmpty()) {
					if (reverseDirection) {
						if (i < startIndex) {
							break;
						}
					} else if (i >= endIndex) {
						break;
					}
					Slot slot = this.inventorySlots.get(i);
					ItemStack itemstack = slot.getStack();
					if (slot.isItemValid(itemstack) && !itemstack.isEmpty() && areItemsAndTagsEqual(stack, itemstack)) {
						int j = itemstack.getCount() + stack.getCount();
						int maxSize = Math.min(slot.getSlotStackLimit(), stack.getMaxStackSize());
						if (j <= maxSize) {
							stack.setCount(0);
							itemstack.setCount(j);
							slot.putStack(itemstack);
							flag = true;
						} else if (itemstack.getCount() < maxSize) {
							stack.shrink(maxSize - itemstack.getCount());
							itemstack.setCount(maxSize);
							slot.putStack(itemstack);
							flag = true;
						}
					}
					if (reverseDirection) {
						--i;
					} else {
						++i;
					}
				}
			}
			if (!stack.isEmpty()) {
				if (reverseDirection) {
					i = endIndex - 1;
				} else {
					i = startIndex;
				}
				while (true) {
					if (reverseDirection) {
						if (i < startIndex) {
							break;
						}
					} else if (i >= endIndex) {
						break;
					}
					Slot slot1 = this.inventorySlots.get(i);
					ItemStack itemstack1 = slot1.getStack();
					if (itemstack1.isEmpty() && slot1.isItemValid(stack)) {
						if (stack.getCount() > slot1.getSlotStackLimit()) {
							slot1.putStack(stack.split(slot1.getSlotStackLimit()));
						} else {
							slot1.putStack(stack.split(stack.getCount()));
						}
						slot1.onSlotChanged();
						flag = true;
						break;
					}
					if (reverseDirection) {
						--i;
					} else {
						++i;
					}
				}
			}
			return flag;
		}

		@Override
		public void onContainerClosed(PlayerEntity playerIn) {
			super.onContainerClosed(playerIn);
			if (!bound && (playerIn instanceof ServerPlayerEntity)) {
				if (!playerIn.isAlive() || playerIn instanceof ServerPlayerEntity && ((ServerPlayerEntity) playerIn).hasDisconnected()) {
					for (int j = 0; j < internal.getSlots(); ++j) {
						if (j == 0)
							continue;
						if (j == 1)
							continue;
						if (j == 2)
							continue;
						if (j == 3)
							continue;
						if (j == 4)
							continue;
						if (j == 5)
							continue;
						if (j == 6)
							continue;
						if (j == 7)
							continue;
						if (j == 8)
							continue;
						if (j == 9)
							continue;
						if (j == 10)
							continue;
						if (j == 11)
							continue;
						if (j == 12)
							continue;
						if (j == 13)
							continue;
						if (j == 14)
							continue;
						if (j == 15)
							continue;
						if (j == 16)
							continue;
						if (j == 17)
							continue;
						if (j == 18)
							continue;
						if (j == 19)
							continue;
						if (j == 20)
							continue;
						if (j == 21)
							continue;
						if (j == 22)
							continue;
						if (j == 23)
							continue;
						if (j == 24)
							continue;
						if (j == 25)
							continue;
						if (j == 26)
							continue;
						if (j == 27)
							continue;
						if (j == 28)
							continue;
						if (j == 29)
							continue;
						if (j == 30)
							continue;
						if (j == 31)
							continue;
						if (j == 32)
							continue;
						if (j == 33)
							continue;
						if (j == 34)
							continue;
						if (j == 35)
							continue;
						if (j == 36)
							continue;
						if (j == 37)
							continue;
						if (j == 38)
							continue;
						if (j == 39)
							continue;
						if (j == 40)
							continue;
						if (j == 41)
							continue;
						if (j == 42)
							continue;
						if (j == 43)
							continue;
						if (j == 44)
							continue;
						if (j == 45)
							continue;
						if (j == 46)
							continue;
						if (j == 47)
							continue;
						if (j == 48)
							continue;
						if (j == 49)
							continue;
						if (j == 50)
							continue;
						if (j == 51)
							continue;
						if (j == 52)
							continue;
						if (j == 53)
							continue;
						if (j == 54)
							continue;
						if (j == 55)
							continue;
						if (j == 57)
							continue;
						if (j == 58)
							continue;
						if (j == 59)
							continue;
						if (j == 56)
							continue;
						playerIn.dropItem(internal.extractItem(j, internal.getStackInSlot(j).getCount(), false), false);
					}
				} else {
					for (int i = 0; i < internal.getSlots(); ++i) {
						if (i == 0)
							continue;
						if (i == 1)
							continue;
						if (i == 2)
							continue;
						if (i == 3)
							continue;
						if (i == 4)
							continue;
						if (i == 5)
							continue;
						if (i == 6)
							continue;
						if (i == 7)
							continue;
						if (i == 8)
							continue;
						if (i == 9)
							continue;
						if (i == 10)
							continue;
						if (i == 11)
							continue;
						if (i == 12)
							continue;
						if (i == 13)
							continue;
						if (i == 14)
							continue;
						if (i == 15)
							continue;
						if (i == 16)
							continue;
						if (i == 17)
							continue;
						if (i == 18)
							continue;
						if (i == 19)
							continue;
						if (i == 20)
							continue;
						if (i == 21)
							continue;
						if (i == 22)
							continue;
						if (i == 23)
							continue;
						if (i == 24)
							continue;
						if (i == 25)
							continue;
						if (i == 26)
							continue;
						if (i == 27)
							continue;
						if (i == 28)
							continue;
						if (i == 29)
							continue;
						if (i == 30)
							continue;
						if (i == 31)
							continue;
						if (i == 32)
							continue;
						if (i == 33)
							continue;
						if (i == 34)
							continue;
						if (i == 35)
							continue;
						if (i == 36)
							continue;
						if (i == 37)
							continue;
						if (i == 38)
							continue;
						if (i == 39)
							continue;
						if (i == 40)
							continue;
						if (i == 41)
							continue;
						if (i == 42)
							continue;
						if (i == 43)
							continue;
						if (i == 44)
							continue;
						if (i == 45)
							continue;
						if (i == 46)
							continue;
						if (i == 47)
							continue;
						if (i == 48)
							continue;
						if (i == 49)
							continue;
						if (i == 50)
							continue;
						if (i == 51)
							continue;
						if (i == 52)
							continue;
						if (i == 53)
							continue;
						if (i == 54)
							continue;
						if (i == 55)
							continue;
						if (i == 57)
							continue;
						if (i == 58)
							continue;
						if (i == 59)
							continue;
						if (i == 56)
							continue;
						playerIn.inventory.placeItemBackInInventory(playerIn.world,
								internal.extractItem(i, internal.getStackInSlot(i).getCount(), false));
					}
				}
			}
		}

		private void slotChanged(int slotid, int ctype, int meta) {
			if (this.world != null && this.world.isRemote()) {
				AriniumMod.PACKET_HANDLER.sendToServer(new GUISlotChangedMessage(slotid, x, y, z, ctype, meta));
				handleSlotAction(entity, slotid, ctype, meta, x, y, z);
			}
		}
	}

	public static class ButtonPressedMessage {
		int buttonID, x, y, z;
		public ButtonPressedMessage(PacketBuffer buffer) {
			this.buttonID = buffer.readInt();
			this.x = buffer.readInt();
			this.y = buffer.readInt();
			this.z = buffer.readInt();
		}

		public ButtonPressedMessage(int buttonID, int x, int y, int z) {
			this.buttonID = buttonID;
			this.x = x;
			this.y = y;
			this.z = z;
		}

		public static void buffer(ButtonPressedMessage message, PacketBuffer buffer) {
			buffer.writeInt(message.buttonID);
			buffer.writeInt(message.x);
			buffer.writeInt(message.y);
			buffer.writeInt(message.z);
		}

		public static void handler(ButtonPressedMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				PlayerEntity entity = context.getSender();
				int buttonID = message.buttonID;
				int x = message.x;
				int y = message.y;
				int z = message.z;
				handleButtonAction(entity, buttonID, x, y, z);
			});
			context.setPacketHandled(true);
		}
	}

	public static class GUISlotChangedMessage {
		int slotID, x, y, z, changeType, meta;
		public GUISlotChangedMessage(int slotID, int x, int y, int z, int changeType, int meta) {
			this.slotID = slotID;
			this.x = x;
			this.y = y;
			this.z = z;
			this.changeType = changeType;
			this.meta = meta;
		}

		public GUISlotChangedMessage(PacketBuffer buffer) {
			this.slotID = buffer.readInt();
			this.x = buffer.readInt();
			this.y = buffer.readInt();
			this.z = buffer.readInt();
			this.changeType = buffer.readInt();
			this.meta = buffer.readInt();
		}

		public static void buffer(GUISlotChangedMessage message, PacketBuffer buffer) {
			buffer.writeInt(message.slotID);
			buffer.writeInt(message.x);
			buffer.writeInt(message.y);
			buffer.writeInt(message.z);
			buffer.writeInt(message.changeType);
			buffer.writeInt(message.meta);
		}

		public static void handler(GUISlotChangedMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				PlayerEntity entity = context.getSender();
				int slotID = message.slotID;
				int changeType = message.changeType;
				int meta = message.meta;
				int x = message.x;
				int y = message.y;
				int z = message.z;
				handleSlotAction(entity, slotID, changeType, meta, x, y, z);
			});
			context.setPacketHandled(true);
		}
	}
	static void handleButtonAction(PlayerEntity entity, int buttonID, int x, int y, int z) {
		World world = entity.world;
		// security measure to prevent arbitrary chunk generation
		if (!world.isBlockLoaded(new BlockPos(x, y, z)))
			return;
	}

	private static void handleSlotAction(PlayerEntity entity, int slotID, int changeType, int meta, int x, int y, int z) {
		World world = entity.world;
		// security measure to prevent arbitrary chunk generation
		if (!world.isBlockLoaded(new BlockPos(x, y, z)))
			return;
	}
}