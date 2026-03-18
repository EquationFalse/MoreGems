package com.equation.moregems.item;

import com.equation.moregems.MoreGemsMod;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class MoreGemsItems {
    public static final Item RUBY = register("ruby", Item::new, new Item.Settings());

    //Item注册器
    public static Item register(String id, Function<Item.Settings, Item> factory, Item.Settings settings) {
        final RegistryKey<Item> registryKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MoreGemsMod.MOD_ID, id));
        return Items.register(registryKey, factory, settings);
    }

    //静态加载此类
    public static void initialize(){
        //打印日志
        MoreGemsMod.LOGGER.info("Registering Items");
    }
}
