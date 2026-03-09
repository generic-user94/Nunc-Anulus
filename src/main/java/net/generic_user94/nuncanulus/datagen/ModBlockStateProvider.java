package net.generic_user94.nuncanulus.datagen;

import com.jcraft.jorbis.Block;
import net.generic_user94.nuncanulus.NuncAnulus;
import net.generic_user94.nuncanulus.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(PackOutput output, String modid, ExistingFileHelper exFileHelper) {
        super(output, NuncAnulus.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

        blockWithItem(ModBlocks.ANULITE_BLOCK);
        blockWithItem(ModBlocks.ANULITE_ORE);
        blockWithItem(ModBlocks.MAGIC_BLOCK);
        blockWithItem(ModBlocks.MAGIC_BLOCK_TWO);

        stairsBlock(ModBlocks.ANULITE_STAIR.get(), blockTexture(ModBlocks.ANULITE_BLOCK.get()));
        blockItem(ModBlocks.ANULITE_STAIR);
        slabBlock(ModBlocks.ANULITE_SLAB.get(), blockTexture(ModBlocks.ANULITE_BLOCK.get()), blockTexture(ModBlocks.ANULITE_BLOCK.get()));
        blockItem(ModBlocks.ANULITE_SLAB);

        fenceBlock(ModBlocks.ANULITE_FENCE.get(), blockTexture(ModBlocks.ANULITE_BLOCK.get()));
        fenceGateBlock(ModBlocks.ANULITE_FENCE_GATE.get(), blockTexture(ModBlocks.ANULITE_BLOCK.get()));
        blockItem(ModBlocks.ANULITE_FENCE_GATE);
        wallBlock(ModBlocks.ANULITE_WALL.get(), blockTexture(ModBlocks.ANULITE_BLOCK.get()));

        buttonBlock(ModBlocks.ANULITE_BUTTON.get(), blockTexture(ModBlocks.ANULITE_BLOCK.get()));
        pressurePlateBlock(ModBlocks.ANULITE_PRESSURE_PLATE.get(), blockTexture(ModBlocks.ANULITE_BLOCK.get()));
        blockItem(ModBlocks.ANULITE_PRESSURE_PLATE);

        doorBlockWithRenderType(ModBlocks.ANULITE_DOOR.get(),
                modLoc("block/anulite_door_bottom"),
                modLoc("block/anulite_door_top"),
                "cutout");
        trapdoorBlockWithRenderType(ModBlocks.ANULITE_TRAPDOOR.get(),
                modLoc("block/anulite_trapdoor"),
                true,
                "cutout");
        blockItem(ModBlocks.ANULITE_TRAPDOOR, "_bottom");

    }

    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }

    private void blockItem(DeferredBlock<?> deferredBlock) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("nuncanulus:block/" + deferredBlock.getId().getPath()));
    }

    private void blockItem(DeferredBlock<?> deferredBlock, String appendix) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("nuncanulus:block/" + deferredBlock.getId().getPath() + appendix));
    }

}
