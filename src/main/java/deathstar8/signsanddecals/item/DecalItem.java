package deathstar8.signsanddecals.item;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
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

        // Test decal item class
        context.getLevel().playSound(null, context.getClickedPos(), SoundEvents.BOOK_PAGE_TURN, SoundSource.PLAYERS, 2.0f, 1.0f);

        return super.useOn(context);
    }
}
