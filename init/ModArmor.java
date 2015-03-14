package com.cvolton.moores.init;

import com.cvolton.moores.help.Reference;
import com.cvolton.moores.help.RegisterHelper;
import com.cvolton.moores.items.CvoltonArmor;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModArmor {
	//      what the heck does that new int[] do? i get it now, its the armor points
	public static ArmorMaterial ruby = EnumHelper.addArmorMaterial("ruby", "ruby", 18, new int[]{2, 7, 6, 2}, 10);
	public static ArmorMaterial amethyst = EnumHelper.addArmorMaterial("amethyst", "amethyst", 45, new int[]{4, 8, 7, 4}, 30);
	public static ArmorMaterial copper = EnumHelper.addArmorMaterial("copper", "copper", 15, new int[]{2, 5, 4, 1}, 14);
//Rubinovy brneni!
	public static Item rubyHelmet = new CvoltonArmor(ruby, 0, 0).setUnlocalizedName("rubyHelmet");
public static Item rubyChestplate = new CvoltonArmor(ruby, 0, 1).setUnlocalizedName("rubyChestplate");
public static Item rubyLeggins = new CvoltonArmor(ruby, 0, 2).setUnlocalizedName("rubyLeggins");
public static Item rubyBoots = new CvoltonArmor(ruby, 0, 3).setUnlocalizedName("rubyBoots");
//Najednou Ametyst
public static Item amethystHelmet = new CvoltonArmor(amethyst, 0, 0).setUnlocalizedName("amethystHelmet");
public static Item amethystChestplate = new CvoltonArmor(amethyst, 0, 1).setUnlocalizedName("amethystChestplate");
public static Item amethystLeggins = new CvoltonArmor(amethyst, 0, 2).setUnlocalizedName("amethystLeggins");
public static Item amethystBoots = new CvoltonArmor(amethyst, 0, 3).setUnlocalizedName("amethystBoots");
//Copper
public static Item copperHelmet = new CvoltonArmor(copper, 0, 0).setUnlocalizedName("copperHelmet");
public static Item copperChestplate = new CvoltonArmor(copper, 0, 1).setUnlocalizedName("copperChestplate");
public static Item copperLeggins = new CvoltonArmor(copper, 0, 2).setUnlocalizedName("copperLeggins");
public static Item copperBoots = new CvoltonArmor(copper, 0, 3).setUnlocalizedName("copperBoots");
	public static void init(){
	//Rubin
		RegisterHelper.registerItem(rubyHelmet);
		RegisterHelper.registerItem(rubyChestplate);
		RegisterHelper.registerItem(rubyLeggins);
		RegisterHelper.registerItem(rubyBoots);
		//Amethyst
		RegisterHelper.registerItem(amethystHelmet);
		RegisterHelper.registerItem(amethystChestplate);
		RegisterHelper.registerItem(amethystLeggins);
		RegisterHelper.registerItem(amethystBoots);
		//Copper
		RegisterHelper.registerItem(copperHelmet);
		RegisterHelper.registerItem(copperChestplate);
		RegisterHelper.registerItem(copperLeggins);
		RegisterHelper.registerItem(copperBoots);
}
}
