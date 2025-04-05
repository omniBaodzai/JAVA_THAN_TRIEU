package chuong01.dulieudauvao;

import java.util.Scanner;

/**
 * Chương 01: Kỹ thuật lập trình Java
 * Ví dụ: Nhập dữ liệu từ bàn phím
 */
public class InputBook {
    public static void main(String[] args) {
        // Tạo một đối tượng Scanner để nhập dữ liệu từ người dùng
        Scanner scanner = new Scanner(System.in);

        // Nhập tiêu đề của cuốn sách
        System.out.print("Enter the book title: ");
        String title = scanner.nextLine();

        // Nhập tác giả của cuốn sách
        System.out.print("Enter the author's name: ");
        String author = scanner.nextLine();

        // Nhập năm sinh của tác giả
        System.out.print("Enter the author's birth year: ");
        int birthYear = scanner.nextInt();

        //scanner.nextLine();  // Đọc bỏ dòng mới còn lại sau khi nhập số

        // Nhập năm mất của tác giả
        System.out.print("Enter the author's death year: ");
        int deathYear = scanner.nextInt();

        scanner.nextLine();  // Đọc bỏ dòng mới còn lại sau khi nhập số

        // Nhập tên nhà xuất bản cuốn sách
        System.out.print("Enter the publisher's name: ");
        String publisher = scanner.nextLine();

        // Nhập năm xuất bản cuốn sách
        System.out.print("Enter the year of publication: ");
        int publicationYear = scanner.nextInt();

        // Nhập giá của cuốn sách
        System.out.print("Enter the book price: ");
        double price = scanner.nextDouble();

        scanner.nextLine(); // Đọc bỏ dòng mới

        // Nhập mã số chuẩn quốc tế của cuốn sách
        System.out.print("Enter the ISBN number: ");
        String isbn = scanner.nextLine();

        // Nhập thể loại của cuốn sách
        System.out.print("Enter the genre of the book: ");
        String genre = scanner.nextLine();

        // Nhập số trang của cuốn sách
        System.out.print("Enter the number of pages: ");
        int numberOfPages = scanner.nextInt();

        scanner.nextLine();  // Đọc bỏ dòng mới

        // Nhập số trang của cuốn sách
        System.out.print("Enter the language of the book: ");
        String language = scanner.nextLine();

        // Nhập phiên bản của cuốn sách
        System.out.print("Enter the edition of the book: ");
        String edition = scanner.nextLine();

        // Nhập mô tả ngắn gọn của cuốn sách
        System.out.print("Enter a brief description of the book: ");
        String description = scanner.nextLine();

        // Nhập số điểm đánh giá của cuốn sách
        System.out.print("Enter the rating of the book (out of 5): ");
        double rating = scanner.nextDouble();

        scanner.nextLine(); // Đọc bỏ dòng mới

        // Nhập định dạng của cuốn sách
        System.out.print("Enter the book format (e.g., paperback, hardcover): ");
        String format = scanner.nextLine();

        // Hiển thị thông tin cuốn sách
        System.out.println("\nBook Information:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Author's birth year: " + birthYear);
        System.out.println("Author's death year: " + deathYear);
        System.out.println("Publisher: " + publisher);
        System.out.println("Publication year: " + publicationYear);
        System.out.println("Price: " + price);
        System.out.println("ISBN: " + isbn);
        System.out.println("Genre: " + genre);
        System.out.println("Number of pages: " + numberOfPages);
        System.out.println("Language: " + language);
        System.out.println("Edition: " + edition);
        System.out.println("Description: " + description);
        System.out.println("Rating: " + rating);
        System.out.println("Format: " + format);

        scanner.close(); // Đóng scanner sau khi sử dụng
    }
}

