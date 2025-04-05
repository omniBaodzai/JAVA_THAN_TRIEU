package chuong01.phuongthuc.input;

import java.util.Scanner;

/**
 * Chương 01: Kỹ thuật lập trình Java
 * Ví dụ: Xử lý ký tự xuống dòng
 */
public class ScannerFixExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số nguyên
        System.out.print("Nhập tuổi của bạn: ");
        int age = scanner.nextInt();

        // Xóa ký tự xuống dòng còn sót lại trong bộ nhớ đệm
        scanner.nextLine();  // Đọc và loại bỏ ký tự xuống dòng sau khi nhập số

        // Nhập tên
        System.out.print("Nhập tên của bạn: ");
        String name = scanner.nextLine();  // Đọc tên người dùng

        // Hiển thị thông tin nhập
        System.out.println("Tuổi: " + age);
        System.out.println("Tên: " + name);
    }
}

