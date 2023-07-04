package pattern.creational.factory.framework;

import java.util.Map;
/*
* The problem with commented code is that we are forced to use Frameworks in-built view engine,
* let's say we got to know of a better engine but since our framework is tightly
* coupled with NewViewEngine , we won't be able to leverage other view engines.
* Another approach is to create an interface and let concrete implementation be
* late bound to it at runtime but that would lead to passing concrete view engine
* everytime we are calling render method which is very cumbersome.
*
* Hmm, I think we can pass view Engine as constructor parameter as well in Controller and leverage
* polymorphism to get the work done.
*
* But, factory method pattern does it elegantly.
* */
public class Controller {
    protected String render(String viewName, Map<String,Object> context){
        //NewViewEngine engine = new NewViewEngine();
        ViewEngine engine = getViewEngine();
        String htmlContent = engine.render(viewName,context);
        System.out.println(htmlContent);
        return htmlContent;
    }

    // This can be an abstract method as well, However currently we are good with providing default implementation.
    protected ViewEngine getViewEngine(){
        return new NewViewEngine();
    }
}
