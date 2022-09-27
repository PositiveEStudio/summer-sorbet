package xufly.summersorbet.item;

import xufly.summersorbet.SummerSorbet;
import xufly.summersorbet.creativetab.TabSummerSorbet;

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
