package net.asheranderson.mccourse.util;

import net.asheranderson.mccourse.item.ModItems;
import net.minecraft.block.ComposterBlock;

public class ModRegistries {
    private static void registerModCompostables(){
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.FLAMEROOT, 0.75f);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.FLAMEROOT_SEEDS, 0.5f);
    }
}
