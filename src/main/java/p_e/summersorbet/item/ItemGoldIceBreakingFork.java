package p_e.summersorbet.item;

import p_e.summersorbet.SummerSorbet;
import p_e.summersorbet.creativetab.TabSummerSorbet;

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
