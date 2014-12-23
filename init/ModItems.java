package com.cvolton.moores.init;

import com.cvolton.moores.help.Reference;
import com.cvolton.moores.help.RegisterHelper;
import com.cvolton.moores.items.CvoltonBlock;
import com.cvolton.moores.items.rubyOre;
import com.cvolton.moores.items.CvoltonItem;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ModItems {
	public static Item ruby = new CvoltonItem().setUnlocalizedName("ruby");
	public static Block rubyblock = new CvoltonBlock().setUnlocalizedName("rubyblock");
	public static Block rubyore = new rubyOre().setUnlocalizedName("rubyore");
	//public static Item cvoltonSlabItem = new itemCvoltonSlab(cobbleSlab).setUnlocalizedName("cvoltonSlab").setCreativeTab(ModTabs.classtab);
	public static void init(){
	RegisterHelper.registerItem(ruby);
	RegisterHelper.registerBlock(rubyblock);
	RegisterHelper.registerBlock(rubyore);
}
}
