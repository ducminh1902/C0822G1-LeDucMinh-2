package ss3_array.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int cot;
        do {
            System.out.println("hãy nhập số cột");
            cot = scanner.nextInt();
            if (cot <= 0) {
                System.out.println("số lượng cột phải lớn hơn 0");
            }
        } while (cot <= 0);
        int hang;
        do {
            System.out.println("hãy nhập số lượng hàng");
            hang = scanner.nextInt();
            if (hang <= 0) {
                System.out.println("số lượng hàng phải lớn hơn 0");
            }
        } while (hang <= 0);
        int[][] array = new int[cot][hang];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("hãy nhập phần tử thứ [" + i + "]" + "[" + j + "]");
                array[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array[i].length; j++) {
                sum += array[i][j];
                break;
            }
        }

    }
}
