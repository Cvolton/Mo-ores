package com.cvolton.moores.help;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

import com.cvolton.moores.init.ModItems;

public class RecipeHelper {
//Yup I'm lazy
	public static void PickaxeRecipe(Item item, String item2){
		GameRegistry.addRecipe(new ShapedOreRecipe(item, new Object[] {"XXX", " # ", " # ",'X', item2, '#', "stickWood"}));
	}
	public static void ShovelRecipe(Item item, String item2){
		GameRegistry.addRecipe(new ShapedOreRecipe(item, new Object[] {"X", "#", "#",'X', item2, '#', "stickWood"}));
	}
	public static void SwordRecipe(Item item, String item2){
		GameRegistry.addRecipe(new ShapedOreRecipe(item, new Object[] {"X", "X", "#",'X', item2, '#', "stickWood"}));
	}
	public static void HoeRecipe(Item item, String item2){
		GameRegistry.addRecipe(new ShapedOreRecipe(item, new Object[] {"XX", " #", " #",'X', item2, '#', "stickWood"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(item, new Object[] {"XX", "# ", "# ",'X', item2, '#', "stickWood"}));
	}
	public static void AxeRecipe(Item item, String item2){
		GameRegistry.addRecipe(new ShapedOreRecipe(item, new Object[] {"XX ", "X# ", " # ",'X', item2, '#', "stickWood"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(item, new Object[] {" XX", " #X", " # ",'X', item2, '#', "stickWood"}));
	}
	public static void BlockRecipe(Block block, String item2){
		GameRegistry.addRecipe(new ShapedOreRecipe(block, new Object[] {"XXX", "XXX", "XXX",'X', item2}));
	}
}
