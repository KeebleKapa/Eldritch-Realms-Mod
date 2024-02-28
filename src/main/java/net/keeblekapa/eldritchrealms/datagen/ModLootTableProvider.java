package net.keeblekapa.eldritchrealms.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLootTableProvider;
import net.keeblekapa.eldritchrealms.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        // Abyssal Granite
        addDrop(ModBlocks.ABYSSAL_GRANITE);
        addDrop(ModBlocks.ABYSSAL_GRANITE_STAIRS);
        addDrop(ModBlocks.ABYSSAL_GRANITE_SLAB);
        addDrop(ModBlocks.ABYSSAL_GRANITE_WALL);
        addDrop(ModBlocks.POLISHED_ABYSSAL_GRANITE);
        addDrop(ModBlocks.POLISHED_ABYSSAL_GRANITE_STAIRS);
        addDrop(ModBlocks.POLISHED_ABYSSAL_GRANITE_SLAB);
        addDrop(ModBlocks.POLISHED_ABYSSAL_GRANITE_WALL);
        addDrop(ModBlocks.ABYSSAL_GRANITE_BRICKS);
        addDrop(ModBlocks.ABYSSAL_GRANITE_BRICK_STAIRS);
        addDrop(ModBlocks.ABYSSAL_GRANITE_BRICK_SLAB);
        addDrop(ModBlocks.ABYSSAL_GRANITE_BRICK_WALL);
        addDrop(ModBlocks.CRACKED_ABYSSAL_GRANITE_BRICKS);
        addDrop(ModBlocks.CRACKED_ABYSSAL_GRANITE_BRICK_STAIRS);
        addDrop(ModBlocks.CRACKED_ABYSSAL_GRANITE_BRICK_SLAB);
        addDrop(ModBlocks.CRACKED_ABYSSAL_GRANITE_BRICK_WALL);
        addDrop(ModBlocks.MOSSY_ABYSSAL_GRANITE);
        addDrop(ModBlocks.MOSSY_ABYSSAL_GRANITE_STAIRS);
        addDrop(ModBlocks.MOSSY_ABYSSAL_GRANITE_SLAB);
        addDrop(ModBlocks.MOSSY_ABYSSAL_GRANITE_WALL);
        addDrop(ModBlocks.MOSSY_POLISHED_ABYSSAL_GRANITE);
        addDrop(ModBlocks.MOSSY_POLISHED_ABYSSAL_GRANITE_STAIRS);
        addDrop(ModBlocks.MOSSY_POLISHED_ABYSSAL_GRANITE_SLAB);
        addDrop(ModBlocks.MOSSY_POLISHED_ABYSSAL_GRANITE_WALL);
        addDrop(ModBlocks.MOSSY_ABYSSAL_GRANITE_BRICKS);
        addDrop(ModBlocks.MOSSY_ABYSSAL_GRANITE_BRICK_STAIRS);
        addDrop(ModBlocks.MOSSY_ABYSSAL_GRANITE_BRICK_SLAB);
        addDrop(ModBlocks.MOSSY_ABYSSAL_GRANITE_BRICK_WALL);
        addDrop(ModBlocks.CRACKED_MOSSY_ABYSSAL_GRANITE_BRICKS);
        addDrop(ModBlocks.CRACKED_MOSSY_ABYSSAL_GRANITE_BRICK_STAIRS);
        addDrop(ModBlocks.CRACKED_MOSSY_ABYSSAL_GRANITE_BRICK_SLAB);
        addDrop(ModBlocks.CRACKED_MOSSY_ABYSSAL_GRANITE_BRICK_WALL);
    }

    public LootTable.Builder multiItemOreDrops(Block drop, Item item) {
        return dropsWithSilkTouch(drop, (LootPoolEntry.Builder)this
                .applyExplosionDecay(drop, ItemEntry.builder(item)
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0F, 4.0F)))
                        .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))));
    }
}
