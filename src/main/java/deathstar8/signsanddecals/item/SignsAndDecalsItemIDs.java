package deathstar8.signsanddecals.item;

import deathstar8.signsanddecals.SignsAndDecals;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

public class SignsAndDecalsItemIDs {
    // Add itemIDs
    public static final ResourceKey<Item> DECAL = create("decal");

    public static ResourceKey<Item> create(String name) {
        return ResourceKey.create(Registries.ITEM, SignsAndDecals.id(name));
    }
}

