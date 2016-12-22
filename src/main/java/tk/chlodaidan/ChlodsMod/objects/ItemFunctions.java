package tk.chlodaidan.ChlodsMod.objects;

import java.io.IOException;
import java.util.ArrayList;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import tk.chlodaidan.ChlodsMod.misc.Config;
import tk.chlodaidan.ChlodsMod.misc.DebugMode;

public class ItemFunctions {

	public static void registerID(Item item) {
		if (DebugMode.DEBUGMODE == true || Config.IDPrints == true) {
			System.out.println("The ID of " + String.valueOf(item.getUnlocalizedName()) + " is " + Integer.valueOf(item.getIdFromItem(item)));
		}
	}
	
	public static void registerID(Block block) {
		if (DebugMode.DEBUGMODE == true || Config.IDPrints == true) {
			System.out.println("The ID of " + String.valueOf(block.getUnlocalizedName()) + " is " + Integer.valueOf(Item.getIdFromItem(Item.getItemFromBlock(block))));
		}
	}
	
}
