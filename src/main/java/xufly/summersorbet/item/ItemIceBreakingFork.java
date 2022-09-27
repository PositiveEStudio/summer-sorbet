package xufly.summersorbet.item;

import com.google.common.collect.Sets;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import xufly.summersorbet.block.BlockRegistryHandler;

import java.util.Set;

public class ItemIceBreakingFork extends ItemTool
{

	public static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(Blocks.ICE, Blocks.PACKED_ICE);

	ItemIceBreakingFork(Item.ToolMaterial material)
	{
		super(1.0F, -2.5F, material, EFFECTIVE_ON);
	}

	public float getDestroySpeed(ItemStack stack, IBlockState state)
	{
		Block block = state.getBlock();
		Boolean pass = (block == Blocks.ICE || block == Blocks.PACKED_ICE || block == BlockRegistryHandler.BLUE_ICE || block == BlockRegistryHandler.COMPRESSED_BLUE_ICE);
		float speed = super.getDestroySpeed(stack, state);
		return (pass) ? speed * 1.5F : speed;
	}

}
