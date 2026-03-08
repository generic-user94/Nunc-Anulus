package net.generic_user94.nuncanulus.item;

import net.generic_user94.nuncanulus.NuncAnulus;
import net.generic_user94.nuncanulus.item.custom.ChiselItem;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.List;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(NuncAnulus.MOD_ID);


    public static final DeferredItem<Item> ANULITE = ITEMS.register("anulite",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> RAW_ANULITE = ITEMS.register("raw_anulite",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> CHISEL = ITEMS.register("chisel",
            () -> new ChiselItem(new Item.Properties().durability(1000)));

    public static final DeferredItem<Item> BURGER = ITEMS.register("burger",
            () -> new Item(new Item.Properties().food(ModFoodProperties.BURGER)){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {

                    tooltipComponents.add(Component.translatable("tooltip.nuncanulus.burger.tooltip"));

                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);

    }
}
