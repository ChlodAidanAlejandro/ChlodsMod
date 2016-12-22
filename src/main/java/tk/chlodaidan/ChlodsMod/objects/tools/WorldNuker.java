package tk.chlodaidan.ChlodsMod.objects.tools;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class WorldNuker extends Item{

	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player)
	  {
		  if(player.capabilities.isCreativeMode || player.inventory.consumeInventoryItem(Tools.BatteryPack)) {
			  world.playSoundAtEntity(player, "random.explode", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
		      world.spawnEntityInWorld(new Nuker(world, player));
		  }
	            
	      return itemstack;
	  }
	
}
