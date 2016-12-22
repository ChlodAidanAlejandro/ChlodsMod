package tk.chlodaidan.ChlodsMod.world;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraftforge.oredict.OreDictionary;
import tk.chlodaidan.ChlodsMod.objects.Items;

public class OreDicHandling {

	public static void mainRegistry() {
		oreRegistration();
		addOreRecipes(); 
	}

    public static void oreRegistration() {
    	OreDictionary.registerOre("gemExtraO", Items.Extraordinium);
    	OreDictionary.registerOre("rubber", Items.Rubber);
    	OreDictionary.registerOre("ic2Rubber", Items.Rubber);
    	OreDictionary.registerOre("materialRubber", Items.Rubber);
    	OreDictionary.registerOre("itemRubber", Items.Rubber);
    	OreDictionary.registerOre("materialCloth", Items.Cloth);
    	OreDictionary.registerOre("cloth", Items.Cloth);
    }
   
    public static void addOreRecipes() {
           
    }
    
}
