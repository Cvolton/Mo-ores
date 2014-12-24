package com.cvolton.moores.items;

import com.cvolton.moores.init.ModTabs;

import net.minecraft.item.ItemSword;

public class CvoltonSword extends ItemSword{

	public CvoltonSword(ToolMaterial material) {
		super(material);
		setCreativeTab(ModTabs.mooresTools);
	}

}
