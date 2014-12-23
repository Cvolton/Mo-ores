package com.cvolton.moores.init;

import net.minecraftforge.oredict.OreDictionary;

public class OreRegister {
public static void init(){
	OreDictionary.registerOre("gemRuby", ModItems.ruby);
	OreDictionary.registerOre("blockRuby", ModItems.rubyblock);
	OreDictionary.registerOre("oreRuby", ModItems.rubyore);
}
}
