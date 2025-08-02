package Bai2_class;

public class Main {
    public static void main(String[] args) {
        Student1 a = new Student1("Nguyen Van A",18);

        a.setName("Nguyễn Khắc Hải");
        a.setAge(19);

        System.out.println("Tên mới: " + a.getName());
        System.out.println("Tuổi mới: " + a.getAge());
    }
}
