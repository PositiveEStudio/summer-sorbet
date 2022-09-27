package xufly.summersorbet.item;

import net.minecraft.item.ItemHoe;
import xufly.summersorbet.SummerSorbet;
import xufly.summersorbet.creativetab.TabSummerSorbet;

public class ItemIceHoe extends ItemHoe
{
	public ItemIceHoe()
	{
		super(ItemRegistryHandler.ICE_TOOL_MATERIAL);
		this.setUnlocalizedName(SummerSorbet.MODID + ".icehoe");
		this.setRegistryName("ice_hoe");
		this.setMaxStackSize(1);
		this.setCreativeTab(TabSummerSorbet.TAB_SUMMER_SORBET);
	}
}
