
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package pokeys.mod.reborn.init;

import pokeys.mod.reborn.PokeyModRebornMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

public class PokeyModRebornModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, PokeyModRebornMod.MODID);
	public static final RegistryObject<Potion> TESTPOTIONITEM = REGISTRY.register("testpotionitem",
			() -> new Potion(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3700, 9, false, true)));
}
