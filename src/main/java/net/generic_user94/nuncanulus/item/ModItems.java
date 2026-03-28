package net.generic_user94.nuncanulus.item;

import net.generic_user94.nuncanulus.NuncAnulus;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.List;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(NuncAnulus.MOD_ID);


    public static final DeferredItem<Item> ANULITE = ITEMS.register("anulite",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_ANULITE = ITEMS.register("raw_anulite",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> EIGHT_RING = ITEMS.register("eight_ring",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SIXTEEN_RING = ITEMS.register("sixteen_ring",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TWENTY_FOUR_RING = ITEMS.register("twenty_four_ring",
            () -> new Item(new Item.Properties()));





    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);

    }
}
