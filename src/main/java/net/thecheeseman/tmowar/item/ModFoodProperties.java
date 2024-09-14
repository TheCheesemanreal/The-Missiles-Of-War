package net.thecheeseman.tmowar.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.thecheeseman.tmowar.effect.ModEffects;

public class ModFoodProperties {
    public static final FoodProperties NukaCola = new FoodProperties.Builder()
            .nutrition(10)
            .saturationModifier(1.2f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 300), 1)
            .build();
    public static final FoodProperties NukaColaQuantum = new FoodProperties.Builder()
            .nutrition(10)
            .saturationModifier(1.2f)
            .effect(() ->  new MobEffectInstance(MobEffects.MOVEMENT_SPEED,300, 4), 1)
            .build();

    public static final FoodProperties NukaColaDark = new FoodProperties.Builder()
            .nutrition(10)
            .saturationModifier(1.2f)
            .effect(() ->  new MobEffectInstance(MobEffects.NIGHT_VISION,300), 1)
            .build();

    public static final FoodProperties NukaColaOrange = new FoodProperties.Builder()
            .nutrition(10)
            .saturationModifier(1.2f)
            .effect(() ->  new MobEffectInstance(MobEffects.JUMP,300, 4), 1)
            .build();

    public static final FoodProperties NukaColaQuartz = new FoodProperties.Builder()
            .nutrition(10).saturationModifier(1.2f)
            .effect(() ->  new MobEffectInstance(MobEffects.GLOWING,300, 1), 1)
            .effect(() -> new MobEffectInstance(ModEffects.FlyingEffect, 280, 14), 1)
            .build();

    public static final FoodProperties NukaColaVictory = new FoodProperties.Builder()
            .nutrition(10)
            .saturationModifier(1.2f)
            .effect(() ->  new MobEffectInstance(MobEffects.DAMAGE_BOOST,300, 1), 1)
            .effect(() -> new MobEffectInstance(ModEffects.RageEffect, 500, 4),1)
            .build();

    public static final FoodProperties NukaColaGrape = new FoodProperties.Builder()
            .nutrition(10)
            .saturationModifier(1.2f)
            .effect(() ->  new MobEffectInstance(ModEffects.DrunkEffect,300, 4), 1)
            .build();
}