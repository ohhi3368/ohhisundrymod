package net.ohhi.sundrymod.sound;

import net.minecraft.client.resources.sounds.Sound;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.ohhi.sundrymod.OhhiSundryMod;

import java.rmi.registry.Registry;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, OhhiSundryMod.MOD_ID);

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }

    public static final RegistryObject<SoundEvent> AWAKEN_MOAI_USED = registerSoundEvents("awaken_moai_used");
    private static RegistryObject<SoundEvent> registerSoundEvents(String soundID) {
        return SOUND_EVENTS.register(soundID, () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(OhhiSundryMod.MOD_ID, soundID)));
    }
}
