package com.chlod.chlodsmod.Main.item;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class BlasterAmmo extends EntityThrowable {
	private double explosionRadius = 5.0F;
	
	public BlasterAmmo(World par1World) {
		super(par1World);
	}
	public BlasterAmmo(World par1World, double arg1Double, double arg2Double, double arg3Double) {
		super(par1World, arg1Double, arg2Double, arg3Double);
	}
	public BlasterAmmo(World par1World, EntityLivingBase arg1EntityLivingBase) {
		super(par1World, arg1EntityLivingBase);
	}
	@Override
	protected void onImpact(MovingObjectPosition par1MovingObjectPosition) {
		this.worldObj.createExplosion(this, this.posX, this.posY, this.posZ, (float)this.explosionRadius, true);
		this.setDead();
	}
	
	@Override
	protected float func_70182_d() {
		return 2.0F; 
	}

}