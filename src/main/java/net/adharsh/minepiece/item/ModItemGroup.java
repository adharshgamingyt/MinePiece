package net.adharsh.minepiece.item;

import net.adharsh.minepiece.MinePiece;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItemGroup {

    private static ItemGroup registerItemGroups(String name, ItemGroup itemgroup) {
        return Registry.register(Registries.ITEM_GROUP, Identifier.of(MinePiece.MOD_ID, name),
                FabricItemGroup.builder().build());
    }

    public static void registerModItemGroups() {
        MinePiece.LOGGER.info("Registering Mod Item Groups For" + MinePiece.MOD_ID);
    }
}
