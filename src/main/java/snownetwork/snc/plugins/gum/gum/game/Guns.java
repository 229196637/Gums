package snownetwork.snc.plugins.gum.gum.game;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class Guns {
    private ItemStack item=null;
    private Material itemMaterial=null;
    private String name=null;
    private int Bullet;
    private  int shootspeed;
    public Guns(String name,int bullet,int shootspeed,ItemStack item){
        this.item=item;
        itemMaterial =item.getType();
        this.name=name;
        Bullet=bullet;
        this.shootspeed=shootspeed;
    }
}
