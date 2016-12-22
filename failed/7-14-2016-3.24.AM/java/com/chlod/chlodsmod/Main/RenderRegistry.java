package com.chlod.chlodsmod.Main;

import com.chlod.chlodsmod.Main.item.BlasterAmmo;
import com.chlod.chlodsmod.Main.item.Flame;
import com.chlod.chlodsmod.Main.item.Tools;

import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class RenderRegistry {

	public static void mainRegistry() {
		registerAmmo();
		registerThrowable();
	}
	
	public static void registerAmmo() {
		RenderingRegistry.registerEntityRenderingHandler(BlasterAmmo.class, new RenderSnowball(Item.getItemFromBlock(Blocks.glass)));
		RenderingRegistry.registerEntityRenderingHandler(Flame.class, new RenderSnowball(Tools.NitroPack));
	}
	
	public static void registerThrowable() {
		
	}
	
}
