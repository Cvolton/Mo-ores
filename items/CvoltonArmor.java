package com.cvolton.moores.items;

import com.cvolton.moores.help.Reference;
import com.cvolton.moores.init.ModArmor;
import com.cvolton.moores.init.ModTabs;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class CvoltonArmor extends ItemArmor{

	public CvoltonArmor(ArmorMaterial material, int renderIndex, int armorType) {
		super(material, renderIndex, armorType);
		setCreativeTab(ModTabs.mooresArmor);
	}
}
