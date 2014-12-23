package com.cvolton.moores.items;

import com.cvolton.moores.help.Reference;
import com.cvolton.moores.init.ModTabs;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class CvoltonBlock extends Block{

	public CvoltonBlock()
	{
	super(Material.rock);
	setCreativeTab(ModTabs.mooresBlocks);
	setHardness(2.0F);
	setResistance(10.0F);
	}
}
