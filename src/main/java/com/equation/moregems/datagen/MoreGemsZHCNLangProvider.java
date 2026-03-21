package com.equation.moregems.datagen;

import com.equation.moregems.block.MoreGemsBlocks;
import com.equation.moregems.item.MoreGemsItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class MoreGemsZHCNLangProvider extends FabricLanguageProvider {
    public MoreGemsZHCNLangProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "zh_cn", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(MoreGemsItems.RUBY, "红宝石");
        translationBuilder.add(MoreGemsItems.RUBY_COOKIE, "红宝石曲奇");

        translationBuilder.add(MoreGemsBlocks.RUBY_BLOCK, "红宝石块");
        translationBuilder.add(MoreGemsBlocks.RUBY_ORE, "红宝石矿石");
        translationBuilder.add(MoreGemsBlocks.DEEPSLATE_RUBY_ORE, "深层红宝石矿石");

        translationBuilder.add("itemGroup.moregems.example_group", "更多宝石");
    }
}
