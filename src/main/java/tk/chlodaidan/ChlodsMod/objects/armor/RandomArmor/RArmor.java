package tk.chlodaidan.ChlodsMod.objects.armor.RandomArmor;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import tk.chlodaidan.ChlodsMod.MainRegistry;
import tk.chlodaidan.ChlodsMod.creativeTabs.ModCreativeTabs;
import tk.chlodaidan.ChlodsMod.misc.Config;
import tk.chlodaidan.ChlodsMod.objects.Items;
import tk.chlodaidan.ChlodsMod.objects.armor.Armor;
import tk.chlodaidan.ChlodsMod.objects.armor.ExtraArmor;

public class RArmor extends Items {

	public static void mainRegistry() {
		initializeArmor();
		registerArmor();
		if(Config.IDPrints == true) {
			idCheck();
		}
	}
	
	//Armor Material Below
	public static ArmorMaterial Pajamas = EnumHelper.addArmorMaterial("Pajama Clothes", 50, new int[]{10, 10, 10, 10}, 30);
	public static ArmorMaterial Swagger = EnumHelper.addArmorMaterial("Swagger Gear", 10, new int[]{2, 2, 2, 2}, 30);
	public static ArmorMaterial Formal = EnumHelper.addArmorMaterial("Formal Clothes", 20, new int[]{1, 1, 1, 1}, 30);
	public static ArmorMaterial InvDiamond = EnumHelper.addArmorMaterial("Invisible Diamond Armor", 33, new int[]{3, 8, 6, 3}, 30);
	public static ArmorMaterial LabGear = EnumHelper.addArmorMaterial("Laboratory Gear", 30, new int[]{10, 15, 13, 5}, 30);
	//Example: public static ArmorMaterial <name> = EnumHelper.addArmorMaterial(name, durability, reductionAmounts, enchantability);
	//Armor Material Above
	//Armor Below
	//----------------------------------------
	//Pajamas
	public static Item PajamaCap;
	public static Item PajamaShirt;
	public static Item PajamaPants;
	public static Item PajamaSlippers;
	//----------------------------------------
	//Swagger Gear B|
	public static Item Shades;
	//----------------------------------------
	//Formal Clothes
	public static Item FormalShirt;
	public static Item FormalPants;
	//----------------------------------------
	//Invisible Diamond Armor
	public static Item InvDiamondHelmet;
	public static Item InvDiamondChestplate;
	public static Item InvDiamondLeggings;
	public static Item InvDiamondBoots;
	//----------------------------------------
	//Laboratory Gear
	public static Item LabGoggles;
	public static Item LabCoat;
	public static Item LabPants;
	public static Item LabBoots;
	//----------------------------------------
	//Armor Above
	
