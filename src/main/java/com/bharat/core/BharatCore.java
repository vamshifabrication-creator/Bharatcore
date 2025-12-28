package com.bharat.core;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class BharatCore extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getLogger().info("BharatCore plugin started");
    }

    @Override
    public void onDisable() {
        Bukkit.getLogger().info("BharatCore plugin stopped");
    }
}
