package BT1_BTVN;

import java.util.Scanner;

public class Student {
    private String name;
    private String classname;
    private double score;
    private Faculty y;

    Scanner sc = new Scanner(System.in);
    public void input(){
        System.out.println("Nhập tên sinh viên: ");
        name = sc.nextLine();
        System.out.println("Nhập lớp: ");
        classname = sc.nextLine();
        System.out.println("Nhập điểm: ");
        score = sc.nextDouble();

        y = new Faculty();
        System.out.println("--- Nhập thông tin khoa ---");
        y.input();
    }

    public void output(){
        System.out.println("Tên sinh viên: " + name);
        System.out.println("Lớp: " + classname);
        System.out.println("Điểm: " + score);
        y.output();
    }
}
