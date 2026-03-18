package com.equation.moregems.datagen;

import com.equation.moregems.block.MoreGemsBlocks;
import com.equation.moregems.item.MoreGemsItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class MoreGemsRecipeProvider extends FabricRecipeProvider {
    private static final List<ItemConvertible> RUBY_ORES = List.of(MoreGemsBlocks.RUBY_ORE, MoreGemsBlocks.DEEPSLATE_RUBY_ORE);

    public MoreGemsRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup wrapperLookup, RecipeExporter recipeExporter) {
        return new RecipeGenerator(wrapperLookup, recipeExporter) {
            @Override
            public void generate() {
                //红宝石块的可逆合成
                offerReversibleCompactingRecipes(RecipeCategory.MISC, MoreGemsItems.RUBY, RecipeCategory.BUILDING_BLOCKS, MoreGemsBlocks.RUBY_BLOCK);

                //熔炉配方
                offerSmelting(RUBY_ORES, RecipeCategory.MISC, MoreGemsItems.RUBY,
                        1.0f, 200, "ruby");

                //高炉配方
                offerBlasting(RUBY_ORES, RecipeCategory.MISC, MoreGemsItems.RUBY,
                        1.0f, 100, "ruby");
            }
        };
    }

    @Override
    public String getName() {
        return "MoreGems";
    }
}
