package net.leventeand1.modtest.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.leventeand1.modtest.ModTest;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModItems {

    public static final Item ORICHALCUM_INGOT = registerItem("orichalcum_ingot", new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(ModTest.MOD_ID, name), item);
    }
    public static void registerModItems() {
        System.out.println("Registering Mod Items for " + ModTest.MOD_ID);
    }

    private static class ITEM {
    }
}
