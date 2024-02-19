package pattern.blogs.structural.proxy;

public class Demo {
    static void mockUserRequest(){
        String query = "select count(1) from employee";

        Resource resource = new CloudDbProxy("free");
        resource.execute(query);
    }
}
