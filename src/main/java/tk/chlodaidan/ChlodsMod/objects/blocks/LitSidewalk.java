package tk.chlodaidan.ChlodsMod.objects.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class LitSidewalk extends Sidewalk {

	protected LitSidewalk(Material p_i45394_1_) {
		super(p_i45394_1_);
		this.setLightLevel(1F);
	}

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconreg) {
    	this.icons[2] = iconreg.registerIcon("cdmd:sidewalk_side");
    	this.icons[3] = iconreg.registerIcon("cdmd:sidewalk_side");
    	this.icons[4] = iconreg.registerIcon("cdmd:sidewalk_side");
    	this.icons[5] = iconreg.registerIcon("cdmd:sidewalk_side");
    	this.icons[1] = iconreg.registerIcon("cdmd:litsidewalk_1");
    }
    
}
