package tk.chlodaidan.ChlodsMod.proxy;

import cpw.mods.fml.client.registry.RenderingRegistry;
import tk.chlodaidan.ChlodsMod.entities.living.ExtraCow.EntityExtraCow;
import tk.chlodaidan.ChlodsMod.entities.living.ExtraCow.RenderExtraCow;
import tk.chlodaidan.ChlodsMod.entities.living.ExtraCow.RenderExtraCowMob;

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
