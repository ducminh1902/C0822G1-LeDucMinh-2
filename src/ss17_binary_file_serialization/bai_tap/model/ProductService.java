package ss17_binary_file_serialization.bai_tap.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService extends Product {
    static List<Product> productList = new ArrayList<>();
    static {
        Product product1 = new Product(1,"shoes","nike",20.000);
        Product product2 = new Product(2,"shirt","nike",30.000);
        Product product3 = new Product(3,"jacket","nike",40.000);

        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
    }

    public  void  display(){
        for (Product product: productList) {
            System.out.println(product);
        }
    }
    public void  add(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("hãy nhập id sản phẩm");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("hãy nhập tên sản phẩm");
        String name = scanner.nextLine();
        System.out.println("hãy nhập hãng của sản phẩm");
        String brand = scanner.nextLine();
        System.out.println("hãy nhập giá sản phẩm ");
        Double price = Double.parseDouble(scanner.nextLine());

        Product product = new Product(id,name,brand,price);
        productList.add(product);
        display();
    }
    public  void find(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("hãy nhập tên sản phẩm bạn muốn tìm");
        String findName = scanner.nextLine();
        boolean check = true;
        for (Product product:productList) {
            if (product.getName().contains(findName)){
                System.out.println(product);
                check=true;
            }else {
                check=false;
            }
        }
        if (check){
            System.out.println("sản phẩm có trong danh sách");
        }else {
            System.out.println("sản phẩm không tồn tại");
        }

    }


}


