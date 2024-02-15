package pattern.blogs.creational.singleton;

public class Driver {
    public static void main(String[] args) {
        Cache cache = Cache.getInstance();
        cache.set("User", new Object());

        System.out.println(cache.get("User"));

        Cache cache1 = Cache.getInstance();

        System.out.println(cache1.get("User"));
    }
}
