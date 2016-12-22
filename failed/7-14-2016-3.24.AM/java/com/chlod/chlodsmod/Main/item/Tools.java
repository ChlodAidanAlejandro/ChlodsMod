package com.chlod.chlodsmod.Main.item;

import com.chlod.chlodsmod.Main.creativeTabs.ModCreativeTabs;
import com.jcraft.jorbis.Block;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class Tools {

	public static void mainRegistry() {
		initializeItem();
		registerItem();
		idCheck();
	}
	
	//ToolMaterials go here V V V
	public static ToolMaterial extraordinium = EnumHelper.addToolMaterial("Extraordinium", 50, 10000, 100.0F, 10000.0F, 30);
	public static ToolMaterial ultramaterial = EnumHelper.addToolMaterial("UltraTool", 999999999, 999999999, 999999999, 999999999, 999999999);
	//public static ToolMaterial material = EnumHelper.addToolMaterial(name, harvestLevel, maxUses, efficiency, damage, enchantability);
	//ToolMaterials list ends HERE
	//Items go here V V V
	public static Item ExtraPickaxe;
	public static Item ExtraShovel;
	public static Item ExtraSword;
	public static Item ExtraAxe;
	public static Item ExtraHoe;
	public static Item ExtraShears;
	public static Item UltraPickaxe;
	public static Item UltraPickaxe0;
	public static Item UltraPickaxe1;
	public static Item UltraPickaxe2;
	public static Item UltraPickaxe3;
	public static Item PEWPEWBLAST;
	public static Item Flamethrower;
	public static Item BatteryPack;
	public static Item NitroPack;
	/*NO MORE ITEMS HERE*/
	
	public static void initializeItem() {
		ExtraPickaxe = new ExtraPickaxe(extraordinium).setUnlocalizedName("ExtraPickaxe").setCreativeTab(ModCreativeTabs.tabChlodsMod).setTextureName("cdmd:itemopickaxe");
		ExtraShovel = new ExtraShovel(extraordinium).setUnlocalizedName("ExtraShovel").setCreativeTab(ModCreativeTabs.tabChlodsMod).setTextureName("cdmd:itemopshovel");
		ExtraSword = new ExtraSword(extraordinium).setUnlocalizedName("ExtraSword").setCreativeTab(ModCreativeTabs.tabChlodsMod).setTextureName("cdmd:itemopsword");
		ExtraAxe = new ExtraAxe(extraordinium).setUnlocalizedName("ExtraAxe").setCreativeTab(ModCreativeTabs.tabChlodsMod).setTextureName("cdmd:itemopaxe");
		ExtraHoe = new ExtraHoe(extraordinium).setUnlocalizedName("ExtraHoe").setCreativeTab(ModCreativeTabs.tabChlodsMod).setTextureName("cdmd:itemophoe");
		ExtraShears = new ExtraShears(extraordinium).setUnlocalizedName("ExtraShears").setCreativeTab(ModCreativeTabs.tabChlodsMod).setTextureName("cdmd:itemopshears");
		UltraPickaxe = new UltraPickaxe(ultramaterial).setUnlocalizedName("UltraPickaxe").setCreativeTab(ModCreativeTabs.tabChlodsMod).setTextureName("cdmd:ultrapickaxe");
		UltraPickaxe0 = new UltraPickaxe0().setUnlocalizedName("UltraPickaxe0").setCreativeTab(ModCreativeTabs.tabChlodsMod).setTextureName("cdmd:ultrapickaxe");
		UltraPickaxe1 = new UltraPickaxe1().setUnlocalizedName("UltraPickaxe1").setCreativeTab(ModCreativeTabs.tabChlodsMod).setTextureName("cdmd:ultrapickaxe");
		UltraPickaxe2 = new UltraPickaxe2().setUnlocalizedName("UltraPickaxe2").setCreativeTab(ModCreativeTabs.tabChlodsMod).setTextureName("cdmd:ultrapickaxe");
		UltraPickaxe3 = new UltraPickaxe3().setUnlocalizedName("UltraPickaxe3").setCreativeTab(ModCreativeTabs.tabChlodsMod).setTextureName("cdmd:ultrapickaxe");
		PEWPEWBLAST = new PEPEWBLAST().setUnlocalizedName("PEWPEWBLAST").setCreativeTab(ModCreativeTabs.tabChlodsMod).setTextureName("cdmd:pewpew");
		Flamethrower = new FlameThrower().setUnlocalizedName("FlameThrower").setCreativeTab(ModCreativeTabs.tabChlodsMod).setTextureName("cdmd:flame");
		BatteryPack = new BatteryPack().setUnlocalizedName("BatteryPack").setCreativeTab(ModCreativeTabs.tabChlodsMod).setTextureName("cdmd:batterypack");
		NitroPack = new NitroPack().setUnlocalizedName("NitroPack").setCreativeTab(ModCreativeTabs.tabChlodsMod).setTextureName("cdmd:nitro");
	}
	
	public static void registerItem() {
		GameRegistry.registerItem(ExtraPickaxe, ExtraPickaxe.getUnlocalizedName());
		GameRegistry.registerItem(ExtraShovel, ExtraShovel.getUnlocalizedName());
		GameRegistry.registerItem(ExtraSword, ExtraSword.getUnlocalizedName());
		GameRegistry.registerItem(ExtraAxe, ExtraAxe.getUnlocalizedName());
		GameRegistry.registerItem(ExtraHoe, ExtraHoe.getUnlocalizedName());
		GameRegistry.registerItem(ExtraShears, ExtraShears.getUnlocalizedName());
		GameRegistry.registerItem(UltraPickaxe, UltraPickaxe.getUnlocalizedName());
		GameRegistry.registerItem(UltraPickaxe0, UltraPickaxe0.getUnlocalizedName());
		GameRegistry.registerItem(UltraPickaxe1, UltraPickaxe1.getUnlocalizedName());
		GameRegistry.registerItem(UltraPickaxe2, UltraPickaxe2.getUnlocalizedName());
		GameRegistry.registerItem(UltraPickaxe3, UltraPickaxe3.getUnlocalizedName());
		GameRegistry.registerItem(PEWPEWBLAST,  PEWPEWBLAST.getUnlocalizedName());
		GameRegistry.registerItem(Flamethrower,  Flamethrower.getUnlocalizedName());
		GameRegistry.registerItem(BatteryPack,  BatteryPack.getUnlocalizedName());
		GameRegistry.registerItem(NitroPack,  NitroPack.getUnlocalizedName());
	}
	
	public static void idCheck(){
		System.out.println("The Extraordinium Pickaxe was initialized with the ID of " + Item.getIdFromItem(ExtraPickaxe));
		System.out.println("The Extraordinium Shovel was initialized with the ID of " + Item.getIdFromItem(ExtraShovel));
		System.out.println("The Extraordinium Sword was initialized with the ID of " + Item.getIdFromItem(ExtraSword));
		System.out.println("The Extraordinium Axe  was initialized with the ID of " + Item.getIdFromItem(ExtraAxe));
		System.out.println("The Extraordinium Hoe Item was initialized with the ID of " + Item.getIdFromItem(ExtraHoe));
		System.out.println("The Extraordinium Shears were initialized with the ID of " + Item.getIdFromItem(ExtraShears));
		System.out.println("The Extraordinium UltraPickaxe was initialized with the ID of " + Item.getIdFromItem(UltraPickaxe));
		System.out.println("The Extraordinium UltraPickaxe 0% was initialized with the ID of " + Item.getIdFromItem(UltraPickaxe0));
		System.out.println("The Extraordinium UltraPickaxe 25% was initialized with the ID of " + Item.getIdFromItem(UltraPickaxe1));
		System.out.println("The Extraordinium UltraPickaxe 50% was initialized with the ID of " + Item.getIdFromItem(UltraPickaxe2));
		System.out.println("The Extraordinium UltraPickaxe 75% was initialized with the ID of " + Item.getIdFromItem(UltraPickaxe3));
		System.out.println("The Extraordinium Pew Pew RF Blaster was initialized with the ID of " + Item.getIdFromItem(PEWPEWBLAST));
		System.out.println("The Extraordinium Flame Thrower was initialized with the ID of " + Item.getIdFromItem(Flamethrower));
		System.out.println("The Extraordinium Battery Pack was initialized with the ID of " + Item.getIdFromItem(BatteryPack));
		System.out.println("The Extraordinium Nitro Pack was initialized with the ID of " + Item.getIdFromItem(NitroPack));
		System.out.println("NOTE: If any of these values are -1, that means that they are not registered into the game");
	}
}
