import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen thu nhat:");
        int a = sc.nextInt();
        System.out.println("Nhap so nguyen thu hai:");
        int b = sc.nextInt();
        System.out.println("Tổng hai số là :" +(a+b));
        System.out.println("Hiệu hai số là: " + (a-b));
        System.out.println("Tích hai số là:" + (a*b));
        System.out.println("Thuong hai so la" + (a/b));
        System.out.println("Chia lay du cua hai so la:" + (a%b));
        if (a == b){
            System.out.println("Hai số bằng nhau");
        } else {
            System.out.println("Hai số không bằng nhau");
        }
    }
}
