package ss14_thuat_toan_sap_xep.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class minh_hoa_thuat_toan_chen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập độ dài mảng");
        int n = Integer.parseInt(scanner.nextLine());
        int[] array = new int[n];
        for (int i = 0; i <n ; i++) {
            System.out.println("hãy nhập phần tử thứ"+i);
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("mảng chưa sắp xếp"+Arrays.toString(array));
        inserSort(array);
//        int[] array = new int[]{1,2,1,34,12,43,56,15,22};
//        System.out.println("mảng có chưa sắp xếp"+ Arrays.toString(array));
//        inserSort(array);
    }

    public  static void inserSort(int[] array){
        for (int i = 0; i <array.length ; i++) {
            int key = array[i];
            int j;
            for (j = i-1;j >= 0 && array[j] > key;j--) {
                array[j+1] = array[j];
            }
            array[j+1] = key;
        }
        System.out.println("mảng đã sắp xếp"+Arrays.toString(array));
    }
}
