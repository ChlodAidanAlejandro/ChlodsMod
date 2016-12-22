package tk.chlodaidan.ChlodsMod.objects.armor;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import tk.chlodaidan.ChlodsMod.MainRegistry;
import tk.chlodaidan.ChlodsMod.creativeTabs.ModCreativeTabs;
import tk.chlodaidan.ChlodsMod.misc.Config;
import tk.chlodaidan.ChlodsMod.objects.Items;

public class Armor extends Items {

	public static void mainRegistry() {
		initializeItem();
		registerItem();
		if(Config.IDPrints == true) {
			idCheck();
		}
	}
	
	//ArmorMaterial:
	public static ArmorMaterial ExtraArmor = EnumHelper.addArmorMaterial("Extraordinium Armor", 10000, new int[]{30, 80, 60, 30}, 30);
	//public static ArmorMaterial ArmorMaterialName = EnumHelper.addArmorMaterial(name, durability, new int[]{Helmet, Chestplate, Leggings, Boots}, enchantability)
	//Armor Items:
	public static Item ExtraHelmet;
	public static Item ExtraChestplate;
	public static Item ExtraLeggings;
	public static Item ExtraBoots;
	
	public static void initializeItem() {
		ExtraHelmet = new ExtraArmor(ExtraArmor, MainRegistry.proxy.addArmor("ExtraArmor"), 0).setUnlocalizedName("ExtraHelmet").setCreativeTab(ModCreativeTabs.tabChlodArmor).setTextureName("cdmd:itemophelmet");
		ExtraChestplate = new ExtraArmor(ExtraArmor, MainRegistry.proxy.addArmor("ExtraArmor"), 1).setUnlocalizedName("ExtraChestplate").setCreativeTab(ModCreativeTabs.tabChlodArmor).setTextureName("cdmd:itemopchestplate");
		ExtraLeggings = new ExtraArmor(ExtraArmor, MainRegistry.proxy.addArmor("ExtraArmor"), 2).setUnlocalizedName("ExtraLeggings").setCreativeTab(ModCreativeTabs.tabChlodArmor).setTextureName("cdmd:itemopleggings");
		ExtraBoots = new ExtraArmor(ExtraArmor, MainRegistry.proxy.addArmor("ExtraArmor"), 3).setUnlocalizedName("ExtraBoots").setCreativeTab(ModCreativeTabs.tabChlodArmor).setTextureName("cdmd:itemopboots");
	}
	
	public static void registerItem() {
		GameRegistry.registerItem(ExtraHelmet, ExtraHelmet.getUnlocalizedName());
		GameRegistry.registerItem(ExtraChestplate, ExtraChestplate.getUnlocalizedName());
		GameRegistry.registerItem(ExtraLeggings, ExtraLeggings.getUnlocalizedName());
		GameRegistry.registerItem(ExtraBoots, ExtraBoots.getUnlocalizedName());
	}
	
	public static void idCheck() {
		registerID(ExtraHelmet);
		registerID(ExtraChestplate);
		registerID(ExtraLeggings);
		registerID(ExtraBoots);
	}
}
