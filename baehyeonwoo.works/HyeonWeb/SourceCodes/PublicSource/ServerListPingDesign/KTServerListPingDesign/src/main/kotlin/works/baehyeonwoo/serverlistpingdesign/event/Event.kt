package works.baehyeonwoo.serverlistpingdesign.event

import org.bukkit.event.server.ServerListPingEvent
import org.bukkit.ChatColor
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener

class Event : Listener {

    @EventHandler
    fun onServerListPingEvent(e: ServerListPingEvent) {

        /**
         * numPlayers means how much players have joined,
         * maxPlayers means how many players can join in server.
         * motd is "Message of the Day." which similar as Server description & comments.
         * playerSample is player list you can check in multiplayer server list, which can be shown if you move your mouse onto playercount + ping info.
         */

        /**
         * numPlayers는 현재 플레이어가 접속한 수를 이야기 합니다.
         * maxPlayers는 플레이어가 서버에 접속 할 수 있는 최대치를 이야기 합니다.
         * motd는 "오늘 하루의 메시지(?)"를 뜻하며, 서버 설명이나 코멘트와 비슷합니다.
         * 플레이어샘플은 멀티플레이어 서버 리스트에서 플레이어수 + 핑이 표시된 곳에 마우스를 가져다 두면 나오는 플레이어 리스트입니다.
         */

        /**
         * Spigot에서는 getNumPlayers(numPlayers)만 작동됩니다. (On Spigot, numPlayers only works with getNumPlayers.)
         */

        e.maxPlayers = 1121 // TMI : 이때 김두한 죽은 해입니다. (TMI : On this year, Kim Doo Han has died.)
        e.motd = "${ChatColor.GREEN}Welcome." // 만일 하나의 String으로 묶는것이 어려운 초보 분들께서는 이 코드를 사용하세요. (Beginner coders who don't how how to use codes with one string, use this.) : ChatColor.GREEN.toString() + "Welcome."
    }

// 이외의 자세한 ServerListPingEvent 사용법은 여기를 참고하세요. (Other Details of PaperServerListPingEvent can be checked here.) : https://hub.spigotmc.org/javadocs/spigot/org/bukkit/event/server/ServerListPingEvent.html


}