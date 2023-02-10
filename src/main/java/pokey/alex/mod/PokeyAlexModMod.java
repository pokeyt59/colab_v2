/*
 *    MCreator note:
 *
 *    If you lock base mod element files, you can edit this file and it won't get overwritten.
 *    If you change your modid or package, you need to apply these changes to this file MANUALLY.
 *
 *    Settings in @Mod annotation WON'T be changed in case of the base mod element
 *    files lock too, so you need to set them manually here in such case.
 *
 *    If you do not lock base mod element files in Workspace settings, this file
 *    will be REGENERATED on each build.
 *
 */
package pokey.alex.mod;

import pokey.alex.mod.init.PokeyAlexModModTabs;
import pokey.alex.mod.init.PokeyAlexModModPotions;
import pokey.alex.mod.init.PokeyAlexModModParticleTypes;
import pokey.alex.mod.init.PokeyAlexModModMobEffects;
import pokey.alex.mod.init.PokeyAlexModModItems;
import pokey.alex.mod.init.PokeyAlexModModFluids;
import pokey.alex.mod.init.PokeyAlexModModFeatures;
import pokey.alex.mod.init.PokeyAlexModModEntities;
import pokey.alex.mod.init.PokeyAlexModModBlocks;
import pokey.alex.mod.init.PokeyAlexModModBiomes;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.minecraftforge.network.simple.SimpleChannel;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.IEventBus;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;

import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.BiConsumer;

@Mod("pokey_alex_mod")
public class PokeyAlexModMod {
	public static final Logger LOGGER = LogManager.getLogger(PokeyAlexModMod.class);
	public static final String MODID = "pokey_alex_mod";
	private static final String PROTOCOL_VERSION = "1";
	public static final SimpleChannel PACKET_HANDLER = NetworkRegistry.newSimpleChannel(new ResourceLocation(MODID, MODID), () -> PROTOCOL_VERSION,
			PROTOCOL_VERSION::equals, PROTOCOL_VERSION::equals);
	private static int messageID = 0;

	public PokeyAlexModMod() {
		PokeyAlexModModTabs.load();
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		PokeyAlexModModBlocks.REGISTRY.register(bus);
		PokeyAlexModModItems.REGISTRY.register(bus);
		PokeyAlexModModEntities.REGISTRY.register(bus);

		PokeyAlexModModFeatures.REGISTRY.register(bus);
		PokeyAlexModModFluids.REGISTRY.register(bus);

		PokeyAlexModModMobEffects.REGISTRY.register(bus);
		PokeyAlexModModPotions.REGISTRY.register(bus);
		PokeyAlexModModBiomes.REGISTRY.register(bus);
		PokeyAlexModModParticleTypes.REGISTRY.register(bus);
	}

	public static <T> void addNetworkMessage(Class<T> messageType, BiConsumer<T, FriendlyByteBuf> encoder, Function<FriendlyByteBuf, T> decoder,
			BiConsumer<T, Supplier<NetworkEvent.Context>> messageConsumer) {
		PACKET_HANDLER.registerMessage(messageID, messageType, encoder, decoder, messageConsumer);
		messageID++;
	}
}
