package com.cvolton.moores.items;

import com.cvolton.moores.init.ModTabs;

import net.minecraft.item.ItemAxe;

public class CvoltonAxe extends ItemAxe{

	public CvoltonAxe(ToolMaterial material) {
		super(material);
		setCreativeTab(ModTabs.mooresTools);
	}

}
