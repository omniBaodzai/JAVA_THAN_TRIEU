package baitapchuong01;

import java.util.Scanner;

/**
 * Bài tập chương 01: Kỹ thuật lập trình Java
 * Bài tập 15: Lập trình hàm xuất ra mã nhị phân của số nguyên n
 */
public class BaiTap15 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Nhập số nguyên n từ bàn phím
        System.out.print("Nhập số nguyên n: ");
        int n = scanner.nextInt();

        // Chuyển đổi n sang mã nhị phân và in ra
        String binaryRepresentation = Integer.toBinaryString(n);
        System.out.println("Mã nhị phân của " + n + " là: " + binaryRepresentation);
    }
}

