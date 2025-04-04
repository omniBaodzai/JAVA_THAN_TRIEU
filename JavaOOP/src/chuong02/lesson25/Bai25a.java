package chuong02.lesson25;

/**
 * Chương 02: Nhập môn lập trình Java
 * Bài 2.5: Ép kiểu dữ liệu
 * Ép sang cùng kiểu
 */
public class Bai25a {
    public static void main(String[] args) {
        // x và y cùng tham chiếu đến String "Hello"
        String x = "Hello";
        String y = (String) x; // tương đương String y = x;
        System.out.println(y.toUpperCase()); // HELLO

        int a = 100;
        int b = a; // Ép kiểu ngầm định, tương đương int b = (int)a
        b++;
        a--;
        int c = (int) b; // Ép kiểu tường minh

        System.out.println("Value a: " + a); // 99
        System.out.println("Value b: " + b); // 101
        System.out.println("Value c: " + c); // 101
    }
}
