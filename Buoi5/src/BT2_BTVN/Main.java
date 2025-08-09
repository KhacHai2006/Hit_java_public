package BT2_BTVN;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PhongMay phong = new PhongMay();

        System.out.println("===Nhập thông tin phòng máy===");
        phong.Nhap();

        System.out.println("===Xuất thông tin phòng máy===");
        phong.Xuat();
    }
}
