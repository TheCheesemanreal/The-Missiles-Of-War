package net.thecheeseman.tmowar.effect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class DrunkEffect extends MobEffect {
    public DrunkEffect(MobEffectCategory category, int color)
    {
        super(category, color);
    }

    private float healthlasttick;
    private float totaldamagetaken;
    private boolean temp = true;
    private float tempo;

    @Override
    public boolean shouldApplyEffectTickThisTick(int tickCount, int amplifier) {
        return true; // replace this with whatever check you want
    }

    @Override
    public void onEffectAdded(LivingEntity entity, int amplifier) {
        entity.heal(20);
        super.onEffectAdded(entity, amplifier);
        totaldamagetaken = 0;
    }
    @Override
    public void onEffectStarted(LivingEntity entity, int amplifier) {
    }

    @Override
    public boolean applyEffectTick(@NotNull LivingEntity pLivingEntity, int pAmplifier) {
        boolean random1 = Math.random() < 0.5;
        boolean random2 = Math.random() < 0.5;
        boolean random3 = Math.random() < 0.5;
        boolean random4 = Math.random() < 0.5;
        boolean random5 = Math.random() < 0.5;
        boolean random6 = Math.random() < 0.5;
        boolean random7 = Math.random() < 0.5;
        boolean random8 = Math.random() < 0.5;
        boolean random9 = Math.random() < 0.5;
        if (pLivingEntity instanceof Player player) {

            player.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 300, pAmplifier));
            if (!temp)
            {
                tempo = totaldamagetaken;
                totaldamagetaken = healthlasttick - player.getHealth() + tempo;
                player.heal(healthlasttick - player.getHealth());
            }
            healthlasttick = player.getHealth();
            temp = false;
            if (Objects.requireNonNull(player.getEffect(ModEffects.DrunkEffect)).getDuration() == 1)
            {
                temp = true;
                player.hurt(player.damageSources().playerAttack(player), totaldamagetaken*2);
                player.isInPowderSnow = false;
            }
            if (random1 && random2 && random3 && random4 && random5)
            {
                player.unRide();
            }
            if (random6 && random7 && random8 && random9 && random1 && random2 && random3 && random4 && random5)
            {
                player.isInPowderSnow = true;
            }

        }
    return true;
    }
}
