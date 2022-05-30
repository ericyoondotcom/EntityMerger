package com.yoonicode.entitymerger;

import org.bukkit.DyeColor;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Silverfish;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;

public class PluginMain extends JavaPlugin {
    public enum MergeableEntityType {
        COW,
        MUSHROOM_COW,
        CHICKEN,
        PIG,
        SHEEP_BLACK,
        SHEEP_BLUE,
        SHEEP_BROWN,
        SHEEP_CYAN,
        SHEEP_GRAY,
        SHEEP_GREEN,
        SHEEP_LIGHT_BLUE,
        SHEEP_LIME,
        SHEEP_MAGENTA,
        SHEEP_ORANGE,
        SHEEP_PINK,
        SHEEP_PURPLE,
        SHEEP_RED,
        SHEEP_LIGHT_GRAY,
        SHEEP_WHITE,
        SHEEP_YELLOW
    }
    public static final HashMap<String, MergeableEntityType> entityNames = new HashMap<String, MergeableEntityType>() {{
        put("cow", MergeableEntityType.COW);
        put("mooshroom", MergeableEntityType.MUSHROOM_COW);
        put("chicken", MergeableEntityType.CHICKEN);
        put("pig", MergeableEntityType.PIG);
        put("sheep_black", MergeableEntityType.SHEEP_BLACK);
        put("sheep_blue", MergeableEntityType.SHEEP_BLUE);
        put("sheep_brown", MergeableEntityType.SHEEP_BROWN);
        put("sheep_cyan", MergeableEntityType.SHEEP_CYAN);
        put("sheep_gray", MergeableEntityType.SHEEP_GRAY);
        put("sheep_green", MergeableEntityType.SHEEP_GREEN);
        put("sheep_light_blue", MergeableEntityType.SHEEP_LIGHT_BLUE);
        put("sheep_lime", MergeableEntityType.SHEEP_LIME);
        put("sheep_magenta", MergeableEntityType.SHEEP_MAGENTA);
        put("sheep_orange", MergeableEntityType.SHEEP_ORANGE);
        put("sheep_pink", MergeableEntityType.SHEEP_PINK);
        put("sheep_purple", MergeableEntityType.SHEEP_PURPLE);
        put("sheep_red", MergeableEntityType.SHEEP_RED);
        put("sheep_light_gray", MergeableEntityType.SHEEP_LIGHT_GRAY);
        put("sheep_white", MergeableEntityType.SHEEP_WHITE);
        put("sheep_yellow", MergeableEntityType.SHEEP_YELLOW);
    }};
    public static final HashMap<MergeableEntityType, EntityType> entityTypes = new HashMap<MergeableEntityType, EntityType>(){{
        put(MergeableEntityType.COW, EntityType.COW);
        put(MergeableEntityType.MUSHROOM_COW, EntityType.MUSHROOM_COW);
        put(MergeableEntityType.CHICKEN, EntityType.CHICKEN);
        put(MergeableEntityType.PIG, EntityType.PIG);
        put(MergeableEntityType.SHEEP_BLACK, EntityType.SHEEP);
        put(MergeableEntityType.SHEEP_BLUE, EntityType.SHEEP);
        put(MergeableEntityType.SHEEP_BROWN, EntityType.SHEEP);
        put(MergeableEntityType.SHEEP_CYAN, EntityType.SHEEP);
        put(MergeableEntityType.SHEEP_GRAY, EntityType.SHEEP);
        put(MergeableEntityType.SHEEP_GREEN, EntityType.SHEEP);
        put(MergeableEntityType.SHEEP_LIGHT_BLUE, EntityType.SHEEP);
        put(MergeableEntityType.SHEEP_LIME, EntityType.SHEEP);
        put(MergeableEntityType.SHEEP_MAGENTA, EntityType.SHEEP);
        put(MergeableEntityType.SHEEP_ORANGE, EntityType.SHEEP);
        put(MergeableEntityType.SHEEP_PINK, EntityType.SHEEP);
        put(MergeableEntityType.SHEEP_PURPLE, EntityType.SHEEP);
        put(MergeableEntityType.SHEEP_RED, EntityType.SHEEP);
        put(MergeableEntityType.SHEEP_LIGHT_GRAY, EntityType.SHEEP);
        put(MergeableEntityType.SHEEP_WHITE, EntityType.SHEEP);
        put(MergeableEntityType.SHEEP_YELLOW, EntityType.SHEEP);
    }};
    public static final HashMap<MergeableEntityType, DyeColor> colors = new HashMap<MergeableEntityType, DyeColor>() {{
        put(MergeableEntityType.SHEEP_BLACK, DyeColor.BLACK);
        put(MergeableEntityType.SHEEP_BLUE, DyeColor.BLUE);
        put(MergeableEntityType.SHEEP_BROWN, DyeColor.BROWN);
        put(MergeableEntityType.SHEEP_CYAN, DyeColor.CYAN);
        put(MergeableEntityType.SHEEP_GRAY, DyeColor.GRAY);
        put(MergeableEntityType.SHEEP_GREEN, DyeColor.GREEN);
        put(MergeableEntityType.SHEEP_LIGHT_BLUE, DyeColor.LIGHT_BLUE);
        put(MergeableEntityType.SHEEP_LIME, DyeColor.LIME);
        put(MergeableEntityType.SHEEP_MAGENTA, DyeColor.MAGENTA);
        put(MergeableEntityType.SHEEP_ORANGE, DyeColor.ORANGE);
        put(MergeableEntityType.SHEEP_PINK, DyeColor.PINK);
        put(MergeableEntityType.SHEEP_PURPLE, DyeColor.PURPLE);
        put(MergeableEntityType.SHEEP_RED, DyeColor.RED);
        put(MergeableEntityType.SHEEP_LIGHT_GRAY, DyeColor.LIGHT_GRAY);
        put(MergeableEntityType.SHEEP_WHITE, DyeColor.WHITE);
        put(MergeableEntityType.SHEEP_YELLOW, DyeColor.YELLOW);
    }};
}
