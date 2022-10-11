package ss5_access_modifier_static_method_static_property_bai2;


import java.util.Scanner;

public class Class2 {
    public static void main(String[] args) {
        Class testclass = new Class();
       testclass.setName("minh");
       testclass.setClasses("C08");
        System.out.println(testclass.getClasses()+" "+testclass.getName());
    }
}
