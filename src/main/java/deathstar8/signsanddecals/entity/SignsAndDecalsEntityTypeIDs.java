package deathstar8.signsanddecals.entity;

import deathstar8.signsanddecals.SignsAndDecals;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.EntityType;

public class SignsAndDecalsEntityTypeIDs {
    public static final ResourceKey<EntityType<?>> DECAL_ENTITY = create("decal_entity");

    private static ResourceKey<EntityType<?>> create(String name) {
        return ResourceKey.create(Registries.ENTITY_TYPE, SignsAndDecals.id(name));
    }
}
