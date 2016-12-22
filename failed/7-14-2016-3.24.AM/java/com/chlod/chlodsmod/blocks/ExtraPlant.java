package com.chlod.chlodsmod.blocks;

import net.minecraft.block.BlockCrops;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class ExtraPlant extends BlockCrops{
	
	@Override
	  protected Item func_149866_i()
	    {
	        return com.chlod.chlodsmod.Main.item.Items.ExtraSeeds;
	    }

	@Override
	    protected Item func_149865_P()
	    {
	        return com.chlod.chlodsmod.Main.item.Items.ExtraStick;
	    }


}
