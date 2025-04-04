package chuong02.lesson23;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Chương 02: Nhập môn lập trình Java
 * Bài 2.3: Các biến trong Java
 * Nhập dữ liệu từ bàn phím
 */
public class Bai23f
{
    public static void main(String[] args)
    {
        var scanner = new Scanner(System.in); // biến nhập dữ liệu từ bàn phím

        System.out.println("Họ và tên: ");
        var fullName = scanner.nextLine();

        System.out.println("Điểm gpa: ");
        var gpa = scanner.nextFloat();

        System.out.println("Mức lương: ");
        var salary = scanner.nextDouble();

        // Hiển thị ra màn hình:
        System.out.printf("Họ và tên: %-30s\n", fullName);
        System.out.printf("Điểm GPA: %-10.2f\n", gpa);

        // Định dạng giá trị số phân tách bởi dấu phẩy ở phần nghìn, lẻ thập phân
        var formatter = new DecimalFormat("#,###.##");
        System.out.printf("Mức lương: %sđ\n", formatter.format(salary));

        scanner.close();
    }
}
