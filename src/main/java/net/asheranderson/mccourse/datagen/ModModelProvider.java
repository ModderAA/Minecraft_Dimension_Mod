package net.asheranderson.mccourse.datagen;

import net.asheranderson.mccourse.block.ModBlocks;
import net.asheranderson.mccourse.block.custom.Aetherlamp;
import net.asheranderson.mccourse.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.*;
import net.minecraft.util.Identifier;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BRIMSTONE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHERITE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHERITE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.FIRE_OPAL_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.FIRE_OPAL_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NIHILITY_STONE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NULLSTEEL_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NULLSTEEL_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.VOIDITE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.VOIDITE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.AMBER);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BISMUTH_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ADAMANT_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ADAMANT_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.AETHERITE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.AETHERITE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SHALE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.FLOODSTEEL_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.FLOODSTEEL_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.AQUAMARINE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.AQUAMARINE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ANGELITE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.FROSTSTEEL_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.FROSTSTEEL_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.FROSTINE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.FROSTINE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CINNABAR);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BERYLLIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BERYLLIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.AUTUNITE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.AUTUNITE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.UNSTABLE_SOUL_STONE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SOUL_STONE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SOULSTEEL_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.UNSTABLE_SOULSTEEL_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SOULSTEEL_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SOULITE_ORE);
        BlockStateModelGenerator.BlockTexturePool unstableSoulitePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.UNSTABLE_SOUL_GEM_BLOCK);
        BlockStateModelGenerator.BlockTexturePool soulitePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SOUL_GEM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SOUL_STABILIZER);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SCULKIFIER);
        unstableSoulitePool.stairs(ModBlocks.UNSTABLE_SOULITE_STAIRS);
        soulitePool.stairs(ModBlocks.SOULITE_STAIRS);
        unstableSoulitePool.slab(ModBlocks.UNSTABLE_SOULITE_SLAB);
        soulitePool.slab(ModBlocks.SOULITE_SLAB);
        unstableSoulitePool.button(ModBlocks.UNSTABLE_SOULITE_BUTTON);
        soulitePool.button(ModBlocks.SOULITE_BUTTON);
        unstableSoulitePool.pressurePlate(ModBlocks.UNSTABLE_SOULITE_PRESSURE_PLATE);
        soulitePool.pressurePlate(ModBlocks.SOULITE_PRESSURE_PLATE);
        unstableSoulitePool.fence(ModBlocks.UNSTABLE_SOULITE_FENCE);
        soulitePool.fence(ModBlocks.SOULITE_FENCE);
        unstableSoulitePool.fenceGate(ModBlocks.UNSTABLE_SOULITE_FENCE_GATE);
        soulitePool.fenceGate(ModBlocks.SOULITE_FENCE_GATE);
        unstableSoulitePool.wall(ModBlocks.UNSTABLE_SOULITE_WALL);
        soulitePool.wall(ModBlocks.SOULITE_WALL);
        blockStateModelGenerator.registerDoor(ModBlocks.UNSTABLE_SOULITE_DOOR);
        blockStateModelGenerator.registerDoor(ModBlocks.SOULITE_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.UNSTABLE_SOULITE_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.SOULITE_TRAPDOOR);
        Identifier lampOffIdentifier = TexturedModel.CUBE_ALL.upload(ModBlocks.AETHERLAMP, blockStateModelGenerator.modelCollector);
        Identifier lampOnIdentifier = blockStateModelGenerator.createSubModel(ModBlocks.AETHERLAMP, "_on", Models.CUBE_ALL, TextureMap::all);
        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(ModBlocks.AETHERLAMP)
                .coordinate(BlockStateModelGenerator.createBooleanModelMap(Aetherlamp.ON, lampOnIdentifier, lampOffIdentifier)));
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.NETHERITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_NETHERITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.FIRE_OPAL, Models.GENERATED);
        itemModelGenerator.register(ModItems.NULLSTEEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_NULLSTEEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.VOIDITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.BISMUTH, Models.GENERATED);
        itemModelGenerator.register(ModItems.ADAMANT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_ADAMANT, Models.GENERATED);
        itemModelGenerator.register(ModItems.AETHERITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.FLOODSTEEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_FLOODSTEEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.AQUAMARINE, Models.GENERATED);
        itemModelGenerator.register(ModItems.FROSTSTEEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_FROSTSTEEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.FROSTINE, Models.GENERATED);
        itemModelGenerator.register(ModItems.BERYLLIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_BERYLLIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.AUTUNITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SOULSTEEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_SOULSTEEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.SOUL_GEM, Models.GENERATED);
        itemModelGenerator.register(ModItems.UNSTABLE_SOULSTEEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_UNSTABLE_SOULSTEEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.UNSTABLE_SOUL_GEM, Models.GENERATED);
        itemModelGenerator.register(ModItems.UNSTABLE_SOULROOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.SOULROOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.UNSTABLE_SOUL_BERRY, Models.GENERATED);
        itemModelGenerator.register(ModItems.SOUL_BERRY, Models.GENERATED);
        itemModelGenerator.register(ModItems.AMETHYST_SOUL_BERRY, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENCHANTED_AMETHYST_SOUL_BERRY, Models.GENERATED);
        itemModelGenerator.register(ModItems.SOULFIRE_CORE, Models.GENERATED);
        itemModelGenerator.register(ModItems.AMBER_WARHAMMER, Models.HANDHELD_MACE);
        itemModelGenerator.register(ModItems.OBSIDIAN_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.OBSIDIAN_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.OBSIDIAN_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.OBSIDIAN_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.OBSIDIAN_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NIHILITY_STONE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NIHILITY_STONE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NIHILITY_STONE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NIHILITY_STONE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NIHILITY_STONE_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NULLSTEEL_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NULLSTEEL_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NULLSTEEL_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NULLSTEEL_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NULLSTEEL_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.VOIDITE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.VOIDITE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.VOIDITE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.VOIDITE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.VOIDITE_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BRIMSTONE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BRIMSTONE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BRIMSTONE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BRIMSTONE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BRIMSTONE_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHERITE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHERITE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHERITE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHERITE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHERITE_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.FIRE_OPAL_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.FIRE_OPAL_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.FIRE_OPAL_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.FIRE_OPAL_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.FIRE_OPAL_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AMBER_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AMBER_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AMBER_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AMBER_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AMBER_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ADAMANT_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ADAMANT_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ADAMANT_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ADAMANT_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ADAMANT_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AETHERITE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AETHERITE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AETHERITE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AETHERITE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AETHERITE_HOE, Models.HANDHELD);
    }
}