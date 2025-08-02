package Bai2_BTVN;

import java.util.ArrayList;

public class StudentManager {

        private ArrayList<Student3> studentList;

        public StudentManager() {
            studentList = new ArrayList<>();
        }

        public ArrayList<Student3> getStudentList() {
            return studentList;
        }

        public void addStudent(Student3 student) {
            studentList.add(student);
        }

        public void removeStudentByName(String name) {
            for (int i = 0; i < studentList.size(); i++) {
                if (studentList.get(i).getName().equalsIgnoreCase(name)) {
                    studentList.remove(i);
                    break;
                }
            }
        }

        public void updateStudentByName(String name, Student3 newStudent) {
            for (int i = 0; i < studentList.size(); i++) {
                if (studentList.get(i).getName().equalsIgnoreCase(name)) {
                    studentList.set(i, newStudent);
                    break;
                }
            }
        }

        public void sortByAge(int currentYear) {
            for (int i = 0; i < studentList.size() - 1; i++) {
                for (int j = 0; j < studentList.size() - 1 - i; j++) {
                    int age1 = currentYear - studentList.get(j).getBirthYear();
                    int age2 = currentYear - studentList.get(j + 1).getBirthYear();
                    if (age1 > age2) {
                        // Hoán đổi
                        Student3 temp = studentList.get(j);
                        studentList.set(j, studentList.get(j + 1));
                        studentList.set(j + 1, temp);
                    }
                }
            }
        }

        public void sortByGPA() {
            for (int i = 0; i < studentList.size() - 1; i++) {
                for (int j = 0; j < studentList.size() - 1 - i; j++) {
                    double gpa1 = studentList.get(j).getGPA();
                    double gpa2 = studentList.get(j + 1).getGPA();
                    if (gpa1 < gpa2) {
                        Student3 temp = studentList.get(j);
                        studentList.set(j, studentList.get(j + 1));
                        studentList.set(j + 1, temp);
                    }
                }
            }
        }

        public void sortByAbsentDays() {
            for (int i = 0; i < studentList.size() - 1; i++) {
                for (int j = 0; j < studentList.size() - 1 - i; j++) {
                    int n1 = studentList.get(j).getAbsentDays();
                    int n2 = studentList.get(j + 1).getAbsentDays();
                    if (n1 > n2) {
                        Student3 temp = studentList.get(j);
                        studentList.set(j, studentList.get(j + 1));
                        studentList.set(j + 1, temp);
                    }
                }
            }
        }

        public void printAllStudents(int currentYear) {
            System.out.printf("%-15s %-6s %-15s %-10s %-10s %-12s %-10s %-12s\n",
                    "Tên", "Tuổi", "Địa chỉ", "Điểm TX1", "Điểm TX2", "Điểm KTHP", "GPA", "Số tiết nghỉ");
            for (int i = 0; i < studentList.size(); i++) {
                studentList.get(i).printRow(currentYear);
            }
        }
}
