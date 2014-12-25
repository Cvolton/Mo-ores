package com.cvolton.moores.init;

import com.cvolton.moores.help.RecipeHelper;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ModRecipes {
	public static void init() {
	//Ruby Items
	RecipeHelper.BlockRecipe(ModItems.rubyblock, "gemRuby");
	RecipeHelper.PickaxeRecipe(ModTools.rubyPickaxe, "gemRuby");
	RecipeHelper.AxeRecipe(ModTools.rubyAxe, "gemRuby");
	RecipeHelper.ShovelRecipe(ModTools.rubyShovel, "gemRuby");
	RecipeHelper.SwordRecipe(ModTools.rubySword, "gemRuby");
	RecipeHelper.HoeRecipe(ModTools.rubyHoe, "gemRuby");
	RecipeHelper.HeadRecipe(ModArmor.rubyHelmet, "gemRuby");
	RecipeHelper.ChestRecipe(ModArmor.rubyChestplate, "gemRuby");
	RecipeHelper.LegRecipe(ModArmor.rubyLeggins, "gemRuby");
	RecipeHelper.BootsRecipe(ModArmor.rubyBoots, "gemRuby");
	
	//Amethyst Items
	RecipeHelper.BlockRecipe(ModItems.amethystblock, "gemAmethyst");
	RecipeHelper.PickaxeRecipe(ModTools.amethystPickaxe, "gemAmethyst");
	RecipeHelper.AxeRecipe(ModTools.amethystAxe, "gemAmethyst");
	RecipeHelper.ShovelRecipe(ModTools.amethystShovel, "gemAmethyst");
	RecipeHelper.SwordRecipe(ModTools.amethystSword, "gemAmethyst");
	RecipeHelper.HoeRecipe(ModTools.amethystHoe, "gemAmethyst");
	RecipeHelper.HeadRecipe(ModArmor.amethystHelmet, "gemAmethyst");
	RecipeHelper.ChestRecipe(ModArmor.amethystChestplate, "gemAmethyst");
	RecipeHelper.LegRecipe(ModArmor.amethystLeggins, "gemAmethyst");
	RecipeHelper.BootsRecipe(ModArmor.amethystBoots, "gemAmethyst");
	}
}
