package tk.chlodaidan.ChlodsMod.objects.tools;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import scala.Int;
import tk.chlodaidan.ChlodsMod.creativeTabs.ModCreativeTabs;
import tk.chlodaidan.ChlodsMod.misc.Config;
import tk.chlodaidan.ChlodsMod.objects.Items;

public class Tools extends Items {

	public static void mainRegistry() {
		initializeItem();
		registerItem();
		if(Config.IDPrints == true) {
			idCheck();
		}
	}
	
	//ToolMaterials go here V V V
	public static ToolMaterial extraordinium = EnumHelper.addToolMaterial("Extraordinium", Int.MaxValue() / 2, Int.MaxValue() / 2, 7499999999.25F, 7499999999.25F, 1610612735);
	public static ToolMaterial ultramaterial = EnumHelper.addToolMaterial("UltraTool", Int.MaxValue(), Int.MaxValue(), 9999999999.00F, 9999999999.00F, 2147483647);
	//public static ToolMaterial material = EnumHelper.addToolMaterial(name, harvestLevel, maxUses, efficiency, damage, enchantability);
	//ToolMaterials list ends HERE
	//Items go here V V V
	public static Item ExtraPickaxe;
	public static Item ExtraShovel;
	public static Item ExtraSword;
	public static Item ExtraAxe;
	public static Item ExtraHoe;
	public static Item ExtraShears;
	public static Item UltraPickaxe;
	public static Item UltraPickaxe0;
	public static Item UltraPickaxe1;
	public static Item UltraPickaxe2;
	public static Item UltraPickaxe3;
	public static Item PEWPEWBLAST;
	public static Item Flamethrower;
	public static Item BatteryPack;
	public static Item NitroPack; 
	public static Item ExtraBow;
	public static Item ExtraArrow;
	/*NO MORE ITEMS HERE*/
	
	public static void initializeItem() {
		ExtraPickaxe = new ExtraPickaxe(extraordinium).setUnlocalizedName("ExtraPickaxe").setCreativeTab(ModCreativeTabs.tabChlodTools).setTextureName("cdmd:itemopickaxe");
		ExtraShovel = new ExtraShovel(extraordinium).setUnlocalizedName("ExtraShovel").setCreativeTab(ModCreativeTabs.tabChlodTools).setTextureName("cdmd:itemopshovel");
		ExtraSword = new ExtraSword(extraordinium).setUnlocalizedName("ExtraSword").setCreativeTab(ModCreativeTabs.tabChlodTools).setTextureName("cdmd:itemopsword");
		ExtraAxe = new ExtraAxe(extraordinium).setUnlocalizedName("ExtraAxe").setCreativeTab(ModCreativeTabs.tabChlodTools).setTextureName("cdmd:itemopaxe");
		ExtraHoe = new ExtraHoe(extraordinium).setUnlocalizedName("ExtraHoe").setCreativeTab(ModCreativeTabs.tabChlodTools).setTextureName("cdmd:itemophoe");
		ExtraShears = new ExtraShears(extraordinium).setUnlocalizedName("ExtraShears").setCreativeTab(ModCreativeTabs.tabChlodTools).setTextureName("cdmd:itemopshears");
		UltraPickaxe = new UltraPickaxe(ultramaterial).setUnlocalizedName("UltraPickaxe").setCreativeTab(ModCreativeTabs.tabChlodTools).setTextureName("cdmd:ultrapickaxe");
		UltraPickaxe0 = new UltraPickaxe0().setUnlocalizedName("UltraPickaxe0").setCreativeTab(ModCreativeTabs.tabChlodTools).setTextureName("cdmd:ultrapickaxe");
		UltraPickaxe1 = new UltraPickaxe1().setUnlocalizedName("UltraPickaxe1").setCreativeTab(ModCreativeTabs.tabChlodTools).setTextureName("cdmd:ultrapickaxe");
		UltraPickaxe2 = new UltraPickaxe2().setUnlocalizedName("UltraPickaxe2").setCreativeTab(ModCreativeTabs.tabChlodTools).setTextureName("cdmd:ultrapickaxe");
		UltraPickaxe3 = new UltraPickaxe3().setUnlocalizedName("UltraPickaxe3").setCreativeTab(ModCreativeTabs.tabChlodTools).setTextureName("cdmd:ultrapickaxe");
		PEWPEWBLAST = new PEPEWBLAST().setUnlocalizedName("PEWPEWBLAST").setCreativeTab(ModCreativeTabs.tabChlodTools).setTextureName("cdmd:pewpew");
		Flamethrower = new FlameThrower().setUnlocalizedName("FlameThrower").setCreativeTab(ModCreativeTabs.tabChlodTools).setTextureName("cdmd:flame");
		BatteryPack = new BatteryPack().setUnlocalizedName("BatteryPack").setCreativeTab(ModCreativeTabs.tabChlodTools).setTextureName("cdmd:batterypack");
		NitroPack = new NitroPack().setUnlocalizedName("NitroPack").setCreativeTab(ModCreativeTabs.tabChlodTools).setTextureName("cdmd:nitro");
		ExtraBow = new ExtraBow(extraordinium).setUnlocalizedName("ExtraBow").setCreativeTab(ModCreativeTabs.tabChlodTools).setTextureName("cdmd:extrabow");
		ExtraArrow = new Item().setUnlocalizedName("ExtraBow").setCreativeTab(ModCreativeTabs.tabChlodTools).setTextureName("cdmd:extrabow");
	}
	
