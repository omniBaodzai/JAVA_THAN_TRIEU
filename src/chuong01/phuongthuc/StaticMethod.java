package chuong01.phuongthuc;

/**
 * Chương 01: Kỹ thuật lập trình Java
 * Ví dụ: static method
 */
class MathUtils {
    public static int square(int x) {
        return x * x;
    }
}
public class StaticMethod {
    public static void main(String[] args) {
        // Gọi method mà không cần tạo đối tượng
        System.out.println("Bình phương của 5 là: " + MathUtils.square(5));
    }
}
