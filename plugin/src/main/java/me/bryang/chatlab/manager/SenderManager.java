package me.bryang.chatlab.manager;

import me.bryang.chatlab.ChatLab;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.entity.Player;

public class SenderManager {

    private final MiniMessage miniMessage;

    public SenderManager(){
        miniMessage = MiniMessage.miniMessage();
    }

    public void sendMessage(Player sender, String message){
        sender.sendMessage(miniMessage.deserialize(message));
    }
}