	public static void registerItem() {
		GameRegistry.registerItem(ExtraPickaxe, ExtraPickaxe.getUnlocalizedName());
		GameRegistry.registerItem(ExtraShovel, ExtraShovel.getUnlocalizedName());
		GameRegistry.registerItem(ExtraSword, ExtraSword.getUnlocalizedName());
		GameRegistry.registerItem(ExtraAxe, ExtraAxe.getUnlocalizedName());
		GameRegistry.registerItem(ExtraHoe, ExtraHoe.getUnlocalizedName());
		GameRegistry.registerItem(ExtraShears, ExtraShears.getUnlocalizedName());
		GameRegistry.registerItem(UltraPickaxe, UltraPickaxe.getUnlocalizedName());
		GameRegistry.registerItem(UltraPickaxe0, UltraPickaxe0.getUnlocalizedName());
		GameRegistry.registerItem(UltraPickaxe1, UltraPickaxe1.getUnlocalizedName());
		GameRegistry.registerItem(UltraPickaxe2, UltraPickaxe2.getUnlocalizedName());
		GameRegistry.registerItem(UltraPickaxe3, UltraPickaxe3.getUnlocalizedName());
		GameRegistry.registerItem(PEWPEWBLAST,  PEWPEWBLAST.getUnlocalizedName());
		GameRegistry.registerItem(Flamethrower,  Flamethrower.getUnlocalizedName());
		GameRegistry.registerItem(BatteryPack,  BatteryPack.getUnlocalizedName());
		GameRegistry.registerItem(NitroPack,  NitroPack.getUnlocalizedName());
		GameRegistry.registerItem(ExtraBow, ExtraBow.getUnlocalizedName());
	}
	
	public static void idCheck(){
		registerID(ExtraPickaxe);
		registerID(ExtraShovel);
		registerID(ExtraSword);
		registerID(ExtraAxe);
		registerID(ExtraHoe);
		registerID(ExtraShears);
		registerID(UltraPickaxe);
		registerID(UltraPickaxe0);
		registerID(UltraPickaxe1);
		registerID(UltraPickaxe2);
		registerID(UltraPickaxe3);
		registerID(PEWPEWBLAST);
		registerID(Flamethrower);
		registerID(BatteryPack);
		registerID(NitroPack);
		registerID(ExtraBow);
	}
}
