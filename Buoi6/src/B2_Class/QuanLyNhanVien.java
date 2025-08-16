package B2_Class;

import java.util.ArrayList;

public class QuanLyNhanVien {
    private ArrayList<NhanVien> danhSachNhanVien;

    public QuanLyNhanVien(){
        danhSachNhanVien = new ArrayList<>();
    }

    public void themNhanVien(NhanVien nv){
        danhSachNhanVien.add(nv);
    }

    public void hienThiTatCa(){
        for (NhanVien nv : danhSachNhanVien){
            nv.hienThiThongTin();
        }
    }

    public double tinhTongLuong(){
        double Tong = 0;
        for (NhanVien nv : danhSachNhanVien){
            Tong += nv.tinhLuong();
        }
        return Tong;
    }
}
