package chuong02.lesson25;

/**
 * Chương 02: Nhập môn lập trình Java
 * Bài 2.5: Ép kiểu dữ liệu
 * Ép sang kiểu rộng hơn
 */
public class Bai25b {
    public static void main(String[] args) {
        // Ép từ int sang float
        float f1 = Integer.MAX_VALUE; // 2.1474836E9
        float f2 = Integer.MIN_VALUE; // -2.1474836E9
        System.out.println("Value f1 & f2: " + f1 + " " + f2);

        // Ép từ float sang double
        double d1 = Float.MAX_VALUE; // 3.4028234663852886E38
        double d2 = Float.MIN_VALUE; // 1.401298464324817E-45
        System.out.println("Value d1 & d2: " + d1 + " " + d2);

        // Kết quả là một số double
        System.out.println("d1 - f1 = " + (d1 - f1)); // 3.4028234663852886E38
        System.out.println("d2 - f2 = " + (d2 - f2)); // 2.147483648E9

        int a1 = 99;
        long newA = a1;

        float fA = a1;
        double dA = fA;
        dA = newA;

        var result = 99 * dA; // ép sang kiểu double

        int a2 = 1234567890;
        float f = a2;

        System.out.println("Value a: " + a2); // 1 234 567 890
        System.out.println("Value f: " + f); // 1.234568E9 = 1 234 568 000
        System.out.println("Value f: " + (int) f); // 1 234 567 936
        System.out.println(a2 - (int) f); // 1 234 567 890 - 1 234 567 936 = -46
    }
}
