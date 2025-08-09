package BT2_BTVN;

import java.util.Scanner;

public class PhongMay {
    private String MaPhong;
    private String TenPhong;
    private double DienTich;
    private QuanLy x;
    private May[] y;
    private int n;

    Scanner sc = new Scanner(System.in);
    public void Nhap(){
        System.out.println("Nhập mã phòng: ");
        MaPhong = sc.nextLine();
        System.out.println("Nhập tên phòng: ");
        TenPhong = sc.nextLine();
        System.out.println("Nhập diện tích: ");
        DienTich = sc.nextDouble();

        x = new QuanLy();
        System.out.println("---Nhập thông tin quản lý---");
        x.Nhap();

        System.out.println("Nhập số lượng máy tính");
        n = sc.nextInt();

        y = new May[n];
        for(int i = 0; i < n; i++){
            System.out.println("---Nhập thông tin máy thứ " + (i + 1) + "---");
            y[i] = new May();
            y[i].Nhap();
        }
    }

    public void Xuat(){
        System.out.println("===Thông tin phòng máy===");
        System.out.println("Mã phòng: " + MaPhong);
        System.out.println("Tên Phòng: " + TenPhong);
        System.out.println("Diện tích: " + DienTich);

        System.out.println("---Thông tin quản lý---");
        x.Xuat();

        System.out.println("---Danh sách máy tính---");
        System.out.println("Mã Máy" + "Tên Máy" + "Tình Trạng");
        for(int i = 0; i < n; i++){
            y[i].Xuat();
        }
    }
}
