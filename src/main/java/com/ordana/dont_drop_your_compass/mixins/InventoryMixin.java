package com.ordana.dont_drop_your_compass.mixins;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.ordana.dont_drop_your_compass.ModTags;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(Inventory.class)
public class InventoryMixin {

    @WrapOperation(method = "dropAll",
            at = @At(value = "INVOKE", target = "Lnet/minecraft/world/item/ItemStack;isEmpty()Z"))
    private boolean dontDropCompass(ItemStack stack, Operation<Boolean> original) {
        return stack.is(ModTags.KEEP_ON_DEATH) || original.call(stack);
    }

}
