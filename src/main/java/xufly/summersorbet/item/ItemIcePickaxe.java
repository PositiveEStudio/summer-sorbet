package xufly.summersorbet.item;

import net.minecraft.item.ItemPickaxe;
import xufly.summersorbet.SummerSorbet;
import xufly.summersorbet.creativetab.TabSummerSorbet;

public class ItemIcePickaxe extends ItemPickaxe
{
	public ItemIcePickaxe()
	{
		super(ItemRegistryHandler.ICE_TOOL_MATERIAL);
		this.setUnlocalizedName(SummerSorbet.MODID + ".icepickaxe");
		this.setRegistryName("ice_pickaxe");
		this.setCreativeTab(TabSummerSorbet.TAB_SUMMER_SORBET);
	}
}
