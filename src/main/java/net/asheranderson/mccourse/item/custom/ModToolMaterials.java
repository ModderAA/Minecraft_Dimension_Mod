package net.asheranderson.mccourse.item.custom;

import com.google.common.base.Suppliers;
import net.asheranderson.mccourse.block.ModBlocks;
import net.asheranderson.mccourse.item.ModItems;
import net.asheranderson.mccourse.util.ModTags;
import net.minecraft.block.Block;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.TagKey;

import java.util.function.Supplier;

public enum ModToolMaterials implements ToolMaterial {

    OBSIDIAN(ModTags.Blocks.INCORRECT_FOR_OBSIDIAN_TOOL, 3000, 10.0F, 4.0F, 15, () -> Ingredient.ofItems(Items.OBSIDIAN)),
    NIHILITY_STONE(ModTags.Blocks.INCORRECT_FOR_NIHILITY_STONE_TOOL, 4500, 15.0F, 5.0F, 17, () -> Ingredient.ofItems(ModBlocks.NIHILITY_STONE)),
    NULLSTEEL(ModTags.Blocks.INCORRECT_FOR_NULLSTEEL_TOOL, 7500, 25.0F, 10.0F, 20, () -> Ingredient.ofItems(ModItems.NULLSTEEL)),
    VOIDITE(ModTags.Blocks.INCORRECT_FOR_VOIDITE_TOOL, 20000, 80.0F, 40.0F, 50, () -> Ingredient.ofItems(ModItems.VOIDITE)),
    BRIMSTONE(ModTags.Blocks.INCORRECT_FOR_BRIMSTONE_TOOL, 45000, 95.0F, 45.0F, 67, () -> Ingredient.ofItems(ModBlocks.BRIMSTONE)),
    NETHERITE(ModTags.Blocks.INCORRECT_FOR_NETHERITE_TOOL, 75000, 105.0F, 50.0F, 70, () -> Ingredient.ofItems(ModItems.NETHERITE)),
    FIRE_OPAL(ModTags.Blocks.INCORRECT_FOR_FIRE_OPAL_TOOL, 200000, 160.0F, 80.0F, 100, () -> Ingredient.ofItems(ModItems.FIRE_OPAL)),
    AMBER(ModTags.Blocks.INCORRECT_FOR_AMBER_TOOL, 450000, 175.0F, 85.0F, 117, () -> Ingredient.ofItems(ModBlocks.AMBER)),
    ADAMANT(ModTags.Blocks.INCORRECT_FOR_ADAMANT_TOOL, 750000, 195.0F, 90.0F, 120, () -> Ingredient.ofItems(ModItems.ADAMANT)),
    AETHERITE(ModTags.Blocks.INCORRECT_FOR_AETHERITE_TOOL, 2000000, 240.0F, 120.0F, 150, () -> Ingredient.ofItems(ModItems.AETHERITE));
    private final TagKey<Block> inverseTag;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    private ModToolMaterials(
            final TagKey<Block> inverseTag,
            final int itemDurability,
            final float miningSpeed,
            final float attackDamage,
            final int enchantability,
            final Supplier<Ingredient> repairIngredient
    ) {
        this.inverseTag = inverseTag;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = Suppliers.memoize(repairIngredient::get);
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public TagKey<Block> getInverseTag() {
        return this.inverseTag;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return (Ingredient)this.repairIngredient.get();
    }
}
