import Hierarchy.MovablePoint;

public class Main {

    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(0, 0, 3, 2);
        System.out.println(point);

        point.moveLeft();
        point.moveUp();
        System.out.println(point);
    }


}
