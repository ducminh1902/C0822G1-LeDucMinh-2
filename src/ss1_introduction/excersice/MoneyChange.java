package ss1_introduction.excersice;


import java.util.Scanner;

public class MoneyChange {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd ;
        Scanner scanner= new Scanner(System.in);
        System.out.println("hãy nhập số tiền USD:");
        usd = scanner.nextDouble();
        double quydoi = usd*vnd;
        System.out.println("VND:"+quydoi);
    }
}
