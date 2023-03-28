package net.mqc.minecraftmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.mqc.minecraftmod.CustomBlocks;

public class ModItemGroup {

    // This creates the item group
    public static ItemGroup CITRINE;


    // This registers each group created
    public static void registerItemGroups(){
        CITRINE = FabricItemGroup.builder(new Identifier(CustomBlocks.MOD_ID, "citrine"))
                .displayName(Text.literal("Citrine Item Group"))
                .icon(() -> new ItemStack(ModItems.CITRINE)).build();
    }
}
