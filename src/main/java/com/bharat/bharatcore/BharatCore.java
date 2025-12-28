package com.bharat.bharatcore;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
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

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("bharat")) {
            sender.sendMessage("§aBharat SMP Core is running!");
            return true;
        }
        return false;
    }
}
