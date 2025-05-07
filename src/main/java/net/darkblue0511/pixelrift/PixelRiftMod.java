package net.darkblue0511.pixelrift;

import net.darkblue0511.pixelrift.block.ModBlocks;
import net.darkblue0511.pixelrift.item.ModItemGroups;
import net.darkblue0511.pixelrift.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PixelRiftMod implements ModInitializer {
	public static final String MOD_ID = "pixelrift";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}