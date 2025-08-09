package BT2_BTVN;

import java.util.Scanner;

public class QuanLy {
    private String MaQL;
    private String HoTen;

    Scanner sc = new Scanner(System.in);
    public void Nhap(){
        System.out.println("Nhập mã Quản Lý: ");
        MaQL = sc.nextLine();
        System.out.println("Nhập Họ Tên: ");
        HoTen = sc.nextLine();
    }

    public void Xuat(){
        System.out.println(MaQL + " " + HoTen);
    }
}
