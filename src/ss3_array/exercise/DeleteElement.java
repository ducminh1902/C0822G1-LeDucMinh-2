package ss3_array.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,4};
        Scanner scanner = new Scanner(System.in);
        System.out.println("phần tử cần xóa:");
        int phanTuXoa= scanner.nextInt();
        for (int i = 0; i <array.length ; i++) {
            if (phanTuXoa == array[i]){
//                System.out.println("vị trí phần tử muốn xóa :"+i);
                for (int j = array[i]; j <array.length ; j++) {
                    array[i]=array[i+1];
                    array[array.length-1]=0;
                }
            }
        }
        System.out.println("mảng sau khi xóa:"+ Arrays.toString(array));
    }
}
