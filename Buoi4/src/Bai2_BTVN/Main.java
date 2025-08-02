package Bai2_BTVN;

public class Main {
        public static void main(String[] args) {
            int currentYear = 2025;

            StudentManager manager = new StudentManager();

            manager.addStudent(new Student3("Nguyen Van A", 2003, "Ha Noi", 7.5, 8.0, 7.0, 2));
            manager.addStudent(new Student3("Le Thi B", 2002, "Hai Phong", 6.0, 6.5, 6.5, 0));
            manager.addStudent(new Student3("Tran Van C", 2001, "Da Nang", 9.0, 8.5, 9.5, 1));
            manager.addStudent(new Student3("Pham Thi D", 2004, "Hue", 5.5, 6.0, 5.0, 3));
            manager.addStudent(new Student3("Do Van E", 2003, "Ho Chi Minh", 8.0, 7.0, 8.5, 0));

            System.out.println("🔹 Danh sách ban đầu:");
            manager.printAllStudents(currentYear);

            manager.updateStudentByName("Tran Van C", new Student3("Tran Van C", 2001, "Da Nang", 10.0, 10.0, 10.0, 0));

            manager.removeStudentByName("Le Thi B");

            manager.sortByAge(currentYear);
            System.out.println("\n🔹 Danh sách sắp xếp theo tuổi:");
            manager.printAllStudents(currentYear);

            manager.sortByGPA();
            System.out.println("\n🔹 Danh sách sắp xếp theo GPA:");
            manager.printAllStudents(currentYear);

            manager.sortByAbsentDays();
            System.out.println("\n🔹 Danh sách sắp xếp theo số tiết nghỉ:");
            manager.printAllStudents(currentYear);
        }
}
