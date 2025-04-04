package chuong02.lesson25;

/**
 * Chương 02: Nhập môn lập trình Java
 * Bài 2.5: Ép kiểu dữ liệu
 * Làm tròn số
 */
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Bai25f {
    public static void main(String[] args) {
        double x = 2;
        double y = 3;
        double result = x / y; // kết quả 0.6666666(6)

        // Lấy phần nguyên của result
        System.out.println(Math.ceil(result)); // kq = 1.0, làm tròn lên
        System.out.println(Math.floor(result)); // kq = 0.0, làm tròn xuống
        System.out.println(Math.round(result)); // kq = 1, làm tròn gần nhất

        // Sử dụng DecimalFormat để định dạng số
        // DecimalFormat: Định dạng số với số lượng chữ số thập phân cố định.
        NumberFormat numberFormat = new DecimalFormat("###.#########");
        System.out.println(numberFormat.format(result)); // Định dạng số đến 9 chữ số thập phân

        // Sử dụng printf để định dạng đầu ra
        // printf: In ra số với định dạng cụ thể, trong trường hợp này là số thực
        // với 9 chữ số thập phân, và số sẽ được căn lề phải trong một không gian
        // 50 ký tự.
        System.out.printf("%50.9f", result); // In ra số với 9 chữ số thập phân, căn lề phải
    }
}

