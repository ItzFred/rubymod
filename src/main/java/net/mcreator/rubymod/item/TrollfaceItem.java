
package net.mcreator.rubymod.item;

@RubymodModElements.ModElement.Tag
public class TrollfaceItem extends RubymodModElements.ModElement {

	@ObjectHolder("rubymod:trollface")
	public static final Item block = null;

	public TrollfaceItem(RubymodModElements instance) {
		super(instance, 23);

	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(EpictabItemGroup.tab).maxStackSize(64).rarity(Rarity.EPIC));
			setRegistryName("trollface");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}

	}

}
