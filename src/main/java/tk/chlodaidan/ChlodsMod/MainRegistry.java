package tk.chlodaidan.ChlodsMod;

import java.io.IOException;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import tk.chlodaidan.ChlodsMod.biome.BiomeRegistry;
import tk.chlodaidan.ChlodsMod.creativeTabs.ModCreativeTabs;
import tk.chlodaidan.ChlodsMod.entities.MEntities;
import tk.chlodaidan.ChlodsMod.lib.RefStrings;
import tk.chlodaidan.ChlodsMod.misc.Config;
import tk.chlodaidan.ChlodsMod.misc.CraftingManager;
import tk.chlodaidan.ChlodsMod.misc.DebugMode;
import tk.chlodaidan.ChlodsMod.misc.RenderRegistry;
import tk.chlodaidan.ChlodsMod.misc.UpdateChecker;
import tk.chlodaidan.ChlodsMod.objects.ItemFunctions;
import tk.chlodaidan.ChlodsMod.objects.Items;
import tk.chlodaidan.ChlodsMod.objects.armor.Armor;
import tk.chlodaidan.ChlodsMod.objects.armor.RandomArmor.RArmor;
import tk.chlodaidan.ChlodsMod.objects.blocks.Blocks;
import tk.chlodaidan.ChlodsMod.objects.food.Food;
import tk.chlodaidan.ChlodsMod.objects.tools.Tools;
import tk.chlodaidan.ChlodsMod.proxy.ClientProxy;
import tk.chlodaidan.ChlodsMod.proxy.ServerProxy;
import tk.chlodaidan.ChlodsMod.world.ModWorld;
import tk.chlodaidan.ChlodsMod.world.OreDicHandling;

/** <h1>CHLOD'S MOD OFFICIAL 1.2</h1>
  * <br>Curse Page: <a href=https://mods.curse.com/mc-mods/minecraft/247386-chlods-mod>https://mods.curse.com/mc-mods/minecraft/247386-chlods-mod</a> 
  * <br>CurseForge Page: <a href=http://minecraft.curseforge.com/projects/chlods-mod>http://minecraft.curseforge.com/projects/chlods-mod</a>
  * <br>Minecraft Forums Thread: <a href=http://www.minecraftforum.net/forums/mapping-and-modding/minecraft-mods/2713586-chlods-mod-for-minecraft-1-7-10>http://www.minecraftforum.net/forums/mapping-and-modding/minecraft-mods/2713586-chlods-mod-for-minecraft-1-7-10</a>
  * <br>GitHub Page: <a href=https://github.com/ChlodAidanAlejandro/ChlodsModOfficial>https://github.com/ChlodAidanAlejandro/ChlodsModOfficial</a>
  * <br>Development Blog: <a href=http://chlodsmod.ga/>http://chlodsmod.ga/</a> 
  * @author Chlod Aidan Alejandro
  * @since Mod: June 2014, Documentation: August 9, 2016
  * @version 1.2
  */ 
@Mod(modid = RefStrings.MODID, name = RefStrings.NAME, version = RefStrings.VERSION)
public class MainRegistry {

	@SidedProxy(clientSide = RefStrings.CLIENTSIDE, serverSide = RefStrings.SERVERSIDE)
	public static ServerProxy proxy;
	
	@Instance
	public static MainRegistry modInstance;
	public static MainRegistry instance;

	@EventHandler
	public static void PreLoad(FMLPreInitializationEvent event) {
		System.out.println(RefStrings.PRINTNAME + "Mod started! Initializing Components...");
		Config.PreInit(event);
		DebugMode.mainRegistry();
		ModCreativeTabs.initializeTabs();
		Blocks.MainRegistry();
		Items.MainRegistry();
		Food.mainRegistry();
		Tools.mainRegistry();
		Armor.mainRegistry();
		RArmor.mainRegistry();
		RenderRegistry.mainRegistry();
		ModWorld.mainRegistry();
		MEntities.mainRegistry();
		BiomeRegistry.mainRegistry();
		/*The DimensionRegistry is scrapped. Go to com.chlod.scrappedcode.dimension for repair*/
		/*dimensionRegistry.mainRegistry();*/
		OreDicHandling.mainRegistry();
		CraftingManager.mainRegistry();
		ClientProxy.mainRegistry();
		proxy.registerRenderInfo();
		if(Config.updateChecking == true) {
			try {
				UpdateChecker.consoleCheck();
			} catch (IOException e) {
				UpdateChecker.updateCheckFailed(e);
			}
		}
		System.out.println(RefStrings.PRINTNAME + "DONE! Mod is ready to go!");
	}
	
	@EventHandler
	public static void Load(FMLInitializationEvent event) {
	}
	
	@EventHandler
	public static void PostLoad(FMLPostInitializationEvent event) {
		System.out.println(RefStrings.PRINTNAME + "Have a good game! DONT CRASH!");
	}
	
	@EventHandler
	public static void ServerStart(FMLServerStartedEvent event) {
		
	}
	
	@SubscribeEvent
	public void worldLoad(World world, EntityJoinWorldEvent event) throws IOException{
		if(Config.updateChecking == true) {
			UpdateChecker.getPlayer(world, event);
		}
	}
	
}
