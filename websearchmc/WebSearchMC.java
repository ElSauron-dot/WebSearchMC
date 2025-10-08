package com.elsauron.websearchmc;

import net.fabricmc.api.ModInitializer;

public class WebSearchMC implements ModInitializer {
    public static final String MOD_ID = "websearchmc";

    @Override
    public void onInitialize() {
        System.out.println("[WebSearchMC] Başlatıldı!");
        WebDisplayHandler.init();
        LinkHandler.init();
    }
}
