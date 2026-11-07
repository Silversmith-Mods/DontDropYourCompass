package com.ordana.dont_drop_your_compass.mixins;

import com.mojang.authlib.GameProfile;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ServerPlayer.class)
public abstract class ServerPlayerMixin extends Player {

    public ServerPlayerMixin(Level level, BlockPos pos, float yRot, GameProfile gameProfile) {
        super(level,
                //? if <26
                pos, yRot,
                gameProfile);
    }

    @Inject(method = "restoreFrom",
            at = @At(value = "INVOKE", target = "Lnet/minecraft/server/level/ServerPlayer;setHealth(F)V",
                    //? if <26
                    ordinal = 0
                    //? if 26.1
                    //ordinal = 1
            ))
    private void dontDropCompass(ServerPlayer that, boolean keepEverything, CallbackInfo ci) {
        this.getInventory().replaceWith(that.getInventory());
    }

}
