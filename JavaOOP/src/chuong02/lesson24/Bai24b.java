package chuong02.lesson24;

/**
 * Chương 02: Nhập môn lập trình Java
 * Bài 2.4: Các toán tử, phép gán
 * Toán tử * /
 */
public class Bai24b {
    public static void main(String[] args) {
        var a = 100;
        var b = -250.25;
        var c = 999L;

        var result1 = a / b;

        System.out.println(result1); // Một số double

        // Lấy phần nguyên
        System.out.println("1 / 2 = " + 1 / 2); // 0

        // Lấy phần nguyên
        System.out.println("1 / 2 = " + (1 / 2)); // 0

        // Lấy phần dư (ép kiểu một trong 2 số)
        System.out.println("1 / 2 = " + (1.0 / 2)); // 0.5
        System.out.println("1 / 2 = " + (1 * 1.0 / 2)); // 0.5
        System.out.println("1 / 2 = " + (1f / 2)); // 0.5
        System.out.println("1 / 2 = " + (1d / 2)); // 0.5

        // Nếu lấy một số nguyên chia cho một số nguyên 0 gây ra lỗi ngoại lệ
        //System.out.println(1 / 0); // Lỗi: Exception in thread "main" java.lang.ArithmeticException: / by zero

        // Xử lý ngoại lệ
        try {
            // Cố gắng thực hiện phép chia
            System.out.println(1 / 0); // Lỗi: chia cho 0
        } catch (ArithmeticException e) {
            // Xử lý ngoại lệ nếu có lỗi chia cho 0
            System.out.println("Lỗi: Không thể chia cho 0!");
        }

        // Nếu chia một số thực cho 0 thì kết quả là một vô cực
        System.out.println(-1f / 0);
        System.out.println(1f / 0);
        System.out.println(1 / 0.0);
        System.out.println(1 / -0.0);

        var result2 = a * b * c;
        System.out.println(a + " * " + b + " * " + c + " = " + result2);
        System.out.println(b * Float.NaN);
        System.out.println(Double.NaN * Float.NaN);
        System.out.println(Double.POSITIVE_INFINITY * Float.NaN);
        System.out.println(Double.POSITIVE_INFINITY * Double.NEGATIVE_INFINITY);
        System.out.println(Double.POSITIVE_INFINITY * Double.POSITIVE_INFINITY);
        System.out.println(Double.NEGATIVE_INFINITY * Double.NEGATIVE_INFINITY);
    }
}
