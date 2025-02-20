package net.adharsh.minepiece.Block;

import net.adharsh.minepiece.MinePiece;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    private static Block registerBlock(String name,Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(MinePiece.MOD_ID, name), block );
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(MinePiece.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        MinePiece.LOGGER.info("Registering Mod Blocks For " + MinePiece.MOD_ID);
    }
}
