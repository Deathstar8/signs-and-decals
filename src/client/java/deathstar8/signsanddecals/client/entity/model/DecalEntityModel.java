package deathstar8.signsanddecals.client.entity.model;

// Made with Blockbench 5.2.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

import deathstar8.signsanddecals.client.entity.render.DecalEntityRenderState;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class DecalEntityModel extends EntityModel<DecalEntityRenderState> {
    // This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
    private final ModelPart bb_main;

    public DecalEntityModel(ModelPart root) {
        super(root);
        this.bb_main = root.getChild("bb_main");
    }

    // Scale of the decal cube relative to a full block, slightly oversized to avoid z-fighting with the block it covers
    private static final float DECAL_SCALE = 1.005F;
    private static final float DECAL_INFLATE = 16.0F * (DECAL_SCALE - 1.0F) / 2.0F;

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        // 16x16x16 cube spanning one full block, sitting on the entity's feet (y = 24 in model space)
        PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, -16.0F, -8.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(DECAL_INFLATE)), PartPose.offset(0.0F, 24.0F, 0.0F));

        return LayerDefinition.create(meshdefinition, 128, 128);
    }

}