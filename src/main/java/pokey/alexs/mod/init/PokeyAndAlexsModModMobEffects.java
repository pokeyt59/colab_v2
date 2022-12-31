
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package pokey.alexs.mod.init;

import pokey.alexs.mod.potion.KeylimehappynesMobEffect;
import pokey.alexs.mod.PokeyAndAlexsModMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

public class PokeyAndAlexsModModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, PokeyAndAlexsModMod.MODID);
	public static final RegistryObject<MobEffect> KEYLIMEHAPPYNES = REGISTRY.register("keylimehappynes", () -> new KeylimehappynesMobEffect());
}
