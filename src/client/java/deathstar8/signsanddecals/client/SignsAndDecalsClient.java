package deathstar8.signsanddecals.client;

import deathstar8.signsanddecals.client.entity.model.SignsAndDecalsModelLayers;
import deathstar8.signsanddecals.client.entity.render.DecalEntityRenderer;
import deathstar8.signsanddecals.entity.SignsAndDecalsEntityTypes;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class SignsAndDecalsClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		// This entrypoint is suitable for setting up client-specific logic, such as rendering.
		SignsAndDecalsModelLayers.registerModelLayers();
		EntityRendererRegistry.register(SignsAndDecalsEntityTypes.DECAL_ENTITY, DecalEntityRenderer::new);
	}
}