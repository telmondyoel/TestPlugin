package io.github.telmondyoel.TestPlugin.Listeners;

import org.bukkit.entity.Creeper;
import org.bukkit.entity.Enderman;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

import static org.bukkit.World.Environment.THE_END;
import static org.bukkit.event.entity.CreatureSpawnEvent.SpawnReason.NATURAL;

public class TestListener implements Listener {
    @EventHandler
    public void onEndermanSpawnInEnd(CreatureSpawnEvent event) {
        LivingEntity livingEntity = event.getEntity();

        if (event.getSpawnReason() == NATURAL &&
                livingEntity.getWorld().getEnvironment().equals(THE_END) &&
                livingEntity instanceof Enderman) {

            livingEntity.getWorld().spawn(event.getLocation(), Creeper.class);
            livingEntity.remove();
        }

    }
}
