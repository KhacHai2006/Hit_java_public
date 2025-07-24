package BTVNb3;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập chuỗi từ bàn phím: ");
        String a = sc.nextLine().trim();

        String b = " ";
        for(int i = a.length() - 1; i >= 0; i--){
            b += a.charAt(i);
        }

        if(a.equalsIgnoreCase(b)){
            System.out.println("Chuỗi này đối xứng");
            String text1 = a.toUpperCase();
            System.out.println(text1);
        }
        else{
            System.out.println("Chuỗi này không đối xứng:");
            String text2 = a.toLowerCase();
            System.out.println(text2);
        }
    }
}
