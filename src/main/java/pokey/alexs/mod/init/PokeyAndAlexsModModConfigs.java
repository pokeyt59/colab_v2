package pokey.alexs.mod.init;

import pokey.alexs.mod.configuration.TestconfigConfiguration;
import pokey.alexs.mod.PokeyAndAlexsModMod;

import net.minecraftforge.fml.event.lifecycle.FMLConstructModEvent;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.eventbus.api.SubscribeEvent;

@Mod.EventBusSubscriber(modid = PokeyAndAlexsModMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class PokeyAndAlexsModModConfigs {
	@SubscribeEvent
	public static void register(FMLConstructModEvent event) {
		event.enqueueWork(() -> {
			ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, TestconfigConfiguration.SPEC, "pokey and alex's mod config.toml");
		});
	}
}
