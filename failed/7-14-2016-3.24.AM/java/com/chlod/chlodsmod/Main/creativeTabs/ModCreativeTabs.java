package com.chlod.chlodsmod.Main.creativeTabs;

import net.minecraft.creativetab.CreativeTabs;

public class ModCreativeTabs {
	
	public static CreativeTabs tabChlodsMod;
	
	public static void initializeTabs() {
		tabChlodsMod = new CreativeTabChlod("ChlodsMod");
	}
}
