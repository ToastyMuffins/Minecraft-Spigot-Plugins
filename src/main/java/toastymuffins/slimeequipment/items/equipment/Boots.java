package toastymuffins.slimeequipment.items.equipment;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class Boots{

    public static ItemStack boots;

    public static void init(){
        createBoot();
    }

    private static void createBoot(){
        ItemStack item = new ItemStack(Material.DIAMOND_BOOTS,1);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName(ChatColor.GREEN + "Slime Boots");
        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.GREEN + "It's like jumping on king slime!");
        meta.setLore(lore);
        item.setItemMeta(meta);



//        net.minecraft.server.v1_16_5.ItemStack nmsStack = CraftItemStack.asNMSCopy(item);
//        NBTTagCompound compound = (nmsStack.hasTag()) ? nmsStack.getTag() : new NBTTagCompound();
//        NBTTagList modifiers = new NBTTagCompound();
//        NBTTagCompound name = new NBTTagCompound();


        boots = item;

    }
}
