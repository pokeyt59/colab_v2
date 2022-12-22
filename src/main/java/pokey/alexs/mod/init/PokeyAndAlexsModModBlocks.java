
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package pokey.alexs.mod.init;

import pokey.alexs.mod.block.TungstenoreBlock;
import pokey.alexs.mod.block.RiceplantBlock;
import pokey.alexs.mod.block.ReinforcedtungstenoreBlock;
import pokey.alexs.mod.block.LuminisomOreBlock;
import pokey.alexs.mod.block.LuminisomBlockBlock;
import pokey.alexs.mod.block.LightfluidblockBlock;
import pokey.alexs.mod.block.CappacitortallBlock;
import pokey.alexs.mod.PokeyAndAlexsModMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

public class PokeyAndAlexsModModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, PokeyAndAlexsModMod.MODID);
	public static final RegistryObject<Block> LUMINISOM_BLOCK = REGISTRY.register("luminisom_block", () -> new LuminisomBlockBlock());
	public static final RegistryObject<Block> LUMINISOM_ORE = REGISTRY.register("luminisom_ore", () -> new LuminisomOreBlock());
	public static final RegistryObject<Block> RICEPLANT = REGISTRY.register("riceplant", () -> new RiceplantBlock());
	public static final RegistryObject<Block> LIGHTFLUIDBLOCK = REGISTRY.register("lightfluidblock", () -> new LightfluidblockBlock());
	public static final RegistryObject<Block> TUNGSTENORE = REGISTRY.register("tungstenore", () -> new TungstenoreBlock());
	public static final RegistryObject<Block> REINFORCEDTUNGSTENORE = REGISTRY.register("reinforcedtungstenore",
			() -> new ReinforcedtungstenoreBlock());
	public static final RegistryObject<Block> CAPPACITORTALL = REGISTRY.register("cappacitortall", () -> new CappacitortallBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			RiceplantBlock.registerRenderLayer();
			CappacitortallBlock.registerRenderLayer();
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
