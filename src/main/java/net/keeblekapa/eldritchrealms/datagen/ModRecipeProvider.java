package net.keeblekapa.eldritchrealms.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.keeblekapa.eldritchrealms.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.ShapedRecipe;
import net.minecraft.recipe.StonecuttingRecipe;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    private static final List<ItemConvertible> CUTTING_ABYSSAL_GRANITE = List.of(ModBlocks.ABYSSAL_GRANITE);
    private static final List<ItemConvertible> CRACKED_ABYSSAL_GRANITE_BRICKS_SMELTING = List.of(ModBlocks.ABYSSAL_GRANITE_BRICKS);

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        //--------------------------------------------------
        //             Abyssal Granite Recipes
        //--------------------------------------------------
        // Crafting
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_ABYSSAL_GRANITE, 4)
                .pattern("AA ")
                .pattern("AA ")
                .pattern("   ")
                .input('A', ModBlocks.ABYSSAL_GRANITE)
                .criterion(hasItem(ModBlocks.ABYSSAL_GRANITE), conditionsFromItem(ModBlocks.ABYSSAL_GRANITE));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ABYSSAL_GRANITE_BRICKS, 4)
                .pattern("AA ")
                .pattern("AA ")
                .pattern("   ")
                .input('A', ModBlocks.POLISHED_ABYSSAL_GRANITE)
                .criterion(hasItem(ModBlocks.POLISHED_ABYSSAL_GRANITE), conditionsFromItem(ModBlocks.POLISHED_ABYSSAL_GRANITE));
        //----------------------------------------------------------------------------------------------------------------------------------------------------
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ABYSSAL_GRANITE_STAIRS, 4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .input('A', ModBlocks.ABYSSAL_GRANITE)
                .criterion(hasItem(ModBlocks.ABYSSAL_GRANITE), conditionsFromItem(ModBlocks.ABYSSAL_GRANITE));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_ABYSSAL_GRANITE_STAIRS, 4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .input('A', ModBlocks.POLISHED_ABYSSAL_GRANITE)
                .criterion(hasItem(ModBlocks.POLISHED_ABYSSAL_GRANITE), conditionsFromItem(ModBlocks.POLISHED_ABYSSAL_GRANITE));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ABYSSAL_GRANITE_BRICK_STAIRS, 4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .input('A', ModBlocks.ABYSSAL_GRANITE_BRICKS)
                .criterion(hasItem(ModBlocks.ABYSSAL_GRANITE_BRICKS), conditionsFromItem(ModBlocks.ABYSSAL_GRANITE_BRICKS));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_ABYSSAL_GRANITE_BRICK_STAIRS, 4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .input('A', ModBlocks.CRACKED_ABYSSAL_GRANITE_BRICKS)
                .criterion(hasItem(ModBlocks.CRACKED_ABYSSAL_GRANITE_BRICKS), conditionsFromItem(ModBlocks.CRACKED_ABYSSAL_GRANITE_BRICKS));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_ABYSSAL_GRANITE_STAIRS, 4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .input('A', ModBlocks.MOSSY_ABYSSAL_GRANITE)
                .criterion(hasItem(ModBlocks.MOSSY_ABYSSAL_GRANITE), conditionsFromItem(ModBlocks.MOSSY_ABYSSAL_GRANITE));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_POLISHED_ABYSSAL_GRANITE_STAIRS, 4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .input('A', ModBlocks.MOSSY_POLISHED_ABYSSAL_GRANITE)
                .criterion(hasItem(ModBlocks.MOSSY_POLISHED_ABYSSAL_GRANITE), conditionsFromItem(ModBlocks.MOSSY_POLISHED_ABYSSAL_GRANITE));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_ABYSSAL_GRANITE_BRICK_STAIRS, 4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .input('A', ModBlocks.MOSSY_ABYSSAL_GRANITE_BRICKS)
                .criterion(hasItem(ModBlocks.MOSSY_ABYSSAL_GRANITE_BRICKS), conditionsFromItem(ModBlocks.MOSSY_ABYSSAL_GRANITE_BRICKS));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_MOSSY_ABYSSAL_GRANITE_BRICK_STAIRS, 4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .input('A', ModBlocks.CRACKED_MOSSY_ABYSSAL_GRANITE_BRICKS)
                .criterion(hasItem(ModBlocks.CRACKED_MOSSY_ABYSSAL_GRANITE_BRICK_STAIRS), conditionsFromItem(ModBlocks.CRACKED_MOSSY_ABYSSAL_GRANITE_BRICKS));
        //----------------------------------------------------------------------------------------------------------------------------------------------------
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ABYSSAL_GRANITE_SLAB, 6)
                .pattern("AAA")
                .input('A', ModBlocks.ABYSSAL_GRANITE)
                .criterion(hasItem(ModBlocks.ABYSSAL_GRANITE), conditionsFromItem(ModBlocks.ABYSSAL_GRANITE));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_ABYSSAL_GRANITE_SLAB, 6)
                .pattern("AAA")
                .input('A', ModBlocks.POLISHED_ABYSSAL_GRANITE)
                .criterion(hasItem(ModBlocks.POLISHED_ABYSSAL_GRANITE), conditionsFromItem(ModBlocks.POLISHED_ABYSSAL_GRANITE));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ABYSSAL_GRANITE_BRICK_SLAB, 6)
                .pattern("AAA")
                .input('A', ModBlocks.ABYSSAL_GRANITE_BRICKS)
                .criterion(hasItem(ModBlocks.ABYSSAL_GRANITE_BRICKS), conditionsFromItem(ModBlocks.ABYSSAL_GRANITE_BRICKS));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_ABYSSAL_GRANITE_BRICK_SLAB, 6)
                .pattern("AAA")
                .input('A', ModBlocks.CRACKED_ABYSSAL_GRANITE_BRICKS)
                .criterion(hasItem(ModBlocks.CRACKED_ABYSSAL_GRANITE_BRICKS), conditionsFromItem(ModBlocks.CRACKED_ABYSSAL_GRANITE_BRICKS));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_ABYSSAL_GRANITE_SLAB, 6)
                .pattern("AAA")
                .input('A', ModBlocks.MOSSY_ABYSSAL_GRANITE)
                .criterion(hasItem(ModBlocks.MOSSY_ABYSSAL_GRANITE), conditionsFromItem(ModBlocks.MOSSY_ABYSSAL_GRANITE));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_POLISHED_ABYSSAL_GRANITE_SLAB, 6)
                .pattern("AAA")
                .input('A', ModBlocks.MOSSY_POLISHED_ABYSSAL_GRANITE)
                .criterion(hasItem(ModBlocks.MOSSY_POLISHED_ABYSSAL_GRANITE), conditionsFromItem(ModBlocks.MOSSY_POLISHED_ABYSSAL_GRANITE));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_ABYSSAL_GRANITE_BRICK_SLAB, 6)
                .pattern("AAA")
                .input('A', ModBlocks.MOSSY_ABYSSAL_GRANITE_BRICKS)
                .criterion(hasItem(ModBlocks.MOSSY_ABYSSAL_GRANITE_BRICKS), conditionsFromItem(ModBlocks.MOSSY_ABYSSAL_GRANITE_BRICKS));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_MOSSY_ABYSSAL_GRANITE_BRICK_SLAB, 6)
                .pattern("AAA")
                .input('A', ModBlocks.CRACKED_MOSSY_ABYSSAL_GRANITE_BRICKS)
                .criterion(hasItem(ModBlocks.CRACKED_MOSSY_ABYSSAL_GRANITE_BRICK_STAIRS), conditionsFromItem(ModBlocks.CRACKED_MOSSY_ABYSSAL_GRANITE_BRICKS));
        //----------------------------------------------------------------------------------------------------------------------------------------------------
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ABYSSAL_GRANITE_WALL, 6)
                .pattern("AAA")
                .pattern("AAA")
                .input('A', ModBlocks.ABYSSAL_GRANITE)
                .criterion(hasItem(ModBlocks.ABYSSAL_GRANITE), conditionsFromItem(ModBlocks.ABYSSAL_GRANITE));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_ABYSSAL_GRANITE_WALL, 6)
                .pattern("AAA")
                .pattern("AAA")
                .input('A', ModBlocks.POLISHED_ABYSSAL_GRANITE)
                .criterion(hasItem(ModBlocks.POLISHED_ABYSSAL_GRANITE), conditionsFromItem(ModBlocks.POLISHED_ABYSSAL_GRANITE));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ABYSSAL_GRANITE_BRICK_WALL, 6)
                .pattern("AAA")
                .pattern("AAA")
                .input('A', ModBlocks.ABYSSAL_GRANITE_BRICKS)
                .criterion(hasItem(ModBlocks.ABYSSAL_GRANITE_BRICKS), conditionsFromItem(ModBlocks.ABYSSAL_GRANITE_BRICKS));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_ABYSSAL_GRANITE_BRICK_WALL, 6)
                .pattern("AAA")
                .pattern("AAA")
                .input('A', ModBlocks.CRACKED_ABYSSAL_GRANITE_BRICKS)
                .criterion(hasItem(ModBlocks.CRACKED_ABYSSAL_GRANITE_BRICKS), conditionsFromItem(ModBlocks.CRACKED_ABYSSAL_GRANITE_BRICKS));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_ABYSSAL_GRANITE_WALL, 6)
                .pattern("AAA")
                .pattern("AAA")
                .input('A', ModBlocks.MOSSY_ABYSSAL_GRANITE)
                .criterion(hasItem(ModBlocks.MOSSY_ABYSSAL_GRANITE), conditionsFromItem(ModBlocks.MOSSY_ABYSSAL_GRANITE));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_POLISHED_ABYSSAL_GRANITE_WALL, 6)
                .pattern("AAA")
                .pattern("AAA")
                .input('A', ModBlocks.MOSSY_POLISHED_ABYSSAL_GRANITE)
                .criterion(hasItem(ModBlocks.MOSSY_POLISHED_ABYSSAL_GRANITE), conditionsFromItem(ModBlocks.MOSSY_POLISHED_ABYSSAL_GRANITE));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_ABYSSAL_GRANITE_BRICK_WALL, 6)
                .pattern("AAA")
                .pattern("AAA")
                .input('A', ModBlocks.MOSSY_ABYSSAL_GRANITE_BRICKS)
                .criterion(hasItem(ModBlocks.MOSSY_ABYSSAL_GRANITE_BRICKS), conditionsFromItem(ModBlocks.MOSSY_ABYSSAL_GRANITE_BRICKS));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_MOSSY_ABYSSAL_GRANITE_BRICK_WALL, 6)
                .pattern("AAA")
                .pattern("AAA")
                .input('A', ModBlocks.CRACKED_MOSSY_ABYSSAL_GRANITE_BRICKS)
                .criterion(hasItem(ModBlocks.CRACKED_MOSSY_ABYSSAL_GRANITE_BRICK_STAIRS), conditionsFromItem(ModBlocks.CRACKED_MOSSY_ABYSSAL_GRANITE_BRICKS));
        //----------------------------------------------------------------------------------------------------------------------------------------------------
        // Stone Cutting

        //----------------------------------------------------------------------------------------------------------------------------------------------------
        // Smelting
        offerSmelting(exporter, CRACKED_ABYSSAL_GRANITE_BRICKS_SMELTING, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_ABYSSAL_GRANITE_BRICKS,
                0.2f, 200, "cracked_bricks");
    }
}
