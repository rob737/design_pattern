package pattern.blogs.creational.prototype;

public class Driver {
    public static void main(String[] args) {
        BeanContext beanContext = new ConnectionBean(8080, "db:mysql");
        BeanContext clonedBean = BeanGenerator.generateBean(beanContext);

        System.out.println(beanContext);
        System.out.println(clonedBean);

    }
}
