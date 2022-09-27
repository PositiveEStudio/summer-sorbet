package p_e.summersorbet.item;

import net.minecraft.item.Item;
import p_e.summersorbet.SummerSorbet;
import p_e.summersorbet.creativetab.TabSummerSorbet;

public class ItemSorbet extends Item
{
	public ItemSorbet()
	{
		super();
		this.setUnlocalizedName(SummerSorbet.MODID + ".sorbet");
		this.setRegistryName("sorbet");
		this.setMaxStackSize(64);
		this.setCreativeTab(TabSummerSorbet.TAB_SUMMER_SORBET);
	}
}
