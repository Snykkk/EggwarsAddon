package mcf.eggwars;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import mcf.eggwars.addon.GUISetting;
import mcf.eggwars.addon.JoinLobby;
import mcf.eggwars.addon.JoinLobby2;
import mcf.eggwars.api.FItem;
import mcf.eggwars.api.FSkull;

public class FMain extends JavaPlugin {
	
	public static FMain m;
	
	@Override
	public void onEnable() {

		m = this;
		
		Bukkit.getConsoleSender().sendMessage("§b|===========================================|");
		Bukkit.getConsoleSender().sendMessage("§b|                 EggwarsAddon              |");
		Bukkit.getConsoleSender().sendMessage("§b|                    Snykkk                 |");
		Bukkit.getConsoleSender().sendMessage("§b|===========================================|");
		
		if (Bukkit.getPluginManager().isPluginEnabled("EggWars")) {
			Bukkit.getConsoleSender().sendMessage("§bFound Eggwars!");
			Bukkit.getPluginManager().registerEvents(new GUISetting(), this);
			Bukkit.getPluginManager().registerEvents(new JoinLobby(), this);
		}
		
		if (Bukkit.getPluginManager().isPluginEnabled("BedWars")) {
			Bukkit.getConsoleSender().sendMessage("§bFound Bedwars!");

			Bukkit.getPluginManager().registerEvents(new JoinLobby2(), this);
		}
	}

	@Override
	public void onDisable() {
		Bukkit.getConsoleSender().sendMessage("§bEggwarsAddon disabling ...");
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String a, String[] args) {
		
		if (a.equalsIgnoreCase("bw") && sender.isOp()) {
			if (args.length == 2 && args[0].equals("setting")) {
				ItemStack i = new FItem(FSkull.byName("Snykkk"))
								.setName("§aEdit §f" + args[1])
								.addLore("§fRight click to open gui setting")
								.toItemStack();
				
				((Player) sender).getInventory().addItem(i);
			}
		}
		
		if (a.equalsIgnoreCase("tb") && sender.isOp()) {
			if (args.length > 0) {
				String msg = "";
				for(int i = 0; i < args.length; i++) {
					msg = msg + args[i] + " ";
				}
				Bukkit.broadcastMessage(msg.replaceAll("&","§"));
			}
			else {
				sender.sendMessage("§cDùng /tb <tin>");
			}
		}
		
		return true;
	}
}
