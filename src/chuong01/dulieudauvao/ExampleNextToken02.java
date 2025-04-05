package chuong01.dulieudauvao;

import java.util.Scanner;

/**
 * Chương 01: Kỹ thuật lập trình Java
 * Ví dụ: Nhập một từ từ bàn phím
 */

public class ExampleNextToken02 {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để đọc dữ liệu từ bàn phím
        Scanner obj = new Scanner(System.in);

        int count = 0;
        int maxTokens = 5;  // Chỉ nhập tối đa 5 token

        // Nhập một chuỗi dữ liệu
        System.out.print("Nhập dữ liệu: ");
        while (obj.hasNext() && count < maxTokens) {
            String input = obj.next();  // Đọc một từ
            System.out.println("Bạn đã nhập: " + input);  // In từ vừa nhập
            count++;  // Tăng số lượng token đã nhập
        }

        System.out.println("Đã đạt giới hạn số token. Chương trình kết thúc.");

        obj.close();  // Đóng Scanner sau khi sử dụng
    }
}
