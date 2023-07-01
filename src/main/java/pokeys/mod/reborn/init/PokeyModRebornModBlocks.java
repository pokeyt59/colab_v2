
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package pokeys.mod.reborn.init;

import pokeys.mod.reborn.block.TungstenoreBlock;
import pokeys.mod.reborn.block.SaltoreBlock;
import pokeys.mod.reborn.block.RiceplantBlock;
import pokeys.mod.reborn.block.ReinforcedtungstenoreBlock;
import pokeys.mod.reborn.block.PabattblockBlock;
import pokeys.mod.reborn.block.LuminisomOreBlock;
import pokeys.mod.reborn.block.LuminisomBlockBlock;
import pokeys.mod.reborn.block.LightfluidblockBlock;
import pokeys.mod.reborn.block.CucumberplantBlock;
import pokeys.mod.reborn.PokeyModRebornMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

public class PokeyModRebornModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, PokeyModRebornMod.MODID);
	public static final RegistryObject<Block> LIGHTFLUIDBLOCK = REGISTRY.register("lightfluidblock", () -> new LightfluidblockBlock());
	public static final RegistryObject<Block> TUNGSTENORE = REGISTRY.register("tungstenore", () -> new TungstenoreBlock());
	public static final RegistryObject<Block> REINFORCEDTUNGSTENORE = REGISTRY.register("reinforcedtungstenore",
			() -> new ReinforcedtungstenoreBlock());
	public static final RegistryObject<Block> SALTORE = REGISTRY.register("saltore", () -> new SaltoreBlock());
	public static final RegistryObject<Block> CUCUMBERPLANT = REGISTRY.register("cucumberplant", () -> new CucumberplantBlock());
	public static final RegistryObject<Block> LUMINISOM_BLOCK = REGISTRY.register("luminisom_block", () -> new LuminisomBlockBlock());
	public static final RegistryObject<Block> LUMINISOM_ORE = REGISTRY.register("luminisom_ore", () -> new LuminisomOreBlock());
	public static final RegistryObject<Block> RICEPLANT = REGISTRY.register("riceplant", () -> new RiceplantBlock());
	public static final RegistryObject<Block> PABATTBLOCK = REGISTRY.register("pabattblock", () -> new PabattblockBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void blockColorLoad(RegisterColorHandlersEvent.Block event) {
			RiceplantBlock.blockColorLoad(event);
		}

		@SubscribeEvent
		public static void itemColorLoad(RegisterColorHandlersEvent.Item event) {
			RiceplantBlock.itemColorLoad(event);
		}
	}
}
