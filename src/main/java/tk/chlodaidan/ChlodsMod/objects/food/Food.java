package tk.chlodaidan.ChlodsMod.objects.food;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBucketMilk;
import net.minecraft.potion.PotionEffect;
import tk.chlodaidan.ChlodsMod.creativeTabs.ModCreativeTabs;
import tk.chlodaidan.ChlodsMod.misc.Config;
import tk.chlodaidan.ChlodsMod.objects.Items;

public class Food extends Items {

	private PotionEffect[] effects;
	
	public static void mainRegistry() {
		InitializeFood();
		registerFood();
		if(Config.IDPrints == true) {
			idCheck();
		}
	}
	//Processed
	public static Item GMBeef;
	//Uncooked
	public static Item GMUncookedBeef;
	//Unprocessed
	public static Item GMMilk;
	
	public static void InitializeFood() {
		GMBeef = new GMBeef(10, 2.0F, true).setUnlocalizedName("GMBeef").setCreativeTab(ModCreativeTabs.tabChlodFood).setTextureName("cdmd:cookedgmbeef");
		GMUncookedBeef = new GMUBeef(2, -1.0F, true).setUnlocalizedName("GMUncookedBeef").setCreativeTab(ModCreativeTabs.tabChlodFood).setTextureName("cdmd:rawgmbeef");
		GMMilk = new ItemBucketMilk().setUnlocalizedName("GMMilk").setCreativeTab(ModCreativeTabs.tabChlodFood).setTextureName("cdmd:gmmilk");
	}
	
	public static void registerFood() {
		GameRegistry.registerItem(GMBeef, GMBeef.getUnlocalizedName() );
		GameRegistry.registerItem(GMUncookedBeef, GMUncookedBeef.getUnlocalizedName());
		GameRegistry.registerItem(GMMilk, GMMilk.getUnlocalizedName());
	}
	
	public static void idCheck() {
		registerID(GMBeef);
		registerID(GMUncookedBeef);
		registerID(GMMilk);
	}
	
}
