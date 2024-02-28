package net.keeblekapa.eldritchrealms.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.keeblekapa.eldritchrealms.block.ModBlocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.ABYSSAL_GRANITE)
                .add(ModBlocks.ABYSSAL_GRANITE_STAIRS)
                .add(ModBlocks.ABYSSAL_GRANITE_SLAB)
                .add(ModBlocks.ABYSSAL_GRANITE_WALL)
                .add(ModBlocks.POLISHED_ABYSSAL_GRANITE)
                .add(ModBlocks.POLISHED_ABYSSAL_GRANITE_STAIRS)
                .add(ModBlocks.POLISHED_ABYSSAL_GRANITE_SLAB)
                .add(ModBlocks.POLISHED_ABYSSAL_GRANITE_WALL)
                .add(ModBlocks.ABYSSAL_GRANITE_BRICKS)
                .add(ModBlocks.ABYSSAL_GRANITE_BRICK_STAIRS)
                .add(ModBlocks.ABYSSAL_GRANITE_BRICK_SLAB)
                .add(ModBlocks.ABYSSAL_GRANITE_BRICK_WALL)
                .add(ModBlocks.CRACKED_ABYSSAL_GRANITE_BRICKS)
                .add(ModBlocks.CRACKED_ABYSSAL_GRANITE_BRICK_STAIRS)
                .add(ModBlocks.CRACKED_ABYSSAL_GRANITE_BRICK_SLAB)
                .add(ModBlocks.CRACKED_ABYSSAL_GRANITE_BRICK_WALL)
                .add(ModBlocks.MOSSY_ABYSSAL_GRANITE)
                .add(ModBlocks.MOSSY_ABYSSAL_GRANITE_STAIRS)
                .add(ModBlocks.MOSSY_ABYSSAL_GRANITE_SLAB)
                .add(ModBlocks.MOSSY_ABYSSAL_GRANITE_WALL)
                .add(ModBlocks.MOSSY_POLISHED_ABYSSAL_GRANITE)
                .add(ModBlocks.MOSSY_POLISHED_ABYSSAL_GRANITE_STAIRS)
                .add(ModBlocks.MOSSY_POLISHED_ABYSSAL_GRANITE_SLAB)
                .add(ModBlocks.MOSSY_POLISHED_ABYSSAL_GRANITE_WALL)
                .add(ModBlocks.MOSSY_ABYSSAL_GRANITE_BRICKS)
                .add(ModBlocks.MOSSY_ABYSSAL_GRANITE_BRICK_STAIRS)
                .add(ModBlocks.MOSSY_ABYSSAL_GRANITE_BRICK_SLAB)
                .add(ModBlocks.MOSSY_ABYSSAL_GRANITE_BRICK_WALL)
                .add(ModBlocks.CRACKED_MOSSY_ABYSSAL_GRANITE_BRICKS)
                .add(ModBlocks.CRACKED_MOSSY_ABYSSAL_GRANITE_BRICK_STAIRS)
                .add(ModBlocks.CRACKED_MOSSY_ABYSSAL_GRANITE_BRICK_SLAB)
                .add(ModBlocks.CRACKED_MOSSY_ABYSSAL_GRANITE_BRICK_WALL);

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE);


        getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE);


        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE);


        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL);


        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL);


        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL);

        getOrCreateTagBuilder(BlockTags.STAIRS)
                .add(ModBlocks.ABYSSAL_GRANITE_STAIRS)
                .add(ModBlocks.POLISHED_ABYSSAL_GRANITE_STAIRS)
                .add(ModBlocks.ABYSSAL_GRANITE_BRICK_STAIRS)
                .add(ModBlocks.CRACKED_ABYSSAL_GRANITE_BRICK_STAIRS)
                .add(ModBlocks.MOSSY_ABYSSAL_GRANITE_STAIRS)
                .add(ModBlocks.MOSSY_POLISHED_ABYSSAL_GRANITE_STAIRS)
                .add(ModBlocks.MOSSY_ABYSSAL_GRANITE_BRICK_STAIRS)
                .add(ModBlocks.CRACKED_MOSSY_ABYSSAL_GRANITE_BRICK_STAIRS);

        getOrCreateTagBuilder(BlockTags.SLABS)
                .add(ModBlocks.ABYSSAL_GRANITE_SLAB)
                .add(ModBlocks.POLISHED_ABYSSAL_GRANITE_SLAB)
                .add(ModBlocks.ABYSSAL_GRANITE_BRICK_SLAB)
                .add(ModBlocks.CRACKED_ABYSSAL_GRANITE_BRICK_SLAB)
                .add(ModBlocks.MOSSY_ABYSSAL_GRANITE_SLAB)
                .add(ModBlocks.MOSSY_POLISHED_ABYSSAL_GRANITE_SLAB)
                .add(ModBlocks.MOSSY_ABYSSAL_GRANITE_BRICK_SLAB)
                .add(ModBlocks.CRACKED_MOSSY_ABYSSAL_GRANITE_BRICK_SLAB);

        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.ABYSSAL_GRANITE_WALL)
                .add(ModBlocks.POLISHED_ABYSSAL_GRANITE_WALL)
                .add(ModBlocks.ABYSSAL_GRANITE_BRICK_WALL)
                .add(ModBlocks.CRACKED_ABYSSAL_GRANITE_BRICK_WALL)
                .add(ModBlocks.MOSSY_ABYSSAL_GRANITE_WALL)
                .add(ModBlocks.MOSSY_POLISHED_ABYSSAL_GRANITE_WALL)
                .add(ModBlocks.MOSSY_ABYSSAL_GRANITE_BRICK_WALL)
                .add(ModBlocks.CRACKED_MOSSY_ABYSSAL_GRANITE_BRICK_WALL);
    }

}
