package net.asheranderson.mccourse.item;

import net.asheranderson.mccourse.MCCourseMod;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class ModArmorMaterials {
    public static final RegistryEntry<ArmorMaterial> NETHERITE_ARMOUR_MATERIAL = registerArmourMaterial("netherite",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 15);
                map.put(ArmorItem.Type.LEGGINGS, 30);
                map.put(ArmorItem.Type.CHESTPLATE, 40);
                map.put(ArmorItem.Type.HELMET, 15);
                map.put(ArmorItem.Type.BODY, 55);
            }), 20, SoundEvents.ITEM_ARMOR_EQUIP_IRON, () -> Ingredient.ofItems(ModItems.NETHERITE),
                    List.of(new ArmorMaterial.Layer(Identifier.of(MCCourseMod.MOD_ID, "netherite"))), 0, 0));
    public static final RegistryEntry<ArmorMaterial> ARMOR_MATERIAL_NOT_FOUND = registerArmourMaterial("not_found",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 1000000000);
                map.put(ArmorItem.Type.LEGGINGS, 1000000000);
                map.put(ArmorItem.Type.CHESTPLATE, 1000000000);
                map.put(ArmorItem.Type.HELMET, 1000000000);
                map.put(ArmorItem.Type.BODY, 1000000000);
            }), 20, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, () -> Ingredient.ofItems(ModItems.ITEM_NOT_FOUND),
                    List.of(new ArmorMaterial.Layer(Identifier.of(MCCourseMod.MOD_ID, "not_found"))), 1000000000, 1000000000));
    public static RegistryEntry<ArmorMaterial> registerArmourMaterial(String name, Supplier<ArmorMaterial> material){
        return Registry.registerReference(Registries.ARMOR_MATERIAL, Identifier.of(MCCourseMod.MOD_ID, name), material.get());
    }
}
