package net.asheranderson.mccourse.datagen;

import net.asheranderson.mccourse.block.ModBlocks;
import net.asheranderson.mccourse.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {

    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
                addDrop(ModBlocks.NETHERITE_BLOCK);
                addDrop(ModBlocks.FIRE_OPAL_BLOCK);
                addDrop(ModBlocks.NULLSTEEL_BLOCK);
                addDrop(ModBlocks.VOIDITE_BLOCK);
                addDrop(ModBlocks.BISMUTH_BLOCK);
                addDrop(ModBlocks.ADAMANT_BLOCK);
                addDrop(ModBlocks.AETHERITE_BLOCK);
                addDrop(ModBlocks.AETHERLAMP);
                addDrop(ModBlocks.FLOODSTEEL_BLOCK);
                addDrop(ModBlocks.AQUAMARINE_BLOCK);
                addDrop(ModBlocks.BERYLLIUM_BLOCK);
                addDrop(ModBlocks.AUTUNITE_BLOCK);
                addDrop(ModBlocks.FROSTSTEEL_BLOCK);
                addDrop(ModBlocks.FROSTINE_BLOCK);
                addDrop(ModBlocks.UNSTABLE_SOULSTEEL_BLOCK);
                addDrop(ModBlocks.SOULSTEEL_BLOCK);
                addDrop(ModBlocks.UNSTABLE_SOUL_GEM_BLOCK);
                addDrop(ModBlocks.SOUL_GEM_BLOCK);
                addDrop(ModBlocks.BISMUTH_BLOCK);
                addDrop(ModBlocks.BRIMSTONE);
                addDrop(ModBlocks.NIHILITY_STONE);
                addDrop(ModBlocks.AMBER);
                addDrop(ModBlocks.SHALE);
                addDrop(ModBlocks.ANGELITE);
                addDrop(ModBlocks.UNSTABLE_SOUL_STONE);
                addDrop(ModBlocks.SOUL_STONE);
                addDrop(ModBlocks.NETHERITE_ORE, oreDrops(ModBlocks.NETHERITE_ORE, ModItems.RAW_NETHERITE));
                addDrop(ModBlocks.FIRE_OPAL_ORE, oreDrops(ModBlocks.FIRE_OPAL_ORE, ModItems.FIRE_OPAL));
                addDrop(ModBlocks.NULLSTEEL_ORE, oreDrops(ModBlocks.NULLSTEEL_ORE, ModItems.RAW_NULLSTEEL));
                addDrop(ModBlocks.VOIDITE_ORE, oreDrops(ModBlocks.VOIDITE_ORE, ModItems.VOIDITE));
                addDrop(ModBlocks.ADAMANT_ORE, oreDrops(ModBlocks.ADAMANT_ORE, ModItems.RAW_ADAMANT));
                addDrop(ModBlocks.AETHERITE_ORE, oreDrops(ModBlocks.AETHERITE_ORE, ModItems.AETHERITE));
                addDrop(ModBlocks.FLOODSTEEL_ORE, oreDrops(ModBlocks.FLOODSTEEL_ORE, ModItems.RAW_FLOODSTEEL));
                addDrop(ModBlocks.AQUAMARINE_ORE, oreDrops(ModBlocks.AQUAMARINE_ORE, ModItems.AQUAMARINE));
                addDrop(ModBlocks.FROSTSTEEL_ORE, oreDrops(ModBlocks.FROSTSTEEL_ORE, ModItems.RAW_FROSTSTEEL));
                addDrop(ModBlocks.FROSTINE_ORE, oreDrops(ModBlocks.FROSTINE_ORE, ModItems.FROSTINE));
                addDrop(ModBlocks.BERYLLIUM_ORE, oreDrops(ModBlocks.BERYLLIUM_ORE, ModItems.RAW_BERYLLIUM));
                addDrop(ModBlocks.AUTUNITE_ORE, oreDrops(ModBlocks.AUTUNITE_ORE, ModItems.AUTUNITE));
                addDrop(ModBlocks.SOULSTEEL_ORE, oreDrops(ModBlocks.SOULSTEEL_ORE, ModItems.RAW_UNSTABLE_SOULSTEEL));
                addDrop(ModBlocks.SOULITE_ORE, oreDrops(ModBlocks.SOULITE_ORE, ModItems.UNSTABLE_SOUL_GEM));
                addDrop(ModBlocks.SOUL_STABILIZER);
                addDrop(ModBlocks.SCULKIFIER);
                addDrop(ModBlocks.SOULITE_STAIRS);
                addDrop(ModBlocks.UNSTABLE_SOULITE_STAIRS);
                addDrop(ModBlocks.SOULITE_SLAB, slabDrops(ModBlocks.SOULITE_SLAB));
                addDrop(ModBlocks.UNSTABLE_SOULITE_SLAB, slabDrops(ModBlocks.UNSTABLE_SOULITE_SLAB));
                addDrop(ModBlocks.SOULITE_BUTTON);
                addDrop(ModBlocks.UNSTABLE_SOULITE_BUTTON);
                addDrop(ModBlocks.SOULITE_PRESSURE_PLATE);
                addDrop(ModBlocks.UNSTABLE_SOULITE_PRESSURE_PLATE);
                addDrop(ModBlocks.SOULITE_FENCE);
                addDrop(ModBlocks.UNSTABLE_SOULITE_FENCE);
                addDrop(ModBlocks.SOULITE_FENCE_GATE);
                addDrop(ModBlocks.UNSTABLE_SOULITE_FENCE_GATE);
                addDrop(ModBlocks.SOULITE_WALL);
                addDrop(ModBlocks.UNSTABLE_SOULITE_WALL);
                addDrop(ModBlocks.SOULITE_DOOR, doorDrops(ModBlocks.SOULITE_DOOR));
                addDrop(ModBlocks.UNSTABLE_SOULITE_DOOR, doorDrops(ModBlocks.UNSTABLE_SOULITE_DOOR));
                addDrop(ModBlocks.SOULITE_TRAPDOOR);
                addDrop(ModBlocks.UNSTABLE_SOULITE_TRAPDOOR);
    }
}
