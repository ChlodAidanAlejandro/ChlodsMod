package tk.chlodaidan.ChlodsMod.world;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModWorld {
	public static void mainRegistry() {
		initializeWorldGen();
		
	}
	
	public static void initializeWorldGen() {
		registerWorldGen(new ExtraordiniumOre(), 1);
	}
	
	private static void registerWorldGen(ExtraordiniumOre extraordiniumOre,
			int i) {
		
	}

	public static void registerWorld(IWorldGenerator worldGenClass, int weightedProbability) {
		GameRegistry.registerWorldGenerator(worldGenClass, weightedProbability);
	}
}
