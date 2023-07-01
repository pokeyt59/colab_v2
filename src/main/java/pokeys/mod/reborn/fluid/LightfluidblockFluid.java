
package pokeys.mod.reborn.fluid;

import pokeys.mod.reborn.init.PokeyModRebornModParticleTypes;
import pokeys.mod.reborn.init.PokeyModRebornModFluids;
import pokeys.mod.reborn.init.PokeyModRebornModFluidTypes;
import pokeys.mod.reborn.init.PokeyModRebornModBlocks;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleOptions;

public abstract class LightfluidblockFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(
			() -> PokeyModRebornModFluidTypes.LIGHTFLUIDBLOCK_TYPE.get(), () -> PokeyModRebornModFluids.LIGHTFLUIDBLOCK.get(),
			() -> PokeyModRebornModFluids.FLOWING_LIGHTFLUIDBLOCK.get()).explosionResistance(200f)
			.block(() -> (LiquidBlock) PokeyModRebornModBlocks.LIGHTFLUIDBLOCK.get());

	private LightfluidblockFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return (SimpleParticleType) (PokeyModRebornModParticleTypes.LIGHTLIQUIDPARTICAL.get());
	}

	public static class Source extends LightfluidblockFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends LightfluidblockFluid {
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
