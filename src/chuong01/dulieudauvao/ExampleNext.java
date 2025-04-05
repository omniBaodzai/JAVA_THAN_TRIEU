package chuong01.dulieudauvao;

import java.util.Scanner;

/**
 * Chương 01: Kỹ thuật lập trình Java
 * Ví dụ: Nhập một từ từ bàn phím
 */

public class ExampleNext {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để đọc dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập một từ: ");

        // Sử dụng phương thức next() để đọc một từ
        String input = scanner.next();
        System.out.print("Bạn đã nhập: " + input);

        // Đóng đối tượng scanner sau khi sử dụng
        scanner.close();
    }
}

