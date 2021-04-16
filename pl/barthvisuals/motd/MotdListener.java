package pl.barthvisuals.motd;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerListPingEvent;

public class MotdListener implements Listener {
    Main plugin;
    public MotdListener(Main plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPing (ServerListPingEvent e){
        String line1 = plugin.getConfig().getString("line1");
        String line2 = plugin.getConfig().getString("line2");

        e.setMotd(ChatColor.translateAlternateColorCodes('&', line1 + "\n" + line2));
    }
}
