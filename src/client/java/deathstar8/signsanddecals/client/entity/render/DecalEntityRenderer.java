package deathstar8.signsanddecals.client.entity.render;

import com.mojang.blaze3d.vertex.PoseStack;
import deathstar8.signsanddecals.client.entity.model.DecalEntityModel;
import deathstar8.signsanddecals.client.entity.model.SignsAndDecalsModelLayers;
import deathstar8.signsanddecals.entity.DecalEntity;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.state.level.CameraRenderState;

public class DecalEntityRenderer extends EntityRenderer<DecalEntity, DecalEntityRenderState> {
    // Baked now so it's ready once decal textures are rendered onto its faces
    private final DecalEntityModel model;

    public DecalEntityRenderer(EntityRendererProvider.Context context) {
        super(context);
        this.model = new DecalEntityModel(context.bakeLayer(SignsAndDecalsModelLayers.DECAL_ENTITY));
        this.shadowRadius = 0.0f;
    }

    @Override
    public DecalEntityRenderState createRenderState() {
        return new DecalEntityRenderState();
    }

    @Override
    public void extractRenderState(DecalEntity entity, DecalEntityRenderState state, float partialTicks) {
        super.extractRenderState(entity, state, partialTicks);
        // Copy decal-specific data from the entity into the render state here
    }

    @Override
    public void submit(DecalEntityRenderState state, PoseStack poseStack, SubmitNodeCollector submitNodeCollector, CameraRenderState camera) {
        // Invisible for now: no textures are submitted, only the default name tag/leash handling
        super.submit(state, poseStack, submitNodeCollector, camera);
    }
}