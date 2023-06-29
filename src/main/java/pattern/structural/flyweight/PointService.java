package pattern.structural.flyweight;

public class PointService {
    private final PointFactory pointFactory;

    public PointService(PointFactory pointFactory) {
        this.pointFactory = pointFactory;
    }

    public PointIcon getIcon(PointType pointType){
        return pointFactory.getPointIcon(pointType);
    }
}
