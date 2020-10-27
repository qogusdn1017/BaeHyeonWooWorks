package works.baehyeonwoo.paperserverlistpingdesign

import org.bukkit.Bukkit
import org.bukkit.plugin.java.JavaPlugin
import works.baehyeonwoo.paperserverlistpingdesign.paperevent.PaperEvent

/**
 *
 * @author BaeHyeonWoo
 *
 */


class PaperMain : JavaPlugin() {

    @Override
    override fun onEnable() {
        Bukkit.getPluginManager().registerEvents(PaperEvent(), this)
    }
}
