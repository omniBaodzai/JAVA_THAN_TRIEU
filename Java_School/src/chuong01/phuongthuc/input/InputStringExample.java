package chuong01.phuongthuc.input;

import java.util.Scanner;

/**
 * Chương 01: Kỹ thuật lập trình Java
 * Ví dụ: Nhập một chuỗi văn bản từ bàn phím
 */
public class InputStringExample {
    // Method nhập một chuỗi văn bản
    public static String inputString() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một chuỗi văn bản: ");

        return scanner.nextLine(); // Đọc một dòng văn bản
    }

    public static void main(String[] args) {
        // Gọi method nhập một chuỗi văn bản
        String input = inputString();
        System.out.println("Chuỗi văn bản bạn vừa nhập là: " + input);
    }
}
