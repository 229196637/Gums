package snownetwork.snc.plugins.gum.gum.Command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import snownetwork.snc.plugins.gum.gum.config.Data;
import snownetwork.snc.plugins.gum.gum.config.config;

public class gunc implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player){
            Player p=(Player)sender;
            if(p.hasPermission("snow.admin")){
                if(args.length>=1){
                    if(args[0].equalsIgnoreCase("help")){
                        p.sendMessage("§b-----------[§6帮助界面§b]----------------");
                        p.sendMessage("§e输入§a/sgum get§e获取枪械");
                        p.sendMessage("§e输入§a/sgum reload§e重载配置文件");
                    }else if(args[0].equalsIgnoreCase("reload")){
                        config.loadConfig();//重载配置文件
                        Data.LoadData();
                    }
                }else {
                    p.sendMessage("§e请输入/sgum help获取帮助");
                }
            }
        }
        return false;
    }
}
