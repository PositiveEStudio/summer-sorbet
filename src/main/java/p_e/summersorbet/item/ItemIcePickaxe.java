package p_e.summersorbet.item;

import net.minecraft.item.ItemPickaxe;
import p_e.summersorbet.SummerSorbet;
import p_e.summersorbet.creativetab.TabSummerSorbet;

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
