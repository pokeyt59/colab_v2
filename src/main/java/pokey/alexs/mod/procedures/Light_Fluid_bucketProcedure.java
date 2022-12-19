package pokey.alexs.mod.procedures;

import pokey.alexs.mod.init.PokeyAndAlexsModModBlocks;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

public class Light_Fluid_bucketProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!(PokeyAndAlexsModModBlocks.LIGHTFLUIDBLOCK.get().defaultBlockState()
				.getMaterial() == net.minecraft.world.level.material.Material.WATER)) {
			world.setBlock(new BlockPos(1 + entity.getLookAngle().x, 1 + entity.getLookAngle().y, 1 + entity.getLookAngle().z),
					PokeyAndAlexsModModBlocks.LIGHTFLUIDBLOCK.get().defaultBlockState(), 3);
		}
	}
}
