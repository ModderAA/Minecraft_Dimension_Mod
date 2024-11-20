package net.asheranderson.mccourse.item.custom;
import net.asheranderson.mccourse.util.ModTags;
import net.minecraft.item.Item;
import net.minecraft.item.MiningToolItem;
import net.minecraft.item.ToolMaterial;
public class MultitoolItem extends MiningToolItem {

    public MultitoolItem(ToolMaterial material, Item.Settings settings) {
        super(material, ModTags.Blocks.MULTITOOL_MINEABLE, settings);
    }
}
