package ss1_introduction.practice;

import java.util.Scanner;

public class AreaRetengle {
    public static void main(String[] args) {
        float height;
        float width;

        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập chiều cao:");
        height= scanner.nextFloat();

        System.out.println("nhập chiều rộng:");
        width= scanner.nextFloat();

        float Area = width * height;

        System.out.println("diện tích:"+Area);;
    }
}
