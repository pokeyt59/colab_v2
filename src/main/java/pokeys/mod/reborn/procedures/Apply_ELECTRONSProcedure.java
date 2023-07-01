package pokeys.mod.reborn.procedures;

import pokeys.mod.reborn.init.PokeyModRebornModMobEffects;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

public class Apply_ELECTRONSProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(PokeyModRebornModMobEffects.ELECTRACUTION.get(), 10, 1));
	}
}
