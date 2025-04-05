package chuong01.phuongthuc;

/**
 * Chương 01: Kỹ thuật lập trình Java
 * Ví dụ: Method
 */
public class Example {
    // Phương thức không có tham số
    public void sayHello() {
        System.out.println("Hello, World");
    }

    // Phương thức có tham số và trả về kết quả
    public long add(long a, long b) {
        return a + b;
    }

    // Phương thức chính
    public static void main(String[] args) {
        Example myObj = new Example();

        // Gọi method không có tham số
        myObj.sayHello();

        // Gọi method có tham số
        long sum = myObj.add(5, 6);
        System.out.println("Tổng của 5 và 6 là: " + sum);
        System.out.println("Tổng của 7 và 8 là: " + myObj.add(7, 8));
    }
}
