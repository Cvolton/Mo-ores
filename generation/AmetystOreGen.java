package com.cvolton.moores.generation;

import java.util.Random;

import com.cvolton.moores.init.ModItems;

import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeDecorator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.event.terraingen.TerrainGen;
import net.minecraftforge.fml.common.IWorldGenerator;

public class AmetystOreGen implements IWorldGenerator{

	private static final BlockPos[] Object = null;
	private WorldGenMinable amethystgen;
	private BlockPos pos;

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
switch(world.provider.getDimensionId())	{
case -1:
	generateInNether(world, random, chunkX*16, chunkZ*16);
	break;
case 0:
	generateInOverWorld(world,random,chunkX*16,chunkZ*16);
	break;
case 1:
	generateInEnd(world,random,chunkX*16,chunkZ*16);
	break;
}
	}

	private void generateInEnd(World world, Random random, int x, int z) {
		// TODO Auto-generated method stub
		
	}

	private void generateInOverWorld(World world, Random random, int x, int z) {
		for (int i = 0; i < 10; i++){ //ta petadvacitka je jak to je vzacny
			int chunkX = x + random.nextInt(16);
			int chunkY =random.nextInt(20);
			int chunkZ = z + random.nextInt(16);
			new WorldGenMinable(ModItems.amethystore.getDefaultState(), 4).generate(world, random, new BlockPos(chunkX,chunkY,chunkZ));
		}
	}

	private void generateInNether(World world, Random random, int x, int z) {
		// TODO Auto-generated method stub
		
	}

}
