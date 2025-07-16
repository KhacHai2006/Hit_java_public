import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bảng cua chuong so 5 la:");
        for(int i = 0; i <= 10; i++){
            System.out.println("5 x" + i + "=" + (5*i));
        }

        int sum = 0;
        int j = 2;
        while(j <= 100){
            sum += j;
            j+=2;
        }
        System.out.println("Tong cac so chan tu 1 den 100 la:" + sum);
    }
}
