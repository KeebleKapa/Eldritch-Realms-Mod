package net.keeblekapa.eldritchrealms.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.keeblekapa.eldritchrealms.EldritchRealms;
import net.keeblekapa.eldritchrealms.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup ELDRITCH_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(EldritchRealms.MOD_ID, "eldritch_blocks"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.eldritch_blocks"))
                    .entries((displayContext, entries) -> {

                    }).build());


    public static void registerItemGroups() {
        EldritchRealms.LOGGER.info("Registering Item Groups for " + EldritchRealms.MOD_ID);
    }
}
