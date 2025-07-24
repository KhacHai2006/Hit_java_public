package trenlopb3;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap so luong phan tu cua mang:");
        int n = sc.nextInt();
        int[][] a = new int[n][n];



        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;
        int tmps = 0;
        while(tmps < n*n){
            //left -> right
            for(int i = left; i <= right; i++){
                a[top][i] = tmps++;
            }
            top++;
            //top -> bottom
            for(int i = top; i <= bottom; i++){
                a[i][right] = tmps++;
            }
            right--;
            //right -> left
            for(int i = right; i >= left; i--){
                a[bottom][i] = tmps++;
            }
            bottom--;
            //bottom -> top
            for(int i = bottom; i >= top; i--){
                a[i][left] = tmps++;
            }
            left++;
        }

       for(int i = 0; i < n; i++){
           for(int j = 0; j < n; j++){
               System.out.printf("%4d",a[i][j]);
           }
           System.out.println();
       }

        int sum = 0;
        for(int i = 0 ; i < n; i++){
            sum += a[i][i];
            sum += a[i][n - 1 - i];
        }

        if(n % 2 == 0){
            sum -= a[n / 2][n / 2];
        }

        System.out.println("Tong cac duong cheo la:" + sum);
    }
}
