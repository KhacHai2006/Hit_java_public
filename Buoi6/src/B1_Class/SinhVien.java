package B1_Class;

public class SinhVien {
    private String maSV;
    private String hoTen;
    private double diemTB;
    private LopHoc lop;

    public SinhVien(){

    }

    public SinhVien(String maSV, String hoTen, double diemTB, LopHoc lop){
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemTB = diemTB;
        this.lop = lop;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public LopHoc getLop() {
        return lop;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }

    public void setDiemTB(int diemTB){
        this.diemTB = (double) diemTB;
    }

    public void setLop(LopHoc lop) {
        this.lop = lop;
    }

    public void inThongTin(){
        System.out.println("Mã SV: " + maSV + ", Họ Tên: " + hoTen + ", Điểm TB: " + diemTB);
        lop.inThongTin();
        System.out.println("-------------------------------");
    }
}
