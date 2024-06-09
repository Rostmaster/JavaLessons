import Hierarchy.MovablePoint;
import Hierarchy.OfficeChair;
import Hierarchy.SchoolChair;

public class Main {

    public static void main(String[] args) {
        //Hierarchy
        SchoolChair schoolChair = new SchoolChair("Turbo", 4, 1000);
        schoolChair.printInfo();

        OfficeChair officeChair = new OfficeChair("Power Seat", 5, 2000);
        officeChair.setDiscountAmount(10);
        officeChair.printInfo();

        //Interfaces
        MovablePoint point = new MovablePoint(0, 0, 3, 2);
        System.out.println(point);

        point.moveLeft();
        point.moveUp();
        System.out.println(point);
    }


}
