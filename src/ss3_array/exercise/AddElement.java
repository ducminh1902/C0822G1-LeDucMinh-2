package ss3_array.exercise;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        int[] array = {10, 4, 6, 7, 8,0,0,0,0,0};
        System.out.println(Arrays.toString(array));
        Scanner scanner = new Scanner(System.in);
        System.out.println("số cần chèn");

        int X = scanner.nextInt();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("vị trí số muốn chèn:");
        int viTri = scanner1.nextInt();
        if (X == -1 || X == array.length - 1) {
            System.out.println("không thể chèn");
        } else {
            for (int i =0; i <array.length; i++) {
                    if (viTri==i){
                        array[i]=X;
                    }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
