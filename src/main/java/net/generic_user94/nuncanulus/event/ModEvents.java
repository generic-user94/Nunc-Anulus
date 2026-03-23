package net.generic_user94.nuncanulus.event;

import net.generic_user94.nuncanulus.NuncAnulus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.living.LivingDamageEvent;

@EventBusSubscriber(modid = NuncAnulus.MOD_ID, bus = EventBusSubscriber.Bus.GAME)
public class ModEvents {

    @SubscribeEvent
    public static void livingDamage(LivingDamageEvent.Pre event) {

    }


}
