import java.util.Scanner;

public class Bai3TT {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap vao kich thuoc của ma tran xoan oc n:");
            int n = sc.nextInt();
            int[][] a = new int[n][n];

            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    a[i][j] = sc.nextInt();
                }
            }

            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    System.out.print(a[i][j]);
                }
            }
        }
}
