package com.cvolton.moores.items;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockGlass;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

import com.cvolton.moores.init.ModItems;
import com.cvolton.moores.init.ModTabs;

public class AmethystOre extends Block {
	public AmethystOre()
	{
	super(Material.rock);
	setCreativeTab(ModTabs.mooresBlocks);
	setHardness(2.0F);
	setResistance(10.0F);
	}
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return ModItems.amethyst;
    }
	public int quantityDropped(Random random)
    {
        return this == Blocks.lapis_ore ? 4 + random.nextInt(5) : 1;
    }
    protected boolean canSilkHarvest()
    {
        return true;
    }
    public int quantityDroppedWithBonus(int fortune, Random random)
    {
        if (fortune > 0 && Item.getItemFromBlock(this) != this.getItemDropped((IBlockState)this.getBlockState().getValidStates().iterator().next(), random, fortune))
        {
            int j = random.nextInt(fortune + 2) - 1;

            if (j < 0)
            {
                j = 0;
            }

            return this.quantityDropped(random) * (j + 1);
        }
        else
        {
            return this.quantityDropped(random);
        }
    }
}
