package chuong01.dulieudauvao;

import java.util.Scanner;

/**
 * Chương 01: Kỹ thuật lập trình Java
 * Ví dụ: Nhập dữ liệu từ bàn phím với try-catch
 */

public class ExampleInputTryCatch01 {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner
        Scanner obj = new Scanner(System.in);

        // Nhập họ và tên
        System.out.print("Nhập họ và tên của bạn: ");
        String fullName = obj.nextLine();

        // Nhập tuổi và kiểm tra hợp lệ với try-catch
        int age = -1;
        while (age <= 0) {  // Tuổi phải là số dương
            System.out.print("Nhập tuổi của bạn: ");
            try {
                age = Integer.parseInt(obj.nextLine());  // Cố gắng chuyển đổi dữ liệu người dùng nhập thành kiểu int
                if (age <= 0) {
                    System.out.println("Tuổi phải là một số dương. Vui lòng nhập lại.");
                }
            } catch (NumberFormatException e) {  // Bắt ngoại lệ nếu người dùng nhập sai kiểu dữ liệu (không phải số)
                System.out.println("Vui lòng nhập một số hợp lệ cho tuổi.");
            }
        }

        // Nhập chiều cao và kiểm tra hợp lệ với try-catch
        double height = -1;
        while (height <= 0) {  // Chiều cao phải là số dương
            System.out.print("Nhập chiều cao của bạn (mét): ");
            try {
                height = Double.parseDouble(obj.nextLine());  // Cố gắng chuyển đổi dữ liệu người dùng nhập thành kiểu double
                if (height <= 0) {
                    System.out.println("Chiều cao phải là một số dương. Vui lòng nhập lại.");
                }
            } catch (NumberFormatException e) {  // Bắt ngoại lệ nếu người dùng nhập sai kiểu dữ liệu (không phải số thực)
                System.out.println("Vui lòng nhập một số hợp lệ cho chiều cao.");
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

        //Đóng đối tượng của lớp Scanner để giải phóng tài nguyên sau khi dùng
        obj.close();
    }
}
