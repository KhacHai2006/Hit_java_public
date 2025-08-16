package B1_Class;

public class LopHoc {
    private String maLop;
    private String tenLop;

    public LopHoc(){

    }

    public LopHoc(String maLop, String tenLop){
        this.maLop = maLop;
        this.tenLop = tenLop;
    }

    public String getTenLop() {
        return tenLop;
    }

    public String getMaLop() {
        return maLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    public void inThongTin(){
        System.out.println("Mã Lớp: " + maLop + ", Tên lớp:" + tenLop);
    }
}
