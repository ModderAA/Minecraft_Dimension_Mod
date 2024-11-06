package net.asheranderson.mccourse.util;

import net.asheranderson.mccourse.MCCourseMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks{
        public static final TagKey<Block> NEEDS_OBSIDIAN_TOOL = createTag("needs_obsidian_tool");
        public static final TagKey<Block> INCORRECT_FOR_OBSIDIAN_TOOL = createTag("incorrect_for_obsidian_tool");
        public static final TagKey<Block> NEEDS_NIHILITY_STONE_TOOL = createTag("needs_nihility_stone_tool");
        public static final TagKey<Block> INCORRECT_FOR_NIHILITY_STONE_TOOL = createTag("incorrect_for_nihility_stone_tool");
        public static final TagKey<Block> NEEDS_NULLSTEEL_TOOL = createTag("needs_nullsteel_tool");
        public static final TagKey<Block> INCORRECT_FOR_NULLSTEEL_TOOL = createTag("incorrect_for_nullsteel_tool");
        public static final TagKey<Block> NEEDS_VOIDITE_TOOL = createTag("needs_voidite_tool");
        public static final TagKey<Block> INCORRECT_FOR_VOIDITE_TOOL = createTag("incorrect_for_voidite_tool");
        public static final TagKey<Block> NEEDS_BRIMSTONE_TOOL = createTag("needs_brimstone_tool");
        public static final TagKey<Block> INCORRECT_FOR_BRIMSTONE_TOOL = createTag("incorrect_for_brimstone_tool");
        public static final TagKey<Block> NEEDS_NETHERITE_TOOL = createTag("needs_netherite_tool");
        public static final TagKey<Block> INCORRECT_FOR_NETHERITE_TOOL = createTag("incorrect_for_netherite_tool");
        public static final TagKey<Block> NEEDS_FIRE_OPAL_TOOL = createTag("needs_fire_opal_tool");
        public static final TagKey<Block> INCORRECT_FOR_FIRE_OPAL_TOOL = createTag("incorrect_for_fire_opal_tool");
        public static final TagKey<Block> NEEDS_AMBER_TOOL = createTag("needs_amber_tool");
        public static final TagKey<Block> INCORRECT_FOR_AMBER_TOOL = createTag("incorrect_for_amber_tool");
        public static final TagKey<Block> NEEDS_ADAMANT_TOOL = createTag("needs_adamant_tool");
        public static final TagKey<Block> INCORRECT_FOR_ADAMANT_TOOL = createTag("incorrect_for_adamant_tool");
        public static final TagKey<Block> NEEDS_AETHERITE_TOOL = createTag("needs_aetherite_tool");
        public static final TagKey<Block> INCORRECT_FOR_AETHERITE_TOOL = createTag("incorrect_for_aetherite_tool");
        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(MCCourseMod.MOD_ID, name));
        }
    }
    public static class Items{
        public static final TagKey<Item> SCULKIFIABLE_ITEMS = createTag("sculkifiable_items");
        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(MCCourseMod.MOD_ID, name));
        }
    }
}
