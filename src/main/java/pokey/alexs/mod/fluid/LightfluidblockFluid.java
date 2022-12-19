
package pokey.alexs.mod.fluid;

import pokey.alexs.mod.init.PokeyAndAlexsModModParticleTypes;
import pokey.alexs.mod.init.PokeyAndAlexsModModFluids;
import pokey.alexs.mod.init.PokeyAndAlexsModModBlocks;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fluids.FluidAttributes;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.item.Rarity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleOptions;

public abstract class LightfluidblockFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(PokeyAndAlexsModModFluids.LIGHTFLUIDBLOCK,
			PokeyAndAlexsModModFluids.FLOWING_LIGHTFLUIDBLOCK,
			FluidAttributes
					.builder(new ResourceLocation("pokey_and_alexs_mod:blocks/water_still_read"),
							new ResourceLocation("pokey_and_alexs_mod:blocks/water_flow_read"))
					.luminosity(100).density(200).viscosity(300).temperature(0)

					.rarity(Rarity.UNCOMMON).sound(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bucket.empty"))))
			.explosionResistance(200f).canMultiply()

			.block(() -> (LiquidBlock) PokeyAndAlexsModModBlocks.LIGHTFLUIDBLOCK.get());

	private LightfluidblockFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return (SimpleParticleType) (PokeyAndAlexsModModParticleTypes.LIGHTLIQUIDPARTICAL.get());
	}

	public static class Source extends LightfluidblockFluid {
		public Source() {
			super();
		}

		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends LightfluidblockFluid {
		public Flowing() {
			super();
		}

		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
