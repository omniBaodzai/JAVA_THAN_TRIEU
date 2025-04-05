package chuong01.phuongthuc.input;

import java.util.Scanner;

/**
 * Chương 01: Kỹ thuật lập trình Java
 * Ví dụ: Nhập nhiều giá trị
 */
public class InputMultipleValuesExample {
    // Method nhập nhiều giá trị
    public static void inputMultipleValues() {
        Scanner scanner = new Scanner(System.in);

        // Nhập họ tên
        System.out.print("Nhập họ tên của bạn: ");
        String fullName = scanner.nextLine();

        // Nhập tuổi
        System.out.print("Nhập tuổi của bạn: ");
        int age = scanner.nextInt();

        // Nhập chiều cao
        System.out.print("Nhập chiều cao của bạn: ");
        double height = scanner.nextDouble();

        // Hiển thị kết quả
        System.out.println("*** Thông tin của tôi ***");
        System.out.println("Họ tên: " + fullName);
        System.out.println("Tuổi: " + age);
        System.out.println("Chiều cao: " + height + "m");
    }

    public static void main(String[] args) {
        // Gọi method nhập nhiều giá trị
        inputMultipleValues();
    }
}
