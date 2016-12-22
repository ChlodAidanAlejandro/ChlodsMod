package tk.chlodaidan.ChlodsMod.objects;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;
import tk.chlodaidan.ChlodsMod.creativeTabs.ModCreativeTabs;
import tk.chlodaidan.ChlodsMod.lib.RefStrings;
import tk.chlodaidan.ChlodsMod.misc.Config;
import tk.chlodaidan.ChlodsMod.objects.armor.extra;
import tk.chlodaidan.ChlodsMod.objects.blocks.Blocks;
import tk.chlodaidan.ChlodsMod.objects.tools.Crashifier;
import tk.chlodaidan.ChlodsMod.objects.tools.UpdateChecker;
import tk.chlodaidan.ChlodsMod.objects.tools.WorldNuker;

public class Items extends ItemFunctions{

	public static void MainRegistry() {
		InitializeItem();
		registerItem();
		if(Config.IDPrints == true) {
			idCheck();
		}
	}
	
	//Items
	public static Item Extraordinium;
	public static Item ExtraordiniumShard;
	public static Item Cloth;
	public static Item CompressedCoal;
	public static Item ExtraStick;
	public static Item Rubber;
	public static Item Crashifier;
	public static Item WorldNuker;
	public static Item UpdateChecker;
	public static Item Feces;
	//Plants
	public static Item ExtraSeeds;
	
	public static void InitializeItem() {
		//Items
		Extraordinium = new extra().setUnlocalizedName("Extraordinium").setCreativeTab(ModCreativeTabs.tabChlodItems).setTextureName(RefStrings.MODID + ":Extraordinium");
		ExtraordiniumShard = new Item().setUnlocalizedName("ExtraordiniumShard").setCreativeTab(ModCreativeTabs.tabChlodItems).setTextureName("cdmd:ExtraordiniumShard");
		Cloth = new Item().setUnlocalizedName("Cloth").setCreativeTab(ModCreativeTabs.tabChlodItems).setTextureName("cdmd:cloth");
		CompressedCoal = new Item().setUnlocalizedName("CompressedCoal").setCreativeTab(ModCreativeTabs.tabChlodItems).setTextureName("cdmd:ccoal");
		Rubber = new Item().setUnlocalizedName("Rubber").setCreativeTab(ModCreativeTabs.tabChlodItems).setTextureName("cdmd:rubber");
		ExtraStick = new Item().setUnlocalizedName("ExtraStick").setCreativeTab(ModCreativeTabs.tabChlodItems).setTextureName("cdmd:stick");
		Crashifier = new Crashifier().setUnlocalizedName("Crashifier").setCreativeTab(ModCreativeTabs.tabChlodItems).setTextureName("cdmd:crash");
		WorldNuker = new WorldNuker().setUnlocalizedName("WorldNuker").setCreativeTab(ModCreativeTabs.tabChlodItems).setTextureName("cdmd:nuker");
		UpdateChecker = new UpdateChecker().setUnlocalizedName("UpdateChecker").setTextureName("cdmd:nuker");
		Feces = new Item().setUnlocalizedName("Feces").setCreativeTab(ModCreativeTabs.tabChlodItems).setTextureName("cdmd:poop");
		//Plants
		ExtraSeeds = new ItemSeeds(Blocks.ExtraPlant, net.minecraft.init.Blocks.farmland).setUnlocalizedName("ExtraSeeds").setCreativeTab(ModCreativeTabs.tabChlodItems).setTextureName("cdmd:ExtraSeeds");
	}
	
	public static void registerItem() {
		//Items
		GameRegistry.registerItem(Extraordinium, Extraordinium.getUnlocalizedName());
		GameRegistry.registerItem(ExtraordiniumShard, ExtraordiniumShard.getUnlocalizedName());
		GameRegistry.registerItem(Cloth, Cloth.getUnlocalizedName());
		//GameRegistry.registerItem(CompressedCoal, CompressedCoal.getUnlocalizedName());
		GameRegistry.registerItem(ExtraStick, ExtraStick.getUnlocalizedName());
		GameRegistry.registerItem(Rubber, Rubber.getUnlocalizedName());
		GameRegistry.registerItem(Crashifier, Crashifier.getUnlocalizedName());
		GameRegistry.registerItem(WorldNuker, WorldNuker.getUnlocalizedName());
		GameRegistry.registerItem(UpdateChecker, UpdateChecker.getUnlocalizedName());
		GameRegistry.registerItem(Feces, Feces.getUnlocalizedName());
		//Plants
		GameRegistry.registerItem(ExtraSeeds, ExtraSeeds.getUnlocalizedName());
	}
	
	public static void idCheck(){
		registerID(Extraordinium);
		registerID(ExtraordiniumShard);
		registerID(Cloth);
		registerID(CompressedCoal);
		registerID(ExtraStick);
		registerID(Rubber);
		registerID(Crashifier);
		registerID(WorldNuker);
		registerID(UpdateChecker);
		registerID(Feces);
		registerID(ExtraSeeds);
	}
}