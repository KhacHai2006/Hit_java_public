import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu cua mang:");
        int n = sc.nextInt();
        int[] a = new int[n];
        int sum = 0;
        for(int i = 0; i < n; i ++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            System.out.println("Cac phan tu trong mang la:" + a[i]);
        }
        for(int i = 0; i < n; i++){
            sum += a[i];
        }
        System.out.println("Tong cac phan tu la:" + sum);
        int max = a[0];
        for(int i = 0; i < n; i++){
            if (a[i] > max){
                max = a[i];
            }
        }
        System.out.println("Số lớn nhất trong mảng là:" + max);
    }
}
