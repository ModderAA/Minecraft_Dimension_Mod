package net.asheranderson.mccourse.datagen;

import net.asheranderson.mccourse.MCCourseMod;
import net.asheranderson.mccourse.block.ModBlocks;
import net.asheranderson.mccourse.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }
    @Override
    public void generate(RecipeExporter exporter) {
        List<ItemConvertible> SOULITE_SMELTABLES = List.of(ModBlocks.SOULITE_ORE);
        List<ItemConvertible> SOULSTEEL_SMELTABLES = List.of(ModItems.RAW_SOULSTEEL);
        List<ItemConvertible> UNSTABLE_SOULSTEEL_SMELTABLES = List.of(ModBlocks.SOULSTEEL_ORE, ModItems.RAW_UNSTABLE_SOULSTEEL);
        List<ItemConvertible> AUTUNITE_SMELTABLES = List.of(ModBlocks.AUTUNITE_ORE);
        List<ItemConvertible> BERYLLIUM_SMELTABLES = List.of(ModBlocks.BERYLLIUM_ORE, ModItems.RAW_BERYLLIUM);
        List<ItemConvertible> FROSTINE_SMELTABLES = List.of(ModBlocks.FROSTINE_ORE);
        List<ItemConvertible> FROSTSTEEL_SMELTABLES = List.of(ModBlocks.FROSTSTEEL_ORE, ModItems.RAW_FROSTSTEEL);
        List<ItemConvertible> AQUAMARINE_SMELTABLES = List.of(ModBlocks.AQUAMARINE_ORE);
        List<ItemConvertible> FLOODSTEEL_SMELTABLES = List.of(ModBlocks.FLOODSTEEL_ORE, ModItems.RAW_FLOODSTEEL);
        List<ItemConvertible> AETHERITE_SMELTABLES = List.of(ModBlocks.AETHERITE_ORE);
        List<ItemConvertible> ADAMANT_SMELTABLES = List.of(ModBlocks.ADAMANT_ORE, ModItems.RAW_ADAMANT);
        List<ItemConvertible> VOIDITE_SMELTABLES = List.of(ModBlocks.VOIDITE_ORE);
        List<ItemConvertible> NULLSTEEL_SMELTABLES = List.of(ModBlocks.NULLSTEEL_ORE, ModItems.RAW_NULLSTEEL);
        List<ItemConvertible> FIRE_OPAL_SMELTABLES = List.of(ModBlocks.FIRE_OPAL_ORE);
        List<ItemConvertible> NETHERITE_SMELTABLES = List.of(ModBlocks.NETHERITE_ORE, ModItems.RAW_NETHERITE);
        offerSmelting(exporter, SOULITE_SMELTABLES, RecipeCategory.MISC, ModItems.SOUL_GEM, 210, 200, "mod_items");
        offerBlasting(exporter, SOULITE_SMELTABLES, RecipeCategory.MISC, ModItems.SOUL_GEM, 210, 100, "mod_items");
        offerSmelting(exporter, SOULSTEEL_SMELTABLES, RecipeCategory.MISC, ModItems.SOULSTEEL, 140, 200, "mod_items");
        offerBlasting(exporter, SOULSTEEL_SMELTABLES, RecipeCategory.MISC, ModItems.SOULSTEEL, 140, 100, "mod_items");
        offerSmelting(exporter, UNSTABLE_SOULSTEEL_SMELTABLES, RecipeCategory.MISC, ModItems.UNSTABLE_SOULSTEEL, 14, 200, "mod_items");
        offerBlasting(exporter, UNSTABLE_SOULSTEEL_SMELTABLES, RecipeCategory.MISC, ModItems.UNSTABLE_SOULSTEEL, 14, 100, "mod_items");
        offerSmelting(exporter, AUTUNITE_SMELTABLES, RecipeCategory.MISC, ModItems.AUTUNITE, 180, 200, "mod_items");
        offerBlasting(exporter, AUTUNITE_SMELTABLES, RecipeCategory.MISC, ModItems.AUTUNITE, 180, 100, "mod_items");
        offerSmelting(exporter, BERYLLIUM_SMELTABLES, RecipeCategory.MISC, ModItems.BERYLLIUM, 120, 200, "mod_items");
        offerBlasting(exporter, BERYLLIUM_SMELTABLES, RecipeCategory.MISC, ModItems.BERYLLIUM, 120, 100, "mod_items");
        offerSmelting(exporter, FROSTINE_SMELTABLES, RecipeCategory.MISC, ModItems.FROSTINE, 150, 200, "mod_items");
        offerBlasting(exporter, FROSTINE_SMELTABLES, RecipeCategory.MISC, ModItems.FROSTINE, 150, 100, "mod_items");
        offerSmelting(exporter, FROSTSTEEL_SMELTABLES, RecipeCategory.MISC, ModItems.FROSTSTEEL, 100, 200, "mod_items");
        offerBlasting(exporter, FROSTSTEEL_SMELTABLES, RecipeCategory.MISC, ModItems.FROSTSTEEL, 100, 100, "mod_items");
        offerSmelting(exporter, AQUAMARINE_SMELTABLES, RecipeCategory.MISC, ModItems.AQUAMARINE, 120, 200, "mod_items");
        offerBlasting(exporter, AQUAMARINE_SMELTABLES, RecipeCategory.MISC, ModItems.AQUAMARINE, 120, 100, "mod_items");
        offerSmelting(exporter, FLOODSTEEL_SMELTABLES, RecipeCategory.MISC, ModItems.FLOODSTEEL, 80, 200, "mod_items");
        offerBlasting(exporter, FLOODSTEEL_SMELTABLES, RecipeCategory.MISC, ModItems.FLOODSTEEL, 80, 100, "mod_items");
        offerSmelting(exporter, AETHERITE_SMELTABLES, RecipeCategory.MISC, ModItems.AETHERITE, 90, 200, "mod_items");
        offerBlasting(exporter, AETHERITE_SMELTABLES, RecipeCategory.MISC, ModItems.AETHERITE, 90, 100, "mod_items");
        offerSmelting(exporter, ADAMANT_SMELTABLES, RecipeCategory.MISC, ModItems.ADAMANT, 60, 200, "mod_items");
        offerBlasting(exporter, ADAMANT_SMELTABLES, RecipeCategory.MISC, ModItems.ADAMANT, 60, 100, "mod_items");
        offerSmelting(exporter, VOIDITE_SMELTABLES, RecipeCategory.MISC, ModItems.VOIDITE, 60, 200, "mod_items");
        offerBlasting(exporter, VOIDITE_SMELTABLES, RecipeCategory.MISC, ModItems.VOIDITE, 60, 100, "mod_items");
        offerSmelting(exporter, NULLSTEEL_SMELTABLES, RecipeCategory.MISC, ModItems.NULLSTEEL, 40, 200, "mod_items");
        offerBlasting(exporter, NULLSTEEL_SMELTABLES, RecipeCategory.MISC, ModItems.NULLSTEEL, 40, 100, "mod_items");
        offerSmelting(exporter, FIRE_OPAL_SMELTABLES, RecipeCategory.MISC, ModItems.FIRE_OPAL, 30, 200, "mod_items");
        offerBlasting(exporter, FIRE_OPAL_SMELTABLES, RecipeCategory.MISC, ModItems.FIRE_OPAL, 30, 100, "mod_items");
        offerSmelting(exporter, NETHERITE_SMELTABLES, RecipeCategory.MISC, ModItems.NETHERITE, 20, 200, "mod_items");
        offerBlasting(exporter, NETHERITE_SMELTABLES, RecipeCategory.MISC, ModItems.NETHERITE, 20, 100, "mod_items");
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.SOUL_GEM, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SOUL_GEM_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.UNSTABLE_SOUL_GEM, RecipeCategory.BUILDING_BLOCKS, ModBlocks.UNSTABLE_SOUL_GEM_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.SOULSTEEL, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SOULSTEEL_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.UNSTABLE_SOULSTEEL, RecipeCategory.BUILDING_BLOCKS, ModBlocks.UNSTABLE_SOULSTEEL_BLOCK);
        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.AMETHYST_SOUL_BERRY)
                .pattern("AAA")
                .pattern("ABA")
                .pattern("AAA")
                .input('A', Items.AMETHYST_SHARD)
                .input('B', ModItems.SOUL_BERRY)
                .criterion(hasItem(ModItems.SOUL_BERRY), conditionsFromItem(ModItems.SOUL_BERRY))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.ENCHANTED_AMETHYST_SOUL_BERRY)
                .pattern("AAA")
                .pattern("ABA")
                .pattern("AAA")
                .input('A', Items.AMETHYST_BLOCK)
                .input('B', ModItems.AMETHYST_SOUL_BERRY)
                .criterion(hasItem(ModItems.AMETHYST_SOUL_BERRY), conditionsFromItem(ModItems.AMETHYST_SOUL_BERRY))
                .offerTo(exporter);
        createSwordRecipe(ModItems.OBSIDIAN_SWORD, Items.OBSIDIAN).offerTo(exporter);
        createSwordRecipe(ModItems.NIHILITY_STONE_SWORD, ModBlocks.NIHILITY_STONE).offerTo(exporter);
        createSwordRecipe(ModItems.NULLSTEEL_SWORD, ModItems.NULLSTEEL).offerTo(exporter);
        createSwordRecipe(ModItems.VOIDITE_SWORD, ModItems.VOIDITE).offerTo(exporter);
        createSwordRecipe(ModItems.BRIMSTONE_SWORD, ModBlocks.BRIMSTONE).offerTo(exporter);
        createSwordRecipe(ModItems.NETHERITE_SWORD, ModItems.NETHERITE).offerTo(exporter);
        createSwordRecipe(ModItems.FIRE_OPAL_SWORD, ModItems.FIRE_OPAL).offerTo(exporter);
        createSwordRecipe(ModItems.AMBER_SWORD, ModBlocks.AMBER).offerTo(exporter);
        createSwordRecipe(ModItems.ADAMANT_SWORD, ModItems.ADAMANT).offerTo(exporter);
        createSwordRecipe(ModItems.AETHERITE_SWORD, ModItems.AETHERITE).offerTo(exporter);
        createAxeRecipe(ModItems.OBSIDIAN_AXE, Items.OBSIDIAN).offerTo(exporter);
        createAxeRecipe(ModItems.NIHILITY_STONE_AXE, ModBlocks.NIHILITY_STONE).offerTo(exporter);
        createAxeRecipe(ModItems.NULLSTEEL_AXE, ModItems.NULLSTEEL).offerTo(exporter);
        createAxeRecipe(ModItems.VOIDITE_AXE, ModItems.VOIDITE).offerTo(exporter);
        createAxeRecipe(ModItems.BRIMSTONE_AXE, ModBlocks.BRIMSTONE).offerTo(exporter);
        createAxeRecipe(ModItems.NETHERITE_AXE, ModItems.NETHERITE).offerTo(exporter);
        createAxeRecipe(ModItems.FIRE_OPAL_AXE, ModItems.FIRE_OPAL).offerTo(exporter);
        createAxeRecipe(ModItems.AMBER_AXE, ModBlocks.AMBER).offerTo(exporter);
        createAxeRecipe(ModItems.ADAMANT_AXE, ModItems.ADAMANT).offerTo(exporter);
        createAxeRecipe(ModItems.AETHERITE_AXE, ModItems.AETHERITE).offerTo(exporter);
        createPickaxeRecipe(ModItems.OBSIDIAN_PICKAXE, Items.OBSIDIAN).offerTo(exporter);
        createPickaxeRecipe(ModItems.NIHILITY_STONE_PICKAXE, ModBlocks.NIHILITY_STONE).offerTo(exporter);
        createPickaxeRecipe(ModItems.NULLSTEEL_PICKAXE, ModItems.NULLSTEEL).offerTo(exporter);
        createPickaxeRecipe(ModItems.VOIDITE_PICKAXE, ModItems.VOIDITE).offerTo(exporter);
        createPickaxeRecipe(ModItems.BRIMSTONE_PICKAXE, ModBlocks.BRIMSTONE).offerTo(exporter);
        createPickaxeRecipe(ModItems.NETHERITE_PICKAXE, ModItems.NETHERITE).offerTo(exporter);
        createPickaxeRecipe(ModItems.FIRE_OPAL_PICKAXE, ModItems.FIRE_OPAL).offerTo(exporter);
        createPickaxeRecipe(ModItems.AMBER_PICKAXE, ModBlocks.AMBER).offerTo(exporter);
        createPickaxeRecipe(ModItems.ADAMANT_PICKAXE, ModItems.ADAMANT).offerTo(exporter);
        createPickaxeRecipe(ModItems.AETHERITE_PICKAXE, ModItems.AETHERITE).offerTo(exporter);
        createShovelRecipe(ModItems.OBSIDIAN_SHOVEL, Items.OBSIDIAN).offerTo(exporter);
        createShovelRecipe(ModItems.NIHILITY_STONE_SHOVEL, ModBlocks.NIHILITY_STONE).offerTo(exporter);
        createShovelRecipe(ModItems.NULLSTEEL_SHOVEL, ModItems.NULLSTEEL).offerTo(exporter);
        createShovelRecipe(ModItems.VOIDITE_SHOVEL, ModItems.VOIDITE).offerTo(exporter);
        createShovelRecipe(ModItems.BRIMSTONE_SHOVEL, ModBlocks.BRIMSTONE).offerTo(exporter);
        createShovelRecipe(ModItems.NETHERITE_SHOVEL, ModItems.NETHERITE).offerTo(exporter);
        createShovelRecipe(ModItems.FIRE_OPAL_SHOVEL, ModItems.FIRE_OPAL).offerTo(exporter);
        createShovelRecipe(ModItems.AMBER_SHOVEL, ModBlocks.AMBER).offerTo(exporter);
        createShovelRecipe(ModItems.ADAMANT_SHOVEL, ModItems.ADAMANT).offerTo(exporter);
        createShovelRecipe(ModItems.AETHERITE_SHOVEL, ModItems.AETHERITE).offerTo(exporter);
        createHoeRecipe(ModItems.OBSIDIAN_HOE, Items.OBSIDIAN).offerTo(exporter);
        createHoeRecipe(ModItems.NIHILITY_STONE_HOE, ModBlocks.NIHILITY_STONE).offerTo(exporter);
        createHoeRecipe(ModItems.NULLSTEEL_HOE, ModItems.NULLSTEEL).offerTo(exporter);
        createHoeRecipe(ModItems.VOIDITE_HOE, ModItems.VOIDITE).offerTo(exporter);
        createHoeRecipe(ModItems.BRIMSTONE_HOE, ModBlocks.BRIMSTONE).offerTo(exporter);
        createHoeRecipe(ModItems.NETHERITE_HOE, ModItems.NETHERITE).offerTo(exporter);
        createHoeRecipe(ModItems.FIRE_OPAL_HOE, ModItems.FIRE_OPAL).offerTo(exporter);
        createHoeRecipe(ModItems.AMBER_HOE, ModBlocks.AMBER).offerTo(exporter);
        createHoeRecipe(ModItems.ADAMANT_HOE, ModItems.ADAMANT).offerTo(exporter);
        createHoeRecipe(ModItems.AETHERITE_HOE, ModItems.AETHERITE).offerTo(exporter);
        createWarhammerRecipe(ModItems.AMBER_WARHAMMER, ModBlocks.AMBER).offerTo(exporter);
        createHelmetRecipe(ModItems.NETHERITE_HELMET, ModItems.NETHERITE).offerTo(exporter);
        createChestplateRecipe(ModItems.NETHERITE_CHESTPLATE, ModItems.NETHERITE).offerTo(exporter);
        createLeggingsRecipe(ModItems.NETHERITE_LEGGINGS, ModItems.NETHERITE).offerTo(exporter);
        createBootsRecipe(ModItems.NETHERITE_BOOTS, ModItems.NETHERITE).offerTo(exporter);
        createHorseArmourRecipe(ModItems.NETHERITE_HORSE_ARMOR, ModItems.NETHERITE).offerTo(exporter);
        offerSmithingTrimRecipe(exporter, ModItems.FIRE_SMITHING_TEMPLATE, Identifier.of(MCCourseMod.MOD_ID, "fire"));

        }
    private static ShapedRecipeJsonBuilder createHorseArmourRecipe(ItemConvertible output, ItemConvertible a) {
        return ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, output)
                .pattern("  A")
                .pattern("AAA")
                .pattern("A A")
                .input('A', a)
                .criterion(hasItem(a), conditionsFromItem(a));
    }
        private static ShapedRecipeJsonBuilder createSwordRecipe(ItemConvertible output, ItemConvertible a) {
            return ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, output)
                    .pattern(" A ")
                    .pattern(" A ")
                    .pattern(" B ")
                    .input('A', a)
                    .input('B', Items.STICK)
                    .criterion(hasItem(a), conditionsFromItem(a));
    }
        private static ShapedRecipeJsonBuilder createAxeRecipe(ItemConvertible output, ItemConvertible a) {
            return  ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, output)
                    .pattern(" AA")
                    .pattern(" BA")
                    .pattern(" B ")
                    .input('A', a)
                    .input('B', Items.STICK)
                    .criterion(hasItem(a), conditionsFromItem(a));
    }
        private static ShapedRecipeJsonBuilder createPickaxeRecipe(ItemConvertible output, ItemConvertible a) {
            return  ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, output)
                    .pattern("AAA")
                    .pattern(" B ")
                    .pattern(" B ")
                    .input('A', a)
                    .input('B', Items.STICK)
                    .criterion(hasItem(a), conditionsFromItem(a));
    }
        private static ShapedRecipeJsonBuilder createShovelRecipe(ItemConvertible output, ItemConvertible a) {
            return  ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, output)
                    .pattern(" A ")
                    .pattern(" B ")
                    .pattern(" B ")
                    .input('A', a)
                    .input('B', Items.STICK)
                 .criterion(hasItem(a), conditionsFromItem(a));
    }
        private static ShapedRecipeJsonBuilder createHoeRecipe(ItemConvertible output, ItemConvertible a) {
            return  ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, output)
                    .pattern("AA ")
                    .pattern(" B ")
                    .pattern(" B ")
                    .input('A', a)
                    .input('B', Items.STICK)
                    .criterion(hasItem(a), conditionsFromItem(a));
    }
    private static ShapedRecipeJsonBuilder createWarhammerRecipe(ItemConvertible output, ItemConvertible a) {
        return  ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, output)
                .pattern("ABA")
                .pattern(" A ")
                .pattern(" A ")
                .input('A', a)
                .input('B', ModBlocks.BISMUTH_BLOCK)
                .criterion(hasItem(a), conditionsFromItem(a));
    }
    private static ShapedRecipeJsonBuilder createHelmetRecipe(ItemConvertible output, ItemConvertible a) {
        return  ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, output)
                .pattern("AAA")
                .pattern("A A")
                .pattern("   ")
                .input('A', a)
                .criterion(hasItem(a), conditionsFromItem(a));
    }
    private static ShapedRecipeJsonBuilder createChestplateRecipe(ItemConvertible output, ItemConvertible a) {
        return  ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, output)
                .pattern("A A")
                .pattern("AAA")
                .pattern("AAA")
                .input('A', a)
                .criterion(hasItem(a), conditionsFromItem(a));
    }
    private static ShapedRecipeJsonBuilder createLeggingsRecipe(ItemConvertible output, ItemConvertible a) {
        return  ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, output)
                .pattern("AAA")
                .pattern("A A")
                .pattern("A A")
                .input('A', a)
                .criterion(hasItem(a), conditionsFromItem(a));
    }
    private static ShapedRecipeJsonBuilder createBootsRecipe(ItemConvertible output, ItemConvertible a) {
        return  ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, output)
                .pattern("A A")
                .pattern("A A")
                .pattern("   ")
                .input('A', a)
                .criterion(hasItem(a), conditionsFromItem(a));
    }
}
