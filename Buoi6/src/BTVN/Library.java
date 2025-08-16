package BTVN;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
    }

    public void displayAllBooks(boolean showPublisher){
        if (books.isEmpty()){
            System.out.println("Thư viện không có sách nào:");
        } else {
            for (Book book : books){
                book.displayInfo(showPublisher);
                System.out.println("----------------------");
            }
        }
    }

    public void searchByAuthor(String author){
        boolean found = false;
        for (Book book : books){
            if (book.getAuthor().toLowerCase().contains(author.toLowerCase())){
                book.displayInfo(true);
                System.out.println("----------------------------------");
                found = true;
            }
        }
        if (!found){
            System.out.println("Không tìm thấy sách nào của tác giả" + author + " ");
        }
    }

    public void removeBookById(int bookId){
        boolean removed = false;
        for (int i = 0; i < books.size(); i++){
            if (books.get(i).getBookId() == bookId){
                books.remove(i);
                System.out.println("Đã xóa sách có ID: " + bookId);
                removed = true;
                break;
            }
        }
        if (!removed){
            System.out.println("Không tìm thấy sách với ID: " + bookId);
        }
    }
}
