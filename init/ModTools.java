package com.cvolton.moores.init;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

import com.cvolton.moores.items.CvoltonPickaxe;
import com.cvolton.moores.items.CvoltonItem;

public class ModTools {
	public static ToolMaterial cvoltonmaterial = EnumHelper.addToolMaterial("ruby", 2, 450, 8.0F, 2.0F, 15);
	//Ruby Tools
	public static Item rubyPickaxe = new CvoltonPickaxe(cvoltonmaterial).setUnlocalizedName("rubyPickaxe");
public static void init(){
	
}
}
