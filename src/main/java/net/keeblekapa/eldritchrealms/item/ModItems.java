package net.keeblekapa.eldritchrealms.item;

import net.keeblekapa.eldritchrealms.EldritchRealms;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(EldritchRealms.MOD_ID, name), item);
    }

    public static void registerModItems() {
        EldritchRealms.LOGGER.info("Registering Items for " + EldritchRealms.MOD_ID);
    }
}
