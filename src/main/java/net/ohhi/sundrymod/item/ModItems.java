package net.ohhi.sundrymod.item;

import net.minecraft.client.gui.screens.social.PlayerEntry;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraftforge.event.entity.living.LivingEntityUseItemEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.ohhi.sundrymod.OhhiSundryMod;
import net.ohhi.sundrymod.item.custom.AwakenMoai;
import net.ohhi.sundrymod.item.custom.GameCrasher;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, OhhiSundryMod.MOD_ID);


    public static final RegistryObject<Item> MOAI_GOODS = ITEMS.register("moai_goods",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_MOAI = ITEMS.register("raw_moai",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> AWAKEN_MOAI = ITEMS.register("awaken_moai",
            () -> new AwakenMoai(new Item.Properties().durability(121)));

    //yes

    public static final RegistryObject<Item> SUGAR_BREAD = ITEMS.register("sugar_bread",
            () -> new Item(new Item.Properties().food(ModFoods.SUGAR_BREAD)));

    public static final RegistryObject<Item> GAME_CRASHER = ITEMS.register("game_crasher",
            () -> new GameCrasher(new Item.Properties()));

    public static final RegistryObject<Item> GOLDEN_GCUBE = ITEMS.register("golden_gcube",
            () -> new Item(new Item.Properties()));

    //yes

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
    private static int sugarBreadCounter = 0;
    @SubscribeEvent
    public static void onItemUse(LivingEntityUseItemEvent event) {
        if (event.getItem().getItem() == ModItems.SUGAR_BREAD.get()) {
            sugarBreadCounter++;
            if (sugarBreadCounter >= 10) {
                event.getEntity().sendSystemMessage(Component.literal("test!!"));
            }
        } else {
            sugarBreadCounter = 0; // Reset counter if a different item is used
        }
    }
}
