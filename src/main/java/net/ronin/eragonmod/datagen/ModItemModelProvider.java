package net.ronin.eragonmod.datagen;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.ronin.eragonmod.EragonMod;
import net.ronin.eragonmod.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, EragonMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.DRAGON_SCALE.get());
        basicItem(ModItems.DIRTY_SCALE.get());

        basicItem(ModItems.RADISH.get());

        basicItem(ModItems.CHISEL.get());

        basicItem(ModItems.STARLIGHT_ASHES.get());
        basicItem(ModItems.FROSTFIRE_ICE.get());
    }
}
