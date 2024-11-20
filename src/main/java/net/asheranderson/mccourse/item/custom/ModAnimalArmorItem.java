package net.asheranderson.mccourse.item.custom;

import com.google.common.collect.ImmutableMap;
import net.asheranderson.mccourse.item.ModArmorMaterials;
import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.passive.HorseEntity;
import net.minecraft.item.AnimalArmorItem;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.world.World;

import java.util.List;
import java.util.Map;

public class ModAnimalArmorItem extends AnimalArmorItem {
    private static final Map<RegistryEntry<ArmorMaterial>, List<StatusEffectInstance>> MATERIAL_TO_EFFECT_MAP =
            (new ImmutableMap.Builder<RegistryEntry<ArmorMaterial>, List<StatusEffectInstance>>())
                    .put(ModArmorMaterials.NETHERITE_ARMOUR_MATERIAL,
                            List.of(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 1000, 1, false, false),
                                    new StatusEffectInstance(StatusEffects.STRENGTH, 1000, 1, false, false)))
                    .put(ModArmorMaterials.ARMOR_MATERIAL_NOT_FOUND,
                            List.of(new StatusEffectInstance(StatusEffects.ABSORPTION, 1000000000, 1000000000, false, false),
                                    new StatusEffectInstance(StatusEffects.STRENGTH, 1000000000, 1000000000, false, false),
                                    new StatusEffectInstance(StatusEffects.SPEED, 1000000000, 100, false, false),
                                    new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 1000000000, 1000000000, false, false),
                                    new StatusEffectInstance(StatusEffects.REGENERATION, 1000000000, 1000000000, false, false),
                                    new StatusEffectInstance(StatusEffects.RESISTANCE, 1000000000, 1000000000, false, false),
                                    new StatusEffectInstance(StatusEffects.HASTE, 1000000000, 1000000000, false, false),
                                    new StatusEffectInstance(StatusEffects.SATURATION, 1000000000, 1000000000, false, false),
                                    new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 1000000000, 1000000000, false, false),
                                    new StatusEffectInstance(StatusEffects.INVISIBILITY, 1000000000, 1000000000, false, false),
                                    new StatusEffectInstance(StatusEffects.JUMP_BOOST, 1000000000, 10, false, false),
                                    new StatusEffectInstance(StatusEffects.NIGHT_VISION, 1000000000, 1000000000, false, false),
                                    new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 1000000000, 1000000000, false, false),
                                    new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 1000000000, 1000000000, false, false),
                                    new StatusEffectInstance(StatusEffects.LUCK, 1000000000, 1000000000, false, false),
                                    new StatusEffectInstance(StatusEffects.WATER_BREATHING, 1000000000, 1000000000, false, false),
                                    new StatusEffectInstance(StatusEffects.HERO_OF_THE_VILLAGE, 1000000000, 1000000000, false, false))).build();


    public ModAnimalArmorItem(RegistryEntry<ArmorMaterial> material, AnimalArmorItem.Type type, Settings settings) {
        super(material, type, false, settings);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if(!world.isClient()) {
            if(entity instanceof HorseEntity horse) {
                if(hasFullSuitOfArmorOn(horse)) {
                    evaluateArmorEffects(horse);
                }
            }
        }

        super.inventoryTick(stack, world, entity, slot, selected);
    }

    private void evaluateArmorEffects(HorseEntity horse) {
        for (Map.Entry<RegistryEntry<ArmorMaterial>, List<StatusEffectInstance>> entry : MATERIAL_TO_EFFECT_MAP.entrySet()) {
            RegistryEntry<ArmorMaterial> mapArmorMaterial = entry.getKey();
            List<StatusEffectInstance> mapStatusEffects = entry.getValue();

            if(hasCorrectArmorOn(mapArmorMaterial, horse)) {
                addStatusEffectForMaterial(horse, mapArmorMaterial, mapStatusEffects);
            }
        }
    }

    private void addStatusEffectForMaterial(HorseEntity horse, RegistryEntry<ArmorMaterial> mapArmorMaterial, List<StatusEffectInstance> mapStatusEffect) {
        boolean hasPlayerEffect = mapStatusEffect.stream().allMatch(statusEffectInstance -> horse.hasStatusEffect(statusEffectInstance.getEffectType()));

        if(!hasPlayerEffect) {
            for (StatusEffectInstance instance : mapStatusEffect) {
                horse.addStatusEffect(new StatusEffectInstance(instance.getEffectType(),
                        instance.getDuration(), instance.getAmplifier(), instance.isAmbient(), instance.shouldShowParticles()));
            }
        }
    }

    private boolean hasFullSuitOfArmorOn(HorseEntity horse) {
        ItemStack armor = horse.getBodyArmor();

        return !armor.isEmpty();
    }

    private boolean hasCorrectArmorOn(RegistryEntry<ArmorMaterial> material, HorseEntity horse) {
        for (ItemStack armorStack: horse.getArmorItems()) {
            if(!(armorStack.getItem() instanceof AnimalArmorItem)) {
                return false;
            }
        }

        ArmorItem armor = ((ArmorItem)horse.getArmorItems());
        return armor == material;
    }
}
