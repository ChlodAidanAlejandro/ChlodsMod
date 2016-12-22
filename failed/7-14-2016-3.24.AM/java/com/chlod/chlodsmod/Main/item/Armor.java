package com.chlod.chlodsmod.Main.item;

import com.chlod.chlodsmod.Main.MainRegistry;
import com.chlod.chlodsmod.Main.creativeTabs.ModCreativeTabs;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class Armor {

	public static void mainRegistry() {
		initializeItem();
		registerItem();
		idCheck();
	}
	
	//ArmorMaterial:
	public static ArmorMaterial ExtraArmor = EnumHelper.addArmorMaterial("Extraordinium Armor", 10000, new int[]{30, 80, 60, 30}, 30);
	//public static ArmorMaterial ArmorMaterialName = EnumHelper.addArmorMaterial(name, durability, new int[]{Helmet, Chestplate, Leggings, Boots}, enchantability)
	//Armor Items:
	public static Item ExtraHelmet;
	public static Item ExtraChestplate;
	public static Item ExtraLeggings;
	public static Item ExtraBoots;
	
	public static void initializeItem() {
		ExtraHelmet = new ExtraArmor(ExtraArmor, MainRegistry.proxy.addArmor("ExtraArmor"), 0).setUnlocalizedName("ExtraHelmet").setCreativeTab(ModCreativeTabs.tabChlodsMod).setTextureName("cdmd:itemophelmet");
		ExtraChestplate = new ExtraArmor(ExtraArmor, MainRegistry.proxy.addArmor("ExtraArmor"), 1).setUnlocalizedName("ExtraChestplate").setCreativeTab(ModCreativeTabs.tabChlodsMod).setTextureName("cdmd:itemopchestplate");
		ExtraLeggings = new ExtraArmor(ExtraArmor, MainRegistry.proxy.addArmor("ExtraArmor"), 2).setUnlocalizedName("ExtraLeggings").setCreativeTab(ModCreativeTabs.tabChlodsMod).setTextureName("cdmd:itemopleggings");
		ExtraBoots = new ExtraArmor(ExtraArmor, MainRegistry.proxy.addArmor("ExtraArmor"), 3).setUnlocalizedName("ExtraBoots").setCreativeTab(ModCreativeTabs.tabChlodsMod).setTextureName("cdmd:itemopboots");
	}
	
	public static void registerItem() {
		GameRegistry.registerItem(ExtraHelmet, ExtraHelmet.getUnlocalizedName());
		GameRegistry.registerItem(ExtraChestplate, ExtraChestplate.getUnlocalizedName());
		GameRegistry.registerItem(ExtraLeggings, ExtraLeggings.getUnlocalizedName());
		GameRegistry.registerItem(ExtraBoots, ExtraBoots.getUnlocalizedName());
	}
	
	public static void idCheck() {
		System.out.println("The Extraordinium Helmet was initialized with the ID of " + ItemArmor.getIdFromItem(ExtraHelmet));
		System.out.println("The Extraordinium Chestplate was initialized with the ID of " + ItemArmor.getIdFromItem(ExtraChestplate));
		System.out.println("The Extraordinium Leggings were initialized with the ID of " + ItemArmor.getIdFromItem(ExtraLeggings));
		System.out.println("The Extraordinium Boots were initialized with the ID of " + ItemArmor.getIdFromItem(ExtraBoots));
		System.out.println("NOTE: If any of these values are -1, that means that they are not registered into the game");
	}
}
