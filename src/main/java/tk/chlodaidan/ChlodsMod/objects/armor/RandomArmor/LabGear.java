package tk.chlodaidan.ChlodsMod.objects.armor.RandomArmor;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class LabGear extends ItemArmor{

	public LabGear(ArmorMaterial p_i45325_1_, int p_i45325_2_, int p_i45325_3_) {
		super(p_i45325_1_, p_i45325_2_, p_i45325_3_);
	}

	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
		if(stack.getItem() == RArmor.LabGoggles || stack.getItem() == RArmor.LabCoat || stack.getItem() == RArmor.LabBoots){
        	return "cdmd:textures/models/armor/LabGear1.png";
        }else if(stack.getItem() == RArmor.LabPants){
        	return "cdmd:textures/models/armor/LabGear2.png";
        }else{
        	return null;
        }
    }
}
