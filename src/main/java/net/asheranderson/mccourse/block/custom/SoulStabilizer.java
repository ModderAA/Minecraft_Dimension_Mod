package net.asheranderson.mccourse.block.custom;

import net.asheranderson.mccourse.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.List;

public class SoulStabilizer extends Block {
    public SoulStabilizer(Settings settings) {
        super(settings);
    }

    @Override
    protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
        world.playSound(player, pos, SoundEvents.ENTITY_WARDEN_NEARBY_CLOSER, SoundCategory.BLOCKS, 1f, 1f);
        return ActionResult.SUCCESS;
    }

    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        if(entity instanceof ItemEntity itemEntity) {
            if(itemEntity.getStack().getItem()== ModItems.UNSTABLE_SOULSTEEL) {
                itemEntity.setStack(new ItemStack(ModItems.SOULSTEEL, itemEntity.getStack().getCount()));
            }
            if(itemEntity.getStack().getItem()== ModItems.RAW_UNSTABLE_SOULSTEEL) {
                itemEntity.setStack(new ItemStack(ModItems.RAW_SOULSTEEL, itemEntity.getStack().getCount()));
            }
            if(itemEntity.getStack().getItem()== ModItems.UNSTABLE_SOUL_GEM) {
                itemEntity.setStack(new ItemStack(ModItems.SOUL_GEM, itemEntity.getStack().getCount()));
            }
            if(itemEntity.getStack().getItem()== ModItems.UNSTABLE_SOULROOT) {
                itemEntity.setStack(new ItemStack(ModItems.SOULROOT, itemEntity.getStack().getCount()));
            }
            if(itemEntity.getStack().getItem()== ModItems.UNSTABLE_SOUL_BERRY) {
                itemEntity.setStack(new ItemStack(ModItems.SOUL_BERRY, itemEntity.getStack().getCount()));
            }
        }
        super.onSteppedOn(world, pos, state, entity);
    }

    @Override
    public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType options) {
        tooltip.add(Text.translatable("tooltip.mccourse.soul_stabilizer.tooltip"));
        super.appendTooltip(stack, context, tooltip, options);
    }
}
