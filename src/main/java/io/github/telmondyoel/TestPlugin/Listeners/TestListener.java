package io.github.telmondyoel.TestPlugin.Listeners;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.event.player.PlayerJoinEvent;

public class TestListener implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Bukkit.broadcastMessage(event.getPlayer().getName() + " is pretty cool");
    }

    @EventHandler
    public void onBedThing(PlayerBedEnterEvent event) {
        Bukkit.broadcastMessage("The bed is at: " + event.getBed().getLocation().toString());
    }
}
