package com.equation.moregems.datagen;

import com.equation.moregems.block.MoreGemsBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class MoreGemsBlockTagsProvider extends FabricTagProvider.BlockTagProvider {
    public MoreGemsBlockTagsProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        //添加到data\minecraft\tags\block\mineable\pickaxe.json
        valueLookupBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(MoreGemsBlocks.RUBY_BLOCK)
                .add(MoreGemsBlocks.RUBY_ORE)
                .add(MoreGemsBlocks.DEEPSLATE_RUBY_ORE)
                .setReplace(false);

        //添加到data\minecraft\tags\block\needs_iron_tool.json
        valueLookupBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(MoreGemsBlocks.RUBY_BLOCK)
                .add(MoreGemsBlocks.RUBY_ORE)
                .add(MoreGemsBlocks.DEEPSLATE_RUBY_ORE)
                .setReplace(false);
    }
}
