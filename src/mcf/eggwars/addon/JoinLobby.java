package mcf.eggwars.addon;

import java.util.Arrays;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import mcf.eggwars.FMain;
import me.wazup.eggwars.Eggwars;
import me.wazup.eggwars.EggwarsAPI;
import me.wazup.eggwars.events.EWPlayerJoinArenaEvent;
import me.wazup.eggwars.events.EWPlayerLeaveArenaEvent;

public class JoinLobby implements Listener {
	
	@EventHandler(priority = EventPriority.HIGHEST)
	public void joinlobby (PlayerJoinEvent e) {
		Player p = e.getPlayer();
		Bukkit.getScheduler().runTaskLater(FMain.m, () -> {
			Bukkit.dispatchCommand(p, "ew join");
		}, 5);
	}
	
	@EventHandler
	public void aa(PlayerCommandPreprocessEvent e) {
		
		List<String> list = Arrays.asList("?", "help", "ehelp", "plugins", "pl");

		String msg = e.getMessage().substring(1).split(" ")[0];

		if (list.contains(msg)) {
			e.setCancelled(true);

			Player p = e.getPlayer();

			p.sendMessage("§7§m------------------------------");
			p.sendMessage("§a<> §a§lBEDWARS MCFAMILY");
			p.sendMessage("§a");
			p.sendMessage("§a Rủ bạn bè vào chơi cùng nhé");
			p.sendMessage("§a");
			p.sendMessage("§7§m------------------------------");
		}
	}
	
	@EventHandler
	public void joinarena(EWPlayerJoinArenaEvent e) {
		Player p = e.getPlayer();
		
		Bukkit.broadcastMessage("§6[§aBedwars§6] §e" + p.getName() + " §6đã vào phòng §a" + e.getArenaName());
		
		EggwarsAPI api = Eggwars.api;
		
		if (api.isSpectating(p)) {
			p.setGameMode(GameMode.SPECTATOR);
			p.setFlying(true);
			p.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 99999, 2));
		}
	}
	
	@SuppressWarnings("deprecation")
	@EventHandler
	public void quitarena(EWPlayerLeaveArenaEvent e) {
		Player p = e.getPlayer();
		
		p.setMaxHealth(20);
	}
	
}
