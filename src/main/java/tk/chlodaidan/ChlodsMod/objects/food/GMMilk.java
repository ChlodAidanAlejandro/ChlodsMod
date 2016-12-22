package tk.chlodaidan.ChlodsMod.objects.food;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemBucketMilk;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class GMMilk extends ItemBucketMilk{

	public GMMilk() {
        this.setMaxStackSize(1);
    }
	
	@Override
	public ItemStack onEaten(ItemStack item, World world, EntityPlayer player)
    {
        if (!player.capabilities.isCreativeMode)
        {
            --item.stackSize;
        }
        player.curePotionEffects(item);
        return item.stackSize <= 0 ? new ItemStack(Items.iron_ingot, 2) : item;
    }
	
}
