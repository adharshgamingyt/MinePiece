package net.adharsh.minepiece;

import net.adharsh.minepiece.Block.ModBlocks;
import net.adharsh.minepiece.item.ModItemGroup;
import net.adharsh.minepiece.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MinePiece implements ModInitializer {
	public static final String MOD_ID = "minepiece";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("MinePiece initialization!");
		ModItemGroup.registerModItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

	}
}