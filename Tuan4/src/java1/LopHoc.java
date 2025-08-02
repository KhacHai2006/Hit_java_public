package java1;

public class LopHoc  {
    public static void main(String[] args){ // dùng protected phải có hàm main
    SinhVien b = new SinhVien();
    b.age = 15;
    SinhVien c = new SinhVien("2024603442","Nguyen Khac Hai", 19, 10);
    System.out.println(c.name);
    }
}