	public static void initializeArmor() {
		//Pajamas
		PajamaCap = new Pajamas(Pajamas, MainRegistry.proxy.addArmor("Pajamas"), 0).setUnlocalizedName("PajamaCap").setCreativeTab(ModCreativeTabs.tabChlodArmor).setTextureName("cdmd:itempajamacap");
		PajamaShirt = new Pajamas(Pajamas, MainRegistry.proxy.addArmor("Pajamas"), 1).setUnlocalizedName("PajamaShirt").setCreativeTab(ModCreativeTabs.tabChlodArmor).setTextureName("cdmd:itempajamashirt");
		PajamaPants = new Pajamas(Pajamas, MainRegistry.proxy.addArmor("Pajamas"), 2).setUnlocalizedName("PajamaPants").setCreativeTab(ModCreativeTabs.tabChlodArmor).setTextureName("cdmd:itempajamapants");
		PajamaSlippers = new Pajamas(Pajamas, MainRegistry.proxy.addArmor("Pajamas"), 3).setUnlocalizedName("PajamaSlippers").setCreativeTab(ModCreativeTabs.tabChlodArmor).setTextureName("cdmd:itempajamaslippers");
		//Swagger Gears
		Shades = new Swagger(Swagger, MainRegistry.proxy.addArmor("Swagger"), 0).setUnlocalizedName("Shades").setCreativeTab(ModCreativeTabs.tabChlodArmor).setTextureName("cdmd:itemshades");
		//Formal Clothes
		FormalShirt = new Formal(Formal, MainRegistry.proxy.addArmor("Formal"), 1).setUnlocalizedName("FormalShirt").setCreativeTab(ModCreativeTabs.tabChlodArmor).setTextureName("cdmd:itemformalshirt");
		FormalPants = new Formal(Formal, MainRegistry.proxy.addArmor("Formal"), 2).setUnlocalizedName("FormalPants").setCreativeTab(ModCreativeTabs.tabChlodArmor).setTextureName("cdmd:itemformalpants");
		//Invisible Diamond Armor
		InvDiamondHelmet = new InvDiamond(InvDiamond, MainRegistry.proxy.addArmor("InvDiamond"), 0).setUnlocalizedName("InvDiamondHelmet").setCreativeTab(ModCreativeTabs.tabChlodArmor).setTextureName("cdmd:InvDiamondHelmet");
		InvDiamondChestplate = new InvDiamond(InvDiamond, MainRegistry.proxy.addArmor("InvDiamond"), 1).setUnlocalizedName("InvDiamondChestplate").setCreativeTab(ModCreativeTabs.tabChlodArmor).setTextureName("cdmd:InvDiamondChestplate");
		InvDiamondLeggings = new InvDiamond(InvDiamond, MainRegistry.proxy.addArmor("InvDiamond"), 2).setUnlocalizedName("InvDiamondLeggings").setCreativeTab(ModCreativeTabs.tabChlodArmor).setTextureName("cdmd:InvDiamondLeggings");
		InvDiamondBoots = new InvDiamond(InvDiamond, MainRegistry.proxy.addArmor("InvDiamond"), 3).setUnlocalizedName("InvDiamondBoots").setCreativeTab(ModCreativeTabs.tabChlodArmor).setTextureName("cdmd:InvDiamondBoots");
		//Laboratory Gear
		LabGoggles = new LabGear(LabGear, MainRegistry.proxy.addArmor("LabGear"), 0).setUnlocalizedName("LabGoggles").setCreativeTab(ModCreativeTabs.tabChlodArmor).setTextureName("cdmd:itemgoggles");
		LabCoat = new LabGear(LabGear, MainRegistry.proxy.addArmor("LabGear"), 1).setUnlocalizedName("LabCoat").setCreativeTab(ModCreativeTabs.tabChlodArmor).setTextureName("cdmd:itemlabtcoat");
		LabPants = new LabGear(LabGear, MainRegistry.proxy.addArmor("LabGear"), 2).setUnlocalizedName("LabPants").setCreativeTab(ModCreativeTabs.tabChlodArmor).setTextureName("cdmd:itemlabpants");
		LabBoots = new LabGear(LabGear, MainRegistry.proxy.addArmor("LabGear"), 3).setUnlocalizedName("LabBoots").setCreativeTab(ModCreativeTabs.tabChlodArmor).setTextureName("cdmd:itemlabboots");
	}
	
	public static void registerArmor() {
		//Pajamas
		GameRegistry.registerItem(PajamaCap, PajamaCap.getUnlocalizedName());
		GameRegistry.registerItem(PajamaShirt, PajamaShirt.getUnlocalizedName());
		GameRegistry.registerItem(PajamaPants, PajamaPants.getUnlocalizedName());
		GameRegistry.registerItem(PajamaSlippers, PajamaSlippers.getUnlocalizedName());
		//Swagger Gear
		GameRegistry.registerItem(Shades, Shades.getUnlocalizedName());
		//Formal Clothes
		GameRegistry.registerItem(FormalShirt, FormalShirt.getUnlocalizedName());
		GameRegistry.registerItem(FormalPants, FormalPants.getUnlocalizedName());
		//Invisible Diamond Armor
		GameRegistry.registerItem(InvDiamondHelmet, InvDiamondHelmet.getUnlocalizedName());
		GameRegistry.registerItem(InvDiamondChestplate, InvDiamondChestplate.getUnlocalizedName());
		GameRegistry.registerItem(InvDiamondLeggings, InvDiamondLeggings.getUnlocalizedName());
		GameRegistry.registerItem(InvDiamondBoots, InvDiamondBoots.getUnlocalizedName());
		//Laboratory Gear
		GameRegistry.registerItem(LabGoggles, LabGoggles.getUnlocalizedName());
		GameRegistry.registerItem(LabCoat, LabCoat.getUnlocalizedName());
		GameRegistry.registerItem(LabPants, LabPants.getUnlocalizedName());
		GameRegistry.registerItem(LabBoots, LabBoots.getUnlocalizedName());
	}
	
	public static void idCheck() {
		//Pajamas
		registerID(PajamaCap);
		registerID(PajamaShirt);
		registerID(PajamaPants);
		registerID(PajamaSlippers);
		//Swagger Gear
		registerID(Shades);
		//Formal Clothes
		registerID(FormalShirt);
		registerID(FormalPants);
		//Invisible Diamond Armor
		registerID(InvDiamondHelmet);
		registerID(InvDiamondChestplate);
		registerID(InvDiamondLeggings);
		registerID(InvDiamondBoots);
		//Laboratory Gear
		registerID(LabGoggles);
		registerID(LabCoat);
		registerID(LabPants);
		registerID(LabBoots);
	}
}
