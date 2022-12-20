package net.mision_thi.morebannerlayers.mixin;

import net.minecraft.recipe.BannerDuplicateRecipe;
import net.mision_thi.morebannerlayers.MoreBannerLayers;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(BannerDuplicateRecipe.class)
public class BannerDuplicateRecipeMixin {
    @ModifyConstant(method = "matches(Lnet/minecraft/inventory/CraftingInventory;Lnet/minecraft/world/World;)Z", constant = @Constant(intValue = 6))
    private static int getLimit(int constant) {
        return MoreBannerLayers.getLimit();
    }
}
