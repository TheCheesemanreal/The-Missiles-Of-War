package net.thecheeseman.tmowar.effect;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageSources;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import org.jetbrains.annotations.NotNull;

public class DarkEffect extends MobEffect
{

    protected DarkEffect(MobEffectCategory category, int color)
    {
        super(category, color);
    }

    @Override
    public boolean applyEffectTick(LivingEntity entity, int amplifier) {
        if (entity instanceof Player player && player.isSprinting())
        {
            player.heal(1);
        }
        else if (entity instanceof Player player)
        {
            player.hurt(player.damageSources().wither(), 5);

        }
        return true;
    }

    // Whether the effect should apply this tick. Used e.g. by the Regeneration effect that only applies
    // once every x ticks, depending on the tick count and amplifier.
    @Override
    public boolean shouldApplyEffectTickThisTick(int tickCount, int amplifier) {
        return tickCount % 3 == 0;
    }

    // Utility method that is called when the effect is first added to the entity.
    // This does not get called again until all instances of this effect have been removed from the entity.
    @Override
    public void onEffectAdded(@NotNull LivingEntity entity, int amplifier) {
        super.onEffectAdded(entity, amplifier);
    }

    // Utility method that is called when the effect is added to the entity.
    // This gets called every time this effect is added to the entity.
    @Override
    public void onEffectStarted(@NotNull LivingEntity entity, int amplifier) {
    }
}
