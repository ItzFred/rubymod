
package net.mcreator.rubymod.item;

@RubymodModElements.ModElement.Tag
public class PooItem extends RubymodModElements.ModElement {

	@ObjectHolder("rubymod:poo")
	public static final Item block = null;

	public PooItem(RubymodModElements instance) {
		super(instance, 24);

	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(EpictabItemGroup.tab).maxStackSize(64).rarity(Rarity.EPIC));
			setRegistryName("poo");
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
