package tk.chlodaidan.ChlodsMod.objects.tools;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class Nuker extends EntityThrowable {
	private double explosionRadius = 999999999.00F;
	
	
	public Nuker(World par1World) {
		super(par1World);
	}
	public Nuker(World par1World, double arg1Double, double arg2Double, double arg3Double) {
		super(par1World, arg1Double, arg2Double, arg3Double);
	}
	
	public Nuker(World par1World, EntityLivingBase arg1EntityLivingBase) {
		super(par1World, arg1EntityLivingBase);
		this.motionX = 0;
        this.motionZ = 0;
        this.motionY = -1;
        this.setThrowableHeading(this.motionX, this.motionY, this.motionZ, this.func_70182_d(), 1.0F);
	}
	@Override
	protected void onImpact(MovingObjectPosition par1MovingObjectPosition) {
		
		this.worldObj.newExplosion(this, this.posX, this.posY, this.posZ, (float)this.explosionRadius, true, true);
		this.setDead();
	}
	
	@Override
	protected float func_70182_d() {
		return 4.0F; 
	}
}
