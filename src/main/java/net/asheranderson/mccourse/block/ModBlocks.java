package net.asheranderson.mccourse.block;

import net.asheranderson.mccourse.MCCourseMod;
import net.asheranderson.mccourse.block.custom.Aetherlamp;
import net.asheranderson.mccourse.block.custom.FlamerootCropBlock;
import net.asheranderson.mccourse.block.custom.Sculkifier;
import net.asheranderson.mccourse.block.custom.SoulStabilizer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block BRIMSTONE = registerBlock("brimstone",
            new Block(AbstractBlock.Settings.create().hardness(93)
                    .strength(10f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)
                    .mapColor(MapColor.YELLOW)
                    .instrument(NoteBlockInstrument.PLING)));
    public static final Block FIRE_OPAL_BLOCK = registerBlock("fire_opal_block",
            new Block(AbstractBlock.Settings.create().hardness(150)
                    .strength(10f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                    .mapColor(MapColor.ORANGE)
                    .instrument(NoteBlockInstrument.GUITAR)));
    public static final Block VOIDITE_BLOCK = registerBlock("voidite_block",
            new Block(AbstractBlock.Settings.create()
                    .hardness(450)
                    .strength(10f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                    .mapColor(MapColor.BLACK)
                    .instrument(NoteBlockInstrument.BIT)));
    public static final Block AETHERITE_BLOCK = registerBlock("aetherite_block",
            new Block(AbstractBlock.Settings.create().hardness(1350)
                    .strength(10f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                    .mapColor(MapColor.GOLD)
                    .instrument(NoteBlockInstrument.CHIME)));
    public static final Block AQUAMARINE_BLOCK = registerBlock("aquamarine_block",
            new Block(AbstractBlock.Settings.create().hardness(4050)
                    .strength(10f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                    .mapColor(MapColor.BRIGHT_TEAL)
                    .instrument(NoteBlockInstrument.FLUTE)));
    public static final Block FROSTINE_BLOCK = registerBlock("frostine_block",
            new Block(AbstractBlock.Settings.create().hardness(12150)
                    .strength(10f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.GLASS)
                    .mapColor(MapColor.LIGHT_BLUE)
                    .instrument(NoteBlockInstrument.CHIME)));
    public static final Block AUTUNITE_BLOCK = registerBlock("autunite_block",
            new Block(AbstractBlock.Settings.create().hardness(36450)
                    .strength(10f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                    .mapColor(MapColor.EMERALD_GREEN)
                    .instrument(NoteBlockInstrument.BASEDRUM)));
    public static final Block SOUL_GEM_BLOCK = registerBlock("soul_gem_block",
            new Block(AbstractBlock.Settings.create().hardness(8857350)
                    .strength(10f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.SCULK_CATALYST)
                    .mapColor(MapColor.BLACK)
                    .instrument(NoteBlockInstrument.BASS)
                    .luminance(state -> 7)));
    public static final Block UNSTABLE_SOUL_GEM_BLOCK = registerBlock("unstable_soul_gem_block",
            new Block(AbstractBlock.Settings.create().hardness(8857350)
                    .strength(10f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.SCULK_CATALYST)
                    .mapColor(MapColor.BLACK)
                    .instrument(NoteBlockInstrument.BASS)
                    .luminance(state -> 7)));
    public static final Block NETHERITE_ORE = registerBlock("netherite_ore",
            new Block(AbstractBlock.Settings.create().hardness(127)
                    .strength(10f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)
                    .mapColor(MapColor.YELLOW)
                    .instrument(NoteBlockInstrument.GUITAR)));
    public static final Block NULLSTEEL_ORE = registerBlock("nullsteel_ore",
            new Block(AbstractBlock.Settings.create().hardness(350)
                    .strength(10f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)
                    .mapColor(MapColor.WHITE)
                    .instrument(NoteBlockInstrument.GUITAR)));
    public static final Block NETHERITE_BLOCK = registerBlock("netherite_block",
            new Block(AbstractBlock.Settings.create().hardness(127)
                    .strength(10f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)
                    .mapColor(MapColor.GRAY)
                    .instrument(NoteBlockInstrument.GUITAR)));
    public static final Block NULLSTEEL_BLOCK = registerBlock("nullsteel_block",
            new Block(AbstractBlock.Settings.create().hardness(350)
                    .strength(10f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)
                    .mapColor(MapColor.PURPLE)
                    .instrument(NoteBlockInstrument.GUITAR)));
    public static final Block FIRE_OPAL_ORE = registerBlock("fire_opal_ore",
            new Block(AbstractBlock.Settings.create().hardness(150)
                    .strength(10f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)
                    .mapColor(MapColor.YELLOW)
                    .instrument(NoteBlockInstrument.BIT)));
    public static final Block VOIDITE_ORE = registerBlock("voidite_ore",
            new Block(AbstractBlock.Settings.create().hardness(450)
                    .strength(10f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)
                    .mapColor(MapColor.GRAY)
                    .instrument(NoteBlockInstrument.BIT)));
    public static final Block NIHILITY_STONE = registerBlock("nihility_stone",
            new Block(AbstractBlock.Settings.create().hardness(250)
                    .strength(10f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)
                    .mapColor(MapColor.WHITE)
                    .instrument(NoteBlockInstrument.BIT)));
    public static final Block AMBER = registerBlock("amber",
            new Block(AbstractBlock.Settings.create().hardness(675)
                    .strength(10f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)
                    .mapColor(MapColor.ORANGE)
                    .instrument(NoteBlockInstrument.CHIME)));
    public static final Block ADAMANT_ORE = registerBlock("adamant_ore",
            new Block(AbstractBlock.Settings.create().hardness(1125)
                    .strength(10f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.COPPER)
                    .mapColor(MapColor.ORANGE)
                    .instrument(NoteBlockInstrument.CHIME)));
    public static final Block ADAMANT_BLOCK = registerBlock("adamant_block",
            new Block(AbstractBlock.Settings.create().hardness(1125)
                    .strength(10f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)
                    .mapColor(MapColor.LIGHT_GRAY)
                    .instrument(NoteBlockInstrument.CHIME)));
    public static final Block AETHERITE_ORE = registerBlock("aetherite_ore",
            new Block(AbstractBlock.Settings.create().hardness(1350)
                    .strength(10f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)
                    .mapColor(MapColor.ORANGE)
                    .instrument(NoteBlockInstrument.CHIME)));
    public static final Block SHALE = registerBlock("shale",
            new Block(AbstractBlock.Settings.create().hardness(2025)
                    .strength(10f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)
                    .mapColor(MapColor.GRAY)
                    .instrument(NoteBlockInstrument.FLUTE)));
    public static final Block FLOODSTEEL_ORE = registerBlock("floodsteel_ore",
            new Block(AbstractBlock.Settings.create().hardness(3375)
                    .strength(10f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)
                    .mapColor(MapColor.GRAY)
                    .instrument(NoteBlockInstrument.FLUTE)));
    public static final Block FLOODSTEEL_BLOCK = registerBlock("floodsteel_block",
            new Block(AbstractBlock.Settings.create().hardness(3375)
                    .strength(10f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)
                    .mapColor(MapColor.BLUE)
                    .instrument(NoteBlockInstrument.FLUTE)));
    public static final Block AQUAMARINE_ORE = registerBlock("aquamarine_ore",
            new Block(AbstractBlock.Settings.create().hardness(4050)
                    .strength(10f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)
                    .mapColor(MapColor.GRAY)
                    .instrument(NoteBlockInstrument.FLUTE)));
    public static final Block ANGELITE = registerBlock("angelite",
            new Block(AbstractBlock.Settings.create().hardness(6075)
                    .strength(10f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.GLASS)
                    .mapColor(MapColor.LIGHT_BLUE_GRAY)
                    .instrument(NoteBlockInstrument.BIT)));
    public static final Block FROSTSTEEL_ORE = registerBlock("froststeel_ore",
            new Block(AbstractBlock.Settings.create().hardness(10125)
                    .strength(10f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.GLASS)
                    .mapColor(MapColor.LIGHT_BLUE_GRAY)
                    .instrument(NoteBlockInstrument.BIT)));
    public static final Block FROSTSTEEL_BLOCK = registerBlock("froststeel_block",
            new Block(AbstractBlock.Settings.create().hardness(10125)
                    .strength(10f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.GLASS)
                    .mapColor(MapColor.LIGHT_BLUE)
                    .instrument(NoteBlockInstrument.BIT)));
    public static final Block FROSTINE_ORE = registerBlock("frostine_ore",
            new Block(AbstractBlock.Settings.create().hardness(12150)
                    .strength(10f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.GLASS)
                    .mapColor(MapColor.LIGHT_BLUE_GRAY)
                    .instrument(NoteBlockInstrument.BIT)));
    public static final Block CINNABAR = registerBlock("cinnabar",
            new Block(AbstractBlock.Settings.create().hardness(18225)
                    .strength(10f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)
                    .mapColor(MapColor.RED)
                    .instrument(NoteBlockInstrument.SNARE)));
    public static final Block BERYLLIUM_ORE = registerBlock("beryllium_ore",
            new Block(AbstractBlock.Settings.create().hardness(30375)
                    .strength(10f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)
                    .mapColor(MapColor.RED)
                    .instrument(NoteBlockInstrument.SNARE)));
    public static final Block BERYLLIUM_BLOCK = registerBlock("beryllium_block",
            new Block(AbstractBlock.Settings.create().hardness(30375)
                    .strength(10f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)
                    .mapColor(MapColor.PALE_GREEN)
                    .instrument(NoteBlockInstrument.SNARE)));
    public static final Block AUTUNITE_ORE = registerBlock("autunite_ore",
            new Block(AbstractBlock.Settings.create().hardness(36450)
                    .strength(10f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)
                    .mapColor(MapColor.RED)
                    .instrument(NoteBlockInstrument.SNARE)));
    public static final Block UNSTABLE_SOUL_STONE = registerBlock("unstable_soul_stone",
            new Block(AbstractBlock.Settings.create().hardness(4428675)
                    .strength(10f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.SCULK_CATALYST)
                    .mapColor(MapColor.BLACK)
                    .instrument(NoteBlockInstrument.BASS)
                    .luminance(state -> 6)));
    public static final Block SOULSTEEL_ORE = registerBlock("soulsteel_ore",
            new Block(AbstractBlock.Settings.create().hardness(7381125)
                    .strength(10f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.SCULK_CATALYST)
                    .mapColor(MapColor.BLACK)
                    .instrument(NoteBlockInstrument.BASS)
                    .luminance(state -> 6)));
    public static final Block SOULITE_ORE = registerBlock("soulite_ore",
            new Block(AbstractBlock.Settings.create().hardness(8857350)
                    .strength(10f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.SCULK_CATALYST)
                    .mapColor(MapColor.BLACK)
                    .instrument(NoteBlockInstrument.BASS)
                    .luminance(state -> 6)));
    public static final Block SOUL_STONE = registerBlock("soul_stone",
            new Block(AbstractBlock.Settings.create().hardness(4428675)
                    .strength(10f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.SCULK_CATALYST)
                    .mapColor(MapColor.BLACK)
                    .instrument(NoteBlockInstrument.BASS)
                    .luminance(state -> 6)));
    public static final Block SOULSTEEL_BLOCK = registerBlock("soulsteel_block",
            new Block(AbstractBlock.Settings.create().hardness(7381125)
                    .strength(10f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.SCULK_CATALYST)
                    .mapColor(MapColor.BLACK)
                    .instrument(NoteBlockInstrument.BASS)
                    .luminance(state -> 6)));
    public static final Block UNSTABLE_SOULSTEEL_BLOCK = registerBlock("unstable_soulsteel_block",
            new Block(AbstractBlock.Settings.create().hardness(7381125)
                    .strength(10f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.SCULK_CATALYST)
                    .mapColor(MapColor.BLACK)
                    .instrument(NoteBlockInstrument.BASS)
                    .luminance(state -> 6)));
    public static final Block BISMUTH_BLOCK = registerBlock("bismuth_block",
            new Block(AbstractBlock.Settings.create().hardness(675)
                    .strength(10f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)
                    .mapColor(MapColor.GRAY)
                    .instrument(NoteBlockInstrument.CHIME)));
    public static final Block SOUL_STABILIZER = registerBlock("soul_stabilizer",
            new SoulStabilizer(AbstractBlock.Settings.create().hardness(4400000)
                    .strength(10f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                    .mapColor(MapColor.PALE_PURPLE)
                    .instrument(NoteBlockInstrument.CHIME)
                    .luminance(state -> 3)));
    public static final Block SCULKIFIER = registerBlock("sculkifier",
            new Sculkifier(AbstractBlock.Settings.create().hardness(8857350)
                    .strength(10f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.SCULK_CATALYST)
                    .mapColor(MapColor.BLACK)
                    .instrument(NoteBlockInstrument.BASS)
                    .luminance(state -> 10)));
    public static final Block SOULITE_STAIRS = registerBlock("soulite_stairs",
            new StairsBlock(ModBlocks.SOUL_GEM_BLOCK.getDefaultState(),
                    AbstractBlock.Settings.create().hardness(8857350)
                    .strength(10f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.SCULK_CATALYST)
                    .mapColor(MapColor.BLACK)
                    .instrument(NoteBlockInstrument.BASS)
                            .luminance(state -> 6)));
    public static final Block UNSTABLE_SOULITE_STAIRS = registerBlock("unstable_soulite_stairs",
            new StairsBlock(ModBlocks.UNSTABLE_SOUL_GEM_BLOCK.getDefaultState(),
                    AbstractBlock.Settings.create().hardness(8857350)
                    .strength(10f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.SCULK_CATALYST)
                    .mapColor(MapColor.BLACK)
                    .instrument(NoteBlockInstrument.BASS)
                            .luminance(state -> 6)));
    public static final Block SOULITE_SLAB = registerBlock("soulite_slab",
            new SlabBlock(AbstractBlock.Settings.create().hardness(8857350)
                            .strength(10f)
                            .requiresTool()
                            .sounds(BlockSoundGroup.SCULK_CATALYST)
                            .mapColor(MapColor.BLACK)
                            .instrument(NoteBlockInstrument.BASS)
                    .luminance(state -> 6)));
    public static final Block UNSTABLE_SOULITE_SLAB = registerBlock("unstable_soulite_slab",
            new SlabBlock(AbstractBlock.Settings.create().hardness(8857350)
                            .strength(10f)
                            .requiresTool()
                            .sounds(BlockSoundGroup.SCULK_CATALYST)
                            .mapColor(MapColor.BLACK)
                            .instrument(NoteBlockInstrument.BASS)
                    .luminance(state -> 6)));
    public static final Block SOULITE_BUTTON = registerBlock("soulite_button",
            new ButtonBlock(BlockSetType.IRON, 1, AbstractBlock.Settings.create().hardness(8857350)
                            .strength(10f)
                            .requiresTool()
                            .sounds(BlockSoundGroup.SCULK_CATALYST)
                            .mapColor(MapColor.BLACK)
                            .instrument(NoteBlockInstrument.BASS)
                            .noCollision()
                    .luminance(state -> 6)));
    public static final Block UNSTABLE_SOULITE_BUTTON = registerBlock("unstable_soulite_button",
            new ButtonBlock(BlockSetType.IRON, 1, AbstractBlock.Settings.create().hardness(8857350)
                            .strength(10f)
                            .requiresTool()
                            .sounds(BlockSoundGroup.SCULK_CATALYST)
                            .mapColor(MapColor.BLACK)
                            .instrument(NoteBlockInstrument.BASS)
                            .noCollision()
                    .luminance(state -> 6)));
    public static final Block SOULITE_PRESSURE_PLATE = registerBlock("soulite_pressure_plate",
            new PressurePlateBlock(BlockSetType.IRON, AbstractBlock.Settings.create().hardness(8857350)
                            .strength(10f)
                            .requiresTool()
                            .sounds(BlockSoundGroup.SCULK_CATALYST)
                            .mapColor(MapColor.BLACK)
                            .instrument(NoteBlockInstrument.BASS)
                    .luminance(state -> 6)));
    public static final Block UNSTABLE_SOULITE_PRESSURE_PLATE = registerBlock("unstable_soulite_pressure_plate",
            new PressurePlateBlock(BlockSetType.IRON, AbstractBlock.Settings.create().hardness(8857350)
                            .strength(10f)
                            .requiresTool()
                            .sounds(BlockSoundGroup.SCULK_CATALYST)
                            .mapColor(MapColor.BLACK)
                            .instrument(NoteBlockInstrument.BASS)
                    .luminance(state -> 6)));
    public static final Block SOULITE_FENCE = registerBlock("soulite_fence",
            new FenceBlock(AbstractBlock.Settings.create().hardness(8857350)
                    .strength(10f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.SCULK_CATALYST)
                    .mapColor(MapColor.BLACK)
                    .instrument(NoteBlockInstrument.BASS)
                    .luminance(state -> 6)));
    public static final Block UNSTABLE_SOULITE_FENCE = registerBlock("unstable_soulite_fence",
            new FenceBlock(AbstractBlock.Settings.create().hardness(8857350)
                    .strength(10f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.SCULK_CATALYST)
                    .mapColor(MapColor.BLACK)
                    .instrument(NoteBlockInstrument.BASS)
                    .luminance(state -> 6)));
    public static final Block SOULITE_FENCE_GATE = registerBlock("soulite_fence_gate",
            new FenceGateBlock(WoodType.CRIMSON, AbstractBlock.Settings.create().hardness(8857350)
                    .strength(10f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.SCULK_CATALYST)
                    .mapColor(MapColor.BLACK)
                    .instrument(NoteBlockInstrument.BASS)
                    .luminance(state -> 6)));
    public static final Block UNSTABLE_SOULITE_FENCE_GATE = registerBlock("unstable_soulite_fence_gate",
            new FenceGateBlock(WoodType.CRIMSON, AbstractBlock.Settings.create().hardness(8857350)
                    .strength(10f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.SCULK_CATALYST)
                    .mapColor(MapColor.BLACK)
                    .instrument(NoteBlockInstrument.BASS)
                    .luminance(state -> 6)));
    public static final Block SOULITE_WALL = registerBlock("soulite_wall",
            new WallBlock(AbstractBlock.Settings.create().hardness(8857350)
                    .strength(10f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.SCULK_CATALYST)
                    .mapColor(MapColor.BLACK)
                    .instrument(NoteBlockInstrument.BASS)
                    .luminance(state -> 6)));
    public static final Block UNSTABLE_SOULITE_WALL = registerBlock("unstable_soulite_wall",
            new WallBlock(AbstractBlock.Settings.create().hardness(8857350)
                    .strength(10f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.SCULK_CATALYST)
                    .mapColor(MapColor.BLACK)
                    .instrument(NoteBlockInstrument.BASS)
                    .luminance(state -> 6)));
    public static final Block SOULITE_DOOR = registerBlock("soulite_door",
            new DoorBlock(BlockSetType.IRON, AbstractBlock.Settings.create().hardness(8857350)
                    .strength(10f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.SCULK_CATALYST)
                    .mapColor(MapColor.BLACK)
                    .instrument(NoteBlockInstrument.BASS)
                    .nonOpaque()
                    .luminance(state -> 6)));
    public static final Block UNSTABLE_SOULITE_DOOR = registerBlock("unstable_soulite_door",
            new DoorBlock(BlockSetType.IRON, AbstractBlock.Settings.create().hardness(8857350)
                    .strength(10f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.SCULK_CATALYST)
                    .mapColor(MapColor.BLACK)
                    .instrument(NoteBlockInstrument.BASS)
                    .nonOpaque()
                    .luminance(state -> 6)));
    public static final Block SOULITE_TRAPDOOR = registerBlock("soulite_trapdoor",
            new TrapdoorBlock(BlockSetType.IRON, AbstractBlock.Settings.create().hardness(8857350)
                    .strength(10f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.SCULK_CATALYST)
                    .mapColor(MapColor.BLACK)
                    .instrument(NoteBlockInstrument.BASS)
                    .nonOpaque()
                    .luminance(state -> 6)));
    public static final Block UNSTABLE_SOULITE_TRAPDOOR = registerBlock("unstable_soulite_trapdoor",
            new TrapdoorBlock(BlockSetType.IRON, AbstractBlock.Settings.create().hardness(8857350)
                    .strength(10f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.SCULK_CATALYST)
                    .mapColor(MapColor.BLACK)
                    .instrument(NoteBlockInstrument.BASS)
                    .nonOpaque()
                    .luminance(state -> 6)));
    public static final Block AETHERLAMP = registerBlock("aetherlamp",
            new Aetherlamp(AbstractBlock.Settings.create().hardness(1350)
                    .strength(10f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                    .mapColor(MapColor.GOLD)
                    .instrument(NoteBlockInstrument.CHIME)
                    .luminance(state -> state.get(Aetherlamp.ON) ? 15:0 )));
    public static final Block FLAMEROOT_CROP = registerBlockWithoutBlockItem("flameroot_crop",
            new FlamerootCropBlock(AbstractBlock.Settings.create().hardness(75)
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .ticksRandomly()
                    .strength(3f)
                    .sounds(BlockSoundGroup.CROP)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(MCCourseMod.MOD_ID, name), block);
    }

    private static Block registerBlockWithoutBlockItem(String name, Block block){
        return Registry.register(Registries.BLOCK, Identifier.of(MCCourseMod.MOD_ID, name), block);
    }


    private static Item registerBlockItem(String name, Block block ){
        return Registry.register(Registries.ITEM, Identifier.of(MCCourseMod.MOD_ID, name),
            new BlockItem(block, new Item.Settings()));
    }
    public static void registerModBlocks(){
        MCCourseMod.LOGGER.info("Registering ModBlocks for " + MCCourseMod.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries ->{
            entries.add(ModBlocks.NETHERITE_BLOCK);
            entries.add(ModBlocks.FIRE_OPAL_BLOCK);
            entries.add(ModBlocks.NULLSTEEL_BLOCK);
            entries.add(ModBlocks.VOIDITE_BLOCK);
            entries.add(ModBlocks.BISMUTH_BLOCK);
            entries.add(ModBlocks.ADAMANT_BLOCK);
            entries.add(ModBlocks.AETHERITE_BLOCK);
            entries.add(ModBlocks.FLOODSTEEL_BLOCK);
            entries.add(ModBlocks.AQUAMARINE_BLOCK);
            entries.add(ModBlocks.BERYLLIUM_BLOCK);
            entries.add(ModBlocks.AUTUNITE_BLOCK);
            entries.add(ModBlocks.FROSTSTEEL_BLOCK);
            entries.add(ModBlocks.FROSTINE_BLOCK);
            entries.add(ModBlocks.UNSTABLE_SOULSTEEL_BLOCK);
            entries.add(ModBlocks.SOULSTEEL_BLOCK);
            entries.add(ModBlocks.UNSTABLE_SOUL_GEM_BLOCK);
            entries.add(ModBlocks.SOUL_GEM_BLOCK);
            entries.add(ModBlocks.UNSTABLE_SOULITE_STAIRS);
            entries.add(ModBlocks.SOULITE_STAIRS);
            entries.add(ModBlocks.UNSTABLE_SOULITE_SLAB);
            entries.add(ModBlocks.SOULITE_SLAB);
            entries.add(ModBlocks.UNSTABLE_SOULITE_BUTTON);
            entries.add(ModBlocks.SOULITE_BUTTON);
            entries.add(ModBlocks.UNSTABLE_SOULITE_PRESSURE_PLATE);
            entries.add(ModBlocks.SOULITE_PRESSURE_PLATE);
            entries.add(ModBlocks.UNSTABLE_SOULITE_FENCE);
            entries.add(ModBlocks.SOULITE_FENCE);
            entries.add(ModBlocks.UNSTABLE_SOULITE_FENCE_GATE);
            entries.add(ModBlocks.SOULITE_FENCE_GATE);
            entries.add(ModBlocks.UNSTABLE_SOULITE_WALL);
            entries.add(ModBlocks.SOULITE_WALL);
            entries.add(ModBlocks.UNSTABLE_SOULITE_DOOR);
            entries.add(ModBlocks.SOULITE_DOOR);
            entries.add(ModBlocks.UNSTABLE_SOULITE_TRAPDOOR);
            entries.add(ModBlocks.SOULITE_TRAPDOOR);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries ->{
            entries.add(ModBlocks.BRIMSTONE);
            entries.add(ModBlocks.NIHILITY_STONE);
            entries.add(ModBlocks.AMBER);
            entries.add(ModBlocks.SHALE);
            entries.add(ModBlocks.ANGELITE);
            entries.add(ModBlocks.UNSTABLE_SOUL_STONE);
            entries.add(ModBlocks.SOUL_STONE);
            entries.add(ModBlocks.NETHERITE_ORE);
            entries.add(ModBlocks.FIRE_OPAL_ORE);
            entries.add(ModBlocks.NULLSTEEL_ORE);
            entries.add(ModBlocks.VOIDITE_ORE);
            entries.add(ModBlocks.ADAMANT_ORE);
            entries.add(ModBlocks.AETHERITE_ORE);
            entries.add(ModBlocks.FLOODSTEEL_ORE);
            entries.add(ModBlocks.AQUAMARINE_ORE);
            entries.add(ModBlocks.FROSTSTEEL_ORE);
            entries.add(ModBlocks.FROSTINE_ORE);
            entries.add(ModBlocks.BERYLLIUM_ORE);
            entries.add(ModBlocks.AUTUNITE_ORE);
            entries.add(ModBlocks.SOULSTEEL_ORE);
            entries.add(ModBlocks.SOULITE_ORE);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(entries -> {
            entries.add(ModBlocks.SOUL_STABILIZER);
            entries.add(ModBlocks.SCULKIFIER);
            entries.add(ModBlocks.AETHERLAMP);
        });
    }
}
