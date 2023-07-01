
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package pokeys.mod.reborn.init;

import pokeys.mod.reborn.world.features.plants.RiceplantFeature;
import pokeys.mod.reborn.world.features.plants.CucumberplantFeature;
import pokeys.mod.reborn.world.features.ores.TungstenoreFeature;
import pokeys.mod.reborn.world.features.ores.SaltoreFeature;
import pokeys.mod.reborn.world.features.ores.ReinforcedtungstenoreFeature;
import pokeys.mod.reborn.world.features.ores.LuminisomOreFeature;
import pokeys.mod.reborn.world.features.lakes.LightfluidblockFeature;
import pokeys.mod.reborn.PokeyModRebornMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

@Mod.EventBusSubscriber
public class PokeyModRebornModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, PokeyModRebornMod.MODID);
	public static final RegistryObject<Feature<?>> LIGHTFLUIDBLOCK = REGISTRY.register("lightfluidblock", LightfluidblockFeature::feature);
	public static final RegistryObject<Feature<?>> TUNGSTENORE = REGISTRY.register("tungstenore", TungstenoreFeature::feature);
	public static final RegistryObject<Feature<?>> REINFORCEDTUNGSTENORE = REGISTRY.register("reinforcedtungstenore",
			ReinforcedtungstenoreFeature::feature);
	public static final RegistryObject<Feature<?>> SALTORE = REGISTRY.register("saltore", SaltoreFeature::feature);
	public static final RegistryObject<Feature<?>> CUCUMBERPLANT = REGISTRY.register("cucumberplant", CucumberplantFeature::feature);
	public static final RegistryObject<Feature<?>> LUMINISOM_ORE = REGISTRY.register("luminisom_ore", LuminisomOreFeature::feature);
	public static final RegistryObject<Feature<?>> RICEPLANT = REGISTRY.register("riceplant", RiceplantFeature::feature);
}
