package com.cvolton.moores.init;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ModRecipes {
	public static void init() {
	//GameRegistry.addRecipe(new ItemStack(ModItems.cobbleclassstairs, 1), new Object[] {"#  ", "## ", "###", '#', ModItems.cobbleclass});
	//GameRegistry.addRecipe(new ItemStack(ModItems.bricksclassstairs, 1), new Object[] {"#  ", "## ", "###", '#', ModItems.bricksclass});
	GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.rubyblock, new Object[] {"###", "###", "###", Character.valueOf('#'), "gemRuby"}));
	}
}
