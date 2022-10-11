package ss5_access_modifier_static_method_static_property_bai1;

import ss5_access_modifier_static_method_static_property.Circle;

public class Circle2 {
    public static void main(String[] args) {
        ss5_access_modifier_static_method_static_property.Circle testCircle = new Circle(3);
        testCircle.getRadius();
        testCircle.getArea();

        System.out.println("bán kính:"+testCircle.getRadius());
        System.out.println("diện tích:"+testCircle.getArea());
    }
}
