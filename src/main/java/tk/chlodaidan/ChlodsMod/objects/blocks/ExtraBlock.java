package tk.chlodaidan.ChlodsMod.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ExtraBlock extends Block {

	public ExtraBlock(Material material) {
		super(material);
		this.setResistance(100.0F);
		this.setHarvestLevel("Pickaxe", 4);
	}

}
