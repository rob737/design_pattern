package pattern.blogs.creational.singleton;

import java.util.HashMap;
import java.util.Map;

public class Cache {
    private static final Map<String, Object> cache = new HashMap<>();
    private static final Cache instance = new Cache();

    private Cache(){}

    public void set(String key, Object value){
        cache.put(key,value);
    }

    public Object get(String key){
        return cache.get(key);
    }

    public static Cache getInstance(){
        return instance;
    }
}
