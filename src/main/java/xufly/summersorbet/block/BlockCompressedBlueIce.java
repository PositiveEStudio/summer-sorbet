package xufly.summersorbet.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import xufly.summersorbet.SummerSorbet;
import xufly.summersorbet.creativetab.TabSummerSorbet;
import xufly.summersorbet.item.ItemRegistryHandler;

public class BlockCompressedBlueIce extends Block
{
	public BlockCompressedBlueIce()
	{
		super(Material.PACKED_ICE, MapColor.ICE);
		this.setUnlocalizedName(SummerSorbet.MODID + ".compressedblueice");
		this.setRegistryName("compressed_blue_ice");
		this.setSoundType(SoundType.GLASS);
		this.slipperiness = 1.02F;
		this.setHardness(3.55F);
		this.setCreativeTab(TabSummerSorbet.TAB_SUMMER_SORBET);
	}

	@Override
	public void getDrops(NonNullList<ItemStack> drops, IBlockAccess blockAccess, BlockPos pos, IBlockState state, int fortune)
	{

		int amount = (int) (1 + Math.random() * (31 - 1 + 1));
		ItemStack drop = new ItemStack(ItemRegistryHandler.LITTLE_ICE, amount);
		drops.add(drop);
	}
}
