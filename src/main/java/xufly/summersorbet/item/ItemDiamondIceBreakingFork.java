package xufly.summersorbet.item;

import xufly.summersorbet.SummerSorbet;
import xufly.summersorbet.creativetab.TabSummerSorbet;

public class ItemDiamondIceBreakingFork extends ItemIceBreakingFork
{
	public ItemDiamondIceBreakingFork()
	{
		super(ToolMaterial.DIAMOND);
		this.setUnlocalizedName(SummerSorbet.MODID + ".diamondicebreakingfork");
		this.setRegistryName("diamond_ice_breaking_fork");
		this.setMaxStackSize(1);
		this.setCreativeTab(TabSummerSorbet.TAB_SUMMER_SORBET);
	}
}
