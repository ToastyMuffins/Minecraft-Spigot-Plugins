package toastymuffins.slimeequipment.items.tools;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class Swords {

    public static ItemStack swords;

    public static void init(){
        createSword();
    }

    private static void createSword(){
        ItemStack item = new ItemStack(Material.DIAMOND_SWORD,1);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName(ChatColor.RED + "Fungi Sword");
        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.RED + "You feel like a vegetarian.");
        meta.setLore(lore);
        meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, new AttributeModifier("attackDamage", 12, AttributeModifier.Operation.ADD_NUMBER));
        item.setItemMeta(meta);


        swords = item;

    }
}
