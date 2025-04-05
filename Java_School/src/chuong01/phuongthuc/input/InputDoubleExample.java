package chuong01.phuongthuc.input;

import java.util.Scanner;

/**
 * Chương 01: Kỹ thuật lập trình Java
 * Ví dụ: Nhập một số thực
 */
public class InputDoubleExample {
    // Method nhập một số thực
    public static double inputDouble() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số thực: ");

        return scanner.nextDouble();
    }

    public static void main(String[] args) {
        // Gọi method nhập một số thực
        double number = inputDouble();
        System.out.println("Số thực bạn vùa nhập là: " + number);
    }
}
