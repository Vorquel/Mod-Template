package ${authorLower}.mod.${modIdLower}.proxy;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import ${authorLower}.mod.${modIdLower}.helper.Log;
import ${authorLower}.mod.${modIdLower}.helper.Ref;

import java.util.Hashtable;

public class Proxy {

    public void preInit(FMLPreInitializationEvent event) {
        Log.setLogger(event.getModLog());
    }

    public void init() {}

    public void postInit() {}
}
