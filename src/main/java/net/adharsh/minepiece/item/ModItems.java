package net.adharsh.minepiece.item;

import net.adharsh.minepiece.MinePiece;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    private static Item RegisterItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(MinePiece.MOD_ID, name),item);
    };

    public static void registerModItems() {
        MinePiece.LOGGER.info("Registering Mod Item For " + MinePiece.MOD_ID);
    }
}
