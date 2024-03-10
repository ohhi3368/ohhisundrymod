package net.ohhi.sundrymod;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.Main;
import net.minecraft.server.packs.resources.Resource;
import net.minecraft.world.damagesource.DamageType;

public class CustomDamageSource {
    public static final ResourceKey<DamageType> DIABETE = ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation(OhhiSundryMod.MOD_ID, "diabete"));
    public static void bootstrap(BootstapContext<DamageType> context) { context.register(DIABETE, new DamageType("diabete", 0.1F)); }
}
