package ss7_abstract_interface_bai1;

import ss7_abstract_interface_bai1.Circle;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle.getArea());
//        System.out.println(circle);
        circle.Resize(30);
        System.out.println(circle.getArea());
//
//        circle = new Circle(3.5, "indigo", false);
//        System.out.println(circle);
    }
}
