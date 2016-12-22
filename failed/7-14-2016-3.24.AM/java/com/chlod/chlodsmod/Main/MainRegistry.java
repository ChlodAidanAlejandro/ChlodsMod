package com.chlod.chlodsmod.Main;

import net.minecraft.world.WorldType;

import com.chlod.chlodsmod.Main.creativeTabs.ModCreativeTabs;
import com.chlod.chlodsmod.Main.entities.MEntities;
import com.chlod.chlodsmod.Main.item.Armor;
import com.chlod.chlodsmod.Main.item.Items;
import com.chlod.chlodsmod.Main.item.Tools;
import com.chlod.chlodsmod.Main.item.RandomArmor.RArmor;
import com.chlod.chlodsmod.blocks.Blocks;
import com.chlod.chlodsmod.lib.Prints;
import com.chlod.chlodsmod.lib.RefStrings;
import com.chlod.chlodsmod.world.ModWorld;
import com.chlod.chlodsmod.world.OreDicHandling;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = RefStrings.MODID, name = RefStrings.NAME, version = RefStrings.VERSION)
public class MainRegistry {

	@SidedProxy(clientSide = RefStrings.CLIENTSIDE, serverSide = RefStrings.SERVERSIDE)
	public static ServerProxy proxy;
	
	@Instance
	public static MainRegistry modInstance;
	
	@EventHandler
	public static void PreLoad(FMLPreInitializationEvent event) {
		System.out.println(RefStrings.PRINTNAME + "Mod started! Initializing Components...");
		ModCreativeTabs.initializeTabs();
		Blocks.MainRegistry();
		Items.MainRegistry();
		Tools.mainRegistry();
		Armor.mainRegistry();
		RArmor.mainRegistry();
		RenderRegistry.mainRegistry();
		ModWorld.mainRegistry();
		OreDicHandling.mainRegistry();
		CraftingManager.mainRegistry();
		MEntities.mainRegistry();
		ClientProxy.mainRegistry();
		proxy.registerRenderInfo();
		System.out.println(RefStrings.PRINTNAME + "DONE! Mod is ready to go!");
	}
	
	@EventHandler
	public static void Load(FMLInitializationEvent event) {
		Prints.initPrints();
	}
	
	@EventHandler
	public static void PostLoad(FMLPostInitializationEvent event) {
		System.out.println(RefStrings.PRINTNAME + "Have a good game! DONT CRASH!");
	}
}
