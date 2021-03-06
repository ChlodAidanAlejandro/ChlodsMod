package tk.chlodaidan.ChlodsMod.objects.armor;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ExtraArmor extends ItemArmor {

	public ExtraArmor(ArmorMaterial p_i45325_1_, int p_i45325_2_, int p_i45325_3_) {
		super(p_i45325_1_, p_i45325_2_, p_i45325_3_);
		
	}
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if(stack.getItem() == Armor.ExtraHelmet || stack.getItem() == Armor.ExtraChestplate || stack.getItem() == Armor.ExtraBoots){
        	return "cdmd:textures/models/armor/ExtraArmor1.png";
        }else if(stack.getItem() == Armor.ExtraLeggings){
        	return "cdmd:textures/models/armor/ExtraArmor2.png";
        }else{
        	return null;
        }
    }


}
