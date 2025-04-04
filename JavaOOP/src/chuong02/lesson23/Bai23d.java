package chuong02.lesson23;

import java.util.Scanner;

/**
 * Chương 02: Nhập môn lập trình Java
 * Bài 2.3: Các biến trong Java
 * Nhập dữ liệu từ bàn phím
 */
public class Bai23d
{
    public static void main(String[] args)
    {
        var scanner = new Scanner(System.in);

        // Nhập vào một ký tự
        char c;
        System.out.println("Nhập vào một ký tự: ");
        c = scanner.next().charAt(0);
        System.out.print("Ký tự bạn vừa nhập là: " + c);

        scanner.close();
    }
}
