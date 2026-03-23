package net.generic_user94.nuncanulus.datagen;

import net.generic_user94.nuncanulus.NuncAnulus;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class ModDatapackProvider extends DatapackBuiltinEntriesProvider {

    public ModDatapackProvider(PackOutput output, CompletableFuture<RegistrySetBuilder.PatchedRegistries> registries) {
        super(output, registries, Set.of(NuncAnulus.MOD_ID));
    }

}
