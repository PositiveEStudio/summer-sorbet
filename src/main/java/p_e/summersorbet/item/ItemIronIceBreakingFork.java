package p_e.summersorbet.item;

import p_e.summersorbet.SummerSorbet;
import p_e.summersorbet.creativetab.TabSummerSorbet;

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
