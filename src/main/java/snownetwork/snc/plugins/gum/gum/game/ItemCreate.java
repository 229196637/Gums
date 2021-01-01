package snownetwork.snc.plugins.gum.gum.game;

import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import snownetwork.snc.plugins.gum.gum.config.Data;
import snownetwork.snc.plugins.gum.gum.config.config;

import java.util.ArrayList;
import java.util.HashMap;

public class ItemCreate {
    public static HashMap<Integer,Guns> Gunslist=new HashMap<>();
    FileConfiguration cg = config.getConfiguration();
    FileConfiguration Da = Data.getGamedata();
    public static void createguns(){

    }
    public void createitem(Material material,String name,int number){
        ItemStack itemStack=new ItemStack(material);
        ItemMeta itemMeta=itemStack.getItemMeta();
        itemMeta.setDisplayName(name+"§e(右键点击)");
        ArrayList<String> lore=new ArrayList<>();
        lore.add("§e弹药数:+§a"+number);
        itemMeta.setLore(lore);
        itemStack.setItemMeta(itemMeta);
    }
}
