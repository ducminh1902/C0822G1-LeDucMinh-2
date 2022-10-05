package ss1_introduction.practice;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int year;
        System.out.println("nhập năm:");
        year = scanner.nextInt();
        if (year%4==0){
            if (year%100==0){
                if (year%400==0){
                    System.out.println("năm nhuận");
                }else {
                    System.out.println("không phải năm nhuận");
                }
            }else {
                System.out.println("năm nhuận");
            }
        }else {
            System.out.println("không phải năm nhuận");
        }
        
    }
}
