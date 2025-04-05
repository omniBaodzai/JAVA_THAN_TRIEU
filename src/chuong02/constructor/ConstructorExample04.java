package chuong02.constructor;

import java.util.Scanner;

/**
 * Chương 02: Lập trình hướng đối tượng
 * Ví dụ: Constructor
 */
class Book3 {
    // Các thuộc tính của cuốn sách
    String title;
    String author;
    int birthYear;
    int deathYear;
    String publisher;
    int publicationYear;
    double price;
    String isbn;
    String genre;
    int numberOfPages;
    String language;
    String edition;
    String description;
    double rating;
    String format;

    // Constructor để khởi tạo thông tin cuốn sách
    public Book3(String title, String author, int birthYear, int deathYear, String publisher,
                int publicationYear, double price, String isbn, String genre, int numberOfPages,
                String language, String edition, String description, double rating, String format) {
        this.title = title;
        this.author = author;
        this.birthYear = birthYear;
        this.deathYear = deathYear;
        this.publisher = publisher;
        this.publicationYear = publicationYear;
        this.price = price;
        this.isbn = isbn;
        this.genre = genre;
        this.numberOfPages = numberOfPages;
        this.language = language;
        this.edition = edition;
        this.description = description;
        this.rating = rating;
        this.format = format;
    }

    // Phương thức để hiển thị thông tin cuốn sách
    public void displayInfo() {
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
    }
}

public class ConstructorExample04 {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để nhập dữ liệu từ người dùng
        Scanner scanner = new Scanner(System.in);

        // Nhập thông tin cuốn sách từ người dùng
        System.out.print("Enter the book title: ");
        String title = scanner.nextLine();

        System.out.print("Enter the author's name: ");
        String author = scanner.nextLine();

        System.out.print("Enter the author's birth year: ");
        int birthYear = scanner.nextInt();

        System.out.print("Enter the author's death year: ");
        int deathYear = scanner.nextInt();

        scanner.nextLine();  // Đọc bỏ dòng mới còn lại sau khi nhập số

        System.out.print("Enter the publisher's name: ");
        String publisher = scanner.nextLine();

        System.out.print("Enter the year of publication: ");
        int publicationYear = scanner.nextInt();

        System.out.print("Enter the book price: ");
        double price = scanner.nextDouble();

        scanner.nextLine(); // Đọc bỏ dòng mới

        // Các thông tin bổ sung
        System.out.print("Enter the ISBN number: ");
        String isbn = scanner.nextLine();

        System.out.print("Enter the genre of the book: ");
        String genre = scanner.nextLine();

        System.out.print("Enter the number of pages: ");
        int numberOfPages = scanner.nextInt();

        scanner.nextLine();  // Đọc bỏ dòng mới

        System.out.print("Enter the language of the book: ");
        String language = scanner.nextLine();

        System.out.print("Enter the edition of the book: ");
        String edition = scanner.nextLine();

        System.out.print("Enter a brief description of the book: ");
        String description = scanner.nextLine();

        System.out.print("Enter the rating of the book (out of 5): ");
        double rating = scanner.nextDouble();

        scanner.nextLine(); // Đọc bỏ dòng mới

        System.out.print("Enter the book format (e.g., paperback, hardcover): ");
        String format = scanner.nextLine();

        // Tạo đối tượng Book bằng constructor và truyền các tham số vào
        Book3 book = new Book3(title, author, birthYear, deathYear, publisher, publicationYear, price,
                isbn, genre, numberOfPages, language, edition, description, rating, format);

        // Hiển thị thông tin cuốn sách
        book.displayInfo();

        // Đóng scanner sau khi sử dụng
        scanner.close();
    }
}

