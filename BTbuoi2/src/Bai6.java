import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong sinh vien:");
        int n = sc.nextInt();

        String[] Ten = new String[n];
        int[] Tuoi = new int[n];
        double[] GPA = new double[n];
        for(int i = 0; i < n; i++){
            System.out.println("Nhap thong tin cua sinh vien thu:" + (i + 1));

            System.out.println("Ten sinh vien thu" + (i + 1) + "la:");
            Ten[i] = sc.nextLine();

            System.out.println("Tuoi sinh vien thu" + (i + 1) + "la:");
            Tuoi[i] = sc.nextInt();

            System.out.println("Diem TB sinh vien thu" + (i + 1) + "la:");
            GPA[i] = sc.nextDouble();
        }

        System.out.println("Danh sach sinh vien vua nhap la:");
        for(int i = 0; i < n; i++){
            System.out.println("Sinh vien thu" + (i + 1) + " Ten: " + Ten[i] + " Tuoi " + Tuoi[i] + " DiemTB: " + GPA[i]);
        }

        double tongdiem = 0;
        for(int i = 0; i < n; i++){
            tongdiem += GPA[i];
        }
        System.out.println("tong diem TB ca lop la:" + tongdiem);

        int max = 0;
        for(int i = 1; i < n; i++){
            if(GPA[i] > GPA[max]){
                max = i;
            }
        }
        System.out.println("Sinh vien diem cao nhat la sinh vien thu:" + (max) + " Ten: " + Ten[max] + " Tuoi: " + Tuoi[max] + " DiemTB: " + GPA[max]);
    }
}
