
package pokeys.mod.reborn.world.biome;

import pokeys.mod.reborn.world.features.treedecorators.ErsmTrunkDecorator;
import pokeys.mod.reborn.world.features.treedecorators.ErsmLeaveDecorator;
import pokeys.mod.reborn.world.features.treedecorators.ErsmFruitDecorator;

import net.minecraft.world.level.levelgen.placement.SurfaceWaterDepthFilter;
import net.minecraft.world.level.levelgen.placement.RarityFilter;
import net.minecraft.world.level.levelgen.placement.NoiseThresholdCountPlacement;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.biome.Climate;
import net.minecraft.world.level.biome.BiomeSpecialEffects;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.features.VegetationFeatures;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;

import java.util.List;

import com.google.common.collect.ImmutableList;

public class ErsmBiome {
	public static final Climate.ParameterPoint PARAMETER_POINT = new Climate.ParameterPoint(Climate.Parameter.span(-0.033333333333f, 0.033333333333f),
			Climate.Parameter.span(-0.033333333333f, 0.033333333333f), Climate.Parameter.span(0.476666666667f, 0.543333333333f),
			Climate.Parameter.span(0.766666666667f, 0.833333333333f), Climate.Parameter.point(0),
			Climate.Parameter.span(-0.35062668033f, -0.283960013664f), 0);
	public static final Climate.ParameterPoint PARAMETER_POINT_UNDERGROUND = new Climate.ParameterPoint(Climate.Parameter.span(-1, 1),
			Climate.Parameter.span(-1, 1), Climate.Parameter.span(0.31f, 0.71f), Climate.Parameter.span(0.6f, 1f), Climate.Parameter.span(0.2f, 0.9f),
			Climate.Parameter.span(-0.517293346997f, -0.117293346997f), 0);

	public static Biome createBiome() {
		BiomeSpecialEffects effects = new BiomeSpecialEffects.Builder().fogColor(12638463).waterColor(4159204).waterFogColor(329011).skyColor(7972607)
				.foliageColorOverride(10387789).grassColorOverride(9470285).build();
		BiomeGenerationSettings.Builder biomeGenerationSettings = new BiomeGenerationSettings.Builder();
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
				PlacementUtils.register("pokey_mod_reborn:tree_ersm", FeatureUtils.register("pokey_mod_reborn:tree_ersm", Feature.TREE,
						new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(Blocks.BUDDING_AMETHYST.defaultBlockState()),
								new StraightTrunkPlacer(7, 2, 0), BlockStateProvider.simple(Blocks.AMETHYST_BLOCK.defaultBlockState()),
								new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3), new TwoLayersFeatureSize(1, 0, 1))
								.decorators(ImmutableList.of(ErsmLeaveDecorator.INSTANCE, ErsmTrunkDecorator.INSTANCE, ErsmFruitDecorator.INSTANCE))
								.build()),
						List.of(CountPlacement.of(1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0),
								PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING),
								BiomeFilter.biome())));
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
				PlacementUtils.register("pokey_mod_reborn:grass_ersm", VegetationFeatures.PATCH_GRASS,
						List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 2), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
								BiomeFilter.biome())));
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
				PlacementUtils.register("pokey_mod_reborn:flower_ersm", VegetationFeatures.FLOWER_DEFAULT, List.of(CountPlacement.of(2),
						RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome())));
		BiomeDefaultFeatures.addSurfaceFreezing(biomeGenerationSettings);
		MobSpawnSettings.Builder mobSpawnInfo = new MobSpawnSettings.Builder();
		mobSpawnInfo.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.AXOLOTL, 20, 4, 4));
		return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.RAIN).temperature(0.5f).downfall(0.5f).specialEffects(effects)
				.mobSpawnSettings(mobSpawnInfo.build()).generationSettings(biomeGenerationSettings.build()).build();
	}
}
