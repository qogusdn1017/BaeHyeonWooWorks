package works.baehyeonwoo.serverlistpingdesign

import org.bukkit.Bukkit
import org.bukkit.plugin.java.JavaPlugin
import works.baehyeonwoo.serverlistpingdesign.event.Event

/**
 *
 * @author BaeHyeonWoo
 *
 */

class Main : JavaPlugin() {
    @Override
    override fun onEnable() {
        Bukkit.getPluginManager().registerEvents(Event(), this)
    }
}