package net.keeblekapa.eldritchrealms.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.keeblekapa.eldritchrealms.EldritchRealms;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    //--------------------------------------------------
    //            Decorative/Building Blocks
    //--------------------------------------------------
    // Abyssal Granite
    public static final Block ABYSSAL_GRANITE = registerBlock("abyssal_granite",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).strength(2f, 6f).sounds(BlockSoundGroup.STONE).luminance(1)));
    public static final Block POLISHED_ABYSSAL_GRANITE = registerBlock("polished_abyssal_granite",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).strength(2f, 6f).sounds(BlockSoundGroup.STONE).luminance(1)));
    public static final Block ABYSSAL_GRANITE_BRICKS = registerBlock("abyssal_granite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).strength(2f, 6f).sounds(BlockSoundGroup.STONE).luminance(1)));
    public static final Block CRACKED_ABYSSAL_GRANITE_BRICKS = registerBlock("cracked_abyssal_granite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).strength(2f, 6f).sounds(BlockSoundGroup.STONE).luminance(1)));
    public static final Block MOSSY_ABYSSAL_GRANITE = registerBlock("mossy_abyssal_granite",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).strength(2f, 6f).sounds(BlockSoundGroup.STONE).luminance(1)));
    public static final Block MOSSY_POLISHED_ABYSSAL_GRANITE = registerBlock("mossy_polished_abyssal_granite",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).strength(2f, 6f).sounds(BlockSoundGroup.STONE).luminance(1)));
    public static final Block MOSSY_ABYSSAL_GRANITE_BRICKS = registerBlock("mossy_abyssal_granite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).strength(2f, 6f).sounds(BlockSoundGroup.STONE).luminance(1)));
    public static final Block CRACKED_MOSSY_ABYSSAL_GRANITE_BRICKS = registerBlock("cracked_mossy_abyssal_granite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).strength(2f, 6f).sounds(BlockSoundGroup.STONE).luminance(1)));
    // stairs, slabs, and walls
    public static final Block ABYSSAL_GRANITE_STAIRS = registerBlock("abyssal_granite_stairs",
            new StairsBlock(ModBlocks.ABYSSAL_GRANITE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE).strength(2f, 6f).sounds(BlockSoundGroup.STONE).luminance(1)));
    public static final Block ABYSSAL_GRANITE_SLAB = registerBlock("abyssal_granite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(2f, 6f).sounds(BlockSoundGroup.STONE).luminance(1)));
    public static final Block ABYSSAL_GRANITE_WALL = registerBlock("abyssal_granite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(2f, 6f).sounds(BlockSoundGroup.STONE).luminance(1)));
    public static final Block POLISHED_ABYSSAL_GRANITE_STAIRS = registerBlock("polished_abyssal_granite_stairs",
            new StairsBlock(ModBlocks.POLISHED_ABYSSAL_GRANITE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE).strength(2f, 6f).sounds(BlockSoundGroup.STONE).luminance(1)));
    public static final Block POLISHED_ABYSSAL_GRANITE_SLAB = registerBlock("polished_abyssal_granite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(2f, 6f).sounds(BlockSoundGroup.STONE).luminance(1)));
    public static final Block POLISHED_ABYSSAL_GRANITE_WALL = registerBlock("polished_abyssal_granite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(2f, 6f).sounds(BlockSoundGroup.STONE).luminance(1)));
    public static final Block ABYSSAL_GRANITE_BRICK_STAIRS = registerBlock("abyssal_granite_brick_stairs",
            new StairsBlock(ModBlocks.ABYSSAL_GRANITE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE).strength(2f, 6f).sounds(BlockSoundGroup.STONE).luminance(1)));
    public static final Block ABYSSAL_GRANITE_BRICK_SLAB = registerBlock("abyssal_granite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(2f, 6f).sounds(BlockSoundGroup.STONE).luminance(1)));
    public static final Block ABYSSAL_GRANITE_BRICK_WALL = registerBlock("abyssal_granite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(2f, 6f).sounds(BlockSoundGroup.STONE).luminance(1)));
    public static final Block CRACKED_ABYSSAL_GRANITE_BRICK_STAIRS = registerBlock("cracked_abyssal_granite_brick_stairs",
            new StairsBlock(ModBlocks.CRACKED_ABYSSAL_GRANITE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE).strength(2f, 6f).sounds(BlockSoundGroup.STONE).luminance(1)));
    public static final Block CRACKED_ABYSSAL_GRANITE_BRICK_SLAB = registerBlock("cracked_abyssal_granite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(2f, 6f).sounds(BlockSoundGroup.STONE).luminance(1)));
    public static final Block CRACKED_ABYSSAL_GRANITE_BRICK_WALL = registerBlock("cracked_abyssal_granite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(2f, 6f).sounds(BlockSoundGroup.STONE).luminance(1)));
    public static final Block MOSSY_ABYSSAL_GRANITE_STAIRS = registerBlock("mossy_abyssal_granite_stairs",
            new StairsBlock(ModBlocks.MOSSY_ABYSSAL_GRANITE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE).strength(2f, 6f).sounds(BlockSoundGroup.STONE).luminance(1)));
    public static final Block MOSSY_ABYSSAL_GRANITE_SLAB = registerBlock(
            "mossy_abyssal_granite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(2f, 6f).sounds(BlockSoundGroup.STONE).luminance(1)));
    public static final Block MOSSY_ABYSSAL_GRANITE_WALL = registerBlock("mossy_abyssal_granite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(2f, 6f).sounds(BlockSoundGroup.STONE).luminance(1)));
    public static final Block MOSSY_POLISHED_ABYSSAL_GRANITE_STAIRS = registerBlock("mossy_polished_abyssal_granite_stairs",
            new StairsBlock(ModBlocks.MOSSY_POLISHED_ABYSSAL_GRANITE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE).strength(2f, 6f).sounds(BlockSoundGroup.STONE).luminance(1)));
    public static final Block MOSSY_POLISHED_ABYSSAL_GRANITE_SLAB = registerBlock("mossy_polished_abyssal_granite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(2f, 6f).sounds(BlockSoundGroup.STONE).luminance(1)));
    public static final Block MOSSY_POLISHED_ABYSSAL_GRANITE_WALL = registerBlock("mossy_polished_abyssal_granite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(2f, 6f).sounds(BlockSoundGroup.STONE).luminance(1)));
    public static final Block MOSSY_ABYSSAL_GRANITE_BRICK_STAIRS = registerBlock("mossy_abyssal_granite_brick_stairs",
            new StairsBlock(ModBlocks.MOSSY_ABYSSAL_GRANITE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE).strength(2f, 6f).sounds(BlockSoundGroup.STONE).luminance(1)));
    public static final Block MOSSY_ABYSSAL_GRANITE_BRICK_SLAB = registerBlock("abyssal_granite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(2f, 6f).sounds(BlockSoundGroup.STONE).luminance(1)));
    public static final Block MOSSY_ABYSSAL_GRANITE_BRICK_WALL = registerBlock("abyssal_granite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(2f, 6f).sounds(BlockSoundGroup.STONE).luminance(1)));
    public static final Block CRACKED_MOSSY_ABYSSAL_GRANITE_BRICK_STAIRS = registerBlock("cracked_mossy_abyssal_granite_brick_stairs",
            new StairsBlock(ModBlocks.CRACKED_MOSSY_ABYSSAL_GRANITE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE).strength(2f, 6f).sounds(BlockSoundGroup.STONE).luminance(1)));
    public static final Block CRACKED_MOSSY_ABYSSAL_GRANITE_BRICK_SLAB = registerBlock("cracked_mossy_abyssal_granite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(2f, 6f).sounds(BlockSoundGroup.STONE).luminance(1)));
    public static final Block CRACKED_MOSSY_ABYSSAL_GRANITE_BRICK_WALL = registerBlock("cracked_mossy_abyssal_granite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(2f, 6f).sounds(BlockSoundGroup.STONE).luminance(1)));

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


    //--------------------------------------------------
    //                 Block Registries
    //--------------------------------------------------
    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(EldritchRealms.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }
    private static Block registerBlock(String name, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(EldritchRealms.MOD_ID, name), block);
    }
    public static void registerModBlocks() {
        EldritchRealms.LOGGER.info("Registering Blocks for " + EldritchRealms.MOD_ID);
    }
    //--------------------------------------------------
    //                       End
    //--------------------------------------------------
}