package trenlopb3;

import java.util.Scanner;

public class Bai2 {

    public static final double PI = 3.14159265;

    public static double chuvi(double r){
        return 2*PI*r;
    }

    public static double dtich(double r){
        return PI*r*r;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap vao ban kinh hinh tron:");
        double r = sc.nextDouble();
        System.out.println("Nhap vao so mu k:");
        int k = sc.nextInt();
        double C = chuvi(r);
        double S = dtich(r);
        System.out.println("Chu vi hinh tron la:" + C);
        System.out.println("Dien tich hinh tron la:" + S);
        double power = Math.pow(r, k);
        System.out.println("r mũ k = " + power);
        double squareRoot = Math.sqrt(r + k);
        System.out.println("Căn bậc hai của r + k la:" + squareRoot);
        double abs = Math.abs(r - k);
        System.out.println("Gia tri tuyet doi cua r - k la :" + abs);
    }
}
