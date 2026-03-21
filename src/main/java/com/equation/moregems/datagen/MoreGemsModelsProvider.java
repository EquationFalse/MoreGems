package com.equation.moregems.datagen;

import com.equation.moregems.block.MoreGemsBlocks;
import com.equation.moregems.item.MoreGemsItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.Models;

public class MoreGemsModelsProvider extends FabricModelProvider {
    public MoreGemsModelsProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(MoreGemsBlocks.RUBY_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(MoreGemsBlocks.RUBY_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(MoreGemsBlocks.DEEPSLATE_RUBY_ORE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(MoreGemsItems.RUBY, Models.GENERATED);
        itemModelGenerator.register(MoreGemsItems.RUBY_COOKIE, Models.GENERATED);
    }
}
