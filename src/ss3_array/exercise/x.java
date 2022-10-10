package ss3_array.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class x {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập độ dài");
        int num = scanner.nextInt();
        int[] array = new int[num];
        for (int i = 0; i <num ; i++) {
            System.out.println("nhập phần tử thứ:"+i);
            array[i]= scanner.nextInt();
        }
        System.out.println(Arrays.toString(array));
    }
}
