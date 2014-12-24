package com.cvolton.moores.items;

import com.cvolton.moores.init.ModTabs;

import net.minecraft.item.ItemSpade;

public class CvoltonShovel extends ItemSpade{

	public CvoltonShovel(ToolMaterial material) {
		super(material);
		setCreativeTab(ModTabs.mooresTools);
	}

}
