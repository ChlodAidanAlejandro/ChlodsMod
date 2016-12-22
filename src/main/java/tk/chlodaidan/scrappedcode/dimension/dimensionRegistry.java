package tk.chlodaidan.scrappedcode.dimension;
/**package com.chlod.ChlodsMod.dimension;

import net.minecraftforge.common.DimensionManager;

public class dimensionRegistry {
	
	public static void mainRegistry(){
		registerDimension();
	}
	
	public static final int dimensionId = 23;
	
	public static void registerDimension(){
		DimensionManager.registerProviderType(dimensionId, WorldProviderExtra.class, false);
		DimensionManager.registerDimension(dimensionId, dimensionId);
		
	}

}**/