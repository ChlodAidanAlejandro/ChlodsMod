package tk.chlodaidan.scrappedcode.dimension;
/**package com.chlod.ChlodsMod.dimension;

import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.WorldChunkManager;
import net.minecraft.world.chunk.IChunkProvider;

public class WorldProviderExtra extends WorldProvider{

	public void registerWorldChunkManager(){
		this.worldChunkMgr = new WorldChunkManager(com.chlod.ChlodsMod.biome.BiomeRegistry.ExtraBiome);
		this.dimensionId = dimensionRegistry.dimensionId;
	}
	
	public IChunkProvider createChunkGeneration(){
		return null;
	}
	
	@Override
	public String getDimensionName() {
		
		return "ExtraDim";
	}

}**/