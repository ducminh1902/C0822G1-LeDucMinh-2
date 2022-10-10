package ss4_class_and_object_in_java.exercise_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("hãy nhập a");
        double A = scanner.nextDouble();
        System.out.println("hãy nhập b");
        double B = scanner.nextDouble();
        System.out.println("hãy nhập c");
        double C = scanner.nextDouble();
        QuadraticEquation pt1 = new QuadraticEquation(A,B,C);
        if (pt1.getDiscriminant() > 0) {
            System.out.println("nghiệm thứ 1 là: " + pt1.getRoot1());
            System.out.println("nghiệm thứ 2 là:" + pt1.getRoot2());
        } else if (pt1.getDiscriminant() == 0) {
            System.out.println("The equation has one root :" + pt1.getRoot1());
        }else if (pt1.getDiscriminant()<0){
            System.out.println("The equation has no root :");
        }

    }
}
