package snownetwork.snc.plugins.gum.gum;

import org.bukkit.plugin.java.JavaPlugin;
import snownetwork.snc.plugins.gum.gum.Command.TabCommand;
import snownetwork.snc.plugins.gum.gum.Command.gettype;
import snownetwork.snc.plugins.gum.gum.Command.gunc;
import snownetwork.snc.plugins.gum.gum.config.Data;
import snownetwork.snc.plugins.gum.gum.config.config;

public final class gun extends JavaPlugin {
    private static gun guns;

    @Override
    public void onEnable() {
        // Plugin startup logic
        guns=this;
        Data.LoadData();
        config.loadConfig();
        getLogger().info("§c[SNC Gun]:加载成功");
        getCommand("sgun").setExecutor(new gunc());
        getCommand("gettype").setExecutor(new gettype());
        getCommand("sgun").setTabCompleter(new TabCommand());

    }

    @Override
    public void onDisable() {
        getLogger().info("§c[SNC Gun]:卸载成功");
        // Plugin shutdown logic
    }
    public static gun getInstance(){
        return guns;
    }
}
