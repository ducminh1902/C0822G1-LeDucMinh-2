package ss5_access_modifier_static_method_static_property;

import java.util.Scanner;

public class Class2 {
    public static void main(String[] args) {
        Class testclass = new Class();
        Scanner scanner = new Scanner(System.in);
        System.out.println("hãy nhập tên:");
        String name = scanner.nextLine();
        System.out.println("hãy nhập lớp:");
        String classes = scanner.nextLine();
       testclass.setName(name);
       testclass.setClasses(classes);
        System.out.println(testclass.toString());

    }
}
