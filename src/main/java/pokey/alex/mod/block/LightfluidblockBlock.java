
package pokey.alex.mod.block;

import pokey.alex.mod.init.PokeyAlexModModFluids;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class LightfluidblockBlock extends LiquidBlock {
	public LightfluidblockBlock() {
		super(() -> (FlowingFluid) PokeyAlexModModFluids.LIGHTFLUIDBLOCK.get(), BlockBehaviour.Properties.of(Material.WATER).strength(200f)
				.hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).lightLevel(s -> 15));
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}
}
