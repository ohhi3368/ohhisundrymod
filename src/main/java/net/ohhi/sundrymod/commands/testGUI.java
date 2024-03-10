package net.ohhi.sundrymod.commands;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.commands.CommandSource;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;

public class testGUI {
    public testGUI(CommandDispatcher<CommandSourceStack> dispatcher){
        dispatcher.register(Commands.literal("sundrygui").then(Commands.literal("go").executes((command) -> {
            return openGUIone(command.getSource());
        })));

    }

    private int openGUIone(CommandSourceStack commandSource) throws CommandSyntaxException {
        commandSource.sendSystemMessage(Component.literal("test!!"));
        return 1;
    }
}
