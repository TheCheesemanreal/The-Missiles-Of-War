package net.thecheeseman.tmowar.effect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class RageEffect extends MobEffect
{
    public RageEffect(MobEffectCategory category, int color)
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
        super.onEffectAdded(entity, amplifier);
    }
    @Override
    public void onEffectStarted(LivingEntity entity, int amplifier) {
    }

    @Override
    public boolean applyEffectTick(@NotNull LivingEntity pLivingEntity, int pAmplifier) {
        if (pLivingEntity instanceof Player player) {
            if (!temp)
            {
                tempo = totaldamagetaken;
                totaldamagetaken = healthlasttick - player.getHealth() + tempo;
                player.heal((float) ((healthlasttick - player.getHealth())*0.8));
            }
            healthlasttick = player.getHealth();
            temp = false;
            if (Objects.requireNonNull(player.getEffect(ModEffects.RageEffect)).getDuration() == 1)
            {
                temp = true;
                player.hurt(player.damageSources().playerAttack(player), (float) (totaldamagetaken * 1.1));
            }

        }
        return true;
    }
}
