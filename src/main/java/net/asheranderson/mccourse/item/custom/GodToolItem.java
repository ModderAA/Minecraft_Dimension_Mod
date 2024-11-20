package net.asheranderson.mccourse.item.custom;

import net.asheranderson.mccourse.util.ModTags;
import net.minecraft.item.MiningToolItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;

import java.util.ArrayList;
import java.util.List;

public class GodToolItem extends MiningToolItem {

    public GodToolItem(ToolMaterial material, Settings settings) {
        super(material, ModTags.Blocks.NEEDS_TOOL_NOT_FOUND, settings);
    }
    public static List<BlockPos> getBlocksToBeDestroyed(int range, BlockPos initialBlockPos, ServerPlayerEntity player) {
        List<BlockPos> positions = new ArrayList<>();
        HitResult hit = player.raycast(100000, 0, true);
        if(hit.getType() == HitResult.Type.BLOCK){
            BlockHitResult blockHit = (BlockHitResult) hit;
            if(blockHit.getSide() == Direction.DOWN || blockHit.getSide() == Direction.UP){
                for(int x = -range; x <= range; x++){
                    for(int y = -range; y <= range; y++){
                        positions.add(new BlockPos(initialBlockPos.getX() + x, initialBlockPos.getY(), initialBlockPos.getZ() + y));
                    }
                }
            }
            if(blockHit.getSide() == Direction.NORTH || blockHit.getSide() == Direction.SOUTH){
                for(int x = -range; x <= range; x++){
                    for(int y = -range; y <= range; y++){
                        positions.add(new BlockPos(initialBlockPos.getX() + x, initialBlockPos.getY() + y, initialBlockPos.getZ()));
                    }
                }
            }
            if(blockHit.getSide() == Direction.EAST || blockHit.getSide() == Direction.WEST){
                for(int x = -range; x <= range; x++){
                    for(int y = -range; y <= range; y++){
                        positions.add(new BlockPos(initialBlockPos.getX(), initialBlockPos.getY() + y, initialBlockPos.getZ() + x));
                    }
                }
            }
        }
        return positions;
    }
}
