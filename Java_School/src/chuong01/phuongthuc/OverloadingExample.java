package chuong01.phuongthuc;

/**
 * Chương 01: Kỹ thuật lập trình Java
 * Ví dụ: Nạp chồng phương thức
 */
public class OverloadingExample {
    // Method tính tổng hai số nguyên
    public int add(int a, int b) {
        return a + b;
    }

    // Method tính tổng ba số nguyên
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method tính tổng hai số thực
    public double add(double a, double b) {
        return a + b;
    }


    // Method chính
    public static void main(String[] args) {
        OverloadingExample myObj = new OverloadingExample();

        // Gọi method tính tổng hai số nguyên
        System.out.println("Tổng hai số nguyên là: " + myObj.add(4, 7));

        // Gọi method tính tổng ba số nguyên
        System.out.println("Tổng ba số nguyên là: " + myObj.add(4, 7, 9));

        // Gọi method tính tổng hai số thực
        System.out.println("Tổng hai số thực là: " + myObj.add(4.9, 7.9));
    }
}
