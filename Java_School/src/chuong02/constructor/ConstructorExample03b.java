package chuong02.constructor;
/**
 * Chương 02: Lập trình hướng đối tượng
 * Ví dụ: Constructor
 */
class Book2 {
    String title;
    String author;
    double price;

    // Constructor có tham số để khởi tạo giá trị ban đầu
    public Book2(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Phương thức hiển thị thông tin sách
    public void display() {
        System.out.println("Tiêu đề: " + title);
        System.out.println("Tác giả: " + author);
        System.out.println("Giá: " + price);
    }
}

public class ConstructorExample03b {
    public static void main(String[] args) {
        // Tạo đối tượng Book và khởi tạo các giá trị ban đầu
        Book2 book1 = new Book2("Lập trình Java", "Nguyễn Văn A", 200.0);
        book1.display();

        Book2 book2 = new Book2("Học lập trình Python", "Trần Thị B", 250.0);
        book2.display();
    }
}

