package net.asheranderson.mccourse.util;

import net.asheranderson.mccourse.item.custom.GodToolItem;
import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.HashSet;
import java.util.Set;

public class GodToolUsageEvent implements PlayerBlockBreakEvents.Before{
    private static final Set<BlockPos> HARVESTED_BLOCKS = new HashSet<>();
    @Override
    public boolean beforeBlockBreak(World world, PlayerEntity player, BlockPos pos, BlockState state, @Nullable BlockEntity blockEntity) {
        ItemStack mainHandItem = player.getMainHandStack();
        if (mainHandItem.getItem() instanceof GodToolItem godToolItem && player instanceof ServerPlayerEntity serverPlayer){
            if(HARVESTED_BLOCKS.contains(pos)){
                return true;
            }
            for(BlockPos position : GodToolItem.getBlocksToBeDestroyed(10, pos, serverPlayer)){
                if(pos == position) {
                    continue;
                }
                HARVESTED_BLOCKS.add(position);
                serverPlayer.interactionManager.tryBreakBlock(position);
                HARVESTED_BLOCKS.remove(position);
            }
        }
        return true;
    }
}
