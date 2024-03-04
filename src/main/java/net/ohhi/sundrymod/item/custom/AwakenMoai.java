package net.ohhi.sundrymod.item.custom;

import net.minecraft.client.Minecraft;
import net.minecraft.locale.Language;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.contents.TranslatableContents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.ohhi.sundrymod.sound.ModSounds;

public class AwakenMoai extends Item {

    public AwakenMoai(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        pContext.getPlayer().sendSystemMessage(Component.translatable("item.ohhisundrymod.awaken_moai_used"));
        pContext.getLevel().playSound(null, pContext.getClickedPos(), ModSounds.AWAKEN_MOAI_USED.get(), SoundSource.PLAYERS, 0.5f, 1);
        return InteractionResult.SUCCESS;
    }
}
