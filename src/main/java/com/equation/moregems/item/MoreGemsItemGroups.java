package com.equation.moregems.item;

import com.equation.moregems.MoreGemsMod;
import com.equation.moregems.block.MoreGemsBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class MoreGemsItemGroups {

    public static final ItemGroup TEST_GROUP = Registry.register(Registries.ITEM_GROUP, Identifier.of(MoreGemsMod.MOD_ID, "example_group"), FabricItemGroup.builder()
            .icon(() -> new ItemStack(MoreGemsItems.RUBY))
            .displayName(Text.translatable("itemGroup.moregems.example_group"))
            .entries((context, entries) -> {
                entries.add(MoreGemsItems.RUBY);
                entries.add(MoreGemsBlocks.RUBY_BLOCK);
                entries.add(MoreGemsBlocks.RUBY_ORE);
                entries.add(MoreGemsBlocks.DEEPSLATE_RUBY_ORE);
            })
            .build());

    //静态加载此类
    public static void initialize(){
        //打印日志，可有可无
        MoreGemsMod.LOGGER.info("Registering Item Groups");
    }
}
