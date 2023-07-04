package pattern.creational.factory.framework;

import java.util.Map;

/*
* Use case of this class is to parse html file and create a view that would be
* sent to the client for rendering on browser.
* */
public class NewViewEngine implements ViewEngine {
    public String render(String viewName, Map<String, Object> context){
        // context basically contains run time data that needs to be passed to html template.
        return "View rendered by new web framework";
    }
}
