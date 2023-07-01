
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package pokeys.mod.reborn.init;

import pokeys.mod.reborn.PokeyModRebornMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

public class PokeyModRebornModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, PokeyModRebornMod.MODID);
	public static final RegistryObject<SoundEvent> CLASIC_LEGACY_SOUNDS_PLAYER = REGISTRY.register("clasic_legacy_sounds_player",
			() -> new SoundEvent(new ResourceLocation("pokey_mod_reborn", "clasic_legacy_sounds_player")));
	public static final RegistryObject<SoundEvent> CRUSADERS_CROSSBOW_SOUNDS = REGISTRY.register("crusaders_crossbow_sounds",
			() -> new SoundEvent(new ResourceLocation("pokey_mod_reborn", "crusaders_crossbow_sounds")));
	public static final RegistryObject<SoundEvent> TLT_THE_LIVING_TOMBSTONE = REGISTRY.register("tlt_the_living_tombstone",
			() -> new SoundEvent(new ResourceLocation("pokey_mod_reborn", "tlt_the_living_tombstone")));
	public static final RegistryObject<SoundEvent> ONENOLY = REGISTRY.register("onenoly",
			() -> new SoundEvent(new ResourceLocation("pokey_mod_reborn", "onenoly")));
	public static final RegistryObject<SoundEvent> DROWNING_POOL = REGISTRY.register("drowning_pool",
			() -> new SoundEvent(new ResourceLocation("pokey_mod_reborn", "drowning_pool")));
	public static final RegistryObject<SoundEvent> RICHAAD_EB = REGISTRY.register("richaad_eb",
			() -> new SoundEvent(new ResourceLocation("pokey_mod_reborn", "richaad_eb")));
	public static final RegistryObject<SoundEvent> SXCREDMANE = REGISTRY.register("sxcredmane",
			() -> new SoundEvent(new ResourceLocation("pokey_mod_reborn", "sxcredmane")));
	public static final RegistryObject<SoundEvent> THE_OH_HELLOS = REGISTRY.register("the_oh_hellos",
			() -> new SoundEvent(new ResourceLocation("pokey_mod_reborn", "the_oh_hellos")));
	public static final RegistryObject<SoundEvent> SOLDIER_DEATH_SOUND = REGISTRY.register("soldier_death_sound",
			() -> new SoundEvent(new ResourceLocation("pokey_mod_reborn", "soldier_death_sound")));
	public static final RegistryObject<SoundEvent> SOLDIER_PAIN_SOUND = REGISTRY.register("soldier_pain_sound",
			() -> new SoundEvent(new ResourceLocation("pokey_mod_reborn", "soldier_pain_sound")));
}
