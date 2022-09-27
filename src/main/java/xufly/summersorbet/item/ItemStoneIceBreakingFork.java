package xufly.summersorbet.item;

import xufly.summersorbet.SummerSorbet;
import xufly.summersorbet.creativetab.TabSummerSorbet;

public class ItemStoneIceBreakingFork extends ItemIceBreakingFork
{
	public ItemStoneIceBreakingFork()
	{
		super(ToolMaterial.STONE);
		this.setUnlocalizedName(SummerSorbet.MODID + ".stoneicebreakingfork");
		this.setRegistryName("stone_ice_breaking_fork");
		this.setMaxStackSize(1);
		this.setCreativeTab(TabSummerSorbet.TAB_SUMMER_SORBET);
	}
}
