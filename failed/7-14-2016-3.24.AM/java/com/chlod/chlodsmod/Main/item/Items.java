package com.chlod.chlodsmod.Main.item;

import com.chlod.chlodsmod.Main.creativeTabs.ModCreativeTabs;
import com.chlod.chlodsmod.blocks.Blocks;
import com.chlod.chlodsmod.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;

public class Items {

	public static void MainRegistry() {
		InitializeItem();
		registerItem();
		idCheck();
	}
	
	//Items
	public static Item Extraordinium;
	public static Item ExtraordiniumShard;
	public static Item Cloth;
	public static Item CompressedCoal;
	public static Item ExtraStick;
	public static Item Rubber;
	//Plants
	public static Item ExtraSeeds;
	
	public static void InitializeItem() {
		//Items
		Extraordinium = new extra().setUnlocalizedName("Extraordinium").setCreativeTab(ModCreativeTabs.tabChlodsMod).setTextureName(RefStrings.MODID + ":Extraordinium");
		ExtraordiniumShard = new Item().setUnlocalizedName("ExtraordiniumShard").setCreativeTab(ModCreativeTabs.tabChlodsMod).setTextureName("cdmd:ExtraordiniumShard");
		Cloth = new Item().setUnlocalizedName("Cloth").setCreativeTab(ModCreativeTabs.tabChlodsMod).setTextureName("cdmd:cloth");
		CompressedCoal = new Item().setUnlocalizedName("CompressedCoal").setCreativeTab(ModCreativeTabs.tabChlodsMod).setTextureName("cdmd:ccoal");
		Rubber = new Item().setUnlocalizedName("Rubber").setCreativeTab(ModCreativeTabs.tabChlodsMod).setTextureName("cdmd:rubber");
		ExtraStick = new Item().setUnlocalizedName("ExtraStick").setCreativeTab(ModCreativeTabs.tabChlodsMod).setTextureName("cdmd:stick");
		//Plants
		ExtraSeeds = new ItemSeeds(Blocks.ExtraPlant, net.minecraft.init.Blocks.farmland).setUnlocalizedName("ExtraSeeds").setCreativeTab(ModCreativeTabs.tabChlodsMod).setTextureName("cdmd:ExtraSeeds");
	}
	
	public static void registerItem() {
		//Items
		GameRegistry.registerItem(Extraordinium, Extraordinium.getUnlocalizedName());
		GameRegistry.registerItem(ExtraordiniumShard, ExtraordiniumShard.getUnlocalizedName());
		GameRegistry.registerItem(Cloth, Cloth.getUnlocalizedName());
		GameRegistry.registerItem(CompressedCoal, CompressedCoal.getUnlocalizedName());
		GameRegistry.registerItem(ExtraStick, ExtraStick.getUnlocalizedName());
		GameRegistry.registerItem(Rubber, Rubber.getUnlocalizedName());
		//Plants
		GameRegistry.registerItem(ExtraSeeds, ExtraSeeds.getUnlocalizedName());
	}
	
	public static void idCheck(){
		System.out.println("The Extraordinium Gem was initialized with the ID of " + Item.getIdFromItem(Extraordinium));
		System.out.println("The Extraordinium Shard was initialized with the ID of " + Item.getIdFromItem(ExtraordiniumShard));
		System.out.println("The Cloth Piece was initialized with the ID of " + Item.getIdFromItem(Cloth));
		System.out.println("The Extraordinium Stick  was initialized with the ID of " + Item.getIdFromItem(ExtraStick));
		System.out.println("The Compressed Coal Item was initialized with the ID of " + Item.getIdFromItem(CompressedCoal));
		System.out.println("The Extraordinium Seeds were initialized with the ID of " + Item.getIdFromItem(ExtraSeeds));
		System.out.println("The Rubber Piece was initialized with the ID of " + Item.getIdFromItem(Rubber));
		System.out.println("NOTE: If any of these values are -1, that means that they are not registered into the game");
	}
}
