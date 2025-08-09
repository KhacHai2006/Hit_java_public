package BT1_BTVN;

import java.util.Scanner;

public class Faculty {
    private String name;
    private String date;
    private School x = new School();

    Scanner sc = new Scanner(System.in);
    public void input(){
        System.out.println("Nhập tên khoa: ");
        name = sc.nextLine();
        System.out.println("Nhập ngày vao khoa: ");
        date = sc.nextLine();

        System.out.println("Nhập tên trường: ");
        x.name = sc.nextLine();
        System.out.println("Nhập ngày vào trường: ");
        x.date = sc.nextLine();
    }

    public void output(){
        System.out.println("Tên khoa: " + name);
        System.out.println("Ngày vào khoa: " + date);
        System.out.println("Tên trường: " + x.name);
        System.out.println("Ngày vào trường: " + x.date);
    }
}
