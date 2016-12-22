package tk.chlodaidan.ChlodsMod.creativeTabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import tk.chlodaidan.ChlodsMod.objects.armor.Armor;
import tk.chlodaidan.ChlodsMod.objects.food.Food;

public class CreativeTabFood extends CreativeTabs {

	public CreativeTabFood(String lable) {
		super(lable);
	}

	@Override
	public Item getTabIconItem() {
		return Food.GMBeef;
	}

}
