package com.cvolton.moores.init;

import com.cvolton.moores.help.Reference;
import com.cvolton.moores.help.RegisterHelper;
import com.cvolton.moores.items.CvoltonBlock;
import com.cvolton.moores.items.AmethystOre;
import com.cvolton.moores.items.RubyOre;
import com.cvolton.moores.items.CvoltonItem;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ModItems {
	//Rubin
	public static Item ruby = new CvoltonItem().setUnlocalizedName("ruby");
	public static Block rubyblock = new CvoltonBlock().setUnlocalizedName("rubyblock");
	public static Block rubyore = new RubyOre().setUnlocalizedName("rubyore");
	//Ametyst
	public static Item amethyst = new CvoltonItem().setUnlocalizedName("amethyst");
	public static Block amethystblock = new CvoltonBlock().setUnlocalizedName("amethystblock");
	public static Block amethystore = new AmethystOre().setUnlocalizedName("amethystore");
	//Copper
	public static Item copperIngot = new CvoltonItem().setUnlocalizedName("copperIngot");
	public static Block copperblock = new CvoltonBlock().setUnlocalizedName("copperblock");
	public static Block copperore = new CopperOre().setUnlocalizedName("copperore");
	public static void init(){
		//ruby
	RegisterHelper.registerItem(ruby);
	RegisterHelper.registerBlock(rubyblock);
	RegisterHelper.registerBlock(rubyore);
	//amethyst
	RegisterHelper.registerItem(amethyst);
	RegisterHelper.registerBlock(amethystblock);
	RegisterHelper.registerBlock(amethystore);
	//copper
	RegisterHelper.registerItem(copper);
	RegisterHelper.registerBlock(copperblock);
	RegisterHelper.registerBlock(copperore);
}
}
