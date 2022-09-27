package xufly.summersorbet.item;

import xufly.summersorbet.SummerSorbet;
import xufly.summersorbet.creativetab.TabSummerSorbet;

public class ItemGoldIceBreakingFork extends ItemIceBreakingFork
{
	public ItemGoldIceBreakingFork()
	{
		super(ToolMaterial.GOLD);
		this.setUnlocalizedName(SummerSorbet.MODID + ".goldicebreakingfork");
		this.setRegistryName("gold_ice_breaking_fork");
		this.setMaxStackSize(1);
		this.setCreativeTab(TabSummerSorbet.TAB_SUMMER_SORBET);
	}
}
