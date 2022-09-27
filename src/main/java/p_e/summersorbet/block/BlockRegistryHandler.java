package p_e.summersorbet.block;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;
import p_e.summersorbet.item.ItemRegistryHandler;

@Mod.EventBusSubscriber
public class BlockRegistryHandler
{
	public static final BlockBlueIce BLUE_ICE = new BlockBlueIce();
	public static final BlockCompressedBlueIce COMPRESSED_BLUE_ICE = new BlockCompressedBlueIce();

	@SubscribeEvent
	public static void onRegistry(RegistryEvent.Register<Block> event)
	{
		IForgeRegistry<Block> registry = event.getRegistry();
		registry.register(BLUE_ICE);
		registry.register(COMPRESSED_BLUE_ICE);
	}

	@SubscribeEvent
	public static void onHarvesting(BlockEvent.HarvestDropsEvent event)
	{
		Block block = event.getState().getBlock();
		Boolean pass1 = block == Blocks.ICE;
		Boolean pass2 = block == Blocks.PACKED_ICE;
		if (pass1)
		{
			int amount = (int) (1 + Math.random() * (3 - 1 + 1));
			ItemStack drop = new ItemStack(ItemRegistryHandler.LITTLE_ICE, amount);
			event.getDrops().add(drop);
		}
		else if (pass2)
		{
			int amount = (int) (1 + Math.random() * (7 - 1 + 1));
			ItemStack drop = new ItemStack(ItemRegistryHandler.LITTLE_ICE, amount);
			event.getDrops().add(drop);
		}
	}
}