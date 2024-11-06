package net.asheranderson.mccourse.item;
import net.asheranderson.mccourse.MCCourseMod;
import net.asheranderson.mccourse.item.custom.ModToolMaterials;
import net.asheranderson.mccourse.item.custom.WarhammerItem;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.List;

public class ModItems {
    public static final Item FIRE_OPAL = registerItem("fire_opal", new Item(new Item.Settings()));
    public static final Item NETHERITE = registerItem("netherite", new Item(new Item.Settings()));
    public static final Item RAW_NETHERITE = registerItem("raw_netherite", new Item(new Item.Settings()));
    public static final Item VOIDITE = registerItem("voidite", new Item(new Item.Settings()));
    public static final Item NULLSTEEL = registerItem("nullsteel", new Item(new Item.Settings()));
    public static final Item RAW_NULLSTEEL = registerItem("raw_nullsteel", new Item(new Item.Settings()));
    public static final Item AETHERITE = registerItem("aetherite", new Item(new Item.Settings()));
    public static final Item ADAMANT = registerItem("adamant", new Item(new Item.Settings()));
    public static final Item RAW_ADAMANT = registerItem("raw_adamant", new Item(new Item.Settings()));
    public static final Item AQUAMARINE = registerItem("aquamarine", new Item(new Item.Settings()));
    public static final Item FLOODSTEEL = registerItem("floodsteel", new Item(new Item.Settings()));
    public static final Item RAW_FLOODSTEEL = registerItem("raw_floodsteel", new Item(new Item.Settings()));
    public static final Item FROSTINE = registerItem("frostine", new Item(new Item.Settings()));
    public static final Item FROSTSTEEL = registerItem("froststeel", new Item(new Item.Settings()));
    public static final Item RAW_FROSTSTEEL = registerItem("raw_froststeel", new Item(new Item.Settings()));
    public static final Item AUTUNITE = registerItem("autunite", new Item(new Item.Settings()));
    public static final Item BERYLLIUM = registerItem("beryllium", new Item(new Item.Settings()));
    public static final Item RAW_BERYLLIUM = registerItem("raw_beryllium", new Item(new Item.Settings()));
    public static final Item UNSTABLE_SOUL_GEM = registerItem("unstable_soul_gem", new Item(new Item.Settings()));
    public static final Item SOUL_GEM = registerItem("soul_gem", new Item(new Item.Settings()));
    public static final Item UNSTABLE_SOULSTEEL = registerItem("unstable_soulsteel", new Item(new Item.Settings()));
    public static final Item SOULSTEEL = registerItem("soulsteel", new Item(new Item.Settings()));
    public static final Item RAW_UNSTABLE_SOULSTEEL = registerItem("raw_unstable_soulsteel", new Item(new Item.Settings()));
    public static final Item RAW_SOULSTEEL = registerItem("raw_soulsteel", new Item(new Item.Settings()));
    public static final Item BISMUTH = registerItem("bismuth", new Item(new Item.Settings()));
    public static final Item UNSTABLE_SOULROOT = registerItem("unstable_soulroot", new Item(new Item.Settings()
            .food(ModFoodComponents.UNSTABLE_SOULROOT)));
    public static final Item SOULROOT = registerItem("soulroot", new Item(new Item.Settings()
            .food(ModFoodComponents.SOULROOT)));
    public static final Item UNSTABLE_SOUL_BERRY = registerItem("unstable_soul_berry", new Item(new Item.Settings().food(ModFoodComponents
            .UNSTABLE_SOUL_BERRY)));
    public static final Item SOUL_BERRY = registerItem("soul_berry", new Item(new Item.Settings()
            .food(ModFoodComponents.SOUL_BERRY)));
    public static final Item AMETHYST_SOUL_BERRY = registerItem("amethyst_soul_berry", new Item(new Item.Settings()
            .food(ModFoodComponents.AMETHYST_SOUL_BERRY)));
    public static final Item ENCHANTED_AMETHYST_SOUL_BERRY = registerItem("enchanted_amethyst_soul_berry", new Item(new Item.Settings()
            .food(ModFoodComponents.ENCHANTED_AMETHYST_SOUL_BERRY)){
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.mccourse.enchamethysoulberry.tooltip"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });
    public static final Item AMBER_WARHAMMER = registerItem("amber_warhammer", new WarhammerItem(ModToolMaterials.AMBER, 40, 0, 4, 10, 10, -1, new Item.Settings()));
    public static final Item SOULFIRE_CORE = registerItem("soulfire_core", new Item(new Item.Settings()));
    public static final Item OBSIDIAN_SWORD = registerSwordItem("obsidian_sword", ModToolMaterials.OBSIDIAN, 12, 1.0f);
    public static final Item NIHILITY_STONE_SWORD = registerSwordItem("nihility_stone_sword", ModToolMaterials.NIHILITY_STONE, 18, 1.2f);
    public static final Item NULLSTEEL_SWORD = registerSwordItem("nullsteel_sword", ModToolMaterials.NULLSTEEL, 30, 1.6f);
    public static final Item VOIDITE_SWORD = registerSwordItem("voidite_sword", ModToolMaterials.VOIDITE, 90, 2f);
    public static final Item BRIMSTONE_SWORD = registerSwordItem("brimstone_sword", ModToolMaterials.BRIMSTONE, 180, 1.7f);
    public static final Item NETHERITE_SWORD = registerSwordItem("netherite_sword", ModToolMaterials.NETHERITE, 300, 2.1f);
    public static final Item FIRE_OPAL_SWORD = registerSwordItem("fire_opal_sword", ModToolMaterials.FIRE_OPAL, 900, 2.5f);
    public static final Item AMBER_SWORD = registerSwordItem("amber_sword", ModToolMaterials.AMBER,  1800, 2.7f);
    public static final Item ADAMANT_SWORD = registerSwordItem("adamant_sword", ModToolMaterials.ADAMANT, 3000, 3.1f);
    public static final Item AETHERITE_SWORD = registerSwordItem("aetherite_sword", ModToolMaterials.AETHERITE, 9000, 3.5f);
    public static final Item OBSIDIAN_PICKAXE = registerPickaxeItem("obsidian_pickaxe", ModToolMaterials.OBSIDIAN, 4, 0.8f);
    public static final Item NIHILITY_STONE_PICKAXE = registerPickaxeItem("nihility_stone_pickaxe", ModToolMaterials.NIHILITY_STONE, 6, 1.0f);
    public static final Item NULLSTEEL_PICKAXE = registerPickaxeItem("nullsteel_pickaxe", ModToolMaterials.NULLSTEEL, 10, 1.4f);
    public static final Item VOIDITE_PICKAXE  = registerPickaxeItem("voidite_pickaxe", ModToolMaterials.VOIDITE, 30, 1.8f);
    public static final Item BRIMSTONE_PICKAXE = registerPickaxeItem("brimstone_pickaxe", ModToolMaterials.BRIMSTONE, 60, 1.5f);
    public static final Item NETHERITE_PICKAXE = registerPickaxeItem("netherite_pickaxe", ModToolMaterials.NETHERITE, 100, 1.9f);
    public static final Item FIRE_OPAL_PICKAXE  = registerPickaxeItem("fire_opal_pickaxe", ModToolMaterials.FIRE_OPAL, 300, 2.3f);
    public static final Item AMBER_PICKAXE = registerPickaxeItem("amber_pickaxe", ModToolMaterials.AMBER,  600, 2.5f);
    public static final Item ADAMANT_PICKAXE = registerPickaxeItem("adamant_pickaxe", ModToolMaterials.ADAMANT, 1000, 2.9f);
    public static final Item AETHERITE_PICKAXE = registerPickaxeItem("aetherite_pickaxe", ModToolMaterials.AETHERITE, 3000, 3.3f);
    public static final Item OBSIDIAN_SHOVEL = registerShovelItem("obsidian_shovel", ModToolMaterials.OBSIDIAN, 4, 0.7f);
    public static final Item NIHILITY_STONE_SHOVEL = registerShovelItem("nihility_stone_shovel", ModToolMaterials.NIHILITY_STONE, 6, 0.9f);
    public static final Item NULLSTEEL_SHOVEL = registerShovelItem("nullsteel_shovel", ModToolMaterials.NULLSTEEL, 10, 1.3f);
    public static final Item VOIDITE_SHOVEL = registerShovelItem("voidite_shovel", ModToolMaterials.VOIDITE, 30, 1.6f);
    public static final Item BRIMSTONE_SHOVEL = registerShovelItem("brimstone_shovel", ModToolMaterials.BRIMSTONE, 60, 1.4f);
    public static final Item NETHERITE_SHOVEL = registerShovelItem("netherite_shovel", ModToolMaterials.NETHERITE, 100, 1.8f);
    public static final Item FIRE_OPAL_SHOVEL = registerShovelItem("fire_opal_shovel", ModToolMaterials.FIRE_OPAL, 300, 2.1f);
    public static final Item AMBER_SHOVEL = registerShovelItem("amber_shovel", ModToolMaterials.AMBER,  600, 2.4f);
    public static final Item ADAMANT_SHOVEL = registerShovelItem("adamant_shovel", ModToolMaterials.ADAMANT, 1000, 2.8f);
    public static final Item AETHERITE_SHOVEL = registerShovelItem("aetherite_shovel", ModToolMaterials.AETHERITE, 3000, 3.1f);
    public static final Item OBSIDIAN_AXE = registerAxeItem("obsidian_axe", ModToolMaterials.OBSIDIAN, 24, 0.5f);
    public static final Item NIHILITY_STONE_AXE = registerAxeItem("nihility_stone_axe", ModToolMaterials.NIHILITY_STONE, 36, 0.6f);
    public static final Item NULLSTEEL_AXE = registerAxeItem("nullsteel_axe", ModToolMaterials.NULLSTEEL, 60, 0.8f);
    public static final Item VOIDITE_AXE = registerAxeItem("voidite_axe", ModToolMaterials.VOIDITE, 180, 1.0f);
    public static final Item BRIMSTONE_AXE = registerAxeItem("brimstone_axe", ModToolMaterials.BRIMSTONE, 3600, 0.85f);
    public static final Item NETHERITE_AXE = registerAxeItem("netherite_axe", ModToolMaterials.NETHERITE, 6000, 1.05f);
    public static final Item FIRE_OPAL_AXE = registerAxeItem("fire_opal_axe", ModToolMaterials.FIRE_OPAL, 18000, 1.25f);
    public static final Item AMBER_AXE = registerAxeItem("amber_axe", ModToolMaterials.AMBER,  36000, 1.35f);
    public static final Item ADAMANT_AXE = registerAxeItem("adamant_axe", ModToolMaterials.ADAMANT, 60000, 1.55f);
    public static final Item AETHERITE_AXE = registerAxeItem("aetherite_axe", ModToolMaterials.AETHERITE, 180000, 1.75f);
    public static final Item OBSIDIAN_HOE = registerHoeItem("obsidian_hoe", ModToolMaterials.OBSIDIAN,  4, 0.5f);
    public static final Item NIHILITY_STONE_HOE = registerHoeItem("nihility_stone_hoe", ModToolMaterials.NIHILITY_STONE,  6, 0.6f);
    public static final Item NULLSTEEL_HOE = registerHoeItem("nullsteel_hoe", ModToolMaterials.NULLSTEEL, 10, 0.7f);
    public static final Item VOIDITE_HOE = registerHoeItem("voidite_hoe", ModToolMaterials.VOIDITE, 30, 1.0f);
    public static final Item BRIMSTONE_HOE = registerHoeItem("brimstone_hoe", ModToolMaterials.BRIMSTONE,  60, 1.1f);
    public static final Item NETHERITE_HOE = registerHoeItem("netherite_hoe", ModToolMaterials.NETHERITE, 100, 1.2f);
    public static final Item FIRE_OPAL_HOE = registerHoeItem("fire_opal_hoe", ModToolMaterials.FIRE_OPAL, 300, 1.5f);
    public static final Item AMBER_HOE = registerHoeItem("amber_hoe", ModToolMaterials.AMBER,  600, 2.1f);
    public static final Item ADAMANT_HOE = registerHoeItem("adamant_hoe", ModToolMaterials.ADAMANT, 1000, 2.2f);
    public static final Item AETHERITE_HOE = registerHoeItem("aetherite_hoe", ModToolMaterials.AETHERITE, 3000, 2.5f);
    private static Item registerSwordItem(String name, ToolMaterial toolMaterial, int baseAttackDamage, float attackSpeed){
        return registerItem(name, new SwordItem(toolMaterial, new Item.Settings()
                .attributeModifiers(SwordItem.createAttributeModifiers(toolMaterial, baseAttackDamage, attackSpeed))));
    }
    private static Item registerPickaxeItem(String name, ToolMaterial toolMaterial, int baseAttackDamage, float attackSpeed){
        return registerItem(name, new PickaxeItem(toolMaterial, new Item.Settings()
                .attributeModifiers(PickaxeItem.createAttributeModifiers(toolMaterial, baseAttackDamage, attackSpeed))));
    }
    private static Item registerAxeItem(String name, ToolMaterial toolMaterial, int baseAttackDamage, float attackSpeed){
        return registerItem(name, new AxeItem(toolMaterial, new Item.Settings()
                .attributeModifiers(AxeItem.createAttributeModifiers(toolMaterial, baseAttackDamage, attackSpeed))));
    }
    private static Item registerShovelItem(String name, ToolMaterial toolMaterial, int baseAttackDamage, float attackSpeed){
        return registerItem(name, new ShovelItem(toolMaterial, new Item.Settings()
                .attributeModifiers(ShovelItem.createAttributeModifiers(toolMaterial, baseAttackDamage, attackSpeed))));
    }
    private static Item registerHoeItem(String name, ToolMaterial toolMaterial, int baseAttackDamage, float attackSpeed){
        return registerItem(name, new HoeItem(toolMaterial, new Item.Settings()
                .attributeModifiers(HoeItem.createAttributeModifiers(toolMaterial, baseAttackDamage, attackSpeed))));
    }
    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of (MCCourseMod.MOD_ID, name), item);
    }
    public static void registerModItems(){
        MCCourseMod.LOGGER.info("Registering Mod Items for " + MCCourseMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(RAW_NETHERITE);
            entries.add(NETHERITE);
            entries.add(FIRE_OPAL);
            entries.add(RAW_NULLSTEEL);
            entries.add(NULLSTEEL);
            entries.add(VOIDITE);
            entries.add(RAW_ADAMANT);
            entries.add(ADAMANT);
            entries.add(BISMUTH);
            entries.add(AETHERITE);
            entries.add(RAW_FLOODSTEEL);
            entries.add(FLOODSTEEL);
            entries.add(AQUAMARINE);
            entries.add(RAW_FROSTSTEEL);
            entries.add(FROSTSTEEL);
            entries.add(FROSTINE);
            entries.add(RAW_BERYLLIUM);
            entries.add(BERYLLIUM);
            entries.add(AUTUNITE);
            entries.add(RAW_UNSTABLE_SOULSTEEL);
            entries.add(RAW_SOULSTEEL);
            entries.add(UNSTABLE_SOULSTEEL);
            entries.add(SOULSTEEL);
            entries.add(UNSTABLE_SOUL_GEM);
            entries.add(SOUL_GEM);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
            entries.add(OBSIDIAN_SWORD);
            entries.add(OBSIDIAN_AXE);
            entries.add(NIHILITY_STONE_SWORD);
            entries.add(NIHILITY_STONE_AXE);
            entries.add(NULLSTEEL_SWORD);
            entries.add(NULLSTEEL_AXE);
            entries.add(VOIDITE_SWORD);
            entries.add(VOIDITE_AXE);
            entries.add(BRIMSTONE_SWORD);
            entries.add(BRIMSTONE_AXE);
            entries.add(NETHERITE_SWORD);
            entries.add(NETHERITE_AXE);
            entries.add(FIRE_OPAL_SWORD);
            entries.add(FIRE_OPAL_AXE);
            entries.add(AMBER_SWORD);
            entries.add(AMBER_AXE);
            entries.add(ADAMANT_SWORD);
            entries.add(ADAMANT_AXE);
            entries.add(AETHERITE_SWORD);
            entries.add(AETHERITE_AXE);
            entries.add(AMBER_WARHAMMER);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
            entries.add(OBSIDIAN_AXE);
            entries.add(OBSIDIAN_PICKAXE);
            entries.add(OBSIDIAN_SHOVEL);
            entries.add(OBSIDIAN_HOE);
            entries.add(NIHILITY_STONE_AXE);
            entries.add(NIHILITY_STONE_PICKAXE);
            entries.add(NIHILITY_STONE_SHOVEL);
            entries.add(NIHILITY_STONE_HOE);
            entries.add(NULLSTEEL_AXE);
            entries.add(NULLSTEEL_PICKAXE);
            entries.add(NULLSTEEL_SHOVEL);
            entries.add(NULLSTEEL_HOE);
            entries.add(VOIDITE_AXE);
            entries.add(VOIDITE_PICKAXE);
            entries.add(VOIDITE_SHOVEL);
            entries.add(VOIDITE_HOE);
            entries.add(BRIMSTONE_AXE);
            entries.add(BRIMSTONE_PICKAXE);
            entries.add(BRIMSTONE_SHOVEL);
            entries.add(BRIMSTONE_HOE);
            entries.add(NETHERITE_AXE);
            entries.add(NETHERITE_PICKAXE);
            entries.add(NETHERITE_SHOVEL);
            entries.add(NETHERITE_HOE);
            entries.add(FIRE_OPAL_AXE);
            entries.add(FIRE_OPAL_PICKAXE);
            entries.add(FIRE_OPAL_SHOVEL);
            entries.add(FIRE_OPAL_HOE);
            entries.add(AMBER_AXE);
            entries.add(AMBER_PICKAXE);
            entries.add(AMBER_SHOVEL);
            entries.add(AMBER_HOE);
            entries.add(ADAMANT_AXE);
            entries.add(ADAMANT_PICKAXE);
            entries.add(ADAMANT_SHOVEL);
            entries.add(ADAMANT_HOE);
            entries.add(AETHERITE_AXE);
            entries.add(AETHERITE_PICKAXE);
            entries.add(AETHERITE_SHOVEL);
            entries.add(AETHERITE_HOE);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
            entries.add(UNSTABLE_SOULROOT);
            entries.add(SOULROOT);
            entries.add(UNSTABLE_SOUL_BERRY);
            entries.add(SOUL_BERRY);
            entries.add(AMETHYST_SOUL_BERRY);
            entries.add(ENCHANTED_AMETHYST_SOUL_BERRY);
        });
    }
}
