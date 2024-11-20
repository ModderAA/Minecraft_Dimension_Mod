package net.asheranderson.mccourse.block.custom;

import net.asheranderson.mccourse.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;

public class FlamerootCropBlock extends CropBlock {
    public FlamerootCropBlock(Settings settings) {
        super(settings);
    }
    public static final int MAX_AGE = 6;
    public static final IntProperty AGE = IntProperty.of("age", 0, 6);

    @Override
    protected ItemConvertible getSeedsItem() {
        return ModItems.FLAMEROOT_SEEDS;
    }

    @Override
    protected IntProperty getAgeProperty() {
        return AGE;
    }

    @Override
    public int getMaxAge() {
        return MAX_AGE;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(AGE);
    }
}
