package tk.chlodaidan.ChlodsMod.creativeTabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import tk.chlodaidan.ChlodsMod.objects.armor.Armor;
import tk.chlodaidan.ChlodsMod.objects.blocks.Blocks;

public class CreativeTabArmor extends CreativeTabs {

	public CreativeTabArmor(String lable) {
		super(lable);
	}

	@Override
	public Item getTabIconItem() {
		return Armor.ExtraChestplate;
	}

}
