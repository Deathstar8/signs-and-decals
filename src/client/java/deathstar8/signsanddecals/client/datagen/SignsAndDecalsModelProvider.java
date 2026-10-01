package deathstar8.signsanddecals.client.datagen;

import deathstar8.signsanddecals.item.SignsAndDecalsItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;

public class SignsAndDecalsModelProvider extends FabricModelProvider {
    public SignsAndDecalsModelProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {

    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
        itemModelGenerators.generateFlatItem(SignsAndDecalsItems.DECAL, ModelTemplates.FLAT_ITEM);
    }

    @Override
    public String getName() {
        return "SignsAndDecalsModelProvider";
    }
}
