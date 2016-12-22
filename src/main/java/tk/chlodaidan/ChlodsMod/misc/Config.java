package tk.chlodaidan.ChlodsMod.misc;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;

public class Config{
	
	public static Boolean debugHandlerConfig;
	public static String blasterStrength;
	public static Boolean updateChecking;
	public static Boolean IDPrints;
	
	
	public static void PreInit(FMLPreInitializationEvent event) {
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		config.load(); 
		//##########################################################################################
		Property debugMode = config.get("debug", "DebugMode", false);
		debugMode.comment = "Should the mod run on debug mode? Hidden objects unlocked, more console info, and crashable items. We are not responsible for broken worlds, destroyed stuff and cookie loss. Hehe :P (Default: false)";
		//##########################################################################################\
		Property pewStrength = config.get("items", "PewStrength", "5.0F");
		pewStrength.comment = "Set the stregnth of the PewPew Blaster. 4.0F = TNT. ! NOTE ! Include the decimal (even if .0) and the 'F.' Thanks! (Default: 5.0F";
		//##########################################################################################
		Property updateCheck = config.get("updates", "CheckForUpdates", true);
		updateCheck.comment = "Check for updates every startup. You can disable this to stop the annoying error log at startup (Default: true)";
		//##########################################################################################
		Property idPrints = config.get("itemIDs", "IDPrints", false);
		updateCheck.comment = "Print out item IDs during startup. This may fill your screen with text and numbers (Default: false)";
		//##########################################################################################
		config.save();
		debugHandlerConfig = config.get("debug", "DebugMode", false).getBoolean(false);
		blasterStrength = config.get("items", "PewStrength", 5.0F).getString();
		updateChecking = config.get("updates", "CheckForUpdates", true).getBoolean(true);
		if(debugHandlerConfig == true) {
			IDPrints = true;
		} else {
			IDPrints = config.get("itemIDs", "IDPrints", false).getBoolean(false);
		}
	}
	
	
}
