package pattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class PointFactory {
    private final Map<PointType,PointIcon> pointCache = new HashMap<>();

    public PointIcon getPointIcon(PointType pointType){
        if(!pointCache.containsKey(pointType)){
            pointCache.put(pointType,new PointIcon(pointType,null));
        }
        return pointCache.get(pointType);
    }
}
