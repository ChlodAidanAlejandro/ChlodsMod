package com.chlod.chlodsmod.Main.creativeTabs;

import com.chlod.chlodsmod.Main.item.Armor;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class CreativeTabChlod extends CreativeTabs{

	public CreativeTabChlod(String lable) {
		super(lable);
	}

	@Override
	public Item getTabIconItem() {
		return com.chlod.chlodsmod.Main.item.Items.Extraordinium;
	}
}
