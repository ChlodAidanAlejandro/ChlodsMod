package tk.chlodaidan.ChlodsMod.biome;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeDictionary.Type;

public class BiomeRegistry {

	public static void mainRegistry() {
		initializeBiome();
		registerBiome();
	}
	
	//Biome List VVVV
	public static BiomeGenBase ExtraBiome;
	//Biome List ^^^^
	
	public static void initializeBiome() {
		ExtraBiome = new BiomeGenExtraBiome(19, false).setBiomeName("ExtraBiome");
	}
	
	public static void registerBiome() {
		BiomeDictionary.registerBiomeType(ExtraBiome, Type.PLAINS, Type.LUSH, Type.MAGICAL, Type.JUNGLE);
		BiomeManager.addSpawnBiome(ExtraBiome);
	}
}