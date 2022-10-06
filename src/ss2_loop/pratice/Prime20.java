package ss2_loop.pratice;

import java.util.Scanner;

public class Prime20 {
    public static void main(String[] args) {
        int n=2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số lượng");
        int size = scanner.nextInt();
        int soLuong = 0;
        while (soLuong<size){
            boolean check = true;
            for (int i = 2; i <n ; i++) {
                if (n % i ==0){
                    check= false;
                }
            }
            if (check){
                System.out.println(n);
                soLuong++;
            }
            n++;
        }

    }
}
