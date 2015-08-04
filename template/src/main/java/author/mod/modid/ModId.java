package ${authorLower}.mod.${modIdLower};

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.relauncher.Side;
import ${authorLower}.mod.${modIdLower}.helper.Ref;
import ${authorLower}.mod.${modIdLower}.proxy.Proxy;

@Mod(modid = Ref.MOD_ID, name = "${modName}", version = "@MOD_VERSION@")
public class ${modId} {

    @Mod.Instance(Ref.MOD_ID)
    @SuppressWarnings("unused")
    public static ${modId} instance;

    @SidedProxy(serverSide = "${authorLower}.mod.${modIdLower}.proxy.Proxy", clientSide = "${authorLower}.mod.${modIdLower}.proxy.ProxyClient")
    public static Proxy proxy;

    @Mod.EventHandler
    @SuppressWarnings("unused")
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }

    @Mod.EventHandler
    @SuppressWarnings("unused")
    public void init(FMLInitializationEvent event) {
        proxy.init();
    }

    @Mod.EventHandler
    @SuppressWarnings("unused")
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit();
    }
}
