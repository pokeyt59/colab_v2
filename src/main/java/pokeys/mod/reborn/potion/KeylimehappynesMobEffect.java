
package pokeys.mod.reborn.potion;

import pokeys.mod.reborn.procedures.KlsProcedure;
import pokeys.mod.reborn.procedures.KlhcrProcedure;
import pokeys.mod.reborn.procedures.KlhProcedure;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class KeylimehappynesMobEffect extends MobEffect {
	public KeylimehappynesMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -1);
	}

	@Override
	public String getDescriptionId() {
		return "effect.pokey_mod_reborn.keylimehappynes";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		KlhProcedure.execute(entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		KlhcrProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		KlsProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
