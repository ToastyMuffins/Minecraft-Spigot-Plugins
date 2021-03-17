package toastymuffins.slimeequipment;

import org.bukkit.plugin.java.JavaPlugin;
import toastymuffins.slimeequipment.commands.ToastyTimesCommands;
import toastymuffins.slimeequipment.events.ToastyTimesEvent;
import toastymuffins.slimeequipment.items.equipment.Boots;
import toastymuffins.slimeequipment.items.tools.Swords;

import java.util.Objects;

public final class ToastyTimes extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new ToastyTimesEvent(), this);
        Boots.init();
        Swords.init();
        Objects.requireNonNull(getCommand("slimeboots")).setExecutor(new ToastyTimesCommands());
        Objects.requireNonNull(getCommand("fungisword")).setExecutor(new ToastyTimesCommands());


    }

    @Override
    public void onDisable() {

    }
}
