package com.battlestickk.potionofhaste;

import com.battlestickk.potionofhaste.potion.ModPotions;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BtlPotionOfHaste implements ModInitializer
	{
	public static final String MOD_ID = "btl-potion-of-haste";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize()
	{
		ModPotions.registerPotions();
	}
}
