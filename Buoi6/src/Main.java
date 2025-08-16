import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<String> danhSachTen = new ArrayList<>();

        danhSachTen.add("Nam");
        danhSachTen.add("Hai");
        danhSachTen.add("Hoa");

        System.out.println("Danh sach ten: ");
        for (String ten : danhSachTen){
            System.out.println(ten);
        }
    }
}