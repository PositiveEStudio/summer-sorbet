package xufly.summersorbet.item;

import xufly.summersorbet.SummerSorbet;
import xufly.summersorbet.creativetab.TabSummerSorbet;

public class ItemIronIceBreakingFork extends ItemIceBreakingFork
{
	public ItemIronIceBreakingFork()
	{
		super(ToolMaterial.IRON);
		this.setUnlocalizedName(SummerSorbet.MODID + ".ironicebreakingfork");
		this.setRegistryName("iron_ice_breaking_fork");
		this.setMaxStackSize(1);
		this.setCreativeTab(TabSummerSorbet.TAB_SUMMER_SORBET);
	}
}
