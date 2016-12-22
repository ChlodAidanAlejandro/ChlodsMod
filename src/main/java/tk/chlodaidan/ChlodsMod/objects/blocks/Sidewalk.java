package tk.chlodaidan.ChlodsMod.objects.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStone;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.util.IIcon;

public class Sidewalk extends Block{

	protected Sidewalk(Material p_i45394_1_) {
		super(p_i45394_1_);
		this.slipperiness = 2.0F;
	}
	
    @SideOnly(Side.CLIENT)
    private IIcon field_149935_N;
    public IIcon[] icons = new IIcon[6];
    
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconreg) {
    	this.icons[2] = iconreg.registerIcon("cdmd:sidewalk_side");
    	this.icons[3] = iconreg.registerIcon("cdmd:sidewalk_side");
    	this.icons[4] = iconreg.registerIcon("cdmd:sidewalk_side");
    	this.icons[5] = iconreg.registerIcon("cdmd:sidewalk_side");
    	this.icons[1] = iconreg.registerIcon("cdmd:sidewalk_1");
    }

    /**
     * Side Numeration:
     * 0 = bottom, 1 = top, 2 = north, 3 = south, 4 = west, 5 = east
     * 
     * @param side
     * @return Icon of that side
     */
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta) {
        return side != 0 ? this.icons[side] : Blocks.stone.getBlockTextureFromSide(0);
    }
    
}