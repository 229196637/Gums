package snownetwork.snc.plugins.gum.gum.Command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class gettype implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if(commandSender instanceof Player){
            Player p=(Player)commandSender;
            if(p.hasPermission("snow.admin")){
                p.sendMessage("§e该物品的Type为:§a"+p.getInventory().getItemInHand().getType());

            }

        }
        return false;
    }
}
