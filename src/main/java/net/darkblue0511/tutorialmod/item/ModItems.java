package net.darkblue0511.tutorialmod.item;

import net.darkblue0511.tutorialmod.TutorialMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item TRYNDAMERE_ICON = registerItem("tryndamere_icon", new Item(new Item.Settings().
            registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TutorialMod.MOD_ID, "tryndamere_icon")))));
    public static final Item TRYNDAMERE_P = registerItem("tryndamere_p", new Item(new Item.Settings().
            registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TutorialMod.MOD_ID, "tryndamere_p")))));
    public static final Item TRYNDAMERE_Q = registerItem("tryndamere_q", new Item(new Item.Settings().
            registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TutorialMod.MOD_ID, "tryndamere_q")))));
    public static final Item TRYNDAMERE_W = registerItem("tryndamere_w", new Item(new Item.Settings().
            registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TutorialMod.MOD_ID, "tryndamere_w")))));
    public static final Item TRYNDAMERE_E = registerItem("tryndamere_e", new Item(new Item.Settings().
            registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TutorialMod.MOD_ID, "tryndamere_e")))));
    public static final Item TRYNDAMERE_R = registerItem("tryndamere_r", new Item(new Item.Settings().
            registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TutorialMod.MOD_ID, "tryndamere_r")))));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(TutorialMod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        TutorialMod.LOGGER.info("Registering Mod Items for" + TutorialMod.MOD_ID);
        /*ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
            entries.add(TRYNDAMERE_ICON);
            entries.add(TRYNDAMERE_P);
            entries.add(TRYNDAMERE_Q);
            entries.add(TRYNDAMERE_W);
            entries.add(TRYNDAMERE_E);
            entries.add(TRYNDAMERE_R);
        });*/
    }

}
