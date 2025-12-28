package com.bharat.bharatcore;

import org.bukkit.plugin.java.JavaPlugin;

public class BharatCore extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("BharatCore enabled successfully!");
    }

    @Override
    public void onDisable() {
        getLogger().info("BharatCore disabled.");
    }
}

