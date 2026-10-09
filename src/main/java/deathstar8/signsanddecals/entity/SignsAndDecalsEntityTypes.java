package deathstar8.signsanddecals.entity;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;

public class SignsAndDecalsEntityTypes {
    // Register entity types
    public static final EntityType<DecalEntity> DECAL_ENTITY = register(SignsAndDecalsEntityTypeIDs.DECAL_ENTITY,
            EntityType.Builder.of(DecalEntity::new, MobCategory.MISC).noLootTable().sized(1.0f, 1.0f).clientTrackingRange(10));

    private static <T extends Entity> EntityType<T> register(ResourceKey<EntityType<?>> id, EntityType.Builder<T> builder) {
        return Registry.register(BuiltInRegistries.ENTITY_TYPE, id, builder.build(id));
    }

    public static void initialize() {
        // Loads this class so the static fields above are registered
    }
}