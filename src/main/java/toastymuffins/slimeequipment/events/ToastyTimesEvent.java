package toastymuffins.slimeequipment.events;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class ToastyTimesEvent implements Listener {

    //these list are for comparing the lore in game so it doesn't have to go by name.
    List<String> SlimeBootsList = new ArrayList<>(Arrays.asList(ChatColor.GREEN + "It's like jumping on king slime!"));
    List<String> FungiSwordList = new ArrayList<>(Arrays.asList(ChatColor.RED + "You feel like a vegetarian."));

    @EventHandler
    public void onMove(PlayerMoveEvent event){
        Player player = event.getPlayer();

        //SlimeBoots
        if(player.getInventory().getBoots() != null){
            if(Objects.equals(Objects.requireNonNull(player.getInventory().getBoots().getItemMeta()).getLore(), SlimeBootsList)) {
                player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 100,2));
            }
        }

        //Fungi Sword
        if(player.getInventory().getItemInMainHand().getType().equals(Material.DIAMOND_SWORD)){
            if(Objects.equals(Objects.requireNonNull(player.getInventory().getItemInMainHand().getItemMeta()).getLore(), FungiSwordList)){
                Objects.requireNonNull(player.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(16);

            }
        }else{
            if(Objects.requireNonNull(player.getAttribute(Attribute.GENERIC_MAX_HEALTH)).getBaseValue() == 16){
                Objects.requireNonNull(player.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(20);
            }
        }
    }

    @EventHandler
    public void onFall(EntityDamageEvent event){
        if(event.getEntity() instanceof Player){
            Player player = (Player) event.getEntity();

            //Slime Boots negate Fall damage
            //btw idk why it need 2 Objects.requireNonNull but it doesn't seem to work without it.
            if(event.getCause() == EntityDamageEvent.DamageCause.FALL && !player.isGliding()){
                if(Objects.equals(Objects.requireNonNull(Objects.requireNonNull(player.getInventory().getBoots()).getItemMeta()).getLore(), SlimeBootsList)){
                    event.setCancelled(true);
                }
            }
        }
    }
}

/*
things to fix
1.fall damage when gliding
2.correct life taken when sword is in main hand
3.bring max life to full when sword is unequiped
 */