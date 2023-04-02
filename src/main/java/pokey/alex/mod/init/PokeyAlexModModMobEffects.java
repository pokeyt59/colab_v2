
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package pokey.alex.mod.init;

import pokey.alex.mod.potion.KeylimehappynesMobEffect;
import pokey.alex.mod.potion.ElectracutionMobEffect;
import pokey.alex.mod.PokeyAlexModMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

public class PokeyAlexModModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, PokeyAlexModMod.MODID);
	public static final RegistryObject<MobEffect> KEYLIMEHAPPYNES = REGISTRY.register("keylimehappynes", () -> new KeylimehappynesMobEffect());
	public static final RegistryObject<MobEffect> ELECTRACUTION = REGISTRY.register("electracution", () -> new ElectracutionMobEffect());
}
