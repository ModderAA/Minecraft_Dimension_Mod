package net.asheranderson.mccourse.datagen;

import net.asheranderson.mccourse.item.ModItems;
import net.asheranderson.mccourse.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ModTags.Items.SCULKIFIABLE_ITEMS)
                .add(ModItems.ADAMANT)
                .add(ModItems.BERYLLIUM)
                .add(ModItems.BISMUTH)
                .add(ModItems.FLOODSTEEL)
                .add(ModItems.FROSTSTEEL)
                .add(ModItems.NETHERITE)
                .add(ModItems.NULLSTEEL)
                .add(Items.IRON_INGOT)
                .add(Items.DIRT)
                .add(Items.STONE)
                .add(Items.OAK_WOOD)
                .add(Items.ACACIA_WOOD)
                .add(Items.BIRCH_WOOD)
                .add(Items.CHERRY_WOOD)
                .add(Items.DARK_OAK_WOOD)
                .add(Items.JUNGLE_WOOD)
                .add(Items.MANGROVE_WOOD)
                .add(Items.SPRUCE_WOOD);
        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.OBSIDIAN_SWORD)
                .add(ModItems.NIHILITY_STONE_SWORD)
                .add(ModItems.NULLSTEEL_SWORD)
                .add(ModItems.VOIDITE_SWORD)
                .add(ModItems.BRIMSTONE_SWORD)
                .add(ModItems.NETHERITE_SWORD)
                .add(ModItems.FIRE_OPAL_SWORD)
                .add(ModItems.AMBER_SWORD)
                .add(ModItems.ADAMANT_SWORD)
                .add(ModItems.AETHERITE_SWORD);
        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModItems.OBSIDIAN_AXE)
                .add(ModItems.NIHILITY_STONE_AXE)
                .add(ModItems.NULLSTEEL_AXE)
                .add(ModItems.VOIDITE_AXE)
                .add(ModItems.BRIMSTONE_AXE)
                .add(ModItems.NETHERITE_AXE)
                .add(ModItems.FIRE_OPAL_AXE)
                .add(ModItems.AMBER_AXE)
                .add(ModItems.ADAMANT_AXE)
                .add(ModItems.AETHERITE_AXE);
        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ModItems.OBSIDIAN_PICKAXE)
                .add(ModItems.NIHILITY_STONE_PICKAXE)
                .add(ModItems.NULLSTEEL_PICKAXE)
                .add(ModItems.VOIDITE_PICKAXE)
                .add(ModItems.BRIMSTONE_PICKAXE)
                .add(ModItems.NETHERITE_PICKAXE)
                .add(ModItems.FIRE_OPAL_PICKAXE)
                .add(ModItems.AMBER_PICKAXE)
                .add(ModItems.ADAMANT_PICKAXE)
                .add(ModItems.AETHERITE_PICKAXE);
        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ModItems.OBSIDIAN_HOE)
                .add(ModItems.NIHILITY_STONE_HOE)
                .add(ModItems.NULLSTEEL_HOE)
                .add(ModItems.VOIDITE_HOE)
                .add(ModItems.BRIMSTONE_HOE)
                .add(ModItems.NETHERITE_HOE)
                .add(ModItems.FIRE_OPAL_HOE)
                .add(ModItems.AMBER_HOE)
                .add(ModItems.ADAMANT_HOE)
                .add(ModItems.AETHERITE_HOE);
        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ModItems.OBSIDIAN_SHOVEL)
                .add(ModItems.NIHILITY_STONE_SHOVEL)
                .add(ModItems.NULLSTEEL_SHOVEL)
                .add(ModItems.VOIDITE_SHOVEL)
                .add(ModItems.BRIMSTONE_SHOVEL)
                .add(ModItems.NETHERITE_SHOVEL)
                .add(ModItems.FIRE_OPAL_SHOVEL)
                .add(ModItems.AMBER_SHOVEL)
                .add(ModItems.ADAMANT_SHOVEL)
                .add(ModItems.AETHERITE_SHOVEL);
    }
}
