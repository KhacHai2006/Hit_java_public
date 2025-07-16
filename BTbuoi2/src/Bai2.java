import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào Tên:");
        String Tên = sc.nextLine();
        System.out.println("Nhập vào Tuổi: ");
        int Tuổi = sc.nextInt();
        System.out.println("Nhập vào lớp: ");
        String Lớp = sc.nextLine();
        System.out.println("Nhập vào điểm trung bình:");
        float GPA = sc.nextFloat();
        System.out.println("Tên:" + Tên + " - Tuổi:" + Tuổi + " - Lớp" + Lớp + " - GPA:" + GPA);
    }
}
