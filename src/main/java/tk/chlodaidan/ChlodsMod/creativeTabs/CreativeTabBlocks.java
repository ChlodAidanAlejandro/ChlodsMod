package tk.chlodaidan.ChlodsMod.creativeTabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import tk.chlodaidan.ChlodsMod.objects.Items;
import tk.chlodaidan.ChlodsMod.objects.blocks.Blocks;

public class CreativeTabBlocks extends CreativeTabs {

	public CreativeTabBlocks(String lable) {
		super(lable);
	}

	@Override
	public Item getTabIconItem() {
		return Item.getItemFromBlock(Blocks.ExtraBlock);
	}

}
