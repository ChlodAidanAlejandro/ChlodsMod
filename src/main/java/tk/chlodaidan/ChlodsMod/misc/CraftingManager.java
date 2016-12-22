package tk.chlodaidan.ChlodsMod.misc;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import tk.chlodaidan.ChlodsMod.objects.Items;
import tk.chlodaidan.ChlodsMod.objects.armor.Armor;
import tk.chlodaidan.ChlodsMod.objects.armor.RandomArmor.RArmor;
import tk.chlodaidan.ChlodsMod.objects.blocks.Blocks;
import tk.chlodaidan.ChlodsMod.objects.food.Food;
import tk.chlodaidan.ChlodsMod.objects.tools.Tools;
import cpw.mods.fml.common.registry.GameRegistry;

public class CraftingManager {
	public static void mainRegistry() {
		addCraftingRes();
		addSmeltingRes();
	}
	public static void addCraftingRes () {
		//Shaped
		GameRegistry.addRecipe(new ItemStack(Blocks.ExtraBlock, 1), new Object[]{"EEE","EEE","EEE", 'E', Items.Extraordinium});
		GameRegistry.addRecipe(new ItemStack(Tools.ExtraSword, 1), new Object[]{" E "," E "," S ", 'E', Items.Extraordinium, 'S', Items.ExtraStick});
		GameRegistry.addRecipe(new ItemStack(Tools.ExtraPickaxe, 1), new Object[]{"EEE", " S ", " S ", 'E', Items.Extraordinium, 'S', Items.ExtraStick});
		GameRegistry.addRecipe(new ItemStack(Tools.ExtraShovel, 1), new Object[]{" E "," S "," S ", 'E', Items.Extraordinium, 'S', Items.ExtraStick});
		GameRegistry.addRecipe(new ItemStack(Tools.ExtraAxe, 1), new Object[]{"EE ","ES "," S ", 'E', Items.Extraordinium, 'S', Items.ExtraStick});
		GameRegistry.addRecipe(new ItemStack(Tools.ExtraHoe, 1), new Object[]{"EE "," S "," S ", 'E', Items.Extraordinium, 'S', Items.ExtraStick});
		GameRegistry.addRecipe(new ItemStack(Items.Extraordinium, 1), new Object[]{"SS","SS", 'S', Items.ExtraordiniumShard});
		GameRegistry.addRecipe(new ItemStack(Items.Extraordinium, 1), new Object[]{"BQB","EDE","BQB", 'B', net.minecraft.init.Items.baked_potato, 'Q', net.minecraft.init.Items.nether_star, 'E', net.minecraft.init.Blocks.emerald_block, 'D', net.minecraft.init.Blocks.diamond_block});
		GameRegistry.addRecipe(new ItemStack(Items.ExtraSeeds, 4), new Object[]{"SEB", 'E', Items.Extraordinium, 'B', net.minecraft.init.Items.blaze_powder, 'S', net.minecraft.init.Items.wheat_seeds});
		GameRegistry.addRecipe(new ItemStack(Items.ExtraordiniumShard, 4), new Object[]{"E", 'E', Items.Extraordinium});
		GameRegistry.addRecipe(new ItemStack(Armor.ExtraHelmet, 1), new Object[]{"EEE","E E", 'E', Items.Extraordinium});
		GameRegistry.addRecipe(new ItemStack(Armor.ExtraChestplate, 1), new Object[]{"E E","EEE","EEE", 'E', Items.Extraordinium});
		GameRegistry.addRecipe(new ItemStack(Armor.ExtraLeggings, 1), new Object[]{"EEE","E E","E E", 'E', Items.Extraordinium});
		GameRegistry.addRecipe(new ItemStack(Armor.ExtraBoots, 1), new Object[]{"E E", "E E", 'E', Items.Extraordinium});
		GameRegistry.addRecipe(new ItemStack(Items.Cloth, 12), new Object[]{"WWW", 'W', net.minecraft.init.Blocks.wool});
		GameRegistry.addRecipe(new ItemStack(net.minecraft.init.Blocks.wool, 1), new Object[]{"CC","CC", 'C', Items.Cloth});
		GameRegistry.addRecipe(new ItemStack(RArmor.PajamaCap, 1), new Object[]{"EEE","E E", 'E', Items.Cloth});
		GameRegistry.addRecipe(new ItemStack(RArmor.PajamaShirt, 1), new Object[]{"E E","EEE","EEE", 'E', Items.Cloth});
		GameRegistry.addRecipe(new ItemStack(RArmor.PajamaPants, 1), new Object[]{"EEE","E E","E E", 'E', Items.Cloth});
		GameRegistry.addRecipe(new ItemStack(RArmor.PajamaSlippers, 1), new Object[]{"E E", "E E", 'E', Items.Cloth});
		GameRegistry.addRecipe(new ItemStack(RArmor.Shades, 1), new Object[]{"SDS", 'S', net.minecraft.init.Items.stick, 'D', net.minecraft.init.Items.dye});
		GameRegistry.addRecipe(new ItemStack(RArmor.FormalShirt, 1), new Object[]{"EDE","EEE","EEE", 'E', Items.Cloth, 'D', net.minecraft.init.Items.dye});
		GameRegistry.addRecipe(new ItemStack(RArmor.FormalPants, 1), new Object[]{"EEE","EDE","E E", 'E', Items.Cloth, 'D', net.minecraft.init.Items.dye});
		GameRegistry.addRecipe(new ItemStack(RArmor.InvDiamondHelmet, 1), new Object[]{"EEE","EDE", 'E', net.minecraft.init.Items.diamond, 'D', net.minecraft.init.Items.dye});
		GameRegistry.addRecipe(new ItemStack(RArmor.InvDiamondChestplate, 1), new Object[]{"EDE","EEE","EEE", 'E', net.minecraft.init.Items.diamond, 'D', net.minecraft.init.Items.dye});
		GameRegistry.addRecipe(new ItemStack(RArmor.InvDiamondLeggings, 1), new Object[]{"EEE","EDE","E E", 'E', net.minecraft.init.Items.diamond, 'D', net.minecraft.init.Items.dye});
		GameRegistry.addRecipe(new ItemStack(RArmor.InvDiamondBoots, 1), new Object[]{"EDE", "E E", 'E', net.minecraft.init.Items.diamond, 'D', net.minecraft.init.Items.dye});
		GameRegistry.addRecipe(new ItemStack(Blocks.Illumination), new Object[]{"GQG", 'G', net.minecraft.init.Items.glowstone_dust, 'Q', net.minecraft.init.Items.quartz});
		GameRegistry.addRecipe(new ItemStack(RArmor.LabGoggles, 1), new Object[]{"EEE","R R", 'E', Items.Cloth, 'R', Items.Rubber});
		GameRegistry.addRecipe(new ItemStack(RArmor.LabCoat, 1), new Object[]{"E E","EEE","RER", 'E', Items.Cloth, 'R', Items.Rubber});
		GameRegistry.addRecipe(new ItemStack(RArmor.LabPants, 1), new Object[]{"ERE","E E","E E", 'E', Items.Cloth, 'R', Items.Rubber});
		GameRegistry.addRecipe(new ItemStack(RArmor.LabBoots, 1), new Object[]{"R R", "R R", 'R', Items.Rubber});
		GameRegistry.addRecipe(new ItemStack(Tools.PEWPEWBLAST, 1), new Object[]{"XBB","BDR","BRE", 'X', Items.Extraordinium, 'B', net.minecraft.init.Items.blaze_powder, 'R', Items.Rubber, 'D', net.minecraft.init.Items.diamond, 'E', net.minecraft.init.Items.emerald});
		GameRegistry.addRecipe(new ItemStack(Tools.Flamethrower, 1), new Object[]{"FBB","BDR","BRE", 'F', net.minecraft.init.Blocks.fire, 'B', net.minecraft.init.Items.blaze_powder, 'R', Items.Rubber, 'D', net.minecraft.init.Items.diamond, 'E', net.minecraft.init.Items.emerald});
		GameRegistry.addRecipe(new ItemStack(Tools.BatteryPack, 1), new Object[]{" E ","IRI","IUI", 'E', net.minecraft.init.Blocks.redstone_block, 'I', net.minecraft.init.Items.iron_ingot, 'R', net.minecraft.init.Items.redstone, 'U', Items.Rubber});
		GameRegistry.addRecipe(new ItemStack(Tools.NitroPack, 1), new Object[]{"GRG","GBG","GGG", 'G', net.minecraft.init.Blocks.glass, 'R', Items.Rubber, 'B', net.minecraft.init.Items.blaze_powder});
		//Command Blocks are now CRAFTABLE
		GameRegistry.addRecipe(new ItemStack(net.minecraft.init.Blocks.command_block), new Object[]{"EDE","DXD","EDE", 'E', net.minecraft.init.Items.emerald, 'D', net.minecraft.init.Items.diamond, 'X', Blocks.ExtraBlock});
		GameRegistry.addRecipe(new ItemStack(Items.CompressedCoal, 2), new Object[]{"CCC","CCC","CCC", 'C', new ItemStack(net.minecraft.init.Blocks.coal_block, 64, 0)});
		GameRegistry.addRecipe(new ItemStack(Items.ExtraStick, 1), new Object[]{"E","E", 'E', Items.Extraordinium});
		GameRegistry.addRecipe(new ItemStack(Tools.UltraPickaxe0, 1), new Object[]{"EEE", " S ", " S ", 'E', Blocks.ExtraBlock, 'S', Items.ExtraStick});
		GameRegistry.addRecipe(new ItemStack(Tools.UltraPickaxe1, 1), new Object[]{"III","IUI","III", 'I', net.minecraft.init.Blocks.iron_block, 'U', Tools.UltraPickaxe0});
		GameRegistry.addRecipe(new ItemStack(Tools.UltraPickaxe2, 1), new Object[]{"DDD","DUD","DDD", 'D', net.minecraft.init.Blocks.diamond_block, 'U', Tools.UltraPickaxe1});
		GameRegistry.addRecipe(new ItemStack(Tools.UltraPickaxe3, 1), new Object[]{"EEE","EUE","EEE", 'E', net.minecraft.init.Blocks.emerald_block, 'U', Tools.UltraPickaxe2});
		GameRegistry.addRecipe(new ItemStack(Tools.UltraPickaxe, 1), new Object[]{"XXX","XUX","XXX", 'X', Blocks.ExtraBlock, 'U', Tools.UltraPickaxe3});
		GameRegistry.addRecipe(new ItemStack(Blocks.CompressedCoal, 1), new Object[]{"CCC","CCC","CCC", 'C', Items.CompressedCoal});
		GameRegistry.addRecipe(new ItemStack(Items.ExtraordiniumShard, 1), new Object[]{"SS","SS", 'S', Items.ExtraStick});
		GameRegistry.addRecipe(new ItemStack(Items.ExtraStick, 1), new Object[]{"SS","SS", 'S', Items.ExtraSeeds});
		GameRegistry.addRecipe(new ItemStack(Items.Crashifier, 1), new Object[]{"IXI","IGI","DIE", 'I', net.minecraft.init.Items.iron_ingot, 'X', Items.Extraordinium, 'G', net.minecraft.init.Blocks.glass_pane, 'D', net.minecraft.init.Items.diamond, 'E', net.minecraft.init.Items.emerald});
		GameRegistry.addRecipe(new ItemStack(Blocks.Sidewalk, 3), new Object[]{"OWP","SSS", 'S', net.minecraft.init.Blocks.stone, 'O', new ItemStack(net.minecraft.init.Items.dye, 1, 14), 'W', new ItemStack(net.minecraft.init.Items.dye, 1, 15), 'P', new ItemStack(net.minecraft.init.Items.dye, 1, 9)});
		//Shapeless
		GameRegistry.addShapelessRecipe(new ItemStack(Items.Cloth, 4), new Object[]{net.minecraft.init.Blocks.wool});
	}
	public static void addSmeltingRes () {
		GameRegistry.addSmelting(Blocks.ExtraOre, new ItemStack(Items.Extraordinium, 1), 10.0F);
		GameRegistry.addSmelting(net.minecraft.init.Blocks.coal_block, new ItemStack(net.minecraft.init.Blocks.fire, 1), 2.0F);
		GameRegistry.addSmelting(Items.CompressedCoal, new ItemStack(net.minecraft.init.Items.diamond, 1), 2.0F);
		GameRegistry.addSmelting(Blocks.CompressedCoal, new ItemStack(net.minecraft.init.Blocks.diamond_block, 1), 2.0F);
		GameRegistry.addSmelting(net.minecraft.init.Blocks.sapling, new ItemStack(Items.Rubber, 1), 2.0F);
		GameRegistry.addSmelting(Food.GMUncookedBeef, new ItemStack(Food.GMBeef, 1), 5.0F);
	}
}
