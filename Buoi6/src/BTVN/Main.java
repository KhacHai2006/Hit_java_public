package BTVN;

import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        while (true){
            System.out.println("====== MENU QUẢN LÝ THƯ VIỆN  =====");
            System.out.println("1. Thêm sách");
            System.out.println("2. Hiển thị danh sách sách");
            System.out.println("3. Tìm sách thao tác giả");
            System.out.println("4. Xóa sách theo mã ID");
            System.out.println("5. Thoát");
            System.out.println("Chọn chức năng (1-5): ");
            int choice = Integer.parseInt(sc.nextLine());

            switch(choice){
                case 1:
                    System.out.println("Nhập số sách muốn thêm: ");
                    int n = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < n; i++){
                        System.out.println("Nhập sách thứ " + (i + 1));
                        System.out.println("Tiêu đề: ");
                        String title = sc.nextLine();
                        System.out.println("Tác giả: ");
                        String author = sc.nextLine();
                        System.out.println("Giá: ");
                        double price = Double.parseDouble(sc.nextLine());
                        System.out.println("Có nhà xuất bản không ?");
                        String ans = sc.nextLine();

                        Book book;
                        if(ans.equalsIgnoreCase("y")){
                            System.out.println("Tên NXB: ");
                            String pubName = sc.nextLine();
                            System.out.println("Địa chỉ NXB: ");
                            String pubAddress = sc.nextLine();
                            Publisher publisher = new Publisher(pubName, pubAddress);
                            book = new Book(title, author, price, publisher);
                        }else {
                            book = new Book(title, author, price);
                        }

                        library.addBook(book);
                    }
                    break;
                case 2:
                    System.out.println("Hiển thị nhà xuất bản? (true/false): ");
                    boolean showPublisher = Boolean.parseBoolean(sc.nextLine());
                    library.displayAllBooks(showPublisher);
                    break;

                case 3:
                    System.out.println("Nhập tên tác giả cần tìm: ");
                    String searchAuthor = sc.nextLine();
                    library.searchByAuthor(searchAuthor);
                    break;

                case 4:
                    System.out.println("Nhập ID sách cần xóa: ");
                    int bookId = Integer.parseInt(sc.nextLine());
                    library.removeBookById(bookId);
                    break;

                case 5:
                    System.out.println("Đã thoát chương trình: ");
                    sc.close();
                    return;

                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn từ 1 đến 5.");
            }
            System.out.println();
        }
    }
}
