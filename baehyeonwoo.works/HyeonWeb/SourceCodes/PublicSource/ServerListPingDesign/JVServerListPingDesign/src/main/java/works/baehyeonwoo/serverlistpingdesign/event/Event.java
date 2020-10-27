package works.baehyeonwoo.serverlistpingdesign.event;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerListPingEvent;

public class Event implements Listener {
    @EventHandler
    public void onServerListPingEvent(ServerListPingEvent e) {

        // Java계열일 경우, String과 Int값 모두 괄호 안에 들어갑니다. 네 이게 끝입니다. ㅋㅋㅋㅋㅋㅋ (If you're on Java, String and Int both are in brackets. That's all lmfao)

        e.setMaxPlayers(1972);
        e.setMotd(ChatColor.GREEN + "Welcome.");

    }
}
