package net.darkblue0511.pixelrift.item;

import net.darkblue0511.pixelrift.PixelRiftMod;
import net.darkblue0511.pixelrift.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup CHAMPION_SKILLS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(PixelRiftMod.MOD_ID, "champion_skills"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.STAT_ADAPTIVE_FORCE))
                    .displayName(Text.translatable("itemgroup.pixelrift.champion_skills"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.TRYNDAMERE_P);
                        entries.add(ModItems.TRYNDAMERE_Q);
                        entries.add(ModItems.TRYNDAMERE_W);
                        entries.add(ModItems.TRYNDAMERE_E);
                        entries.add(ModItems.TRYNDAMERE_R);
                    })
                    .build());
    public static final ItemGroup CHAMPION_ICONS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(PixelRiftMod.MOD_ID, "champion_icons"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.CHAMPION_ICON))
                    .displayName(Text.translatable("itemgroup.pixelrift.champion_icons"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.TRYNDAMERE_ICON);
                    })
                    .build());
    public static final ItemGroup SHOP_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(PixelRiftMod.MOD_ID, "shop_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.GOLD_ICON))
                    .displayName(Text.translatable("itemgroup.pixelrift.shop_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.ITEM_CLOAK_OF_AGILITY);
                        entries.add(ModItems.ITEM_PICKAXE);
                        entries.add(ModItems.ITEM_B_F_SWORD);
                        entries.add(ModItems.ITEM_SHARD_OF_INFINITY);
                        entries.add(ModItems.ITEM_INFINITY_EDGE);
                    })
                    .build());
    public static final ItemGroup RIFT_STRUCTURES_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(PixelRiftMod.MOD_ID, "rift_structures"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.TURRET_ICON))
                    .displayName(Text.translatable("itemgroup.pixelrift.rift_structures"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.ORNN_Q_PILLAR);
                    })
                    .build());

    public static void registerItemGroups() {

        PixelRiftMod.LOGGER.info("Registering Item Groups for " + PixelRiftMod.MOD_ID);
    }
}
