package tk.chlodaidan.ChlodsMod.creativeTabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import tk.chlodaidan.ChlodsMod.objects.tools.Tools;

public class CreativeTabTools extends CreativeTabs {

	public CreativeTabTools(String lable) {
		super(lable);
	}

	@Override
	public Item getTabIconItem() {
		return Tools.ExtraPickaxe;
	}

}
