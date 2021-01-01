package snownetwork.snc.plugins.gum.gum.config;

import org.bukkit.configuration.file.FileConfiguration;
import snownetwork.snc.plugins.gum.gum.gun;

public class config {
    private static FileConfiguration configuration;
    public static void loadConfig(){
        gun.getInstance().getConfig().options().copyDefaults();
        gun.getInstance().saveDefaultConfig();
        gun.getInstance().reloadConfig();
        configuration=gun.getInstance().getConfig();
    }

    public static FileConfiguration getConfiguration() {
        return configuration;
    }
}
