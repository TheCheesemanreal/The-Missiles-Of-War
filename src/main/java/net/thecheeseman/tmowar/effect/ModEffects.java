package net.thecheeseman.tmowar.effect;


import net.minecraft.core.registries.Registries;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import net.thecheeseman.tmowar.TheMissilesOfWar;

import java.util.function.Supplier;

public class ModEffects {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS = DeferredRegister.create(Registries.MOB_EFFECT, TheMissilesOfWar.MODID);

    public static final Supplier<DrunkEffect> DrunkEffect = MOB_EFFECTS.register("drunk", () -> new DrunkEffect(
            //Can be either BENEFICIAL, NEUTRAL or HARMFUL. Used to determine the potion tooltip color of this effect.
            MobEffectCategory.BENEFICIAL,
            //The color of the effect particles.
            0xffffff
    ));
    public static final Supplier<FlyingEffect> FlyingEffect = MOB_EFFECTS.register("flying", () -> new FlyingEffect(
            //Can be either BENEFICIAL, NEUTRAL or HARMFUL. Used to determine the potion tooltip color of this effect.
            MobEffectCategory.BENEFICIAL,
            //The color of the effect particles.
            0xffffff
    ));


    public static void register(IEventBus eventBus) {
        MOB_EFFECTS.register(eventBus);

    }
}
