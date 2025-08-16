package B2_Class;

public class Main {
    public static void main(String[] args) {
        QuanLyNhanVien ql = new QuanLyNhanVien();

        NhanVienFullTime ft1 = new NhanVienFullTime("FT01", "Nguyen Van A", 20, "a@gmail.com", "0123456789", 8000000,2000000);
        NhanVienFullTime ft2 = new NhanVienFullTime("FT02", "Nguyen Van B", 28, "b@gmail.com", "0986654321", 7500000,1500000);

        NhanVienPartTime pt1 = new NhanVienPartTime("PT01", "Nguyen Thi C", 22, "c@gmail.com", "0111222333", 80, 100000);
        NhanVienPartTime pt2 = new NhanVienPartTime("PT02", "Pham Thi D", 25, "d@gmail.com","0444555666",60,90000);

        ql.themNhanVien(ft1);
        ql.themNhanVien(ft2);
        ql.themNhanVien(pt1);
        ql.themNhanVien(pt2);

        System.out.println("=== Danh Sách Nhân Viên ===");
        ql.hienThiTatCa();

        double tongLuong = ql.tinhTongLuong();
        System.out.println("Tổng Quỹ Lương:" + tongLuong + " VND");
    }
}
