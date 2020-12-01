
package net.mcreator.rubymod.itemgroup;

@RubymodModElements.ModElement.Tag
public class EpictabItemGroup extends RubymodModElements.ModElement {

	public EpictabItemGroup(RubymodModElements instance) {
		super(instance, 23);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabepictab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(TrollfaceItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}

	public static ItemGroup tab;

}
