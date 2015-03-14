package com.cvolton.moores.generation;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class GeneratorsDef {
	public static RubyOreGen rubyOreGenerate = new RubyOreGen();
	public static CopperOreGen copperOreGenerate = new CopperOreGen();
	public static AmetystOreGen ametystOreGenerate = new AmetystOreGen();
public static void init(){
	GameRegistry.registerWorldGenerator(rubyOreGenerate, 1);
	GameRegistry.registerWorldGenerator(copperOreGenerate, 1);
	GameRegistry.registerWorldGenerator(ametystOreGenerate, 1);
	
}
}
