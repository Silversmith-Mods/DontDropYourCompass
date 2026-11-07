//? neoforge && >26 {
package com.ordana.dont_drop_your_compass.neoforge;

import com.ordana.dont_drop_your_compass.DontDropYourCompass;
import com.ordana.dont_drop_your_compass.ModTags;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.player.ItemTooltipEvent;

@EventBusSubscriber(modid = DontDropYourCompass.MOD_ID)
public class NeoForgeEntrypoint {
	@SubscribeEvent
	public static void addTooltip(ItemTooltipEvent event) {
		if (event.getItemStack().is(ModTags.KEEP_ON_DEATH)) {
			event.getToolTip().add(Component.translatable("tooltip.dont_drop_your_compass.keep_on_death").setStyle(Style.EMPTY.applyFormat(ChatFormatting.DARK_AQUA)));
		}
	}
}
//?}