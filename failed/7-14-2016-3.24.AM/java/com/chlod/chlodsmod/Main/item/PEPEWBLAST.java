package com.chlod.chlodsmod.Main.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ArrowNockEvent;

public class PEPEWBLAST extends Item{

	public PEPEWBLAST() {
		super();
	}
	
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player)
	  {
		  if(player.capabilities.isCreativeMode || player.inventory.consumeInventoryItem(Tools.BatteryPack)) {
			  world.playSoundAtEntity(player, "random.explode", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
		      world.spawnEntityInWorld(new BlasterAmmo(world, player));
		  }
	            
	      return itemstack;
	  }
	
}

