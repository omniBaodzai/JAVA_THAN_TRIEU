package chuong01.phuongthuc.input;

import java.util.Scanner;

/**
 * Chương 01: Kỹ thuật lập trình Java
 * Ví dụ: Nhập số nguyên từ bàn phím
 */
public class InputIntegerExample {
    // Method nhập số nguyên
    public static int inputInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số nguyên: ");

        return scanner.nextInt(); // Đọc một số nguyên int
    }

    public static void main(String[] args) {
        // Gọi method nhập số nguyên
        int number = inputInteger();
        System.out.println("Số nguyên bạn vừa nhập là: " + number);
    }
}
