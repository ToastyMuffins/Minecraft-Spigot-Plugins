package toastymuffins.slimeequipment.items.equipment;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class Helmets {

    public static ItemStack helmets;

    public static void init(){
        createHelmet();
    }

    private static void createHelmet(){
        ItemStack item = new ItemStack(Material.GOLDEN_HELMET,1);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName(ChatColor.GOLD + "Crown of the King");
        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.GOLD + "A kingly crown that grants");
        lore.add(ChatColor.GOLD + "the wearer unwavering power!");
        meta.setLore(lore);
        item.setItemMeta(meta);


        helmets = item;
    }
}
