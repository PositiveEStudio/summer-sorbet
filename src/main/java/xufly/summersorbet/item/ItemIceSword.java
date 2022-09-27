package xufly.summersorbet.item;

import net.minecraft.item.ItemSword;
import xufly.summersorbet.SummerSorbet;
import xufly.summersorbet.creativetab.TabSummerSorbet;

public class ItemIceSword extends ItemSword
{
	public ItemIceSword()
	{
		super(ItemRegistryHandler.ICE_TOOL_MATERIAL);
		this.setUnlocalizedName(SummerSorbet.MODID + ".icesword");
		this.setRegistryName("ice_sword");
		this.setMaxStackSize(1);
		this.setCreativeTab(TabSummerSorbet.TAB_SUMMER_SORBET);
	}
}
