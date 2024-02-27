package net.keeblekapa.eldritchrealms;

import net.fabricmc.api.ModInitializer;

import net.keeblekapa.eldritchrealms.block.ModBlocks;
import net.keeblekapa.eldritchrealms.item.ModItemGroups;
import net.keeblekapa.eldritchrealms.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EldritchRealms implements ModInitializer {
	public static final String MOD_ID = "eldritchrealms";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}