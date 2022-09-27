package xufly.summersorbet;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = SummerSorbet.MODID, name = SummerSorbet.NAME, version = SummerSorbet.VERSION, acceptedMinecraftVersions = "[1.12,1.13)")
public class SummerSorbet
{
    public static final String MODID = "summersorbet";
    public static final String NAME = "Summer Sorbet";
    public static final String VERSION = "1.1";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    }
}
