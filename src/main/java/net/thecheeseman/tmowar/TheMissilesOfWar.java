package net.thecheeseman.tmowar;

import net.minecraft.world.item.CreativeModeTabs;
import net.thecheeseman.tmowar.effect.ModEffects;
import net.thecheeseman.tmowar.item.ModFoodProperties;
import net.thecheeseman.tmowar.item.ModItems;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import net.thecheeseman.tmowar.sound.ModSounds;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(TheMissilesOfWar.MODID)
public class TheMissilesOfWar
{
    public static final String MODID = "tmowar";
    private static final Logger LOGGER = LogUtils.getLogger();
    public TheMissilesOfWar(IEventBus modEventBus, ModContainer modContainer)
    {
        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);
        // Register ourselves for server and other game events we are interested in.
        // Note that this is necessary if and only if we want *this* class (ExampleMod) to respond directly to events.
        // Do not add this line if there are no @SubscribeEvent-annotated functions in this class, like onServerStarting() below.
        NeoForge.EVENT_BUS.register(this);
        ModSounds.SOUND_EVENTS.register(modEventBus);
        ModItems.register(modEventBus);
        ModEffects.register(modEventBus);
        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);

        // Register our mod's ModConfigSpec so that FML can create and load the config file for us
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }
    private void commonSetup(final FMLCommonSetupEvent event)
    {
    }
    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {
        if(event.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
            event.accept(ModItems.NukaCola);
            event.accept(ModItems.NukaColaDark);
            event.accept(ModItems.NukaColaGrape);
            event.accept(ModItems.NukaColaOrange);
            event.accept(ModItems.NukaColaQuartz);
            event.accept(ModItems.NukaColaQuantum);
            event.accept(ModItems.NukaColaVictory);
        }
    }
    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        // Do something when the server starts
        LOGGER.info("TMOWAR BOOTING UP. PREPARE FOR DESTRUCTION.");
    }
    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @EventBusSubscriber(modid = MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
        }
    }
}
