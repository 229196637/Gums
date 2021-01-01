package snownetwork.snc.plugins.gum.gum.config;

import org.bukkit.configuration.file.YamlConfiguration;
import snownetwork.snc.plugins.gum.gum.gun;

import java.io.File;

public class Data {
    private static YamlConfiguration gamedata;

    public static void LoadData() {
        File file = new File(gun.getInstance().getDataFolder(), "guns.yml");
        if (!file.exists()) {
            gun.getInstance().saveResource("guns.yml", false);

        }
        gamedata = YamlConfiguration.loadConfiguration(file);
    }

    public static YamlConfiguration getGamedata() {
        return gamedata;
    }
}
