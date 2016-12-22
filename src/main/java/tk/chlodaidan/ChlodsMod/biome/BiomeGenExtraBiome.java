package tk.chlodaidan.ChlodsMod.biome;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.BiomeGenPlains;
import tk.chlodaidan.ChlodsMod.entities.living.ExtraCow.EntityExtraCow;
import tk.chlodaidan.ChlodsMod.objects.blocks.Blocks;

public class BiomeGenExtraBiome extends BiomeGenBase{

	public BiomeGenExtraBiome(int p_i1971_1_, boolean register) {
		super(p_i1971_1_, register);
		this.setBiomeName("Extra Biome");
		this.topBlock = Blocks.ExtraBlock;
		this.enableRain = false;
		this.setHeight(height_LowPlains);
        this.flowers.clear();
		this.fillerBlock = Blocks.ExtraOre;
		this.spawnableCreatureList.add(new SpawnListEntry(EntityExtraCow.class, 5, 5, 10));
	}
	
    public BiomeGenBase createMutationM()
    {
        BiomeGenPlains biomegenextram = new BiomeGenPlains(46);
        biomegenextram.setBiomeName("Overpowered Extra Biome");
        biomegenextram.fillerBlock = Blocks.ExtraBlock;
        biomegenextram.topBlock = Blocks.ExtraBlock;
        return biomegenextram;
    }
    
    public BiomeGenBase createMutationN()
    {
        BiomeGenPlains biomegenextran = new BiomeGenPlains(68);
        biomegenextran.setBiomeName("Nerfed Extra Biome");
        biomegenextran.fillerBlock = Blocks.Illumination;
        biomegenextran.topBlock = net.minecraft.init.Blocks.stone;
        return biomegenextran;
    }

}