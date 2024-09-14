package net.thecheeseman.tmowar.effect;


import net.minecraft.core.registries.Registries;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import net.thecheeseman.tmowar.TheMissilesOfWar;

public class ModEffects {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS = DeferredRegister.create(Registries.MOB_EFFECT, TheMissilesOfWar.MODID);

    public static final DeferredHolder<MobEffect, DrunkEffect> DrunkEffect = MOB_EFFECTS.register("drunk", () -> new DrunkEffect(
            //Can be either BENEFICIAL, NEUTRAL or HARMFUL. Used to determine the potion tooltip color of this effect.
            MobEffectCategory.BENEFICIAL,
            //The color of the effect particles.
            0xffffff
    ));
    public static final DeferredHolder<MobEffect, RageEffect> RageEffect = MOB_EFFECTS.register("rage", () -> new RageEffect(
            //Can be either BENEFICIAL, NEUTRAL or HARMFUL. Used to determine the potion tooltip color of this effect.
            MobEffectCategory.BENEFICIAL,
            //The color of the effect particles.
            0xffffff
    ));
    public static final DeferredHolder<MobEffect, FlyingEffect> FlyingEffect = MOB_EFFECTS.register("flying", () -> new FlyingEffect(
            //Can be either BENEFICIAL, NEUTRAL or HARMFUL. Used to determine the potion tooltip color of this effect.
            MobEffectCategory.BENEFICIAL,
            //The color of the effect particles.
            0xffffff
    ));
    public static final DeferredHolder<MobEffect, ImmunityEffect> ImmunityEffect = MOB_EFFECTS.register("immunity", () -> new ImmunityEffect(
            //Can be either BENEFICIAL, NEUTRAL or HARMFUL. Used to determine the potion tooltip color of this effect.
            MobEffectCategory.BENEFICIAL,
            //The color of the effect particles.
            0xffffff
    ));
    public static final DeferredHolder<MobEffect, DarkEffect> DarkEffect = MOB_EFFECTS.register("dark", () -> new DarkEffect(
            //Can be either BENEFICIAL, NEUTRAL or HARMFUL. Used to determine the potion tooltip color of this effect.
            MobEffectCategory.BENEFICIAL,
            //The color of the effect particles.
            0xffffff
    ));


    public static void register(IEventBus eventBus) {
        MOB_EFFECTS.register(eventBus);

    }
}
