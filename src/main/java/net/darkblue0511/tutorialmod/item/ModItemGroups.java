package net.darkblue0511.tutorialmod.item;

import net.darkblue0511.tutorialmod.TutorialMod;
import net.darkblue0511.tutorialmod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup CHAMPION_SKILLS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID, "champion_skills"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.TRYNDAMERE_Q))
                    .displayName(Text.translatable("itemgroup.tutorialmod.champion_skills"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.TRYNDAMERE_P);
                        entries.add(ModItems.TRYNDAMERE_Q);
                        entries.add(ModItems.TRYNDAMERE_W);
                        entries.add(ModItems.TRYNDAMERE_E);
                        entries.add(ModItems.TRYNDAMERE_R);
                    })
                    .build());
    public static final ItemGroup CHAMPION_ICONS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID, "champion_icons"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.TRYNDAMERE_ICON))
                    .displayName(Text.translatable("itemgroup.tutorialmod.champion_icons"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.TRYNDAMERE_ICON);
                    })
                    .build());
    public static final ItemGroup RIFT_STRUCTURES_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID, "rift_structures"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.ORNN_Q_PILLAR))
                    .displayName(Text.translatable("itemgroup.tutorialmod.rift_structures"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.ORNN_Q_PILLAR);
                    })
                    .build());

    public static void registerItemGroups() {

        TutorialMod.LOGGER.info("Registering Item Groups for " + TutorialMod.MOD_ID);
    }
}
