package works.baehyeonwoo.paperserverlistpingdesign;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import works.baehyeonwoo.paperserverlistpingdesign.paperevent.PaperEvent;

public class PaperMain extends JavaPlugin {
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new PaperEvent(), this);
    }
}
