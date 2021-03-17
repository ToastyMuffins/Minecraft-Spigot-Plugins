package toastymuffins.slimeequipment.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import toastymuffins.slimeequipment.items.equipment.Boots;
import toastymuffins.slimeequipment.items.tools.Swords;

public class ToastyTimesCommands implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(!(sender instanceof Player)){
            return true;
        }
        Player player = (Player) sender;


        if(command.getName().equalsIgnoreCase("slimeboots")){
            if(player.isOp() || player.getPlayerListName().equalsIgnoreCase("ToasttheRoast")){
                player.getInventory().addItem(Boots.boots);
            }else{
                player.sendMessage("you are not allowed to use this command.");
            }

        }

        if(command.getName().equalsIgnoreCase("fungisword")){
            if(player.isOp() || player.getPlayerListName().equalsIgnoreCase("ToasttheRoast")){
                player.getInventory().addItem(Swords.swords);
            }else{
                player.sendMessage("you are not allowed to use this command.");
            }
        }

        return true;
    }
}