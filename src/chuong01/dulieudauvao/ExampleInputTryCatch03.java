package chuong01.dulieudauvao;

import java.util.Scanner;

/**
 * Chương 01: Kỹ thuật lập trình Java
 * Ví dụ: Nhập dữ liệu từ bàn phím với try-catch
 */

public class ExampleInputTryCatch03 {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner
        Scanner obj = new Scanner(System.in);

        // Nhập họ và tên
        System.out.print("Nhập họ và tên của bạn: ");
        String fullName = obj.nextLine();

        // Nhập tuổi và xử lý ngoại lệ bằng try-catch
        int age = -1;
        while (age <= 0) {  // Tuổi phải là số dương
            System.out.print("Nhập tuổi của bạn: ");
            try {
                age = obj.nextInt();  // Đọc tuổi (số nguyên)
                obj.nextLine();  // Đọc ký tự xuống dòng còn sót lại sau nextInt()

                if (age <= 0) {
                    System.out.println("Tuổi phải là một số dương. Vui lòng nhập lại.");
                }
            } catch (Exception e) {  // Bắt ngoại lệ nếu người dùng nhập sai kiểu dữ liệu
                System.out.println("Vui lòng nhập một số hợp lệ cho tuổi.");
                obj.nextLine(); // Xử lý nhập sai, xóa input không hợp lệ
            }
        }

        // Nhập chiều cao
        double height = -1;
        while (height <= 0) {  // Chiều cao phải là số dương
            System.out.print("Nhập chiều cao của bạn (mét): ");
            try {
                height = obj.nextDouble();  // Đọc chiều cao (số thực)
                obj.nextLine(); // Đọc ký tự xuống dòng còn sót lại sau nextDouble()

                if (height <= 0) {
                    System.out.println("Chiều cao phải là một số dương. Vui lòng nhập lại.");
                }
            } catch (Exception e) {  // Bắt ngoại lệ nếu người dùng nhập sai kiểu dữ liệu
                System.out.println("Vui lòng nhập một số hợp lệ cho chiều cao.");
                obj.nextLine(); // Xử lý nhập sai, xóa input không hợp lệ
            }
        }

        // Nhập sở thích
        System.out.print("Nhập sở thích của bạn: ");
        String hoppy = obj.nextLine();

        // In thông tin của người dùng
        System.out.println("\n*** Thông tin của bạn! ***");
        System.out.println("Họ và tên: " + fullName);
        System.out.println("Tuổi: " + age);
        System.out.println("Chiều cao: " + height + "m");
        System.out.println("Sở thích : " + hoppy);
    }
}
