package com.cvolton.moores.init;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

import com.cvolton.moores.help.RegisterHelper;
import com.cvolton.moores.items.CvoltonHoe;
import com.cvolton.moores.items.CvoltonPickaxe;
import com.cvolton.moores.items.CvoltonItem;
import com.cvolton.moores.items.CvoltonShovel;
import com.cvolton.moores.items.CvoltonSword;

public class ModTools {
	//NAME, harvestLevel, durability, mining speed, damage to mobs, enchantibility
	public static ToolMaterial ruby = EnumHelper.addToolMaterial("ruby", 2, 450, 8.0F, 2.5F, 15);
	public static ToolMaterial amethyst = EnumHelper.addToolMaterial("amethyst", 3, 750, 10.0F, 3.5F, 15);
	//Ruby Tools
	public static Item rubyPickaxe = new CvoltonPickaxe(ruby).setUnlocalizedName("rubyPickaxe");
	public static Item rubyAxe = new CvoltonPickaxe(ruby).setUnlocalizedName("rubyAxe");
	public static Item rubyShovel = new CvoltonShovel(ruby).setUnlocalizedName("rubyShovel");
	public static Item rubyHoe = new CvoltonHoe(ruby).setUnlocalizedName("rubyHoe");
	public static Item rubySword = new CvoltonSword(ruby).setUnlocalizedName("rubySword");
	//Ametyst Tools
	public static Item amethystPickaxe = new CvoltonPickaxe(amethyst).setUnlocalizedName("amethystPickaxe");
	public static Item amethystAxe = new CvoltonPickaxe(amethyst).setUnlocalizedName("amethystAxe");
	public static Item amethystShovel = new CvoltonShovel(amethyst).setUnlocalizedName("amethystShovel");
	public static Item amethystHoe = new CvoltonHoe(amethyst).setUnlocalizedName("amethystHoe");
	public static Item amethystSword = new CvoltonSword(amethyst).setUnlocalizedName("amethystSword");
public static void init(){
	//Ruby Tools
	RegisterHelper.registerItem(rubyPickaxe);
	RegisterHelper.registerItem(rubyAxe);
	RegisterHelper.registerItem(rubyShovel);
	RegisterHelper.registerItem(rubyHoe);
	RegisterHelper.registerItem(rubySword);
	//ametyst
	RegisterHelper.registerItem(amethystPickaxe);
	RegisterHelper.registerItem(amethystAxe);
	RegisterHelper.registerItem(amethystShovel);
	RegisterHelper.registerItem(amethystHoe);
	RegisterHelper.registerItem(amethystSword);
}
}
