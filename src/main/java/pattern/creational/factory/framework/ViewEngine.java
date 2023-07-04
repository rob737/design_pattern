package pattern.creational.factory.framework;

import java.util.Map;
// Functional Interface.
public interface ViewEngine {
    String render(String viewName, Map<String,Object> context);
}
