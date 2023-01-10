
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package pokey.alexs.mod.init;

import pokey.alexs.mod.world.features.plants.RiceplantFeature;
import pokey.alexs.mod.world.features.plants.CucumberplantFeature;
import pokey.alexs.mod.world.features.ores.TungstenoreFeature;
import pokey.alexs.mod.world.features.ores.SaltoreFeature;
import pokey.alexs.mod.world.features.ores.ReinforcedtungstenoreFeature;
import pokey.alexs.mod.world.features.ores.LuminisomOreFeature;
import pokey.alexs.mod.world.features.lakes.LightfluidblockFeature;
import pokey.alexs.mod.PokeyAndAlexsModMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Holder;

import java.util.function.Supplier;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber
public class PokeyAndAlexsModModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, PokeyAndAlexsModMod.MODID);
	private static final List<FeatureRegistration> FEATURE_REGISTRATIONS = new ArrayList<>();
	public static final RegistryObject<Feature<?>> LIGHTFLUIDBLOCK = register("lightfluidblock", LightfluidblockFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.LAKES, LightfluidblockFeature.GENERATE_BIOMES, LightfluidblockFeature::placedFeature));
	public static final RegistryObject<Feature<?>> LUMINISOM_ORE = register("luminisom_ore", LuminisomOreFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, LuminisomOreFeature.GENERATE_BIOMES, LuminisomOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> RICEPLANT = register("riceplant", RiceplantFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, RiceplantFeature.GENERATE_BIOMES, RiceplantFeature::placedFeature));
	public static final RegistryObject<Feature<?>> TUNGSTENORE = register("tungstenore", TungstenoreFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, TungstenoreFeature.GENERATE_BIOMES, TungstenoreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> REINFORCEDTUNGSTENORE = register("reinforcedtungstenore", ReinforcedtungstenoreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, ReinforcedtungstenoreFeature.GENERATE_BIOMES,
					ReinforcedtungstenoreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> CUCUMBERPLANT = register("cucumberplant", CucumberplantFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, CucumberplantFeature.GENERATE_BIOMES, CucumberplantFeature::placedFeature));
	public static final RegistryObject<Feature<?>> SALTORE = register("saltore", SaltoreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, SaltoreFeature.GENERATE_BIOMES, SaltoreFeature::placedFeature));

	private static RegistryObject<Feature<?>> register(String registryname, Supplier<Feature<?>> feature, FeatureRegistration featureRegistration) {
		FEATURE_REGISTRATIONS.add(featureRegistration);
		return REGISTRY.register(registryname, feature);
	}

	@SubscribeEvent
	public static void addFeaturesToBiomes(BiomeLoadingEvent event) {
		for (FeatureRegistration registration : FEATURE_REGISTRATIONS) {
			if (registration.biomes() == null || registration.biomes().contains(event.getName()))
				event.getGeneration().getFeatures(registration.stage()).add(registration.placedFeature().get());
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes,
			Supplier<Holder<PlacedFeature>> placedFeature) {
	}
}
