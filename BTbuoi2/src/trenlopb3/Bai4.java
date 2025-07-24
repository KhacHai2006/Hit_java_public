package trenlopb3;

import java.util.Scanner;

public class Bai4 {

    public static int fibonacci(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;
        
        int a = 0, b = 1, fib = 0;
        for(int i = 2; i <= n; i++){
            fib = a + b;
            a = b;
            b = fib;
        }
        return fib;
    }
    
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Nhập n:");
        int n = sc.nextInt();

        System.out.println("Dãy Fibonacci từ F0 đến F" + n + ":");
        int tongle = 0;

        for(int i = 0; i <= n; i++){
            int fib = fibonacci(i);
            System.out.println(fib + " ");
            if(fib % 2 != 0){
                tongle += fib;
            }
        }

        System.out.println("Tổng các sô fibonacci lẻ là: " + tongle);
    }
}
