package net.asheranderson.mccourse.effect;

import net.asheranderson.mccourse.MCCourseMod;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

public class ModEffects {
    public static final RegistryEntry<StatusEffect> GODMODE = registerStatusEffect("godmode",
            new GodmodeEffect(StatusEffectCategory.BENEFICIAL, 0xd400ff)
                    .addAttributeModifier(EntityAttributes.GENERIC_MOVEMENT_SPEED,
                            Identifier.of(MCCourseMod.MOD_ID, "godmode"), 25.00f,
                            EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
                    .addAttributeModifier(EntityAttributes.GENERIC_ATTACK_DAMAGE,
                          Identifier.of(MCCourseMod.MOD_ID, "godmode"), 1000000000000000000000000000.0,
                            EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
                    .addAttributeModifier(EntityAttributes.GENERIC_MAX_HEALTH,
                      Identifier.of(MCCourseMod.MOD_ID, "godmode"), 1000000000000000000000000000.0,
                            EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
                    .addAttributeModifier(EntityAttributes.GENERIC_ARMOR,
                      Identifier.of(MCCourseMod.MOD_ID, "godmode"), 1000000000000000000000000000.0,
                            EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
                    .addAttributeModifier(EntityAttributes.GENERIC_ATTACK_SPEED,
                            Identifier.of(MCCourseMod.MOD_ID, "godmode"), 1000000000000000000000000000.0f,
                            EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
                    .addAttributeModifier(EntityAttributes.GENERIC_ARMOR_TOUGHNESS,
                            Identifier.of(MCCourseMod.MOD_ID, "godmode"), 1000000000000000000000000000.0,
                            EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
                    .addAttributeModifier(EntityAttributes.GENERIC_MAX_ABSORPTION,
                            Identifier.of(MCCourseMod.MOD_ID, "godmode"), 1000000000000000000000000000.0,
                            EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
                    .addAttributeModifier(EntityAttributes.GENERIC_ATTACK_KNOCKBACK,
                            Identifier.of(MCCourseMod.MOD_ID, "godmode"), 1000000000000000000000000000.0,
                            EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
                    .addAttributeModifier(EntityAttributes.GENERIC_JUMP_STRENGTH,
                            Identifier.of(MCCourseMod.MOD_ID, "godmode"), 5.0f,
                            EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
                    .addAttributeModifier(EntityAttributes.GENERIC_LUCK,
                            Identifier.of(MCCourseMod.MOD_ID, "godmode"), 1000000000000000000000000000.0,
                            EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
                    .addAttributeModifier(EntityAttributes.GENERIC_BURNING_TIME,
                            Identifier.of(MCCourseMod.MOD_ID, "godmode"), 0.0,
                            EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
                    .addAttributeModifier(EntityAttributes.GENERIC_FLYING_SPEED,
                            Identifier.of(MCCourseMod.MOD_ID, "godmode"), 1000000000000000000000000000.0,
                            EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
                    .addAttributeModifier(EntityAttributes.GENERIC_STEP_HEIGHT,
                            Identifier.of(MCCourseMod.MOD_ID, "godmode"), 2,
                            EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
                    .addAttributeModifier(EntityAttributes.GENERIC_KNOCKBACK_RESISTANCE,
                            Identifier.of(MCCourseMod.MOD_ID, "godmode"), 1000000000000000000000000000.0,
                            EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
                    .addAttributeModifier(EntityAttributes.GENERIC_EXPLOSION_KNOCKBACK_RESISTANCE,
                            Identifier.of(MCCourseMod.MOD_ID, "godmode"), 1000000000000000000000000000.0,
                            EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
                    .addAttributeModifier(EntityAttributes.GENERIC_MOVEMENT_EFFICIENCY,
                            Identifier.of(MCCourseMod.MOD_ID, "godmode"), 1000000000000000000000000000.0,
                            EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
                    .addAttributeModifier(EntityAttributes.GENERIC_WATER_MOVEMENT_EFFICIENCY,
                            Identifier.of(MCCourseMod.MOD_ID, "godmode"), 1000000000000000000000000000.0,
                            EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
                    .addAttributeModifier(EntityAttributes.GENERIC_OXYGEN_BONUS,
                            Identifier.of(MCCourseMod.MOD_ID, "godmode"), 1000000000000000000000000000.0,
                            EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
                    .addAttributeModifier(EntityAttributes.GENERIC_FALL_DAMAGE_MULTIPLIER,
                            Identifier.of(MCCourseMod.MOD_ID, "godmode"), 0.0,
                            EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
    private static RegistryEntry<StatusEffect> registerStatusEffect(String name, StatusEffect statusEffect){
        return Registry.registerReference(Registries.STATUS_EFFECT, Identifier.of(MCCourseMod.MOD_ID, name), statusEffect);
    }
    public static void registerEffects(){
        MCCourseMod.LOGGER.info("Registering Mod Effects For "+MCCourseMod.MOD_ID);
    }
}
