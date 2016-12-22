package tk.chlodaidan.ChlodsMod.objects.blocks;

import net.minecraft.block.BlockCrops;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import tk.chlodaidan.ChlodsMod.creativeTabs.ModCreativeTabs;
import tk.chlodaidan.ChlodsMod.misc.DebugMode;

public class ExtraPlant extends BlockCrops{
	
	protected ExtraPlant(Material material) {
		if (DebugMode.DEBUGMODE == true) {
			this.setCreativeTab(ModCreativeTabs.tabChlodDebug);
		}
	}
	
	@Override
	protected Item func_149866_i() {
	      return tk.chlodaidan.ChlodsMod.objects.Items.ExtraSeeds;
	  }

	@Override
	protected Item func_149865_P() {
	      return tk.chlodaidan.ChlodsMod.objects.Items.ExtraStick;
	  }


}
