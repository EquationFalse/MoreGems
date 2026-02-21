package com.equation.moregems.block;

import com.equation.moregems.MoreGemsMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class MoreGemsBlocks {
    public static final Block RUBY_BLOCK = register("ruby_block", Block::new, Block.Settings.create().mapColor(MapColor.BRIGHT_RED).requiresTool().strength(5.0f, 5.0f).sounds(BlockSoundGroup.METAL));
    public static final Block RUBY_ORE = register("ruby_ore", Block::new, Block.Settings.create().mapColor(MapColor.STONE_GRAY).requiresTool().strength(3.0f, 3.0f).sounds(BlockSoundGroup.STONE));
    public static final Block DEEPSLATE_RUBY_ORE = register("deepslate_ruby_ore", Block::new, Block.Settings.create().mapColor(MapColor.DEEPSLATE_GRAY).requiresTool().strength(4.5f, 3.0f).sounds(BlockSoundGroup.DEEPSLATE));

    private static Block register(String id, Function<AbstractBlock.Settings, Block> factory, AbstractBlock.Settings settings) {
        final Identifier identifier = Identifier.of(MoreGemsMod.MOD_ID, id);
        final RegistryKey<Block> registryKey = RegistryKey.of(RegistryKeys.BLOCK, identifier);

        final Block block = Blocks.register(registryKey, factory, settings);
        Items.register(block);
        return block;
    }

    public static void initialize() {
        MoreGemsMod.LOGGER.info("Registering Blocks");
    }
}
