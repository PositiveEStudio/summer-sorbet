package p_e.summersorbet.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import p_e.summersorbet.SummerSorbet;
import p_e.summersorbet.creativetab.TabSummerSorbet;
import p_e.summersorbet.item.ItemRegistryHandler;

public class BlockBlueIce extends Block
{
	public BlockBlueIce()
	{
		super(Material.PACKED_ICE, MapColor.ICE);
		this.setUnlocalizedName(SummerSorbet.MODID + ".blueice");
		this.setRegistryName("blue_ice");
		this.setSoundType(SoundType.GLASS);
		this.slipperiness = 1.0F;
		this.setHardness(2.8F);
		this.setCreativeTab(TabSummerSorbet.TAB_SUMMER_SORBET);
	}

	@Override
	public void getDrops(NonNullList<ItemStack> drops, IBlockAccess blockAccess, BlockPos pos, IBlockState state, int fortune)
	{
		int amount = (int) (0 + Math.random() * (15 - 1 + 1));
		ItemStack drop = new ItemStack(ItemRegistryHandler.LITTLE_ICE, amount);
		drops.add(drop);
	}
}
