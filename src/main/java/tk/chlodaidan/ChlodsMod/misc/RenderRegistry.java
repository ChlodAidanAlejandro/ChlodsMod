package tk.chlodaidan.ChlodsMod.misc;

import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.client.renderer.entity.RenderSnowball;
import tk.chlodaidan.ChlodsMod.objects.Items;
import tk.chlodaidan.ChlodsMod.objects.tools.BlasterAmmo;
import tk.chlodaidan.ChlodsMod.objects.tools.Flame;
import tk.chlodaidan.ChlodsMod.objects.tools.Tools;

public class RenderRegistry {

	public static void mainRegistry() {
		registerAmmo();
		registerThrowable();
	}
	
	public static void registerAmmo() {
		RenderingRegistry.registerEntityRenderingHandler(BlasterAmmo.class, new RenderSnowball(Items.WorldNuker));
		RenderingRegistry.registerEntityRenderingHandler(Flame.class, new RenderSnowball(Tools.NitroPack));
	}
	
	public static void registerThrowable() {
		
	}
	
}
