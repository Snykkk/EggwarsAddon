package mcf.eggwars.addon;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;

import mcf.eggwars.api.FItem;

public class GUISetting implements Listener {
	
	
	
	public static void open(Player p, String arena) {
		
		Inventory inv = Bukkit.createInventory(null, 27, "§5[Setting] " + arena);
		
		for (int i = 1; i <= 8; i++) {
			inv.setItem(i - 1, new FItem(Material.BED)
					.setName(getTeam(i))
					.addLore("§a" + arena)
					.addLore("")
					.addLore("§fLeft-click to set team spawn")
					.addLore("§fRight-click to set team bed")
					.toItemStack());
		}

		inv.setItem(9, new FItem(Material.COMPASS)
				.setName("§eSet lobby")
				.addLore("§a" + arena)
				.addLore("")
				.addLore("§fLeft-click to set")
				.toItemStack());
		inv.setItem(10, new FItem(Material.COMPASS)
				.setName("§eSet spectator")
				.addLore("§a" + arena)
				.addLore("")
				.addLore("§fLeft-click to set")
				.toItemStack());
		inv.setItem(11, new FItem(Material.LEATHER_HELMET)
				.setName("§eAdd villager")
				.addLore("§a" + arena)
				.addLore("")
				.addLore("§fLeft-click to add")
				.toItemStack());

		inv.setItem(18, new FItem(Material.IRON_INGOT)
				.setName("§eAdd spawner IRON_INGOT")
				.addLore("§a" + arena)
				.addLore("")
				.addLore("§fLeft-click to add")
				.toItemStack());
		inv.setItem(19, new FItem(Material.GOLD_INGOT)
				.setName("§eAdd spawner GOLD_INGOT")
				.addLore("§a" + arena)
				.addLore("")
				.addLore("§fLeft-click to add")
				.toItemStack());
		inv.setItem(20, new FItem(Material.DIAMOND)
				.setName("§eAdd spawner DIAMOND")
				.addLore("§a" + arena)
				.addLore("")
				.addLore("§fLeft-click to add")
				.toItemStack());
		inv.setItem(21, new FItem(Material.EMERALD)
				.setName("§eAdd spawner EMERALD")
				.addLore("§a" + arena)
				.addLore("")
				.addLore("§fLeft-click to add")
				.toItemStack());
		
		p.openInventory(inv);
	}
	
