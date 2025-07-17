import java.util.Scanner;

public class Bai2TT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu cua mang:");
        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){
            if(i % 2 != 0){
                int left=(i - 1 >= 0) ? a[i - 1]:0;
                int right=(i + 1 < n) ? a[i + 1]:0;
                a[i] += Math.abs(right - left);
            }
        }

        for(int i = 0; i < n; i++){
            System.out.println(a[i]);
        }
    }
}
