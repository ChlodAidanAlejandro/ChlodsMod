package com.chlod.chlodsmod.Main.item;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.init.Blocks;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class Flame extends EntityThrowable{
	
	public Flame(World par1World) {
		super(par1World);
	}
	public Flame(World par1World, double arg1Double, double arg2Double, double arg3Double) {
		super(par1World, arg1Double, arg2Double, arg3Double);
	}
	public Flame(World par1World, EntityLivingBase arg1EntityLivingBase) {
		super(par1World, arg1EntityLivingBase);
	}
	@Override
	protected void onImpact(MovingObjectPosition movingobjectposition) {
		if(this.worldObj.getBlock(movingobjectposition.blockX, movingobjectposition.blockY, movingobjectposition.blockZ) == Blocks.bedrock || this.worldObj.getBlock(movingobjectposition.blockX, movingobjectposition.blockY, movingobjectposition.blockZ) == Blocks.command_block || this.worldObj.getBlock(movingobjectposition.blockX, movingobjectposition.blockY, movingobjectposition.blockZ) == Blocks.obsidian) {
			this.setDead();
		} else {
			if(this.worldObj.getBlock(movingobjectposition.blockX, movingobjectposition.blockY + 1, movingobjectposition.blockZ) == Blocks.air) {
				this.worldObj.setBlock(movingobjectposition.blockX, movingobjectposition.blockY + 1, movingobjectposition.blockZ, Blocks.fire);
				this.onEntityUpdate();
			} else {
				this.setDead();
			}
		}
	}
	
	@Override
	protected float func_70182_d() {
		return 2.0F; 
	}
}
