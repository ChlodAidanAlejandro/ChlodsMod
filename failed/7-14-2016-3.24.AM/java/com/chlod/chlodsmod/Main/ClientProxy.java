package com.chlod.chlodsmod.Main;

import com.chlod.chlodsmod.Main.entities.EntityExtraCow;
import com.chlod.chlodsmod.Main.entities.RenderExtraCow;
import com.chlod.chlodsmod.Main.entities.RenderExtraCowMob;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends ServerProxy{

	public static void mainRegistry() {
		RenderLivingThings();
	}
	
	public static void RenderLivingThings() {
		RenderingRegistry.registerEntityRenderingHandler(EntityExtraCow.class, new RenderExtraCowMob(new RenderExtraCow(), 0));
	}
	
	public void registerRenderInfo() {
		
	}

	public int addArmor(String armor) {
		return RenderingRegistry.addNewArmourRendererPrefix(armor);
	}
}
