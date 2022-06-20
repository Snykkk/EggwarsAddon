package mcf.eggwars.addon;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import ro.mag.bedwars.customevents.PlayerJoinArenaEvent;

public class JoinLobby2 implements Listener {
	
	@EventHandler
	public void joinarena(PlayerJoinArenaEvent e) {
		Player p = e.getPlayer();
		
		Bukkit.broadcastMessage("§6[§aBedwars§6] §e" + p.getName() + " §6đã vào phòng §a" + e.getArena().name);
	}
}
