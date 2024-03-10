package net.ohhi.sundrymod.effect;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageType;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingEntityUseItemEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.ohhi.sundrymod.CustomDamageSource;
import net.ohhi.sundrymod.OhhiSundryMod;

import java.sql.Time;

public class DiabeteEffect extends MobEffect {


    public DiabeteEffect(MobEffectCategory mobEffectCategory, int color) {
        super(mobEffectCategory, color);
    }
    
    @Override
    public void applyEffectTick(LivingEntity pLivingEntity, int pAmplifier) {
        DamageSource damagesource = new DamageSource(pLivingEntity.level().registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(CustomDamageSource.DIABETE));
        pLivingEntity.hurt(damagesource, pAmplifier * 1F);
        super.applyEffectTick(pLivingEntity, pAmplifier);
    }


    @Override
    public boolean isDurationEffectTick(int pDuration, int pAmplifier) {
        return true;
    }
}
