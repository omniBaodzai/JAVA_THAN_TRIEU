package chuong02.lesson23;

/**
 * Chương 02: Nhập môn lập trình Java
 * Bài 2.3: Các biến trong Java
 * Hằng số
 */
public class Bai23c
{
    public static void main(String[] args)
    {
        // Khai báo hằng số
        final int AGE;
        AGE = 18;
        System.out.println(AGE);

        final double PI = Math.PI;
        System.out.println("Pi = " + PI);

        final String EXTRA_MESSAGE = "Hello World!";
        System.out.println("Extra message: " + EXTRA_MESSAGE);

        final int MAX_INT = Integer.MAX_VALUE;
        System.out.println("Max int: " + MAX_INT);

        final int MIN_INT = Integer.MIN_VALUE;
        System.out.println("Min int: " + MIN_INT);


    }
}