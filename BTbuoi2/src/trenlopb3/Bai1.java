package trenlopb3;


import java.util.Scanner;

public class Bai1 {
    public static void tongchan(int a[], int n){
        int tongchan = 0;
        for(int i = 0; i < n; i++){
            if(a[i] % 2 == 0){
                tongchan += a[i];
            }
        }
        System.out.println("Tong cac phan tu chan trong mang la:" + tongchan);
    }

    public static void tongle(int a[], int n){
        int tongle = 0;
        for(int i = 0; i < n; i++){
            if(a[i] % 2 != 0){
                tongle += a[i];
            }
        }
        System.out.println("Tong cac phan tu le trong mang:" + tongle);
    }

    public static boolean ktranto(int n){
        if(n < 2) return false;
        if(n == 2) return true;
        if(n % 2 == 0) return false;
        for(int i = 3; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }

    public static void sonto(int a[], int n){
        int dem = 0;
        for(int i = 0; i <= n; i++){
            if(ktranto(i)){
                dem++;
            }
        }
        System.out.println("So luong so nto trong mang la:" + dem);
    }

     public static void main(String[] args){
         Scanner sc= new Scanner(System.in);
         System.out.println("Nhao so luong phan tu vao mang: ");
         int n = sc.nextInt();
         int[] a= new int[n];
         System.out.println("Nhap cac phan tu cua mang");
         for(int i = 0; i < n; i++){
             a[i] = sc.nextInt();
         }
         tongchan(a,n);
         tongle(a,n);
         sonto(a,n);
     }
}
