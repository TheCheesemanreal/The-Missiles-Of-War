package net.thecheeseman.tmowar.effect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class ImmunityEffect extends MobEffect
{
    public ImmunityEffect(MobEffectCategory category, int color)
    {
        super(category, color);
    }
    @Override
    public boolean shouldApplyEffectTickThisTick(int tickCount, int amplifier) {
        return true; // replace this with whatever check you want
    }

    @Override
    public void onEffectAdded(LivingEntity entity, int amplifier) {
        super.onEffectAdded(entity, amplifier);
    }
    @Override
    public void onEffectStarted(LivingEntity entity, int amplifier) {
    }

    @Override
    public boolean applyEffectTick(@NotNull LivingEntity pLivingEntity, int pAmplifier) {
        if (pLivingEntity instanceof Player player) {
            player.removeEffect(MobEffects.WITHER);
            player.removeEffect(MobEffects.POISON);
            player.removeEffect(MobEffects.CONFUSION);
            player.removeEffect(MobEffects.DARKNESS);
            player.removeEffect(MobEffects.INFESTED);
            player.removeEffect(MobEffects.WEAVING);
            player.removeEffect(MobEffects.OOZING);

        }
        return true;
    }
}
