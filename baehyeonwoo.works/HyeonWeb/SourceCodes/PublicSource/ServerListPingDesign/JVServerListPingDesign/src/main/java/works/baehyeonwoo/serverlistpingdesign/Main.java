package works.baehyeonwoo.serverlistpingdesign;

import works.baehyeonwoo.serverlistpingdesign.event.Event;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new Event(), this);
    }
}