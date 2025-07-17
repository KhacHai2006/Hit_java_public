import java.text.DecimalFormat;
import java.util.Scanner;

public class Bai1TT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao ban kinh hinh tron:");
        double r = sc.nextDouble();
        double pi = 3.14;

        double chuvi = 2*pi*r;
        double dientich = pi*r*r;

        DecimalFormat df = new DecimalFormat("0.000");
        System.out.println("Chu vi hinh tron la:" + df.format(chuvi) + " " + "Dien tich hinh tron la:" + df.format(dientich));
    }
}
