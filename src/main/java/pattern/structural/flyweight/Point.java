package pattern.structural.flyweight;

public class Point {
    private final int x;
    private final int y;
    /*private final PointType pointType;
    private final byte[] image;*/
    // Whenever, new point is created, PointIcon must be fetched from factory and must be reused.
    private final PointIcon pointIcon;

    public Point(int x, int y, PointIcon pointIcon) {
        this.x = x;
        this.y = y;
        /*this.pointType = pointType;
        this.image = image;*/
        this.pointIcon = pointIcon;
    }

    public void draw(){
        System.out.printf("%s at (%d, %d)",pointIcon.getPointType(),x,y);
    }
}
