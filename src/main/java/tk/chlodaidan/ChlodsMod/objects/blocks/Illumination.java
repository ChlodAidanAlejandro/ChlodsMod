package tk.chlodaidan.ChlodsMod.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Illumination extends Block {

	protected Illumination(Material material) {
		super(material);
		this.setHardness(0.5F);
		this.setHarvestLevel("Pickaxe", 2);
		this.setLightLevel(1.2F);
		this.setStepSound(soundTypeGlass);
	}

}
