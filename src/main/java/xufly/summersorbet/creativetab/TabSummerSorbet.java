package xufly.summersorbet.creativetab;


import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import xufly.summersorbet.item.ItemRegistryHandler;

public class TabSummerSorbet extends CreativeTabs
{
    public static final TabSummerSorbet TAB_SUMMER_SORBET = new TabSummerSorbet();

    public TabSummerSorbet()
    {
        super("summersorbet");
    }

    @Override
    public ItemStack getTabIconItem()
    {
        return new ItemStack(ItemRegistryHandler.SORBET);
    }
}
