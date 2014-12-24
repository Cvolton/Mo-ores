package com.cvolton.moores;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import com.cvolton.moores.generation.GeneratorsDef;
import com.cvolton.moores.help.Reference;
import com.cvolton.moores.init.ModArmor;
import com.cvolton.moores.init.ModItems;
import com.cvolton.moores.init.ModRecipes;
import com.cvolton.moores.init.ModTools;
import com.cvolton.moores.init.OreRegister;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class CvoltonMoOres {
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		System.out.println("Cvolton's Mo' Ores mod is ready to go!");
		
	}
	
	@Mod.EventHandler
	public void Init(FMLInitializationEvent event)
	{
		System.out.println("Cvolton's Mo' Ores: Loading Items & Blocks");
		ModItems.init();
		System.out.println("Cvolton's Mo' Ores: Loading Tools");
		ModTools.init();
		System.out.println("Cvolton's Mo' Ores: Loading Armor");
		ModArmor.init();
		System.out.println("Cvolton's Mo' Ores: Hooking up into the Ore Dictionary");
		OreRegister.init();
		System.out.println("Cvolton's Mo' Ores: Preparing the ore generators");
		GeneratorsDef.init();
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		System.out.println("Cvolton's Mo' Ores: Preparing the crafting recipes");
		ModRecipes.init();
		System.out.println("Cvolton's Mo' Ores: I'm fully loaded up!");
	}

}
