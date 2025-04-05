package chuong02.constructor;

/**
 * Chương 02: Lập trình hướng đối tượng
 * Ví dụ: Constructor
 */
class Book {
    String title;
    String author;
    double price;

    // Constructor có tham số để khởi tạo giá trị ban đầu
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Phương thức hiển thị thông tin sách
    public static void infoBook(String title, String author, double price) {
        System.out.println("*** Thông tin của cuốn sách: \"" + title + "\"" + " ***");
        System.out.println("Tác giả: " + author);
        System.out.println("Giá: " + price);
    }
}

public class ConstructorExample03a {
    public static void main(String[] args) {
        Book myBook1 = new Book("Lập trình Java", "Huỳnh Lê Bảo", 125.500);
        Book myBook2 = new Book("Lập trình C++", "Mai Đào", 130000);
        myBook1.infoBook("Lập trình Java", "Huỳnh Lê Bảo", 125.500 );
        myBook2.infoBook("Lập trình C++", "Mai Đào", 130000);

    }
}
