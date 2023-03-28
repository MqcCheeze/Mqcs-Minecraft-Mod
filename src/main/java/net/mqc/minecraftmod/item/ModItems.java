package net.mqc.minecraftmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.mqc.minecraftmod.CustomBlocks;
import net.minecraft.util.Identifier;

public class ModItems {

    // This creates the item
    public static final Item CITRINE = registerItem("citrine",
        new Item(new FabricItemSettings()));
    public static final Item RAW_CITRINE = registerItem("raw_citrine",
            new Item(new FabricItemSettings()));

    // This registers the items
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(CustomBlocks.MOD_ID, name), item);
    }

    // This adds the items to the group
    public static void addItemsToItemGroup(){
        addToItemGroup(ModItemGroup.CITRINE, CITRINE);
        addToItemGroup(ModItemGroup.CITRINE, RAW_CITRINE);
    }

    // This is the function that adds the item to the group
    private  static void addToItemGroup(ItemGroup group, Item item){
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void registerModItems(){
        CustomBlocks.LOGGER.info("Registering Mod Items for " + CustomBlocks.MOD_ID);
        addItemsToItemGroup();
    }
}
