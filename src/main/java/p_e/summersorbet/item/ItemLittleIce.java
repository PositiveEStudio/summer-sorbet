package p_e.summersorbet.item;

import net.minecraft.item.Item;
import p_e.summersorbet.SummerSorbet;
import p_e.summersorbet.creativetab.TabSummerSorbet;

public class ItemLittleIce extends Item
{
	public ItemLittleIce()
	{
		super();
		this.setUnlocalizedName(SummerSorbet.MODID + ".littleice");
		this.setRegistryName("little_ice");
		this.setCreativeTab(TabSummerSorbet.TAB_SUMMER_SORBET);
	}
}
