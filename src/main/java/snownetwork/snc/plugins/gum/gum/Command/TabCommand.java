package snownetwork.snc.plugins.gum.gum.Command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class TabCommand implements TabCompleter {
    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
        if(sender instanceof Player){
            Player p =(Player)sender;
            if(p.hasPermission("snow.admin")){
                List<String> result = new ArrayList<>();
                result.add("help");
                result.add("get");
                result.add("reload");
                return result;
            }
        }
        return null;
    }
}
