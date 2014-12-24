package com.cvolton.moores.items;

import com.cvolton.moores.init.ModTabs;

import net.minecraft.item.ItemPickaxe;

public class CvoltonPickaxe extends ItemPickaxe{

	public CvoltonPickaxe(ToolMaterial material) {
		super(material);
		setCreativeTab(ModTabs.mooresTools);
	}

}
