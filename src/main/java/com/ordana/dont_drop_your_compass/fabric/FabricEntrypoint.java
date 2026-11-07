//? fabric {
/*package com.ordana.dont_drop_your_compass.fabric;

import com.ordana.dont_drop_your_compass.ModTags;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.item.v1.ItemTooltipCallback;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;

public class FabricEntrypoint implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		ItemTooltipCallback.EVENT.register((itemStack, tooltipContext, tooltipFlag, list) -> {
			if (itemStack.is(ModTags.KEEP_ON_DEATH)) {
				list.add(Component.translatable("tooltip.dont_drop_your_compass.keep_on_death").setStyle(Style.EMPTY.applyFormat(ChatFormatting.DARK_AQUA)));
			}
		});
	}
}
*///?}