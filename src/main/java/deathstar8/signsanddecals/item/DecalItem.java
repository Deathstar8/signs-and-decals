package deathstar8.signsanddecals.item;

import deathstar8.signsanddecals.entity.DecalEntity;
import deathstar8.signsanddecals.entity.SignsAndDecalsEntityTypes;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;

public class DecalItem extends Item {
    public DecalItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        // Perform on server only
        if (context.getLevel().isClientSide()) {
            return InteractionResult.PASS;
        }

        // Create decal entity
        EntityType<DecalEntity> entityType = SignsAndDecalsEntityTypes.DECAL_ENTITY;
        DecalEntity entity = entityType.create(context.getLevel(), EntitySpawnReason.TRIGGERED);
        if (entity == null) {
            return InteractionResult.FAIL;
        }
        entity.snapTo(context.getClickedPos().getX() + 0.5, context.getClickedPos().getY(), context.getClickedPos().getZ() + 0.5);

        // Add the entity to the world so it is ticked and synced to clients
        context.getLevel().addFreshEntity(entity);

        // Test decal item class
        context.getLevel().playSound(null, context.getClickedPos(), SoundEvents.BOOK_PAGE_TURN, SoundSource.PLAYERS, 2.0f, 1.0f);

        return InteractionResult.SUCCESS;
    }
}
