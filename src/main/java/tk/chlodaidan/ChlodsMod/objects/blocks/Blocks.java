package tk.chlodaidan.ChlodsMod.objects.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import tk.chlodaidan.ChlodsMod.creativeTabs.ModCreativeTabs;
import tk.chlodaidan.ChlodsMod.lib.RefStrings;
import tk.chlodaidan.ChlodsMod.misc.Config;
import tk.chlodaidan.ChlodsMod.objects.Items;

public class Blocks extends Items {

	public static void MainRegistry() {
		InitializeBlock();
		registerItem();
		if(Config.IDPrints == true) {
			idCheck();
		}
		
	}
	
	public static Block ExtraBlock;
	public static Block ExtraOre;
	public static Block Illumination;
	public static Block ExtraPlant;
	public static Block CompressedCoal;
	/*The ExtraPortal is scrapped. Find it at com.chlod.scrappedcode for fixing*/
	/*public static Block ExtraPortal;*/
	public static Block Sidewalk;
	public static Block LitSidewalk;
	
	public static void InitializeBlock() {
		ExtraBlock = new ExtraBlock(Material.ground).setBlockName("ExtraordiniumBlock").setCreativeTab(ModCreativeTabs.tabChlodBlocks).setBlockTextureName("cdmd:ExtraordiniumBlock");
		ExtraOre = new ExtraOre(Material.ground).setBlockName("ExtraOre").setCreativeTab(ModCreativeTabs.tabChlodBlocks).setBlockTextureName("cdmd:ExtraOre");
		Illumination = new Illumination(Material.glass).setBlockName("Illumination").setCreativeTab(ModCreativeTabs.tabChlodBlocks).setBlockTextureName("cdmd:Illumination");
		ExtraPlant = new ExtraPlant(Material.plants).setBlockName("ExtraPlant").setBlockTextureName(RefStrings.MODID + ":extraplant");
		CompressedCoal = new CompressedCoal(Material.rock).setBlockName("CompressedCoal").setCreativeTab(ModCreativeTabs.tabChlodBlocks).setBlockTextureName("cdmd:ccoal");
		Sidewalk = new Sidewalk(Material.ground).setBlockName("Sidewalk").setCreativeTab(ModCreativeTabs.tabChlodBlocks).setBlockTextureName("cdmd:sidewalk_1");
		LitSidewalk = new LitSidewalk(Material.ground).setBlockName("LitSidewalk").setCreativeTab(ModCreativeTabs.tabChlodBlocks).setBlockTextureName("cdmd:litsidewalk_1");
		/*###########################################################################################*/
		/*The ExtraPortal is scrapped. Find it at com.chlod.scrappedcode for fixing*/
		/*ExtraPortal = new ExtraPortal().setBlockName("ExtraPortal").setBlockTextureName("cdmd:portal");*/
	}
	
	public static void registerItem() {
		GameRegistry.registerBlock(ExtraBlock, ExtraBlock.getUnlocalizedName());
		GameRegistry.registerBlock(ExtraOre, ExtraOre.getUnlocalizedName());
		GameRegistry.registerBlock(Illumination, Illumination.getUnlocalizedName());
		GameRegistry.registerBlock(ExtraPlant, ExtraPlant.getUnlocalizedName());
		GameRegistry.registerBlock(Sidewalk, Sidewalk.getUnlocalizedName());
		//GameRegistry.registerBlock(CompressedCoal, CompressedCoal.getUnlocalizedName());
		/*The ExtraPortal is scrapped. Find it at com.chlod.scrappedcode for fixing*/
		/*GameRegistry.registerBlock(ExtraPortal, ExtraPortal.getUnlocalizedName());*/
		GameRegistry.registerBlock(LitSidewalk, LitSidewalk.getUnlocalizedName());
	}
	
	public static void idCheck(){
		registerID(ExtraBlock);
		registerID(ExtraOre);
		registerID(Illumination);
		registerID(ExtraPlant);
		registerID(Sidewalk);
		registerID(LitSidewalk);
	}
}