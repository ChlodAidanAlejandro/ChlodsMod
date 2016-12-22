package tk.chlodaidan.ChlodsMod.objects.tools;

import net.minecraft.crash.CrashReport;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ReportedException;
import net.minecraft.world.World;

public class Crashifier extends Item{

	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player) {
		throw new ReportedException(new CrashReport("YOU RIGHT CLICKED THE CRASHIFIER!!!", new Throwable()));
	}
}
