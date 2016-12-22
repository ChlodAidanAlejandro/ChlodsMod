package com.chlod.chlodsmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.chlod.chlodsmod.Main.creativeTabs.ModCreativeTabs;
import com.chlod.chlodsmod.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;

public class Blocks {

	public static void MainRegistry() {
		InitializeBlock();
		registerItem();
		idCheck();
		
	}
	
	public static Block ExtraBlock;
	public static Block ExtraOre;
	public static Block Illumination;
	public static Block ExtraPlant;
	public static Block CompressedCoal;
	
	public static void InitializeBlock() {
		ExtraBlock = new ExtraBlock(Material.ground).setBlockName("ExtraordiniumBlock").setCreativeTab(ModCreativeTabs.tabChlodsMod).setBlockTextureName("cdmd:ExtraordiniumBlock");
		ExtraOre = new ExtraOre(Material.ground).setBlockName("ExtraOre").setCreativeTab(ModCreativeTabs.tabChlodsMod).setBlockTextureName("cdmd:ExtraOre");
		Illumination = new Illumination(Material.glass).setBlockName("Illumination").setCreativeTab(ModCreativeTabs.tabChlodsMod).setBlockTextureName("cdmd:Illumination");
		ExtraPlant = new ExtraPlant().setBlockName("ExtraPlant").setCreativeTab(ModCreativeTabs.tabChlodsMod).setBlockTextureName(RefStrings.MODID + ":extraplant");
		CompressedCoal = new CompressedCoal(Material.rock).setBlockName("CompressedCoal").setCreativeTab(ModCreativeTabs.tabChlodsMod).setBlockTextureName("cdmd:ccoal");
	}
	
	public static void registerItem() {
		GameRegistry.registerBlock(ExtraBlock, ExtraBlock.getUnlocalizedName());
		GameRegistry.registerBlock(ExtraOre, ExtraOre.getUnlocalizedName());
		GameRegistry.registerBlock(Illumination, Illumination.getUnlocalizedName());
		GameRegistry.registerBlock(ExtraPlant, ExtraPlant.getUnlocalizedName());
		GameRegistry.registerBlock(CompressedCoal, CompressedCoal.getUnlocalizedName());
	}
	
	public static void idCheck(){
		System.out.println("The Extraordinium Block was initialized with the ID of " + Block.getIdFromBlock(ExtraBlock));
		System.out.println("The Extraordinium Ore was initialized with the ID of " + Block.getIdFromBlock(ExtraOre));
		System.out.println("The Illumination was initialized with the ID of " + Block.getIdFromBlock(Illumination));
		System.out.println("The ExtraPlant Block was initialized with the ID of " + Block.getIdFromBlock(ExtraPlant));
		System.out.println("The Compressed Coal Block was initialized with the ID of " + Block.getIdFromBlock(CompressedCoal));
		System.out.println("NOTE: If any of these values are -1, that means that they are not registered into the game");
	}
}


