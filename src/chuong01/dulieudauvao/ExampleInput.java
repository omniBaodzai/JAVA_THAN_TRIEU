package chuong01.dulieudauvao;

import java.util.Scanner;

/**
 * Chương 01: Kỹ thuật lập trình Java
 * Ví dụ: Nhập dữ liệu từ bàn phím
 */

public class ExampleInput {
    public static void main(String[] args) {
        // Tạo một đối tượng của lớp Scanner để đọc đầu vào từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Đọc một văn bản từ người dùng
        System.out.print("Bạn tên là gì? ");
        String name = scanner.nextLine();

        // Đọc một số nguyên từ người dùng
        System.out.print("Bạn bao nhiêu tuổi? ");
        int age = scanner.nextInt();

        // Thêm scanner.nextLine() để tiêu thụ ký tự "Enter"
        scanner.nextLine();  // Đọc ký tự newline mà nextInt() không tiêu thụ

        // Đọc một văn bản từ người dùng
        System.out.print("Bạn đến từ đầu? ");
        String diaChi = scanner.nextLine();

        // In kết quả
        System.out.println("Tên mình là: " + name);
        System.out.println("Mình: " + age + " tuổi");
        System.out.println("Mình đến từ: " + diaChi);

        //Đóng đối tượng của lớp Scanner để giải phóng tài nguyên sau khi dùng
        scanner.close();
    }
}

