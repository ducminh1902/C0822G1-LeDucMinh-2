package ss17_binary_file_serialization.bai_tap.model;

public class Product {
    private int codeProduct;
    private String name;
    private String brand;
    private double price;

    public Product() {
    }

    public Product(int codeProduct, String name, String brand, double price) {
        this.codeProduct = codeProduct;
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    public int getCodeProduct() {
        return codeProduct;
    }

    public void setCodeProduct(int codeProduct) {
        this.codeProduct = codeProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "codeProduct=" + codeProduct  +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}'+'\n';
    }
}
