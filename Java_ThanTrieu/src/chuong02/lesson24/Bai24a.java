package chuong02.lesson24;

/**
 * Chương 02: Nhập môn lập trình Java
 * Bài 2.4: Các toán tử, phép gán
 * Toán tử + -
 */
public class Bai24a
{
    public static void main(String[] args)
    {
        var a = 100;
        var b = 250.25;
        var sum = a + b; // cộng hai số bình thường
        var diff = a - b; // trừ số a cho số b
        // hiện kết quả:
        System.out.println(a + " + " + b + " = " + sum);
        System.out.println(a + " - " + b + " = " + diff);

        // cộng âm vô cực với dương vô cực
        var sumInfinity = Float.NEGATIVE_INFINITY + Float.POSITIVE_INFINITY;
        System.out.println(sumInfinity);
        // cộng vô cực cùng dấu -> vô cực cùng dấu
        System.out.println(Float.NEGATIVE_INFINITY + Float.NEGATIVE_INFINITY);
        System.out.println(Float.POSITIVE_INFINITY + Float.POSITIVE_INFINITY);
        // cộng vô cực với số cụ thể -> vô cực
        System.out.println(Float.POSITIVE_INFINITY + a);
        System.out.println(Float.NEGATIVE_INFINITY + a);
        // trừ vô cực cho vô cực đuợc NaN
        System.out.println(Float.NEGATIVE_INFINITY - Float.NEGATIVE_INFINITY);
        System.out.println(Float.POSITIVE_INFINITY - Float.POSITIVE_INFINITY);
        // trừ vô cực với số cụ thể -> vô cực
        System.out.println(Float.POSITIVE_INFINITY - a);
        System.out.println(Float.NEGATIVE_INFINITY - a);
    }
}