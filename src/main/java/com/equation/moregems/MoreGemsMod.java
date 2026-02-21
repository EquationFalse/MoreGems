package com.equation.moregems;

import com.equation.moregems.block.MoreGemsBlocks;
import com.equation.moregems.item.MoreGemsItemGroups;
import com.equation.moregems.item.MoreGemsItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreGemsMod implements ModInitializer {
	public static final String MOD_ID = "moregems";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		MoreGemsItems.initialize();
        MoreGemsBlocks.initialize();
		MoreGemsItemGroups.initialize();
		LOGGER.info("Hello Fabric world!");
	}
}