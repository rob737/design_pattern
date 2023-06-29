package pattern.structural.flyweight;

/*
* Assuming that we are making an app of the level of Google maps,
* there can be thousands of points that can be loaded into memory at runtime.
*
* This would cause our APPS to bloat up and occasionally crash as well.
*
* To mitigate memory issue, we can leverage flyweight pattern.
* */
public class Driver {
    public static void main(String[] args) {
        PointService pointService = new PointService(new PointFactory());
        // Icon for hospital is created for the first time and same instance is re-used for point 1
        Point point = new Point(2, 3, pointService.getIcon(PointType.HOSPITAL));
        Point point1 = new Point(4,5, pointService.getIcon(PointType.HOSPITAL));
        point.draw();
        point1.draw();
    }
}
