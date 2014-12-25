package com.cvolton.moores.init;

import net.minecraftforge.oredict.OreDictionary;

public class OreRegister {
public static void init(){
	//ruby
	OreDictionary.registerOre("gemRuby", ModItems.ruby);
	OreDictionary.registerOre("blockRuby", ModItems.rubyblock);
	OreDictionary.registerOre("oreRuby", ModItems.rubyore);
	//ametyst
	OreDictionary.registerOre("gemAmethyst", ModItems.amethyst);
	OreDictionary.registerOre("blockAmethyst", ModItems.amethystblock);
	OreDictionary.registerOre("oreAmethyst", ModItems.amethystore);
	//copper
	OreDictionary.registerOre("ingotCopper", ModItems.copperIngot);
	OreDictionary.registerOre("blockCopper", ModItems.copperblock);
	OreDictionary.registerOre("oreCopper", ModItems.copperore);
}
}
