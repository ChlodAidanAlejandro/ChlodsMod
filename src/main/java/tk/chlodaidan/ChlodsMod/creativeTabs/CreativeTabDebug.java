package tk.chlodaidan.ChlodsMod.creativeTabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import tk.chlodaidan.ChlodsMod.objects.Items;

public class CreativeTabDebug extends CreativeTabs {

	public CreativeTabDebug(String lable) {
		super(lable);
	}
	
	@Override
	public Item getTabIconItem() {
		return Items.Crashifier;
	}

}
