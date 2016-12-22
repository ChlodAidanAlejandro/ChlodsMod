package tk.chlodaidan.ChlodsMod.objects.armor.RandomArmor;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import tk.chlodaidan.ChlodsMod.objects.armor.Armor;

public class Pajamas extends ItemArmor{

	public Pajamas(ArmorMaterial p_i45325_1_, int p_i45325_2_, int p_i45325_3_) {
		super(p_i45325_1_, p_i45325_3_, p_i45325_3_);
		
	}
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if(stack.getItem() == RArmor.PajamaCap || stack.getItem() == RArmor.PajamaShirt || stack.getItem() == RArmor.PajamaSlippers){
        	return "cdmd:textures/models/armor/PajamaArmor1.png";
        }else if(stack.getItem() == RArmor.PajamaPants){
        	return "cdmd:textures/models/armor/PajamaArmor2.png";
        }else{
        	return null;
        }
    }

}
