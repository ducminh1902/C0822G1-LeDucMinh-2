package ss6_ke_thua_bai1;

import ss6_ke_thua_bai1.Circle;
import ss6_ke_thua_bai1.Cylinder;

public class Test {
    public static void main(String[] args) {
        Circle circle= new Circle(2,"red");
        Cylinder cylinder = new Cylinder(5,"black",5);

        System.out.println("diện tích hình tròn: "+circle.getArea());
        System.out.println("thể tích hình trụ: "+cylinder.getVolume());
    }
}
