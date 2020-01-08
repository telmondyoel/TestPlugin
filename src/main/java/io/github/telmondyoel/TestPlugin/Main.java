package io.github.telmondyoel.TestPlugin;

import io.github.telmondyoel.TestPlugin.Listeners.TestListener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new TestListener(), this);
    }

    @Override
    public void onDisable() {
        getLogger().info("bye bye");
    }
}
