package case_study_furama.controllers;

import java.util.Scanner;

public class FuramaController {
    public static void displayMainMenu() {
        Scanner scanner =new Scanner(System.in);
        System.out.println("1.Employee Management");
        System.out.println("2.Customer Management");
        System.out.println("3.Facility Management ");
        System.out.println("4.Booking Management");
        System.out.println("5.Promotion Management");
        System.out.println("6.Exit");
        System.out.println("hãy chọn chức năng");
        int chosen = scanner.nextInt();
       do {
           if (chosen==1){
               System.out.println("1.Display list employees");
               System.out.println("2.Add new employee");
               System.out.println("3.Delete employee");
               System.out.println("4.Edit employee");
               System.out.println("5.Return main menu");
               chosen = scanner.nextInt();
               if ( chosen == 5){
                   displayMainMenu();
               }
           }else if (chosen==2){
               System.out.println("1.Display list customers");
               System.out.println("2.Add new customer");
               System.out.println("3.Edit customer");
               System.out.println("4.Return main menu");
               chosen = scanner.nextInt();
               if ( chosen == 4){
                   displayMainMenu();
               }
           }else if (chosen==3){
               System.out.println("1.Display list facility");
               System.out.println("2.Add new facility");
               System.out.println("3.Display list facility maintenance");
               System.out.println("4.Return main menu");
               chosen = scanner.nextInt();
               if ( chosen == 4){
                   displayMainMenu();
               }
           }else  if (chosen==4){
               System.out.println("1.Add new booking");
               System.out.println("2.Display list booking");
               System.out.println("3.Return main menu");
               chosen = scanner.nextInt();
               if (chosen==3){
                   displayMainMenu();
               }
           }else if (chosen==5){
               System.out.println("1.Display list customers use service");
               System.out.println("2.Display list customers get voucher");
               System.out.println("3.Return main menu");
               chosen = scanner.nextInt();
               if (chosen == 3){
                   displayMainMenu();
               }
           }
       }while (chosen>6);
    }
}
