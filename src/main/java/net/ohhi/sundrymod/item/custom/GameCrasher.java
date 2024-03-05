package net.ohhi.sundrymod.item.custom;

import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.ohhi.sundrymod.sound.ModSounds;

public class GameCrasher extends Item {

    public GameCrasher(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        pContext.getPlayer().sendSystemMessage(Component.literal("BYE BYE!"));
        System.exit(-1);
        return InteractionResult.SUCCESS;
    }
}
