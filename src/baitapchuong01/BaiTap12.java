package baitapchuong01;

import java.util.Scanner;

/**
 * Bài tập chương 01: Kỹ thuật lập trình Java
 * Bài tập 12: Lập trình tính n!
 */

public class BaiTap12 {
    // Hàm tính giai thừa sử dụng vòng lặp
    public static long tinhGiaiThua(int n)
    {
        long ketQua = 1;
        for (int i = 1; i <= n; i++)
        {
            ketQua *= i;
        }
        return ketQua;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Nhập số nguyên n từ bàn phím
        System.out.print("Nhập n: ");
        int n = scanner.nextInt();

        // Tính n! bằng vòng lặp
        long ketQua = tinhGiaiThua(n);
        System.out.println(n + "! = " + ketQua);
    }
}

