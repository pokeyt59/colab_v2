
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package pokeys.mod.reborn.init;

import pokeys.mod.reborn.potion.KeylimehappynesMobEffect;
import pokeys.mod.reborn.potion.ElectracutionMobEffect;
import pokeys.mod.reborn.PokeyModRebornMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

public class PokeyModRebornModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, PokeyModRebornMod.MODID);
	public static final RegistryObject<MobEffect> KEYLIMEHAPPYNES = REGISTRY.register("keylimehappynes", () -> new KeylimehappynesMobEffect());
	public static final RegistryObject<MobEffect> ELECTRACUTION = REGISTRY.register("electracution", () -> new ElectracutionMobEffect());
}
