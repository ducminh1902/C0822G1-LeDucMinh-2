package ss1_introduction.practice;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = c', please enter constants:");

        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập a: ");
        double a = scanner.nextDouble();

        System.out.println("nhập b: ");
        double b = scanner.nextDouble();

        System.out.println("nhập c: ");
        double c = scanner.nextDouble();

        if ( a !=0 ){
             double answer = (c-b)/a;
            System.out.println("nghiệm là:"+answer);
        }else {
            if (b == c){
                System.out.println("phương trình đúng với mọi x");
            }else {
                System.out.println("vô nghiệm");
            }
        }
    }
}
