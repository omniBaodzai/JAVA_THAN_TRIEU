package chuong02.lesson23;

import java.util.Scanner;

/**
 * Chương 02: Nhập môn lập trình Java
 * Bài 2.3: Các biến trong Java
 * Nhập dữ liệu từ bàn phím
 */
public class Bai23e
{
    public static void main(String[] args)
    {
        var input = new Scanner(System.in);

        // Nhập tuổi
        System.out.print("Mời bạn nhập tuổi: ");
        var age = input.nextInt();

        // Xóa ký tự Enter khỏi bộ nhớ đệm
        input.nextLine();

        // Nhập họ và tên
        System.out.print("Mời bạn nhập họ và tên: ");
        var fullName = input.nextLine();

        // Nhập mức lương
        System.out.print("Mời bạn nhập mức lương: ");
        var salary = input.nextLong();

        // Hiển thị thông tin ra màn hình
        System.out.println("*** Thông tin của bạn ***");
        System.out.println("Họ và tên: " + fullName);
        System.out.println("Tuổi: " + age);
        System.out.println("Mức lương: " + salary);

        input.close();
    }
}
