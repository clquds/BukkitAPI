package com.lunarclient.bukkitapi.apollo;

import com.google.gson.JsonObject;
import com.lunarclient.bukkitapi.LunarClientAPI;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class JsonPacketUtil {

    public static void sendPacket(Player player, JsonObject message) {
        Bukkit.getScheduler().runTask(LunarClientAPI.getInstance(), () -> {
            player.sendPluginMessage(LunarClientAPI.getInstance(), "apollo:json", message.toString().getBytes());
        });
    }

}
