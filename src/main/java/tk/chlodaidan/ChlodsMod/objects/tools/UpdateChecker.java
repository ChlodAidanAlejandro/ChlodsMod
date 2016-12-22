package tk.chlodaidan.ChlodsMod.objects.tools;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;
import tk.chlodaidan.ChlodsMod.creativeTabs.ModCreativeTabs;
import tk.chlodaidan.ChlodsMod.lib.RefStrings;
import tk.chlodaidan.ChlodsMod.misc.DebugMode;

public class UpdateChecker extends Item{

	public UpdateChecker() {
		if (DebugMode.DEBUGMODE == true) {
			this.setCreativeTab(ModCreativeTabs.tabChlodDebug);
		}
	}
	
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player) {
		player.addChatMessage(new ChatComponentText("§c[§bChlod's Mod§c]§7Sorry. The UpdateChecker has been temporarily disabled."));
		/*try {
			tk.chlodaidan.ChlodsMod.misc.UpdateChecker.checkForUpdates(null);
		} catch (IOException e) {
			e.printStackTrace();
		}*/
		return itemstack;
	}
	
}
