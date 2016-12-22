package tk.chlodaidan.ChlodsMod.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ExtraOre extends Block {

	protected ExtraOre(Material material) {
		super(material);
		this.setHardness(5.0F);
		this.setResistance(2000.0F);
		this.setHarvestLevel("Pickaxe", 4);
	}

}
