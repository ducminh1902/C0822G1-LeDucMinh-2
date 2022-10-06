package ss3_array.exercise;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class FindMaxInMultiArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m ;
        do {
            System.out.println("nhập số lượng hàng:");
            m = Integer.parseInt(scanner.nextLine());
            if (m<=0){
                System.out.println("số lượng hàng phải lớn hơn 0");
            }
        } while( m <= 0);
        int n ;
        do {
            System.out.println("nhập số lượng cột:");
            n = Integer.parseInt(scanner.nextLine());
            if (n <= 0){
                System.out.println("số lượng hàng phải lớn hơn 0");
            }
        } while( n <= 0);
        int[][] array = new int[m][n];
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                System.out.print("Nhập vào a[" + i + "][" + j + "]: ");
                array[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
      
    }

}
