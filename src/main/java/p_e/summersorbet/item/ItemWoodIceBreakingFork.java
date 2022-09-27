package p_e.summersorbet.item;

import p_e.summersorbet.SummerSorbet;
import p_e.summersorbet.creativetab.TabSummerSorbet;

public class ItemWoodIceBreakingFork extends ItemIceBreakingFork
{
	public ItemWoodIceBreakingFork()
	{
		super(ToolMaterial.WOOD);
		this.setUnlocalizedName(SummerSorbet.MODID + ".woodicebreakingfork");
		this.setRegistryName("wood_ice_breaking_fork");
		this.setMaxStackSize(1);
		this.setCreativeTab(TabSummerSorbet.TAB_SUMMER_SORBET);
	}
}
