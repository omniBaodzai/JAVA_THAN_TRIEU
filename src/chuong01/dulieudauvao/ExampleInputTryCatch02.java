package chuong01.dulieudauvao;

import java.util.Scanner;

/**
 * Chương 01: Kỹ thuật lập trình Java
 * Ví dụ: Nhập dữ liệu từ bàn phím với try-catch
 */

public class ExampleInputTryCatch02 {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner
        Scanner obj = new Scanner(System.in);

        try {
            // Nhập họ và tên
            System.out.print("Nhập họ và tên của bạn: ");
            String fullName = obj.nextLine();  // Dùng nextLine để đọc cả chuỗi

            // Nhập tuổi và kiểm tra hợp lệ
            int age = -1;
            while (age <= 0) {  // Tuổi phải là số dương
                System.out.print("Nhập tuổi của bạn: ");
                if (obj.hasNextInt()) {
                    age = obj.nextInt();
                    if (age <= 0) {
                        System.out.println("Tuổi phải là một số dương. Vui lòng nhập lại.");
                    }
                } else {
                    // Người dùng không nhập số nguyên hợp lệ
                    String invalidInput = obj.next();  // Đọc một từ sai và lưu vào biến invalidInput
                    System.out.println("Vui lòng nhập một số nguyên hợp lệ cho tuổi.");
                    System.out.println("Dữ liệu nhập sai: " + invalidInput);  // In ra dữ liệu sai nhập vào

                    // Đọc và bỏ qua cả chuỗi nhập sai (không phải số nguyên)
                    obj.nextLine();  // Đọc và bỏ qua cả chuỗi hoặc dòng đã nhập sai
                }
            }

            // Nhập chiều cao và kiểm tra hợp lệ
            double height = -1;
            while (height <= 0) {  // Chiều cao phải là số dương
                System.out.print("Nhập chiều cao của bạn (mét): ");
                if (obj.hasNextDouble()) {
                    height = obj.nextDouble();
                    if (height <= 0) {
                        System.out.println("Chiều cao phải là một số dương. Vui lòng nhập lại.");
                    }
                } else {
                    System.out.println("Vui lòng nhập một số hợp lệ cho chiều cao.");
                    obj.next();  // Đọc và bỏ qua input sai
                }
            }

            // Xóa ký tự xuống dòng sau khi nhập chiều cao
            obj.nextLine();  // Để đảm bảo không bị ảnh hưởng đến phần nhập sở thích sau này

            // Nhập sở thích
            System.out.print("Nhập sở thích của bạn: ");
            String hoppy = obj.nextLine();  // Dùng nextLine để đọc cả chuỗi

            // In thông tin của người dùng
            System.out.println("\n*** Thông tin của bạn! ***");
            System.out.println("Họ và tên: " + fullName);
            System.out.println("Tuổi: " + age);
            System.out.println("Chiều cao: " + height + "m");
            System.out.println("Sở thích : " + hoppy);
        } finally {
            // Đóng đối tượng Scanner sau khi hoàn thành công việc
            obj.close();
        }
    }
}
