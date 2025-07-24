package BTVNb3;

import java.util.Scanner;

public class Bai1 {

    public static final String SQUARE = "Square";
    public static final String TRIANGLE = "Triangle";
    public static final String CIRCLE = "Circle";
    public static final double PI = 3.14159265;

    public static double areaSquare(double side){
        return side * side;
    }

    public static double areaTriangle(double base, double height){
        return 0.5 * base * height;
    }

    public static double areaCircle(double r){
        return PI*r*r;
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Nhập loại hình(Square, Triangle, Circle): ");
        String a = sc.nextLine().trim();

        double dtich = 0;

        if(a.equalsIgnoreCase(SQUARE)){
            System.out.println("Nhập độ dài cạnh hình vuông:");
            double side = sc.nextDouble();
            dtich = areaSquare(side);
        } else if (a.equalsIgnoreCase(TRIANGLE)) {
            System.out.println("Nhập đáy tam giác: ");
            double base = sc.nextDouble();
            System.out.println("Nhập chiều cao tam giác: ");
            double height = sc.nextDouble();
            dtich = areaTriangle(base, height);
        } else if (a.equalsIgnoreCase(CIRCLE)) {
            System.out.println("Nhập bán kính hình tròn: ");
            double r = sc.nextDouble();
            dtich = areaCircle(r);
        }
        else{
            System.out.println("Hình dạng không hợp lệ !");
        }
        System.out.println("Dien tich vien gach la:" + dtich);
    }
}
