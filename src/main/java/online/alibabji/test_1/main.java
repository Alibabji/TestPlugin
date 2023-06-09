package online.alibabji.test_1;

import org.bukkit.plugin.java.JavaPlugin;

public final class main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("plugin in now running");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("plugin in not anymore running");
    }
}
