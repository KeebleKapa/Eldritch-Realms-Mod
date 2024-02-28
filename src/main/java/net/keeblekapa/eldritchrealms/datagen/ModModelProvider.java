package net.keeblekapa.eldritchrealms.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.keeblekapa.eldritchrealms.block.ModBlocks;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ABYSSAL_GRANITE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ABYSSAL_GRANITE_STAIRS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ABYSSAL_GRANITE_SLAB);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ABYSSAL_GRANITE_WALL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.POLISHED_ABYSSAL_GRANITE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.POLISHED_ABYSSAL_GRANITE_STAIRS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.POLISHED_ABYSSAL_GRANITE_SLAB);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.POLISHED_ABYSSAL_GRANITE_WALL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ABYSSAL_GRANITE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ABYSSAL_GRANITE_BRICK_STAIRS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ABYSSAL_GRANITE_BRICK_SLAB);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ABYSSAL_GRANITE_BRICK_WALL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRACKED_ABYSSAL_GRANITE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRACKED_ABYSSAL_GRANITE_BRICK_STAIRS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRACKED_ABYSSAL_GRANITE_BRICK_SLAB);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRACKED_ABYSSAL_GRANITE_BRICK_WALL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MOSSY_ABYSSAL_GRANITE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MOSSY_ABYSSAL_GRANITE_STAIRS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MOSSY_ABYSSAL_GRANITE_SLAB);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MOSSY_ABYSSAL_GRANITE_WALL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MOSSY_POLISHED_ABYSSAL_GRANITE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MOSSY_POLISHED_ABYSSAL_GRANITE_STAIRS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MOSSY_POLISHED_ABYSSAL_GRANITE_SLAB);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MOSSY_POLISHED_ABYSSAL_GRANITE_WALL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MOSSY_ABYSSAL_GRANITE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MOSSY_ABYSSAL_GRANITE_BRICK_STAIRS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MOSSY_ABYSSAL_GRANITE_BRICK_SLAB);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MOSSY_ABYSSAL_GRANITE_BRICK_WALL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRACKED_MOSSY_ABYSSAL_GRANITE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRACKED_MOSSY_ABYSSAL_GRANITE_BRICK_STAIRS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRACKED_MOSSY_ABYSSAL_GRANITE_BRICK_SLAB);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRACKED_MOSSY_ABYSSAL_GRANITE_BRICK_WALL);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
