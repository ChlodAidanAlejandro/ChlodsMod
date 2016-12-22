package com.chlod.chlodsmod.Main.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class FlameThrower extends Item{
	public FlameThrower() {
		super();
	}
	
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player)
	  {
		  if(player.capabilities.isCreativeMode || player.inventory.consumeInventoryItem(Tools.NitroPack)) {
			  world.playSoundAtEntity(player, "random.fizz", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
		      world.spawnEntityInWorld(new Flame(world, player));
		  }
	            
	      return itemstack;
	  }
}
