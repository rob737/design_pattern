package pattern.structural.composite;

public class Driver {
    public static void main(String[] args) {
        Shape firstSquare = new Shape();
        Shape secondSquare = new Shape();
        Shape thirdSquare = new Shape();
        Shape fourthSquare = new Shape();

        Group firstGroup = new Group();
        firstGroup.add(firstSquare);
        firstGroup.add(secondSquare);

        Group secondGroup = new Group();
        secondGroup.add(thirdSquare);
        secondGroup.add(fourthSquare);

        Group root = new Group();
        root.add(firstGroup);
        root.add(secondGroup);

        firstGroup.render();
        //secondGroup.render();
       // root.render();
    }
}
