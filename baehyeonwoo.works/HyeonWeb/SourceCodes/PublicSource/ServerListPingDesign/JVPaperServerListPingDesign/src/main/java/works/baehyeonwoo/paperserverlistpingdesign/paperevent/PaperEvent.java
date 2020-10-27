package works.baehyeonwoo.paperserverlistpingdesign.paperevent;

import com.destroystokyo.paper.event.server.PaperServerListPingEvent;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class PaperEvent implements Listener {

    @EventHandler
    public void onPaperServerListPingEvent(PaperServerListPingEvent e) {
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
             * 색이 적혀있는 코드는 샘플 코드이며, 주석 처리된 코드는 noonmaru님의 aimless 레포지토리에서 가져왔습니다.
             *
             * 문제가 생길시 인용된 코드를 삭제하겠습니다.
             */

            e.setNumPlayers(0);
            e.setMaxPlayers(1972); // TMI : 이때 김두한 죽은 해입니다. (TMI : On this year, Kim Doo Han has died.)
            e.setMotd(ChatColor.GREEN + "Welcome.");
            }

            /**
             *
             * 이 코드는 noonmaru님의 aimless 레포지토리에서 가져왔습니다. 링크를 통하여 코드를 확인 부탁드리며, 원 코드 작성자가 요청시 삭제 될 수 있습니다.
             * This code is from noonmaru's repository "aimless". Click the link to check the code. If original author requests, it will be deleted.
             * (https://github.com/noonmaru/aimless/blob/424bad6c00f5fa0f08f07326bcb3efaf797bad6c/src/main/kotlin/com/github/noonmaru/aimless/plugin/EventListener.kt#L86)
             *
             * @EventHandler
             * fun onPaperServerListPing(PaperServerListPingEvent event) {
             * Calendar c = Calendar.getInstance();
             *
             * event.setNumPlayers = String.valueOf(c.get(Calendar.YEAR) * 10000 + (c.get(Calendar.MONTH) +1) *100 + c.get(Calendar.DAY_OF_MONTH))
             * event.setMaxPlayers = String.valueOf(c.get(Calendar.HOUR) * 10000 + c.get(Calendar.MINUTE) * 100 + c.get(Calendar.SECOND))
             *
             * event.getPlayerSample().clear();
             * }
             *
             */

// 이외의 자세한 PaperServerListPingEvent 사용법은 여기를 참고하세요. (Other Details of PaperServerListPingEvent can be checked here.) : https://papermc.io/javadocs/paper/1.16/com/destroystokyo/paper/event/server/PaperServerListPingEvent.html


            }