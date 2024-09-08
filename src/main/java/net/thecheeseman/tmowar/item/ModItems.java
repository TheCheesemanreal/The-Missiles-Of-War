package net.thecheeseman.tmowar.item;

import net.minecraft.world.item.*;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.thecheeseman.tmowar.TheMissilesOfWar;


public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(TheMissilesOfWar.MODID);


    public static final DeferredItem<net.thecheeseman.tmowar.item.NukaCola> NukaCola = ITEMS.register("nukacola",
            () -> new NukaCola(new Item.Properties().rarity(Rarity.EPIC).food(ModFoodProperties.NukaCola)));
    public static final DeferredItem<Item> NukaColaQuantum = ITEMS.register("nukacolaquantum",
            () -> new NukaCola(new Item.Properties().rarity(Rarity.EPIC).food(ModFoodProperties.NukaCola)));
    public static final DeferredItem<Item> NukaColaGrape = ITEMS.register("nukacolagrape",
            () -> new NukaCola(new Item.Properties().rarity(Rarity.EPIC).food(ModFoodProperties.NukaCola)));
    public static final DeferredItem<Item> NukaColaDark = ITEMS.register("nukacoladark",
            () -> new NukaCola(new Item.Properties().rarity(Rarity.EPIC).food(ModFoodProperties.NukaCola)));
    public static final DeferredItem<Item> NukaColaOrange = ITEMS.register("nukacolaorange",
            () -> new NukaCola(new Item.Properties().rarity(Rarity.EPIC).food(ModFoodProperties.NukaCola)));
    public static final DeferredItem<Item> NukaColaVictory = ITEMS.register("nukacolavictory",
            () -> new NukaCola(new Item.Properties().rarity(Rarity.EPIC).food(ModFoodProperties.NukaCola)));
    public static final DeferredItem<Item> NukaColaQuartz = ITEMS.register("nukacolaquartz",
            () -> new NukaCola(new Item.Properties().rarity(Rarity.EPIC).food(ModFoodProperties.NukaCola)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);


    }
}
