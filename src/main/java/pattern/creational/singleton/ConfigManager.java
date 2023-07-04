package pattern.creational.singleton;

import java.util.HashMap;
import java.util.Map;

public class ConfigManager {
    private final Map<String,Object> config = new HashMap<>();
    private final static ConfigManager instance = new ConfigManager();

    // This is done to prevent creation of new objects.
    private ConfigManager(){}

    public void set(String key, Object val){
        config.put(key,val);
    }

    public Object get(String key){
        return config.get(key);
    }

    public static ConfigManager getInstance() {
        return instance;
    }
}
