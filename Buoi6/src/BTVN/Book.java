package BTVN;

public class Book {
    private static int nextId = 1;
    private int bookId;
    private String title;
    private String author;
    private double price;
    private Publisher publisher;

    public Book(String title, String author, double price, Publisher publisher){
        this.title = title;
        this.author = author;
        this.price = price;
        this.publisher = publisher;
        this.bookId = nextId++;
    }

    public Book(String title, String author, double price){
        this(title, author, price, new Publisher("Unknown", "Unknown"));
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public void displayInfo(){
        System.out.println("Book ID:" + bookId + ", Tittle: " + title + ", Author: " + author + ", Price: " + price);
    }

    public void displayInfo(boolean showPublisher){
        displayInfo();
        if (showPublisher){
            System.out.println(publisher.getInfo());
        }
        else {
            System.out.println("Publisher: Unknown");
        }
    }
}
