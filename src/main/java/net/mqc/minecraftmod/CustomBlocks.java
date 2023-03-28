package net.mqc.minecraftmod;

import net.fabricmc.api.ModInitializer;

import net.mqc.minecraftmod.block.ModBlocks;
import net.mqc.minecraftmod.item.ModItemGroup;
import net.mqc.minecraftmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomBlocks implements ModInitializer {
	public static final String MOD_ID = "mqcs-minecraft-mod";
	public static final Logger LOGGER = LoggerFactory.getLogger("mqcs-minecraft-mod");


	// The code that starts when Minecraft starts
	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}