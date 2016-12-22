package tk.chlodaidan.ChlodsMod.objects.tools;

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
		if(this.worldObj.getBlock(movingobjectposition.blockX, movingobjectposition.blockY, movingobjectposition.blockZ) == Blocks.bedrock || this.worldObj.getBlock(movingobjectposition.blockX, movingobjectposition.blockY, movingobjectposition.blockZ) == Blocks.command_block) {
			this.setDead();
		} else {
		if(this.worldObj.getBlock(movingobjectposition.blockX, movingobjectposition.blockY, movingobjectposition.blockZ) == Blocks.obsidian) {
			this.worldObj.setBlock(movingobjectposition.blockX, movingobjectposition.blockY, movingobjectposition.blockZ, Blocks.lava);
		} else {
		if(this.worldObj.getBlock(movingobjectposition.blockX, movingobjectposition.blockY + 1, movingobjectposition.blockZ) == Blocks.air) {
			this.worldObj.setBlock(movingobjectposition.blockX, movingobjectposition.blockY + 1, movingobjectposition.blockZ, Blocks.fire);
			//sometimes the entity doesn't start getting hurt after hit by flamethrower. We need to make it so that
			//when the bullet hits the entity, it automatically starts getting burnt.
			this.setDead();
		} else {
		if(this.worldObj.getBlock(movingobjectposition.blockX, movingobjectposition.blockY, movingobjectposition.blockZ) == Blocks.sand){
			this.worldObj.setBlock(movingobjectposition.blockX, movingobjectposition.blockY, movingobjectposition.blockZ, Blocks.glass);
			this.worldObj.setBlock(movingobjectposition.blockX, movingobjectposition.blockY + 1, movingobjectposition.blockZ, Blocks.fire);
			//sometimes the entity doesn't start getting hurt after hit by flamethrower. We need to make it so that
			//when the bullet hits the entity, it automatically starts getting burnt.
			this.setDead();
		} else {
			this.setDead();
		}}}}
	}
	
	@Override
	protected float func_70182_d() {
		return 2.0F; 
	}
}
