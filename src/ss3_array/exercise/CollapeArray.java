package ss3_array.exercise;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class CollapeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("hãy nhập độ dài mảng 1:");
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];
        for (int i = 0; i <size1 ; i++) {
            System.out.println("nhập phần tử :"+i);
           array1[i]=scanner.nextInt();
        }
        System.out.println("mảng thứ 1:"+Arrays.toString(array1));
        Scanner scanner1 =new Scanner(System.in);
        System.out.println("hãy nhập độ dài mảng 2:");
        int size2 = scanner.nextInt();
        int[] array2= new int[size2];
        for (int i = 0; i <size2 ; i++) {
            System.out.println("nhập vào phần tử thứ "+i);
            array2[i]=scanner.nextInt();
        }
        System.out.println("mảng thứ 2:"+Arrays.toString(array2));

        int[] array3 = new int[size1+size2];
        for (int i = 0; i <size1 ; i++) {
            array3[i]=array1[i];
        }
        for (int i = 0; i <size2 ; i++) {
            array3[i+size1]=array2[i];
        }
        System.out.println("mảng thứ 3:"+Arrays.toString(array3));
    }
}
