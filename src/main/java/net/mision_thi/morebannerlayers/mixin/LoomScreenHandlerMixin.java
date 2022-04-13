package net.mision_thi.morebannerlayers.mixin;

import net.minecraft.client.gui.screen.ingame.LoomScreen;
import net.minecraft.screen.LoomScreenHandler;
import net.mision_thi.morebannerlayers.MoreBannerLayers;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(LoomScreenHandler.class)
public class LoomScreenHandlerMixin {
    @ModifyConstant(method = "onContentChanged", constant = @Constant(intValue = 6))
    public int getLimit(int constant) {
        return MoreBannerLayers.getLimit();
    }
}