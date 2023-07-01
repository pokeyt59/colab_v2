
package pokeys.mod.reborn.potion;

import pokeys.mod.reborn.procedures.ELECTRONSProcedure;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class ElectracutionMobEffect extends MobEffect {
	public ElectracutionMobEffect() {
		super(MobEffectCategory.HARMFUL, -1);
	}

	@Override
	public String getDescriptionId() {
		return "effect.pokey_mod_reborn.electracution";
	}

	@Override
	public boolean isInstantenous() {
		return true;
	}

	@Override
	public void applyInstantenousEffect(Entity source, Entity indirectSource, LivingEntity entity, int amplifier, double health) {
		ELECTRONSProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
