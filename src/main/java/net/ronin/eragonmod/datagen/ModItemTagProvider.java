package net.ronin.eragonmod.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.ronin.eragonmod.EragonMod;
import net.ronin.eragonmod.block.ModBlocks;
import net.ronin.eragonmod.item.ModItems;
import net.ronin.eragonmod.util.ModTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {

    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, EragonMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ModTags.Items.TRANSFORMABLE_ITEMS)
                .add(ModItems.DRAGON_SCALE.get())
                .add(ModItems.DIRTY_SCALE.get())
                .add(ModBlocks.DRAGON_SCALE_DEEPSLATE_ORE.asItem())
                .add(ModBlocks.DRAGON_SCALE_ORE.asItem())
                .add(Items.COAL);
    }
}
