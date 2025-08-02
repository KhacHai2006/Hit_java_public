package Bai1_BTVN;

public class Student2 {
    private String name;
    private int birthYear;
    private String address;
    private double tx1;
    private double tx2;
    private double kthp;
    private double absentDays;

    public Student2(String name, int birthYear, String address, double tx1, double tx2, double kthp, double absentDays){
        this.name = name;
        this.birthYear = birthYear;
        this.address = address;
        this.tx1 = tx1;
        this.tx2 = tx2;
        this.kthp = kthp;
        this.absentDays = absentDays;
    }

    public String getName(){
        return name;
    }

    public int getBirthYear(){
        return birthYear;
    }

    public String getAddress() {
        return address;
    }

    public double getTx1() {
        return tx1;
    }

    public double getTx2() {
        return tx2;
    }

    public double getKthp() {
        return kthp;
    }

    public double getAbsentDays() {
        return absentDays;
    }

    public int getAge(int nowAGE){
        return nowAGE - birthYear;
    }

    public double getGPA(){
        return tx1 * 0.2 + tx2 * 0.3 + kthp * 0.5;
    }
}
