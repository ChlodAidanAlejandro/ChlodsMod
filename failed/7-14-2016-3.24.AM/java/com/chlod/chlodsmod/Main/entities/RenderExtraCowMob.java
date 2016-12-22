package com.chlod.chlodsmod.Main.entities;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderExtraCowMob extends RenderLiving{

	private static final ResourceLocation mobTextures = new ResourceLocation("cdmd:textures/entity/ExtraCow.png");
	
	public RenderExtraCowMob(ModelBase parlModelBase, float par2) {
		super(parlModelBase, par2);
	}

	protected ResourceLocation getEntityTexture(EntityExtraCow entity) {
		return mobTextures;
	}
	
	protected ResourceLocation getEntityTexture(Entity entity) {
		return this.getEntityTexture((EntityExtraCow)entity);
	}
}
