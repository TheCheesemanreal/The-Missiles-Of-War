package net.thecheeseman.tmowar.effect;

import com.sun.jna.platform.unix.X11;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MoverType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.DaylightDetectorBlock;
import net.thecheeseman.tmow.item.ModItems;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class DrunkEffect extends MobEffect
{
    public DrunkEffect(MobEffectCategory mobEffectCategory, int color)
    {
        super(mobEffectCategory, color);
    }
    private float healthlasttick;
    private float totaldamagetaken;
    private boolean temp = true;
    private float tempo;


    @Override
    public void applyEffectTick(@NotNull LivingEntity pLivingEntity, int pAmplifier)
    {
        boolean random1 = Math.random() < 0.5;
        boolean random2 = Math.random() < 0.5;
        boolean random3 = Math.random() < 0.5;
        boolean random4 = Math.random() < 0.5;
        boolean random5 = Math.random() < 0.5;
        boolean random6 = Math.random() < 0.5;
        boolean random7 = Math.random() < 0.5;
        boolean random8= Math.random() < 0.5;
        boolean random9 = Math.random() < 0.5;
        boolean random10 = Math.random() < 0.5;
        if (pLivingEntity instanceof Player player ) {

            player.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 300, pAmplifier));
            if (temp)
            {
                player.heal(20);

            }
            if (!temp)
            {
                tempo = totaldamagetaken;
                totaldamagetaken = healthlasttick - player.getHealth() + tempo;
                player.heal(healthlasttick - player.getHealth());
                player.onUpdateAbilities();
            }
            healthlasttick =  player.getHealth();
            temp = false;
            if (Objects.requireNonNull(player.getEffect(ModEffects.DrunkEffect.get())).getDuration() == 1)
            {
                temp = true;
                player.hurt(player.damageSources().playerAttack(player), totaldamagetaken);


            }
            if (random1)
            {
                if (random2)
                {
                    if (random3)
                    {
                        if (random4)
                        {
                            if (random5)
                            {
                                player.unRide();
                            }
                        }
                    }
                }
            }



            if (random6)
            {
                if (random7)
                {
                    if (random8)
                    {
                        if (random10)
                        {
                            if (random9)
                            {
                                if (random1)
                                {
                                    if (random2)
                                    {
                                        if (random3)
                                        {
                                            if (random4)
                                            {
                                                //random5
                                                if (true)
                                                {
                                                    player.drop(player.getMainHandItem(), false);
                                                    //eeee

                                                }
                                            }
                                        }
                                    }
                                }

                            }
                        }
                    }
                }
            }

        }

    }
    @Override
    public boolean isDurationEffectTick(int pDuration, int pAmplifier) {
        return true;
    }
}
