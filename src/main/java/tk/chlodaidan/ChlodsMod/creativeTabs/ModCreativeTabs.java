package tk.chlodaidan.ChlodsMod.creativeTabs;

import net.minecraft.creativetab.CreativeTabs;
import tk.chlodaidan.ChlodsMod.misc.DebugMode;

public class ModCreativeTabs {
	
	public static CreativeTabs tabChlodItems;
	public static CreativeTabs tabChlodBlocks;
	public static CreativeTabs tabChlodTools;
	public static CreativeTabs tabChlodArmor;
	public static CreativeTabs tabChlodFood;
	public static CreativeTabs tabChlodDebug;
	
	public static void initializeTabs() {
		tabChlodItems = new CreativeTabItems("ItemsTab");
		tabChlodBlocks = new CreativeTabBlocks("BlocksTab");
		tabChlodTools = new CreativeTabTools("ToolsTab");
		tabChlodArmor = new CreativeTabArmor("ArmorTab");
		tabChlodFood = new CreativeTabFood("FoodTab");
		if (DebugMode.DEBUGMODE == true) {
			tabChlodDebug = new CreativeTabDebug("DebugTab");
		}
	}
}