	@EventHandler
    public void onClick(InventoryClickEvent e) {
		if (e.getView().getTitle().contains("§5[Setting] ")) {
			e.setCancelled(true);
			
			String arena = ChatColor.stripColor(e.getView().getTitle().split(" ")[1].toString());
			
			try {
				Player p = (Player) e.getWhoClicked();
				String name = e.getCurrentItem().getItemMeta().getDisplayName();

				if (name.contains("RED")) {
					if (e.getClick() == ClickType.LEFT) {
						Bukkit.dispatchCommand(p, "ew setteamspawn " + arena + " RED");
						p.sendMessage("Set team spawn RED");
					}
					if (e.getClick() == ClickType.RIGHT) {
						Bukkit.dispatchCommand(p, "ew setteamegg " + arena + " RED");
						p.sendMessage("Set team egg RED");
					}
				}
				if (name.contains("YELLOW")) {
					if (e.getClick() == ClickType.LEFT) {
						Bukkit.dispatchCommand(p, "ew setteamspawn " + arena + " YELLOW");
						p.sendMessage("Set team spawn YELLOW");
					}
					if (e.getClick() == ClickType.RIGHT) {
						Bukkit.dispatchCommand(p, "ew setteamegg " + arena + " YELLOW");
						p.sendMessage("Set team egg YELLOW");
					}
				}
				if (name.contains("BLUE")) {
					if (e.getClick() == ClickType.LEFT) {
						Bukkit.dispatchCommand(p, "ew setteamspawn " + arena + " BLUE");
						p.sendMessage("Set team spawn BLUE");
					}
					if (e.getClick() == ClickType.RIGHT) {
						Bukkit.dispatchCommand(p, "ew setteamegg " + arena + " BLUE");
						p.sendMessage("Set team egg BLUE");
					}
				}
				if (name.contains("GREEN")) {
					if (e.getClick() == ClickType.LEFT) {
						Bukkit.dispatchCommand(p, "ew setteamspawn " + arena + " GREEN");
						p.sendMessage("Set team spawn GREEN");
					}
					if (e.getClick() == ClickType.RIGHT) {
						Bukkit.dispatchCommand(p, "ew setteamegg " + arena + " GREEN");
						p.sendMessage("Set team egg GREEN");
					}
				}
				if (name.contains("PINK")) {
					if (e.getClick() == ClickType.LEFT) {
						Bukkit.dispatchCommand(p, "ew setteamspawn " + arena + " LIGHT_PURPLE");
						p.sendMessage("Set team spawn PINK");
					}
					if (e.getClick() == ClickType.RIGHT) {
						Bukkit.dispatchCommand(p, "ew setteamegg " + arena + " LIGHT_PURPLE");
						p.sendMessage("Set team egg PINK");
					}
				}
				if (name.contains("GRAY")) {
					if (e.getClick() == ClickType.LEFT) {
						Bukkit.dispatchCommand(p, "ew setteamspawn " + arena + " GRAY");
						p.sendMessage("Set team spawn GRAY");
					}
					if (e.getClick() == ClickType.RIGHT) {
						Bukkit.dispatchCommand(p, "ew setteamegg " + arena + " GRAY");
						p.sendMessage("Set team egg GRAY");
					}
				}
				if (name.contains("WHITE")) {
					if (e.getClick() == ClickType.LEFT) {
						Bukkit.dispatchCommand(p, "ew setteamspawn " + arena + " WHITE");
						p.sendMessage("Set team spawn WHITE");
					}
					if (e.getClick() == ClickType.RIGHT) {
						Bukkit.dispatchCommand(p, "ew setteamegg " + arena + " WHITE");
						p.sendMessage("Set team egg WHITE");
					}
				}
				if (name.contains("AQUA")) {
					if (e.getClick() == ClickType.LEFT) {
						Bukkit.dispatchCommand(p, "ew setteamspawn " + arena + " AQUA");
						p.sendMessage("Set team spawn AQUA");
					}
					if (e.getClick() == ClickType.RIGHT) {
						Bukkit.dispatchCommand(p, "ew setteamegg " + arena + " AQUA");
						p.sendMessage("Set team egg AQUA");
					}
				}

				if (name.contains("§eSet lobby")) {
					Bukkit.dispatchCommand(p, "ew setlobby " + arena);
					p.sendMessage(e.getView().getTitle().split("§5[Setting] ")[1]);
				}
				if (name.contains("§eSet spectator")) {
					Bukkit.dispatchCommand(p, "ew setspectators " + arena);
					p.sendMessage("Set spectator " + arena);
				}
				if (name.contains("§eAdd villager")) {
					Bukkit.dispatchCommand(p, "ew addvillager " + arena);
					p.sendMessage("Add villager " + arena);
				}
				if (name.contains("IRON_INGOT")) {
					Bukkit.dispatchCommand(p, "ew addspawner " + arena + " IRON_INGOT 50 false");
				}
				if (name.contains("GOLD_INGOT")) {
					Bukkit.dispatchCommand(p, "ew addspawner " + arena + " GOLD_INGOT 100 false");
				}
				if (name.contains("DIAMOND")) {
					Bukkit.dispatchCommand(p, "ew addspawner " + arena + " DIAMOND 800 false");
				}
				if (name.contains("EMERALD")) {
					Bukkit.dispatchCommand(p, "ew addspawner " + arena + " EMERALD 1200 false");
				}
				
			} catch (Exception ex) {}
		}
	}

	@EventHandler
	public void click2 (PlayerInteractEvent e) {
		if (e.getAction().toString().contains("RIGHT")) {
			Player p = e.getPlayer();
			try {
				if (p.getInventory().getItemInMainHand().getItemMeta().getDisplayName().contains("§aEdit ")) {
					e.setCancelled(true);
					
					String arena = ChatColor.stripColor(p.getInventory().getItemInMainHand().getItemMeta().getDisplayName());
					
					open(p, arena.split("Edit ")[1]);
				}
			}
			catch (Exception ex) {}
		}
	}
	
	public static String getTeam (int i) {
		if (i == 1) {return "§cRED";}
		if (i == 2) {return "§eYELLOW";}
		if (i == 3) {return "§9BLUE";}
		if (i == 4) {return "§aGREEN";}
		if (i == 5) {return "§7GRAY";}
		if (i == 6) {return "§dPINK";}
		if (i == 7) {return "§fWHITE";}
		if (i == 8) {return "§bAQUA";}
		
		return null;
	}
	
}
