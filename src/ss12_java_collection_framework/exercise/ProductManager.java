package ss12_java_collection_framework.exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager extends Product {
    Scanner scanner= new Scanner(System.in);
      ArrayList<Product> listProduct = new ArrayList<>();

    Product product1= new Product(1,"kem đánh răng",13.000);
    Product product2= new Product(2,"bánh",17.000);
    Product product3= new Product(3,"kẹo",3.000);

    {
        listProduct.add(product1);
        listProduct.add(product2);
        listProduct.add(product3);
    }

    public  void  display(){
        for (Product product : listProduct) {
            System.out.println(product);
        } Test.choice();
    }
    public void displayMenu() {
        System.out.println("------CHOICE-----\n"+
                "1.hiển thị sản phẩm \n"+
                "2.thêm sản phẩm\n"+
                "3.xóa sản phẩm\n"+
                "4.sửa sản phẩm\n"+
                "5.sắp xếp sản phẩm\n"+
                "6.exit\n");
        Test.choice();
    }
    public void add(){
        Product product = new Product();
        System.out.println("hãy nhập id cho sản phẩm");
        product.setId(Integer.parseInt(scanner.nextLine()));
        System.out.println("hãy nhập tên sản phẩm");
        product.setNameProduct(scanner.nextLine());
        System.out.println("hãy nhập giá cho sản phẩm");
        product.setPriceProduct(Double.parseDouble(scanner.nextLine()));
        listProduct.add(product);
//        display();
        Test.choice();
    }

        void delete(){
        display();
        System.out.println("hãy nhập id sản phẩm muốn xóa");
        int idDelete = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <listProduct.size() ; i++) {
            if (idDelete-1 == listProduct.get(i).getId()){
                listProduct.remove(listProduct.get(i).getId());
                display();
                Test.choice();
            }
        }
    }
    public void edit(){
        display();
        System.out.println("nhập id sản phẩm bạn muốn sửa");
        int idEdit = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <listProduct.size() ; i++) {
             if (idEdit == listProduct.get(i).getId()){
                 System.out.println("mời bạn nhập lại id sản phẩm");
                 ;
             }
        }
        Test.choice();
    }


}
