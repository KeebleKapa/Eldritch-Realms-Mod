package net.keeblekapa.eldritchrealms.block;

import net.keeblekapa.eldritchrealms.EldritchRealms;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    //--------------------------------------------------
    //            Decorative/Building Blocks
    //--------------------------------------------------
    // Abyssal Granite

    // Cryptic Chert

    // Cursed Cobble

    // Ebon Obsidian

    // Eldritch Limestone

    // Ghostly Gabbro

    // Hauntrock

    // Mystic Marble

    // Netherweave

    // Shadowslate

    // Silent Sandstone

    // Umbral Onyx

    // Veilstone

    // Wraithstone


    //--------------------------------------------------
    //                  Light Blocks
    //--------------------------------------------------
    // Gloomarble

    // Twilight Shale


    //--------------------------------------------------
    //               Element/Ore Blocks
    //--------------------------------------------------
    // Cursed Silver (Decorative blocks & ore block)

    // Dreadium (Decorative blocks & ore block)

    // Dreadquartz (Decorative blocks & ore block)

    // Eclipsium (Decorative blocks & ore block)

    // Eldritch Essence (Decorative blocks & ore block)

    // Enigmatic Iron (Decorative blocks & ore block)

    // Etherealite (Decorative blocks & ore block)

    // Hallowed Gold (Decorative blocks & ore block)

    // Mystic Crystal  (ore block)

    // Nebula Copper (Decorative blocks & ore block)

    // Nebula Lapis (Decorative blocks & ore block)

    // Phantomite (Decorative blocks & ore blocks)

    // Shadowsteel (Decorative blocks & ore block)

    // Soulspark (Decorative blocks & ore block)

    // Spectralite (Decorative blocks & ore block)

    // Twilightium (Decorative blocks & ore block)

    // Voidstone  (ore block)


    //--------------------------------------------------
    //                   Log Blocks
    //--------------------------------------------------
    // Elder Tree

    // Phantomwood

    // Umbran Oak

    //--------------------------------------------------
    //               Dirt/Ground Blocks
    //--------------------------------------------------
    // Astral Sand

    // Eerie Gravel

    // Mystic Grass

    // Shadowsoil

    //--------------------------------------------------
    //                 Utility Blocks
    //--------------------------------------------------


    //--------------------------------------------------
    //                  Other Blocks
    //--------------------------------------------------



    private static Block registerBlock(String name, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(EldritchRealms.MOD_ID, name), block);
    }

    public static void registerModBlocks() {
        EldritchRealms.LOGGER.info("Registering Blocks for " + EldritchRealms.MOD_ID);
    }
}
