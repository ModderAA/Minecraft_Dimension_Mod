package net.asheranderson.mccourse;
import net.asheranderson.mccourse.block.ModBlocks;
import net.asheranderson.mccourse.effect.ModEffects;
import net.asheranderson.mccourse.item.ModItemGroups;
import net.asheranderson.mccourse.item.ModItems;
import net.asheranderson.mccourse.util.GodToolUsageEvent;
import net.asheranderson.mccourse.util.HammerUsageEvent;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class MCCourseMod implements ModInitializer {
	public static final String MOD_ID = "mccourse";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModEffects.registerEffects();
		FuelRegistry.INSTANCE.add(ModItems.SOULFIRE_CORE, 32767);
		PlayerBlockBreakEvents.BEFORE.register(new GodToolUsageEvent());
		PlayerBlockBreakEvents.BEFORE.register(new HammerUsageEvent());
	}
}