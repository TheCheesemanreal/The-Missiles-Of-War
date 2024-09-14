package net.thecheeseman.tmowar.sound;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModSounds {
    // Assuming that your mod id is examplemod
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(BuiltInRegistries.SOUND_EVENT, "examplemod");

    // All vanilla sounds use variable range events.
    public static final DeferredHolder<SoundEvent, SoundEvent> NUKACOLADRINK = SOUND_EVENTS.register(
            "nukacoladrink", // must match the resource location on the next line
            () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("tmowar", "nukacoladrink")));
    public static final DeferredHolder<SoundEvent, SoundEvent> silent = SOUND_EVENTS.register(
            "silent", // must match the resource location on the next line
            () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("tmowar", "silent")));

}