package net.thecheeseman.tmowar.effect;



import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;

import org.jetbrains.annotations.NotNull;


import java.util.Objects;


public class FlyingEffect extends MobEffect {

    public FlyingEffect(MobEffectCategory mobEffectCategory, int color) {
        super(mobEffectCategory, color);
    }



    @Override
    public boolean applyEffectTick(@NotNull LivingEntity pLivingEntity, int pAmplifier)
    {
        if (pLivingEntity instanceof Player player && !player.getAbilities().mayfly) {
            player.mayFly();
            player.onUpdateAbilities();
        }
        else if (pLivingEntity instanceof Player player)
        {
            if ((Objects.requireNonNull(pLivingEntity.getEffect(ModEffects.FlyingEffect))).getDuration() == 1 && !((Player) pLivingEntity).isCreative())
            {
                player.getAbilities().mayfly= false;
                player.getAbilities().flying = false;

            }

        }
        return true;
    }

}





