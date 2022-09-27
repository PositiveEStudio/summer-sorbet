package xufly.summersorbet.item;

import net.minecraft.item.ItemSpade;
import xufly.summersorbet.SummerSorbet;
import xufly.summersorbet.creativetab.TabSummerSorbet;

public class ItemIceShovel extends ItemSpade
{
	public ItemIceShovel()
	{
		super(ItemRegistryHandler.ICE_TOOL_MATERIAL);
		this.setUnlocalizedName(SummerSorbet.MODID + ".iceshovel");
		this.setRegistryName("ice_shovel");
		this.setMaxStackSize(1);
		this.setCreativeTab(TabSummerSorbet.TAB_SUMMER_SORBET);
	}
}
