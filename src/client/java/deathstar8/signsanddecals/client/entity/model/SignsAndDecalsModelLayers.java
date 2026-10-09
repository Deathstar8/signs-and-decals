package deathstar8.signsanddecals.client.entity.model;

import deathstar8.signsanddecals.SignsAndDecals;
import net.fabricmc.fabric.api.client.rendering.v1.ModelLayerRegistry;
import net.minecraft.client.model.geom.ModelLayerLocation;

public class SignsAndDecalsModelLayers {
    public static final ModelLayerLocation DECAL_ENTITY = createMain("decal_entity");

    private static ModelLayerLocation createMain(String name) {
        return new ModelLayerLocation(SignsAndDecals.id(name), "main");
    }

    public static void registerModelLayers() {
        ModelLayerRegistry.registerModelLayer(SignsAndDecalsModelLayers.DECAL_ENTITY, DecalEntityModel::createBodyLayer);
    }
}