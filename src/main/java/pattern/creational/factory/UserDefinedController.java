package pattern.creational.factory;

import pattern.creational.factory.framework.Controller;
import pattern.creational.factory.framework.ViewEngine;

import java.util.HashMap;
import java.util.Map;

/*
* This controller is outside the core framework codebase.
* It leverages frameworks classes to react to client request.
* Basically, work of UserDefinedController is to list products fetched from DB on client browser.
* */
public class UserDefinedController extends Controller {
    public String listProducts(){
        // Get Products from DB.
        Map<String,Object> context = new HashMap<>();
        // context.put("products", fetchedProductFromDb)
        return render("products.html",context);
    }


    @Override
    protected ViewEngine getViewEngine(){
        /*return new ViewEngine() {
            @Override
            public String render(String viewName, Map<String, Object> context) {
                return "Factory Pattern to use custom view engine";
            }
        };*/
        // Lambda is just syntactic sugar to replace anonymous inner classes.
        return (viewName, context) -> "Factory Pattern to use custom view engine";
    }

}
