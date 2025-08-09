package BT1_BTVN;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số lượng sinh viên: ");
        int n = sc.nextInt();

        Student[] students = new Student[n];

        for(int i = 0; i < n; i++){
            System.out.println("Nhập thông tin sinh viên thứ " + (i + 1) + "---" );
            students[i] = new Student();
            students[i].input();
        }

        System.out.println("Thông tin sinh viên");
        for(int i = 0; i < n; i++){
            System.out.println("Sinh viên thứ " + (i + 1) + "---");
            students[i].output();
        }
    }
}
