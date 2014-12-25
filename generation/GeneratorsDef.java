package com.cvolton.moores.generation;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class GeneratorsDef {
	public static RubyOreGen rubyOreGenerate = new RubyOreGen();
public static void init(){
	GameRegistry.registerWorldGenerator(rubyOreGenerate, 1);
}
}
