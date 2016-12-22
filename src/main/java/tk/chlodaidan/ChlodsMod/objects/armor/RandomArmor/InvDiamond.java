package tk.chlodaidan.ChlodsMod.objects.armor.RandomArmor;

import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;

public class InvDiamond extends ItemArmor {

	public InvDiamond(ArmorMaterial p_i45325_1_, int p_i45325_2_,
			int p_i45325_3_) {
		super(p_i45325_1_, p_i45325_2_, p_i45325_3_);
	}
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if(stack.getItem() == RArmor.InvDiamondHelmet || stack.getItem() == RArmor.InvDiamondChestplate || stack.getItem() == RArmor.InvDiamondBoots){
        	return "cdmd:textures/models/armor/InvisibleArmor1.png";
        }else if(stack.getItem() == RArmor.InvDiamondLeggings){
        	return "cdmd:textures/models/armor/InvisibleArmor2.png";
        }else{
        	return null;
        }
    }

}
