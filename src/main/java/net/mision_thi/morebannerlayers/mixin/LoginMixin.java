package net.mision_thi.morebannerlayers.mixin;

import io.netty.buffer.Unpooled;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.network.ClientConnection;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.server.PlayerManager;
import net.mision_thi.morebannerlayers.config.ModConfigs;
import net.mision_thi.morebannerlayers.networking.ModPackets;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;


@Mixin(value = PlayerManager.class)
public class LoginMixin {

    @Inject(at = @At("TAIL"), method = "onPlayerConnect(Lnet/minecraft/network/ClientConnection;Lnet/minecraft/server/network/ServerPlayerEntity;)V")
    private void syncBannerLayerLimit(ClientConnection connection, ServerPlayerEntity player, CallbackInfo info) {

        PacketByteBuf passedData = new PacketByteBuf(Unpooled.buffer());
        passedData.writeInt(ModConfigs.BANNER_LAYERS);
        ServerPlayNetworking.send(player, ModPackets.BANNER_LAYER_LIMIT, passedData);

    }

}
