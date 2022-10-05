package ss1_introduction.excersice;

import java.util.Scanner;

public class DisplayHello {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập tên:");
        String name = scanner.nextLine();
        System.out.println("hello babbe,"+name);
    }
}
