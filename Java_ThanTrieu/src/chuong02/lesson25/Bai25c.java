package chuong02.lesson25;

/**
 * Chương 02: Nhập môn lập trình Java
 * Bài 2.5: Ép kiểu dữ liệu
 * Ép sang kiểu hẹp hơn
 */
public class Bai25c {
    public static void main(String[] args) {
        // Ép từ double sang int
        // int canBacHai = Math.sqrt(90); // Lỗi: sqrt trả về double
        int canBacHai = (int)Math.sqrt(90); // 9.486832981
        System.out.println("Căn bậc hai: " + canBacHai); // 9

        float pi = 3.14159f;
        // int intPi = pi; // Lỗi
        int intPi = (int)pi;
        System.out.println("Value pi int: " + intPi); // 3
    }
}
