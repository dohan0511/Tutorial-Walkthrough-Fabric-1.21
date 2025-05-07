package net.darkblue0511.pixelrift.block;

import net.darkblue0511.pixelrift.PixelRiftMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block ORNN_Q_PILLAR = registerBlock("ornn_q_pillar",
            AbstractBlock.Settings.create().strength(10f).requiresTool().sounds(BlockSoundGroup.ANCIENT_DEBRIS));

    private static Block registerBlock(String name, AbstractBlock.Settings blockSettings) {
        RegistryKey<Block> key = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(PixelRiftMod.MOD_ID, name));
        Block block = new Block(blockSettings.registryKey(key));
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(PixelRiftMod.MOD_ID, name), block);
    }
    private static void registerBlockItem(String name, Block block) {
        RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(PixelRiftMod.MOD_ID, name));
        Registry.register(Registries.ITEM, Identifier.of(PixelRiftMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings().registryKey(key)));
    }
    public static void registerModBlocks() {
        PixelRiftMod.LOGGER.info("Registering Mod Blocks for " + PixelRiftMod.MOD_ID);
        /*ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ORNN_Q_PILLAR);
        });*/
    }
}
