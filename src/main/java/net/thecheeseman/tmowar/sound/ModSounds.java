package net.thecheeseman.tmow.sound;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.thecheeseman.tmow.TheMissilesOfWar;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, TheMissilesOfWar.MOD_ID);

    public static final RegistryObject<SoundEvent> NUKACOLADRINK = registerSoundEvents("nukacoladrink");
    public static final RegistryObject<SoundEvent> silent = registerSoundEvents("silent");




    private static RegistryObject<SoundEvent> registerSoundEvents(String name) {
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(TheMissilesOfWar.MOD_ID, name)));
    }

        public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}