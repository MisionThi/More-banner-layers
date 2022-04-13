package net.mision_thi.morebannerlayers;

import net.fabricmc.api.ClientModInitializer;
import net.mision_thi.morebannerlayers.networking.ModPacketsS2C;

public class MoreBannerLayersClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        ModPacketsS2C.register();


    }
}
