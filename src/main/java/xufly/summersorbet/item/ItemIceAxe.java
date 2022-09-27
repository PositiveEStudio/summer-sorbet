package xufly.summersorbet.item;

import net.minecraft.item.ItemAxe;
import xufly.summersorbet.SummerSorbet;
import xufly.summersorbet.creativetab.TabSummerSorbet;

public class ItemIceAxe extends ItemAxe
{
	public ItemIceAxe()
	{
		super(ItemRegistryHandler.ICE_TOOL_MATERIAL, 9.5F, -3.0F);
		this.setUnlocalizedName(SummerSorbet.MODID + ".iceaxe");
		this.setRegistryName("ice_axe");
		this.setCreativeTab(TabSummerSorbet.TAB_SUMMER_SORBET);
	}
}
