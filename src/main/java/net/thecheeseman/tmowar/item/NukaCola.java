package net.thecheeseman.tmowar.item;

import net.minecraft.advancements.CriteriaTriggers;

import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvent;

import net.minecraft.stats.Stats;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.HoneyBottleItem;
import net.minecraft.world.item.ItemStack;

import net.minecraft.world.level.Level;

import net.thecheeseman.tmow.sound.ModSounds;
import org.jetbrains.annotations.NotNull;

import static net.minecraftforge.client.ForgeHooksClient.playSound;


public class NukaCola extends HoneyBottleItem
{
    private boolean toggle = true;
    public NukaCola(Properties pProperties)
    {
        super(pProperties);
    }

    @Override
    public void onUseTick(@NotNull Level pLevel, @NotNull LivingEntity pLivingEntity, @NotNull ItemStack pStack, int pRemainingUseDuration)
    {
        if (pRemainingUseDuration == 30)
        {
            toggle = true;
        }
        else if (pRemainingUseDuration == 25 && toggle)
        {
            toggle = false;
            pLivingEntity.playSound(ModSounds.NUKACOLADRINK.get(), 100, 1);

        }

    }




    @Override
    public int getUseDuration(@NotNull ItemStack pStack)
    {
        return 30;
    }

    @Override
    public @NotNull SoundEvent getDrinkingSound() {
         return ModSounds.silent.get();
    }

    @Override
    public @NotNull ItemStack finishUsingItem(@NotNull ItemStack pStack, @NotNull Level pLevel, @NotNull LivingEntity pEntityLiving) {
        super.finishUsingItem(pStack, pLevel, pEntityLiving);
        if (pEntityLiving instanceof ServerPlayer serverplayer) {
            CriteriaTriggers.CONSUME_ITEM.trigger(serverplayer, pStack);
            serverplayer.awardStat(Stats.ITEM_USED.get(this));
        }
        //if (!pLevel.isClientSide) {
        //pEntityLiving.removeEffect(MobEffects.POISON);}
        if (pStack.isEmpty()) {
            toggle = true;
            return new ItemStack(ModItems.Bottlecap.get());
        } else {
            if (pEntityLiving instanceof Player player && !((Player)pEntityLiving).getAbilities().instabuild) {
                ItemStack itemstack = new ItemStack(ModItems.Bottlecap.get());
                if (!player.getInventory().add(itemstack)) {
                    player.drop(itemstack, false);
                }
            }
            toggle = true;
            return pStack;
        }
    }

    }






