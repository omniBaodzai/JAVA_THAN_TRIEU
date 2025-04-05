package chuong01.dulieudauvao;

import java.util.Scanner;

/**
 * Chương 01: Kỹ thuật lập trình Java
 * Ví dụ: Nhập một từ từ bàn phím
 */

public class ExampleNextToken01 {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để đọc dữ liệu từ bàn phím
        Scanner obj = new Scanner(System.in);

        // Nhập một chuỗi dữ liệu
        System.out.print("Nhập dữ liệu (gõ 'exit' để dừng): ");
        while (obj.hasNext()) {
            String input = obj.next();  // Đọc một từ
            if ("exit".equalsIgnoreCase(input)) {  // Kiểm tra xem người dùng có nhập "exit" không
                System.out.println("Chương trình kết thúc.");
                break;  // Thoát khỏi vòng lặp
            }
            System.out.println("Bạn đã nhập: " + input);  // In từ vừa nhập
        }

        // Đóng Scanner sau khi sử dụng
        obj.close();
    }
}
