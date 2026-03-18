package com.equation.moregems.datagen;

import com.equation.moregems.block.MoreGemsBlocks;
import com.equation.moregems.item.MoreGemsItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class MoreGemsLootTabelProvider extends FabricBlockLootTableProvider {
    public MoreGemsLootTabelProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(MoreGemsBlocks.RUBY_BLOCK);
        addDrop(MoreGemsBlocks.RUBY_ORE, oreDrops(MoreGemsBlocks.RUBY_ORE, MoreGemsItems.RUBY));
        addDrop(MoreGemsBlocks.DEEPSLATE_RUBY_ORE, oreDrops(MoreGemsBlocks.DEEPSLATE_RUBY_ORE, MoreGemsItems.RUBY));
    }
}
