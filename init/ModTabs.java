package com.cvolton.moores.init;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ModTabs {
public static CreativeTabs mooresItems = new CreativeTabs("mooresItems") {
    @Override
    @SideOnly(Side.CLIENT)
    public Item getTabIconItem() {
        return ModItems.ruby;
    }
};
public static CreativeTabs mooresBlocks = new CreativeTabs("mooresBlocks") {
    @Override
    @SideOnly(Side.CLIENT)
    public Item getTabIconItem() {
        return Item.getItemFromBlock(ModItems.rubyblock);
    }
};
public static CreativeTabs mooresTools = new CreativeTabs("mooresTools") {
    @Override
    @SideOnly(Side.CLIENT)
    public Item getTabIconItem() {
        return ModTools.rubyPickaxe;
    }
};
public static CreativeTabs mooresArmor = new CreativeTabs("mooresArmor") {
    @Override
    @SideOnly(Side.CLIENT)
    public Item getTabIconItem() {
        return ModArmor.rubyChestplate;
    }
};
}
