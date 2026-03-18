package com.equation.moregems.datagen;

import com.equation.moregems.block.MoreGemsBlocks;
import com.equation.moregems.item.MoreGemsItemGroups;
import com.equation.moregems.item.MoreGemsItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class MoreGemsENUSLangProvider extends FabricLanguageProvider {
    public MoreGemsENUSLangProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "en_us", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(MoreGemsItems.RUBY, "Ruby");

        translationBuilder.add(MoreGemsBlocks.RUBY_BLOCK, "Ruby Block");
        translationBuilder.add(MoreGemsBlocks.RUBY_ORE, "Ruby Ore");
        translationBuilder.add(MoreGemsBlocks.DEEPSLATE_RUBY_ORE, "Deepslate Ruby Ore");

        translationBuilder.add("itemGroup.moregems.example_group", "More Gems");
    }
}
