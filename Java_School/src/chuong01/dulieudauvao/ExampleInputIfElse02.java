package chuong01.dulieudauvao;

import java.util.Scanner;

/**
 * Chương 01: Kỹ thuật lập trình Java
 * Ví dụ: Nhập dữ liệu từ bàn phím với if-else
 */

public class ExampleInputIfElse02 {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner
        Scanner obj = new Scanner(System.in);

        // Nhập họ và tên
        System.out.print("Nhập họ và tên của bạn: ");
        String fullName = obj.nextLine();

        // Nhập tuổi và xử lý đúng việc đọc ký tự xuống dòng
        int age = -1;
        while (age <= 0) {  // Tuổi phải là số dương
            System.out.print("Nhập tuổi của bạn: ");
            if (obj.hasNextInt()) {
                age = obj.nextInt(); // Đọc tuổi (số nguyên)
                obj.nextLine(); // Đọc ký tự xuống dòng còn sót lại sau nextInt()

                if (age <= 0) {
                    System.out.println("Tuổi phải là một số dương. Vui lòng nhập lại.");
                }
            } else {
                System.out.println("Vui lòng nhập một số hợp lệ cho tuổi.");
                obj.next(); // Đọc và bỏ qua input sai (không phải số)
            }
        }

        // Nhập chiều cao
        double height = -1;
        while (height <= 0) {  // Chiều cao phải là số dương
            System.out.print("Nhập chiều cao của bạn (mét): ");
            if (obj.hasNextDouble()) {
                height = obj.nextDouble();
                obj.nextLine(); // Đọc ký tự xuống dòng còn sót lại sau nextDouble()

                if (height <= 0) {
                    System.out.println("Chiều cao phải là một số dương. Vui lòng nhập lại.");
                }
            } else {
                System.out.println("Vui lòng nhập một số hợp lệ cho chiều cao.");
                obj.next(); // Đọc và bỏ qua input sai (không phải số thực)
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
