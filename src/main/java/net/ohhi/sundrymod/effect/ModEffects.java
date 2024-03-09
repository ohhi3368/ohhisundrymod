package net.ohhi.sundrymod.effect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.Mob;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.ohhi.sundrymod.OhhiSundryMod;

public class ModEffects {
    public static final DeferredRegister<MobEffect> MOD_EFFECTS =
            DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, OhhiSundryMod.MOD_ID);

    public static RegistryObject<MobEffect> DIABETE = MOD_EFFECTS.register("diabete",
            () -> new DiabeteEffect(MobEffectCategory.HARMFUL,  0x8B4513));


    public static void register(IEventBus eventBus){
        MOD_EFFECTS.register(eventBus);
    }
}
