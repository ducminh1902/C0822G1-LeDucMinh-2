package ss1_introduction.practice;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double height,weight,bmi;
        System.out.println("nhập chiều cao");
        height = scanner.nextDouble();

        System.out.println("nhập cân nặng");
        weight = scanner.nextDouble();

        bmi= weight / (height * height);
        System.out.println(bmi);
        if (bmi < 18){
            System.out.println("ốm");
        }else if (bmi < 25.0){
            System.out.println("bình thường");
        }else if (bmi < 30.0){
            System.out.println("thừa cân");
        }else {
            System.out.println("béo phì");
        }
    }
}
