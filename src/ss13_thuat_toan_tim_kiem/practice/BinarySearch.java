package ss13_thuat_toan_tim_kiem.practice;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinarySearch binarySearch = new BinarySearch();
        System.out.println("hãy nhập số lượng phần tử");
        int size = Integer.parseInt(scanner.nextLine());
        int[]array = new int[size];
        for (int i = 0; i <size ; i++) {
            System.out.printf("arr[%s] = ", i);
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("mảng nhập vào :"+array);
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println("bạn muốn tìm vị trí của số nào");
        int value = Integer.parseInt(scanner.nextLine());
        int num =  binarySearch.binarySearch(array,0,array.length-1,value);
        System.out.println("vị trí của nó là :"+num);
    }
    public int binarySearch(int[]array, int left, int right, int value){
        if (right >= left){
            int middle = (left+right)/2;
            if (array[middle] == value){
                return middle;
            }
            if (array[middle]>value){
                return binarySearch(array,left,middle-1,value);
            }return binarySearch(array,middle+1,right,value);
        }
        return -1;
    }


}
