package trenlopb3;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String a = sc.nextLine();

        a = a.trim();

        String b = " ";
        for(int i = a.length() - 1; i >= 0; i--){
            b += a.charAt(i);
        }

        System.out.println("Chuoi dao nguoc la:" + b);

        if(a.equalsIgnoreCase(b)){
            System.out.println("Đây là chuỗi đối xứng:");
        }
        else {
            System.out.println("Đây không phải chuỗi đối xứng:");
        }
    }
}
