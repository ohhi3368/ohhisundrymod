package net.ohhi.sundrymod.events;


import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.server.command.ConfigCommand;
import net.ohhi.sundrymod.OhhiSundryMod;
import net.ohhi.sundrymod.commands.testGUI;

@Mod.EventBusSubscriber(modid = OhhiSundryMod.MOD_ID)
public class ModEvents {

    @SubscribeEvent
    public static void onCommandRegister(RegisterCommandsEvent event){
        new testGUI(event.getDispatcher());
        ConfigCommand.register(event.getDispatcher());
    }
}
