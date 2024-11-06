package net.asheranderson.mccourse.item.custom;

import net.asheranderson.mccourse.item.ModItems;
import net.minecraft.block.BlockState;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.AttributeModifierSlot;
import net.minecraft.component.type.AttributeModifiersComponent;
import net.minecraft.component.type.ToolComponent;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.decoration.ArmorStandEntity;
import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.network.packet.s2c.play.EntityVelocityUpdateS2CPacket;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraft.world.WorldEvents;

import java.util.List;
import java.util.function.Predicate;

public class WarhammerItem extends ToolItem {

    public static float MINING_SPEED_MULTIPLIER;
    public static float KNOCKBACK_RANGE;
    public static float KNOCKBACK_POWER;
    public static int ATTACK_DAMAGE_MODIFIER_VALUE;
    public static float ATTACK_SPEED_MODIFIER_VALUE;
    public static double PLAYER_RANGE_MODIFIER_VALUE;
    private final ToolMaterial toolMaterial;
    public WarhammerItem(ToolMaterial toolMaterial, int ATTACK_DAMAGE_MODIFIER_VALUE,
                         float ATTACK_SPEED_MODIFIER_VALUE,
                         double PLAYER_RANGE_MODIFIER_VALUE,
                         float KNOCKBACK_POWER,
                         float KNOCKBACK_RANGE,
                         float MINING_SPEED_MULTIPLIER,
                         Item.Settings settings) {
        super(toolMaterial, settings.component(DataComponentTypes.TOOL, createToolComponent()));
        this.toolMaterial = toolMaterial;
        this.ATTACK_DAMAGE_MODIFIER_VALUE = ATTACK_DAMAGE_MODIFIER_VALUE;
        this.ATTACK_SPEED_MODIFIER_VALUE = ATTACK_SPEED_MODIFIER_VALUE;
        this.PLAYER_RANGE_MODIFIER_VALUE = PLAYER_RANGE_MODIFIER_VALUE;
        this.KNOCKBACK_POWER = KNOCKBACK_POWER;
        this.KNOCKBACK_RANGE = KNOCKBACK_RANGE;
        this.MINING_SPEED_MULTIPLIER = MINING_SPEED_MULTIPLIER;
    }
    public static boolean shouldDealAdditionalDamage(LivingEntity attacker) {
        return attacker.fallDistance > 1.5F && !attacker.isFallFlying();
    }
    public float getBonusAttackDamage(Entity target, float baseAttackDamage, DamageSource damageSource) {
        if (damageSource.getSource() instanceof LivingEntity livingEntity) {
            if (!shouldDealAdditionalDamage(livingEntity)) {
                return 0.0F;
            } else {
                float f = 3.0F;
                float g = 8.0F;
                float h = livingEntity.fallDistance;
                float i;
                if (h <= f) {
                    i = 4.0F * h;
                } else if (h <= g) {
                    i = 12.0F + 2.0F * (h - f);
                } else {
                    i = 22.0F + h - g;
                }

                return livingEntity.getWorld() instanceof ServerWorld serverWorld
                        ? i + EnchantmentHelper.getSmashDamagePerFallenBlock(serverWorld, livingEntity.getWeaponStack(), target, damageSource, 0.0F) * h
                        : i;
            }
        } else {
            return 0.0F;
        }
    }
    private static void knockbackNearbyEntities(World world, PlayerEntity player, Entity attacked) {
        world.syncWorldEvent(WorldEvents.SMASH_ATTACK, attacked.getSteppingPos(), 750);
        world.getEntitiesByClass(LivingEntity.class, attacked.getBoundingBox().expand(KNOCKBACK_RANGE), getKnockbackPredicate(player, attacked)).forEach(entity -> {
            Vec3d vec3d = entity.getPos().subtract(attacked.getPos());
            double d = getKnockback(player, entity, vec3d);
            Vec3d vec3d2 = vec3d.normalize().multiply(d);
            if (d > 0.0) {
                entity.addVelocity(vec3d2.x, KNOCKBACK_POWER, vec3d2.z);
                if (entity instanceof ServerPlayerEntity serverPlayerEntity) {
                    serverPlayerEntity.networkHandler.sendPacket(new EntityVelocityUpdateS2CPacket(serverPlayerEntity));
                }
            }
        });
    }
    private static Predicate<LivingEntity> getKnockbackPredicate(PlayerEntity player, Entity attacked) {
        return entity -> {
            boolean bl;
            boolean bl2;
            boolean bl3;
            boolean var10000;
            label62: {
                bl = !entity.isSpectator();
                bl2 = entity != player && entity != attacked;
                bl3 = !player.isTeammate(entity);
                if (entity instanceof TameableEntity tameableEntity && tameableEntity.isTamed() && player.getUuid().equals(tameableEntity.getOwnerUuid())) {
                    var10000 = true;
                    break label62;
                }

                var10000 = false;
            }

            boolean bl4;
            label55: {
                bl4 = !var10000;
                if (entity instanceof ArmorStandEntity armorStandEntity && armorStandEntity.isMarker()) {
                    var10000 = false;
                    break label55;
                }

                var10000 = true;
            }

            boolean bl5 = var10000;
            boolean bl6 = attacked.squaredDistanceTo(entity) <= Math.pow(3.5, 2.0);
            return bl && bl2 && bl3 && bl4 && bl5 && bl6;
        };
    }
    private static double getKnockback(PlayerEntity player, LivingEntity attacked, Vec3d distance) {
        return (KNOCKBACK_RANGE - distance.length())
                * KNOCKBACK_POWER
                * (double)(player.fallDistance > 5.0F ? 2 : 1)
                * (1.0 - attacked.getAttributeValue(EntityAttributes.GENERIC_KNOCKBACK_RESISTANCE));
    }
    public static final Identifier PLAYER_ENTITY_INTERACTION_RANGE_MODIFIER_ID = Identifier.ofVanilla("player.entity_interaction_range");
    public static AttributeModifiersComponent createAttributeModifiers(ToolMaterial material, int baseAttackDamage, float attackSpeed, float getBonusAttackDamage) {
        return AttributeModifiersComponent.builder()
                .add(
                        EntityAttributes.GENERIC_ATTACK_DAMAGE,
                        new EntityAttributeModifier(
                                BASE_ATTACK_DAMAGE_MODIFIER_ID, (ATTACK_DAMAGE_MODIFIER_VALUE + material.getAttackDamage() + getBonusAttackDamage), EntityAttributeModifier.Operation.ADD_VALUE
                        ),
                        AttributeModifierSlot.ANY
                )
                .add(
                        EntityAttributes.GENERIC_ATTACK_SPEED,
                        new EntityAttributeModifier(BASE_ATTACK_SPEED_MODIFIER_ID, (double)attackSpeed, EntityAttributeModifier.Operation.ADD_VALUE),
                        AttributeModifierSlot.ANY
                )
                .add(
                        EntityAttributes.PLAYER_ENTITY_INTERACTION_RANGE,
                        new EntityAttributeModifier(PLAYER_ENTITY_INTERACTION_RANGE_MODIFIER_ID, PLAYER_RANGE_MODIFIER_VALUE, EntityAttributeModifier.Operation.ADD_VALUE),
                        AttributeModifierSlot.ANY
                )
                .build();
    }
    public static ToolComponent createToolComponent() {
        return new ToolComponent(List.of(), 1.0F, 2);
    }

    @Override
    public boolean canMine(BlockState state, World world, BlockPos pos, PlayerEntity miner) {
        return !miner.isCreative();
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        return true;
    }

    @Override
    public void postDamageEntity(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        stack.damage(1, attacker, EquipmentSlot.MAINHAND);
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        if(Screen.hasShiftDown()){
            tooltip.add(Text.translatable("tooltip.mccourse.warhammer_item.tooltip"));
        }else{
            tooltip.add(Text.translatable("tooltip.mccourse.more_info.tooltip"));
        }
        super.appendTooltip(stack, context, tooltip, type);
    }
}
