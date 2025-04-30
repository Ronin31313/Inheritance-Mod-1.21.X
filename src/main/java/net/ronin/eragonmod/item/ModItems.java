package net.ronin.eragonmod.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.ronin.eragonmod.EragonMod;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(EragonMod.MOD_ID);

    public static final DeferredItem<Item> DRAGON_SCALE = ITEMS.register("dragon_scale",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> DIRTY_SCALE = ITEMS.register("dirty_scale",
            () -> new Item(new Item.Properties()));

    public static void  register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
