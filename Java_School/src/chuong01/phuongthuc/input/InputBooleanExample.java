package chuong01.phuongthuc.input;

import java.util.Scanner;

/**
 * Chương 01: Kỹ thuật lập trình Java
 * Ví dụ: Nhập một giá trị boolean
 */
public class InputBooleanExample {
    // Method nhập một giá trị boolean
    public static boolean inputBoolean() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một giá trị boolean: ");

        return scanner.nextBoolean();
    }

    public static void main(String[] args) {
        // Gọi method nhập một giá trị boolean
        boolean value = inputBoolean();
        System.out.println("Giá trị boolean bạn vừa nhập là: " + (value ? "đúng" : "sai"));
    }
}
