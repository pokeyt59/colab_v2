
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package pokey.alex.mod.init;

import pokey.alex.mod.PokeyAlexModMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

public class PokeyAlexModModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, PokeyAlexModMod.MODID);
	public static final RegistryObject<Potion> TESTPOTIONITEM = REGISTRY.register("testpotionitem",
			() -> new Potion(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3700, 9, false, true)));
}
