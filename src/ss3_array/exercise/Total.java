package ss3_array.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Total {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int col;
        do {
            System.out.println("số lượng cột");
            col = scanner.nextInt();
            if (col <= 0) {
                System.out.println("số lượng cột phải lớn hơn 0");
            }
        } while (col <= 0);
        int row;
        do {
            System.out.println("số lượng hàng");
            row = scanner.nextInt();
            if (row <= 0) {
                System.out.println("số lượng hàng phải lớn hơn 0");
            }
        } while (row <= 0);
        int[][] array = new int[col][row];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("nhập phần tử thứ [" + i + "][" + j + "]");
                array[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
        int sum = 0;
        System.out.println("hãy nhập số cột muốn tính tổng");
        int nhapCot = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (nhapCot == j) {
                    sum += array[i][j];
                }
            }
        }
        System.out.println("tổng của cột " + nhapCot + "là" + sum);
    }
}

