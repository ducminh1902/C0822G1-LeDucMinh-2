package ss3_array.exercise;

import java.util.Scanner;

public class Countstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "hello";
        System.out.println(str);
        System.out.println("hãy nhập vào 1 ký tự");
        char kyTu = scanner.nextLine().charAt(0);
        int count =0;
        for (int i = 0; i <str.length() ; i++) {
            if (kyTu == str.charAt(i)){
                count++;
            }else {
               count=0;
            }

    }
        System.out.println("Số lần kí tự xuất hiện trong chuỗi là "+count);
}
}
