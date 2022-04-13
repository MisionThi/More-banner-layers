package net.mision_thi.morebannerlayers;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import net.mision_thi.morebannerlayers.config.ModConfigs;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreBannerLayersMod implements ModInitializer {
	public static final String MOD_ID = "morebannerlayers";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModConfigs.registerConfigs();
	}


}
