package net.darkblue0511.pixelrift.item;

import net.darkblue0511.pixelrift.PixelRiftMod;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item STAT_ADAPTIVE_FORCE = registerItem("stat_adaptive_force", new Item.Settings());
    public static final Item TURRET_ICON = registerItem("turret_icon", new Item.Settings());
    public static final Item CHAMPION_ICON = registerItem("champion_icon", new Item.Settings());
    public static final Item GOLD_ICON = registerItem("gold_icon", new Item.Settings());
    public static final Item TRYNDAMERE_ICON = registerItem("tryndamere_icon", new Item.Settings());
    public static final Item TRYNDAMERE_P = registerItem("tryndamere_p", new Item.Settings());
    public static final Item TRYNDAMERE_Q = registerItem("tryndamere_q", new Item.Settings());
    public static final Item TRYNDAMERE_W = registerItem("tryndamere_w", new Item.Settings());
    public static final Item TRYNDAMERE_E = registerItem("tryndamere_e", new Item.Settings());
    public static final Item TRYNDAMERE_R = registerItem("tryndamere_r", new Item.Settings());
    public static final Item ITEM_CLOAK_OF_AGILITY = registerItem("item_cloak_of_agility", new Item.Settings());
    public static final Item ITEM_PICKAXE = registerItem("item_pickaxe", new Item.Settings());
    public static final Item ITEM_B_F_SWORD = registerItem("item_b_f_sword", new Item.Settings());
    public static final Item ITEM_SHARD_OF_INFINITY = registerItem("item_shard_of_infinity", new Item.Settings());
    public static final Item ITEM_INFINITY_EDGE = registerItem("item_infinity_edge", new Item.Settings());

    private static Item registerItem(String name, Item.Settings itemSettings) {
        RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(PixelRiftMod.MOD_ID, name));
        Item item = new Item(itemSettings.registryKey(key));
        return Registry.register(Registries.ITEM, Identifier.of(PixelRiftMod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        PixelRiftMod.LOGGER.info("Registering Mod Items for" + PixelRiftMod.MOD_ID);
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
