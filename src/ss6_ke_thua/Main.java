package ss6_ke_thua;

public class Main {
    public static void main(String[] args) {
        Circle circle1= new Circle(3,"red");
        Cylinder cylinder1 = new Cylinder(5,"yellow",3);

        System.out.println("diện tích hình tròn:"+circle1.getArea()+" "+"màu"+" "+circle1.getColor());
        System.out.println("diện tích hình trụ:"+cylinder1.getVolume()+" " +"màu"+" "+cylinder1.getColor());
    }
}
