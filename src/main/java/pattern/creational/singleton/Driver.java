package pattern.creational.singleton;

public class Driver {
    public static void main(String[] args) {
        ConfigManager configManager = ConfigManager.getInstance();
        configManager.set("-Xms","2048MB");
        System.out.println(configManager.get("-Xms"));
        ConfigManager redundantConfigManager = ConfigManager.getInstance();
        System.out.println(redundantConfigManager.get("-Xms"));
    }
}
