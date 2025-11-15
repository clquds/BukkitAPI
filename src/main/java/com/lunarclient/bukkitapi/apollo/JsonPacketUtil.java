package com.lunarclient.bukkitapi.apollo;

import com.google.gson.JsonObject;
import com.lunarclient.bukkitapi.LunarClientAPI;
import org.bukkit.entity.Player;

public class JsonPacketUtil {

    public static void sendPacket(Player player, JsonObject message) {
        player.sendPluginMessage(LunarClientAPI.getInstance(), "apollo:json", message.toString().getBytes());
    }

}
