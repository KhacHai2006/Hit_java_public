package B1_Class;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        LopHoc lop1 = new LopHoc("2024DHHTTT01", "HTTT01");

        ArrayList<SinhVien> danhSach = new ArrayList<>();

        danhSach.add(new SinhVien("SV01", "Nguyen Van A", 9.0, lop1));
        danhSach.add(new SinhVien("SV02", "Nguyen Khac A", 10.0, lop1));
        danhSach.add(new SinhVien("SV03", "Tran Thi B", 7.5, lop1));
        danhSach.add(new SinhVien("SV04", "Nguyen Thi C", 9.2,lop1));
        danhSach.add(new SinhVien("SV05", "Do Thi B", 8.0,lop1));

        System.out.println("===Danh sach sinh vien===");
        for (SinhVien sv : danhSach){
            sv.inThongTin();
        }

        SinhVien svMax = danhSach.get(0);
        for (SinhVien sv : danhSach){
            if (sv.getDiemTB() > svMax.getDiemTB()){
                svMax = sv;
            }
        }

        System.out.println("===Sinh vien co diem TB cao nhat ===");
        svMax.inThongTin();
    }
}
