package p_e.summersorbet.item;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;
import p_e.summersorbet.block.BlockRegistryHandler;

@Mod.EventBusSubscriber
public class ItemRegistryHandler
{

	public static final Item.ToolMaterial ICE_TOOL_MATERIAL = EnumHelper.addToolMaterial("ICE", 1, 86, 4.0F, 2.0F, 6);

	public static final ItemBlock BLUE_ICE = withRegistryName(new ItemBlock(BlockRegistryHandler.BLUE_ICE));
	public static final ItemBlock COMPRESSED_BLUE_ICE = withRegistryName(new ItemBlock(BlockRegistryHandler.COMPRESSED_BLUE_ICE));

	public static final ItemWoodIceBreakingFork WOOD_ICE_BREAKING_FORK = new ItemWoodIceBreakingFork();
	public static final ItemStoneIceBreakingFork STONE_ICE_BREAKING_FORK = new ItemStoneIceBreakingFork();
	public static final ItemIronIceBreakingFork IRON_ICE_BREAKING_FORK = new ItemIronIceBreakingFork();
	public static final ItemGoldIceBreakingFork GOLD_ICE_BREAKING_FORK = new ItemGoldIceBreakingFork();
	public static final ItemDiamondIceBreakingFork DIAMOND_ICE_BREAKING_FORK = new ItemDiamondIceBreakingFork();
	public static final ItemIceSword ICE_SWORD = new ItemIceSword();
	public static final ItemIcePickaxe ICE_PICKAXE = new ItemIcePickaxe();
	public static final ItemIceAxe ICE_AXE = new ItemIceAxe();
	public static final ItemIceShovel ICE_SPADE = new ItemIceShovel();
	public static final ItemIceHoe ICE_HOE = new ItemIceHoe();
	public static final ItemSorbet SORBET = new ItemSorbet();
	public static final ItemLittleIce LITTLE_ICE = new ItemLittleIce();

	@SubscribeEvent
	public static void onRegistry(RegistryEvent.Register<Item> event)
	{
		IForgeRegistry<Item> registry = event.getRegistry();
		registry.register(WOOD_ICE_BREAKING_FORK);
		registry.register(STONE_ICE_BREAKING_FORK);
		registry.register(IRON_ICE_BREAKING_FORK);
		registry.register(GOLD_ICE_BREAKING_FORK);
		registry.register(DIAMOND_ICE_BREAKING_FORK);
		registry.register(ICE_SWORD);
		registry.register(ICE_PICKAXE);
		registry.register(ICE_AXE);
		registry.register(ICE_SPADE);
		registry.register(ICE_HOE);
		registry.register(SORBET);
		registry.register(LITTLE_ICE);
		registry.register(BLUE_ICE);
		registry.register(COMPRESSED_BLUE_ICE);
	}

	private static ItemBlock withRegistryName(ItemBlock item)
	{
		item.setRegistryName(item.getBlock().getRegistryName());
		return item;
	}

	public static void registerModel(Item item)
	{
		ModelResourceLocation modelResourceLocation = new ModelResourceLocation(item.getRegistryName(), "inventory");
		ModelLoader.setCustomModelResourceLocation(item, 0, modelResourceLocation);
	}

	@SubscribeEvent
	@SideOnly(Side.CLIENT)
	public static void onModelRegistry(ModelRegistryEvent event)
	{
		registerModel(WOOD_ICE_BREAKING_FORK);
		registerModel(STONE_ICE_BREAKING_FORK);
		registerModel(IRON_ICE_BREAKING_FORK);
		registerModel(GOLD_ICE_BREAKING_FORK);
		registerModel(DIAMOND_ICE_BREAKING_FORK);
		registerModel(ICE_SWORD);
		registerModel(ICE_PICKAXE);
		registerModel(ICE_AXE);
		registerModel(ICE_SPADE);
		registerModel(ICE_HOE);
		registerModel(SORBET);
		registerModel(LITTLE_ICE);
		registerModel(BLUE_ICE);
		registerModel(COMPRESSED_BLUE_ICE);
	}
}
