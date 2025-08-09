package BT2_BTVN;

import java.util.Scanner;

public class May {
    private String MaMay;
    private String TenMay;
    private String TinhTrang;

    Scanner sc = new Scanner(System.in);
    public void Nhap(){
        System.out.println("Nhập mã máy: ");
        MaMay = sc.nextLine();
        System.out.println("Nhập tên máy: ");
        TenMay = sc.nextLine();
        System.out.println("Nhập tình trạng máy: ");
        TinhTrang = sc.nextLine();
    }

    public void Xuat(){
        System.out.println(MaMay + " " + TenMay + " " + TinhTrang);
    }
}
