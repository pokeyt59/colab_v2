
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package pokey.alex.mod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PokeyAlexModModSounds {
	public static Map<ResourceLocation, SoundEvent> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(new ResourceLocation("pokey_alex_mod", "clasic_legacy_sounds_player"),
				new SoundEvent(new ResourceLocation("pokey_alex_mod", "clasic_legacy_sounds_player")));
		REGISTRY.put(new ResourceLocation("pokey_alex_mod", "clasic_legacy_sounds_music"),
				new SoundEvent(new ResourceLocation("pokey_alex_mod", "clasic_legacy_sounds_music")));
		REGISTRY.put(new ResourceLocation("pokey_alex_mod", "crusaders_crossbow_sounds"),
				new SoundEvent(new ResourceLocation("pokey_alex_mod", "crusaders_crossbow_sounds")));
		REGISTRY.put(new ResourceLocation("pokey_alex_mod", "sxcredmane"), new SoundEvent(new ResourceLocation("pokey_alex_mod", "sxcredmane")));
		REGISTRY.put(new ResourceLocation("pokey_alex_mod", "the_oh_hellos"),
				new SoundEvent(new ResourceLocation("pokey_alex_mod", "the_oh_hellos")));
		REGISTRY.put(new ResourceLocation("pokey_alex_mod", "onenoly"), new SoundEvent(new ResourceLocation("pokey_alex_mod", "onenoly")));
		REGISTRY.put(new ResourceLocation("pokey_alex_mod", "richaad_eb"), new SoundEvent(new ResourceLocation("pokey_alex_mod", "richaad_eb")));
		REGISTRY.put(new ResourceLocation("pokey_alex_mod", "drowning_pool"),
				new SoundEvent(new ResourceLocation("pokey_alex_mod", "drowning_pool")));
		REGISTRY.put(new ResourceLocation("pokey_alex_mod", "tlt_the_living_tombstone"),
				new SoundEvent(new ResourceLocation("pokey_alex_mod", "tlt_the_living_tombstone")));
	}

	@SubscribeEvent
	public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
		for (Map.Entry<ResourceLocation, SoundEvent> sound : REGISTRY.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}
}
