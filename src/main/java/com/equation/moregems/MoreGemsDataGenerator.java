package com.equation.moregems;

import com.equation.moregems.datagen.*;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class MoreGemsDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(MoreGemsENUSLangProvider::new);
		pack.addProvider(MoreGemsZHCNLangProvider::new);
		pack.addProvider(MoreGemsBlockTagsProvider::new);
		pack.addProvider(MoreGemsLootTabelProvider::new);
//		pack.addProvider(MoreGemsItemTagsProvider::new);
		pack.addProvider(MoreGemsRecipeProvider::new);
		pack.addProvider(MoreGemsModelsProvider::new);
	}
}
