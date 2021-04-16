package pl.barthvisuals.motd;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents((Listener)new MotdListener(this), (Plugin)this);
        getLogger().info("Uruchomiono pomyslnie!");
    }
}
