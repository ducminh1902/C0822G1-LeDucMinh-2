package ss7_abstract_interface_bai1;

import ss7_abstract_interface_bai1.Rectangle;

public class RetangleTest {
    public static void main(String[] args) {
        Rectangle rectangle= new Rectangle();
        System.out.println(rectangle);

        Rectangle rectangle1 = new Rectangle(1.5, 3.6);
        System.out.println("diện tích ban đầu"+rectangle1.getArea());
//        System.out.println(rectangle1);
        rectangle.Resize(20);
        System.out.println("diện tích khi tăng "+rectangle1.getArea());
//        Rectangle rectangle2 = new Rectangle("orange", false, 1, 3.6);
//        System.out.println(rectangle2);
   }
}
