package net.mision_thi.morebannerlayers.networking;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.network.PacketByteBuf;
import net.mision_thi.morebannerlayers.config.ModConfigs;


public class ModPacketsS2C {

    @Environment(EnvType.CLIENT)
    public static void register() {
        ClientPlayConnectionEvents.INIT.register(((clientPlayNetworkHandler, minecraftClient) -> {
            ClientPlayNetworking.registerReceiver(ModPackets.BANNER_LAYER_LIMIT, ModPacketsS2C::recieveBLL);
        }));
    }

    private static void recieveBLL(MinecraftClient minecraftClient, ClientPlayNetworkHandler clientPlayNetworkHandler, PacketByteBuf packetByteBuf, PacketSender packetSender) {

        ModConfigs.BANNER_LAYERS = packetByteBuf.readInt();
    }


}
