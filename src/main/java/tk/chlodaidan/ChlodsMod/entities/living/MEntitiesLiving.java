package tk.chlodaidan.ChlodsMod.entities.living;

import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import tk.chlodaidan.ChlodsMod.MainRegistry;
import tk.chlodaidan.ChlodsMod.entities.living.ExtraCow.EntityExtraCow;

public class MEntitiesLiving {

	public static void registerEntity() {
		//ExtraCow
		createEntity(EntityExtraCow.class, "ExtraCow", 0x140CF2, 0xB90CF2);
	}
	
	/** The ExtraCow's EntityRegistry **/
	public static void createEntity(Class entityClass, String entityName, int solidColor, int spotColor) {
		int randomId = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(entityClass, entityName, randomId);
		EntityRegistry.registerModEntity(entityClass, entityName, randomId, MainRegistry.modInstance, 80, 1, true);
		EntityRegistry.addSpawn(entityClass, 2, 0, 1, EnumCreatureType.creature, BiomeGenBase.plains);
		
		createEgg(randomId, solidColor, spotColor);
	}
	
	/** The ExtraCow's Spawn Egg **/
	private static void createEgg(int randomId, int solidColor, int spotColor) {
		EntityList.entityEggs.put(Integer.valueOf(randomId), new EntityList.EntityEggInfo(randomId, solidColor, spotColor));
	}
	
}