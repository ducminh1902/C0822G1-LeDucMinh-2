package ss17_binary_file_serialization.bai_tap.controller;

import ss17_binary_file_serialization.bai_tap.model.ProductService;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class TestController {
    public TestController() throws FileNotFoundException {
    }

    public static void main(String[] args) {
        ProductService productService = new ProductService();
        Scanner scanner = new Scanner(System.in);


        do {
            System.out.println("Quản lí sản phẩm");
            System.out.println("1.thêm sản phẩm ");
            System.out.println("2.hiển thị sản phẩm");
            System.out.println("3.tìm kiếm sản phẩm");
            System.out.println("hãy lựa chọn chức năng");

            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1 :
                    productService.add();
                break;
                case 2 :
                    productService.display();
                break;
                case 3 :
                    productService.find();
                    break;
            }
        }while (true);

    }

    File file = new File("src\\ss17_binary_file_serialization\\bai_tap\\data\\product.csv");
    FileReader fileReader = new FileReader(file);
    BufferedReader bufferedReader = new BufferedReader(fileReader);

    String line

}
