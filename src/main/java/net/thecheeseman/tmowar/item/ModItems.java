package net.thecheeseman.tmowar.item;

import net.minecraft.world.item.*;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.thecheeseman.tmowar.TheMissilesOfWar;


public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(TheMissilesOfWar.MODID);


    public static final DeferredItem<NukaCola> NukaCola = ITEMS.register("nukacola",
            () -> new NukaCola(new Item.Properties().rarity(Rarity.EPIC).food(ModFoodProperties.NukaCola)));
    public static final DeferredItem<NukaCola> NukaColaQuantum = ITEMS.register("nukacolaquantum",
            () -> new NukaCola(new Item.Properties().rarity(Rarity.EPIC).food(ModFoodProperties.NukaColaQuantum)));
    public static final DeferredItem<NukaCola> NukaColaGrape = ITEMS.register("nukacolagrape",
            () -> new NukaCola(new Item.Properties().rarity(Rarity.EPIC).food(ModFoodProperties.NukaColaGrape)));
    public static final DeferredItem<NukaCola> NukaColaDark = ITEMS.register("nukacoladark",
            () -> new NukaCola(new Item.Properties().rarity(Rarity.EPIC).food(ModFoodProperties.NukaColaDark)));
    public static final DeferredItem<NukaCola> NukaColaOrange = ITEMS.register("nukacolaorange",
            () -> new NukaCola(new Item.Properties().rarity(Rarity.EPIC).food(ModFoodProperties.NukaColaOrange)));
    public static final DeferredItem<NukaCola> NukaColaVictory = ITEMS.register("nukacolavictory",
            () -> new NukaCola(new Item.Properties().rarity(Rarity.EPIC).food(ModFoodProperties.NukaColaVictory)));
    public static final DeferredItem<NukaCola> NukaColaQuartz = ITEMS.register("nukacolaquartz",
            () -> new NukaCola(new Item.Properties().rarity(Rarity.EPIC).food(ModFoodProperties.NukaColaQuartz)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);


    }
}
