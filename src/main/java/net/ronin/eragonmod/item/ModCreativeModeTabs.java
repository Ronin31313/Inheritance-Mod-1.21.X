package net.ronin.eragonmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.ronin.eragonmod.EragonMod;
import net.ronin.eragonmod.block.ModBlocks;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EragonMod.MOD_ID);


    public static final Supplier<CreativeModeTab> ERAGON_ITEMS_TAB = CREATIVE_MODE_TAB.register("eragon_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.DRAGON_SCALE.get()))
                    .title(Component.translatable("creativetab.eragonmodronin.eragon_items"))
                    .displayItems((itemDisplayParameters, output) ->   {
                        output.accept(ModItems.DRAGON_SCALE);
                        output.accept(ModItems.DIRTY_SCALE);
                        output.accept(ModItems.CHISEL);
                        output.accept(ModItems.RADISH);
                        output.accept(ModItems.FROSTFIRE_ICE);
                        output.accept(ModItems.STARLIGHT_ASHES);
                    }).build());

public static final Supplier<CreativeModeTab> ERAGON_BLOCKS_TAB = CREATIVE_MODE_TAB.register("eragon_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.DRAGON_SCALE_BLOCK))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(EragonMod.MOD_ID, "eragon_items_tab")) //Important to always let the blocks tab follow the items tab
                    .title(Component.translatable("creativetab.eragonmodronin.eragon_blocks"))
                    .displayItems((itemDisplayParameters, output) ->   {
                        output.accept(ModBlocks.DRAGON_SCALE_BLOCK);
                        output.accept(ModBlocks.DRAGON_SCALE_ORE);
                        output.accept(ModBlocks.DRAGON_SCALE_DEEPSLATE_ORE);
                        output.accept(ModBlocks.MAGIC_BLOCK);
                    }).build());


    public static void register (IEventBus eventBus){
        CREATIVE_MODE_TAB.register(eventBus);
    }

}
