
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package pokey.alex.mod.init;

import pokey.alex.mod.block.TungstenoreBlock;
import pokey.alex.mod.block.SaltoreBlock;
import pokey.alex.mod.block.RiceplantBlock;
import pokey.alex.mod.block.ReinforcedtungstenoreBlock;
import pokey.alex.mod.block.LuminisomOreBlock;
import pokey.alex.mod.block.LuminisomBlockBlock;
import pokey.alex.mod.block.LightfluidblockBlock;
import pokey.alex.mod.block.CucumberplantBlock;
import pokey.alex.mod.PokeyAlexModMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

public class PokeyAlexModModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, PokeyAlexModMod.MODID);
	public static final RegistryObject<Block> LIGHTFLUIDBLOCK = REGISTRY.register("lightfluidblock", () -> new LightfluidblockBlock());
	public static final RegistryObject<Block> TUNGSTENORE = REGISTRY.register("tungstenore", () -> new TungstenoreBlock());
	public static final RegistryObject<Block> REINFORCEDTUNGSTENORE = REGISTRY.register("reinforcedtungstenore",
			() -> new ReinforcedtungstenoreBlock());
	public static final RegistryObject<Block> SALTORE = REGISTRY.register("saltore", () -> new SaltoreBlock());
	public static final RegistryObject<Block> CUCUMBERPLANT = REGISTRY.register("cucumberplant", () -> new CucumberplantBlock());
	public static final RegistryObject<Block> LUMINISOM_BLOCK = REGISTRY.register("luminisom_block", () -> new LuminisomBlockBlock());
	public static final RegistryObject<Block> LUMINISOM_ORE = REGISTRY.register("luminisom_ore", () -> new LuminisomOreBlock());
	public static final RegistryObject<Block> RICEPLANT = REGISTRY.register("riceplant", () -> new RiceplantBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			CucumberplantBlock.registerRenderLayer();
			RiceplantBlock.registerRenderLayer();
		}

		@SubscribeEvent
		public static void blockColorLoad(ColorHandlerEvent.Block event) {
			RiceplantBlock.blockColorLoad(event);
		}

		@SubscribeEvent
		public static void itemColorLoad(ColorHandlerEvent.Item event) {
			RiceplantBlock.itemColorLoad(event);
		}
	}
}
