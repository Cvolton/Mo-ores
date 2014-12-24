package com.cvolton.moores.items;

import com.cvolton.moores.init.ModTabs;

import net.minecraft.item.ItemHoe;

public class CvoltonHoe extends ItemHoe{

	public CvoltonHoe(ToolMaterial material) {
		super(material);
		setCreativeTab(ModTabs.mooresTools);
	}

}
