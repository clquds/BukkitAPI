package com.lunarclient.bukkitapi.apollo;

import com.google.gson.JsonObject;

import java.awt.*;

public class JsonUtil {

    public static JsonObject createBlockLocationObject(String world, int x, int y, int z) {
        JsonObject locationObject = new JsonObject();
        locationObject.addProperty("world", world);
        locationObject.addProperty("x", x);
        locationObject.addProperty("y", y);
        locationObject.addProperty("z", z);
        return locationObject;
    }

    public static JsonObject createColorObject(Color color) {
        JsonObject colorObject = new JsonObject();
        colorObject.addProperty("color", color.getRGB());
        return colorObject;
    }

}
