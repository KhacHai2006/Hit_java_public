import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //System.out.println("Hay nhap ten cua ban");
        //String name = sc.nextLine();
        //System.out.println("Xin chao"+ name);
        //System.out.println("Hay nhap tuoi cua ban:");
        //Integer t = sc.nextInt();
        //sc.nextLine();
        //System.out.println("Tuoi cua ban" + t);
        //System.out.println("Hay nhap so luong phan cua mang:");
        Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        //sc.nextLine();
        //int[] a = new int[n];
        //for(int i = 0; i < n; i++){
        //a[i] = sc.nextInt();
        //sc.nextLine();
        //}
        //for(int i : a){
        //System.out.println(i);
        //}
        //int sum = 0;
        //for(int i : a){
        //sum += i;
        //}
        //System.out.println(sum);
        int a = sc.nextInt();
        int b = sc.nextInt();
        so(a,b);
        int t = tong(a,b);
        System.out.println("Tong la = " + t);
    }
    public static void so(int a, int b){
        System.out.println("So a = " + a);
        System.out.println("So b = " + b);
        System.out.println("Hieu = " + (a - b));
        System.out.println("Tich = " + (a * b));
        System.out.println("Thuong = " + ( (float)a/ b));

    }

    public static int tong(int a, int b){
        return (a + b);
    }
}