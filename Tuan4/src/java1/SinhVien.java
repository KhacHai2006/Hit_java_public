package java;

public class SinhVien {
    private String maSinhVien;
    public String name;
    protected int age;
    int diem;

    public SinhVien(){

    }

    public SinhVien(String maSinhVien, String name, int age, int diem){
        this.maSinhVien = maSinhVien;
        this.name = name;
        this.age = age;
        this.diem = diem;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}
