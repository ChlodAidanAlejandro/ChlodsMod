package tk.chlodaidan.ChlodsMod.objects.armor.RandomArmor;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import tk.chlodaidan.ChlodsMod.objects.armor.Armor;

public class Swagger extends ItemArmor{

	public Swagger(ArmorMaterial p_i45325_1_, int p_i45325_2_, int p_i45325_3_) {
		super(p_i45325_1_, p_i45325_2_, p_i45325_3_);
	}

	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if(stack.getItem() == RArmor.Shades) {
        	return "cdmd:textures/models/armor/SwaggerArmor1.png";
        }else if(stack.getItem() == null){
        	return "cdmd:textures/models/armor/SwaggerArmor2.png";
        }else{
        	return null;
        }
    }
}
