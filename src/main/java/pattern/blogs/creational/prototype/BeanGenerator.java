package pattern.blogs.creational.prototype;

public class BeanGenerator {

    public static BeanContext generateBean(BeanContext beanContext){
        return beanContext.cloneBean();
    }
}
