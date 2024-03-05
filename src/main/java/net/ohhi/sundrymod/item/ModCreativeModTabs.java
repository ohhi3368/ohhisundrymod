package net.ohhi.sundrymod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.ohhi.sundrymod.OhhiSundryMod;
import net.ohhi.sundrymod.block.ModBlocks;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, OhhiSundryMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> SUNDRY_TAB = CREATIVE_MODE_TABS.register("sundry_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.RAW_MOAI.get()))
                    .title(Component.translatable("sundry_tab.title"))
                    .displayItems((pParameters, pOutPut) -> {
                        pOutPut.accept(ModItems.MOAI_GOODS.get());
                        pOutPut.accept(ModItems.RAW_MOAI.get());
                        pOutPut.accept(ModBlocks.MOAI_BLOCK.get());
                        pOutPut.accept(ModItems.AWAKEN_MOAI.get());
                        pOutPut.accept(ModItems.GAME_CRASHER.get());
                    })
                    .build());
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
