package net.ohhi.sundrymod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.food.FoodProperties;
import net.ohhi.sundrymod.effect.ModEffects;


public class ModFoods {
    public static final FoodProperties SUGAR_BREAD = new FoodProperties.Builder().nutrition(5).
            saturationMod(0.8F).effect(() -> new MobEffectInstance(ModEffects.DIABETE.get(), 100, 1), 0.07F).build();
}
