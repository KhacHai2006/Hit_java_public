package Bai1_BTVN;

public class Main {
    public static void main(String[] args) {
        int nowAGE = 2025;

        Student2[] students = new Student2[5];
        students[0] = new Student2("Nguyen Van A", 2000, "Ha Noi", 8.0, 9.0, 10.0, 3.8);
        students[1] = new Student2("Nguyen Khac B", 2001, "Bac Ninh", 9.0, 9.0, 10.0, 3.9);
        students[2] = new Student2("Nguyen Thi C", 2002, "Ha Noi", 5.0, 5.0, 6.0, 2.0);
        students[3] = new Student2("Le Thi F", 2003, "Ha Noi", 4.0, 3.0, 2.0, 1.9);
        students[4] = new Student2("Tran Thi E", 2004, "Ha Noi", 7.0, 8.0, 10.0, 3.0);

        System.out.printf("%-15s %-6s %-15s %-10s %-10s %-12s %-10s %-12s\n",
                " Tên ", " Tuổi ", " Địa chỉ ", " Điểm TX1 ", " Điểm TX2 ", " Điểm KTHP ", " GPA ", " Số tiết nghỉ ");

        for(Student2 s : students){
            System.out.printf("%-15s %-6d %-15s %-10.2f %-10.2f %-12.2f %-10.2f %-12d\n",
                    s.getName(),
                    s.getAge(nowAGE),
                    s.getAddress(),
                    s.getTx1(),
                    s.getTx2(),
                    s.getKthp(),
                    s.getGPA(),
                    s.getAbsentDays());
        }
    }
}
