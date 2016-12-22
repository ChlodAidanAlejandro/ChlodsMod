package tk.chlodaidan.ChlodsMod.misc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import tk.chlodaidan.ChlodsMod.lib.RefStrings;

public class UpdateChecker {
	
	public static String updateVersion;
	
	public static void checkForUpdates(EntityJoinWorldEvent event) throws IOException {
		try {
			consoleCheck();
		} catch (IOException e) {
			e.printStackTrace();
		}
		URL version = new URL("https://raw.githubusercontent.com/ChlodAidanAlejandro/ChlodsModOfficial/master/version.txt");
        BufferedReader in = new BufferedReader(
        new InputStreamReader(version.openStream()));
        String inputLine;
    	while ((inputLine = in.readLine()) != null)
        if(event.entity == Minecraft.getMinecraft().thePlayer){
                EntityPlayer player = Minecraft.getMinecraft().thePlayer; 
                if (DebugMode.DEBUGMODE == true) {
                    player.addChatMessage(new ChatComponentText("§c[§bChlod's Mod§c]§7New updates are available! You are using &7" + RefStrings.VERSION + "&7 as the latest is &7" + inputLine + "&7. Please consider updating. To update, go to http://mods.curse.com/mc-mods/minecraft/247386-chlods-mod"));
                } else {
                	if (updateVersion != RefStrings.VERSION) {
                		player.addChatMessage(new ChatComponentText("§c[§bChlod's Mod§c]§7New updates are available! You are using &7" + RefStrings.VERSION + "&7 as the latest is &7" + inputLine + "&7. Please consider updating. To update, go to http://mods.curse.com/mc-mods/minecraft/247386-chlods-mod"));	
                	}
                }
        in.close();
        }
	}
	
	public static void consoleCheck() throws IOException {
		URL version = new URL("https://raw.githubusercontent.com/ChlodAidanAlejandro/ChlodsModOfficial/master/version.txt");
        BufferedReader in = new BufferedReader(
        new InputStreamReader(version.openStream()));

        String inputLine;
    	while ((inputLine = in.readLine()) != null)
        if(DebugMode.DEBUGMODE != true) {
            	if (RefStrings.VERSION != inputLine) {
            		System.out.println("=====================================================");
            		System.out.println("THERE IS A NEW VERSION OF CHLOD'S MOD!");
            		System.out.println("You currently have: v" + RefStrings.VERSION);
            		System.out.println("The updated one is: v" + inputLine);
            		System.out.println("=====================================================");
            	} else {
            		System.out.println("=====================================================");
            		System.out.println("You have the latest version of Chlod's Mod! YAYYY!");
            		System.out.println("The latest/your version is v" + RefStrings.VERSION);
            		System.out.println("=====================================================");
            	}
        } else {
        	System.out.println("=====================================================");
        	System.out.println("---------------DEBUG PRINTING (ALL)------------------");
        	System.out.println("=====================================================");
        	System.out.println("THERE IS A NEW VERSION OF CHLOD'S MOD!");
        	System.out.println("You currently have: v" + RefStrings.VERSION);
        	System.out.println("The updated one is: v" + inputLine);
        	System.out.println("=====================================================");
        	System.out.println("You have the latest version of Chlod's Mod! YAYYY!");
        	System.out.println("The latest/your version is v" + RefStrings.VERSION);
        	System.out.println("=====================================================");
        	System.out.println("---------------DEBUG PRINTING (BOOLEAN)--------------");
        	System.out.println("=====================================================");
        	if (RefStrings.VERSION != inputLine) {
        		System.out.println("THERE IS A NEW VERSION OF CHLOD'S MOD!");
        		System.out.println("You currently have: v" + RefStrings.VERSION);
        		System.out.println("The updated one is: v" + inputLine);
        		System.out.println("=====================================================");
        	} else {
        		System.out.println("You have the latest version of Chlod's Mod! YAYYY!");
        		System.out.println("The latest/your version is v" + RefStrings.VERSION);
        		System.out.println("=====================================================");
        	}
        }
    	String updateVersion = inputLine;
        in.close();
	}
	
	@SubscribeEvent
	public static void getPlayer(World world, EntityJoinWorldEvent event) throws IOException{
		URL version = new URL("https://raw.githubusercontent.com/ChlodAidanAlejandro/ChlodsModOfficial/master/version.txt");
        BufferedReader in = new BufferedReader(
        new InputStreamReader(version.openStream()));

        String inputLine;
    	while ((inputLine = in.readLine()) != null)
		//Credits: Matryoshika, Ernio and coolAlias on the Minecraft Forge Forums
        if(event.entity == Minecraft.getMinecraft().thePlayer){
                EntityPlayer player = Minecraft.getMinecraft().thePlayer; 
                if (DebugMode.DEBUGMODE == true) {
                    player.addChatMessage(new ChatComponentText("§c[§bChlod's Mod§c]§7New updates are available! You are using &7" + RefStrings.VERSION + "&7 as the latest is &7" + inputLine + "&7. Please consider updating. To update, go to http://mods.curse.com/mc-mods/minecraft/247386-chlods-mod"));
                } else {
                	if (updateVersion != RefStrings.VERSION) {
                		player.addChatMessage(new ChatComponentText("§c[§bChlod's Mod§c]§7New updates are available! You are using &7" + RefStrings.VERSION + "&7 as the latest is &7" + inputLine + "&7. Please consider updating. To update, go to http://mods.curse.com/mc-mods/minecraft/247386-chlods-mod"));	
                	}
                }
        in.close();
        }
	}
	
	public static void updateCheckFailed(IOException e) {
		System.out.println("The update check failed. Here's the stacktrace. Sorry.");
		System.out.println("By the way, this isn't fatal, so you can still play the game.");
		System.out.println("=================================================================");
		e.printStackTrace();
		System.out.println("=================================================================");
	}
	
}
