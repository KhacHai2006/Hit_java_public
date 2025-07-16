import java.awt.*;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập họ và tên của bạn: ");
        String name = sc.nextLine();
        System.out.println("Họ và tên:" + name);
        System.out.print("Nhập tuổi của bạn: ");
        int age = sc.nextInt();
        System.out.println("Tuổi của bạn là:" + age);
        System.out.print("Nhập chiều cao của bạn: ");
        int cao = sc.nextInt();
        System.out.println("Chiều cao của bạn là: " + cao);
    }
}
