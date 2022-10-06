package ss3_array.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class FindSmallestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("hãy nhập độ dài mảng:");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i <size ; i++) {
            System.out.println("hãy nhập phần tử thứ"+i);
            array[i]= scanner.nextInt();
        }
        System.out.println("mảng:"+ Arrays.toString(array));
        int min = array[0];
        for (int i = 0; i <array.length ; i++) {
            if (array[i] < min){
                min=array[i];
            }
        }
        System.out.println("phần tử nhỏ nhất trong mảng:"+min);
    }
}
