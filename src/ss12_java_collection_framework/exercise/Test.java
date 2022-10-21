package ss12_java_collection_framework.exercise;

import java.util.Scanner;

public class Test {
   static ProductManager productManager = new ProductManager();

    public static void main(String[] args) {
        productManager.displayMenu();
    }
    public static void choice() {
        Scanner scanner = new Scanner(System.in);
        int choose ;
        do {
            System.out.println("hãy chọn chức năng");
            choose=scanner.nextInt();
            switch (choose) {
                case 1:
                    productManager.display();
                    break;
                case 2:
                    productManager.add();
                    break;
                case 3:
                    productManager.delete();
                    break;

            }

        }while (choose>6);
    }
}
