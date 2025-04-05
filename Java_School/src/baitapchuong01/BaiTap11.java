package baitapchuong01;

import java.util.Scanner;

/**
 * Bài tập chương 01: Kỹ thuật lập trình Java
 * Bài tập 11: Lập trình tính tổng 1 + 2 + .... + n
 */
public class BaiTap11
{
    // Hàm tính tổng
    public static int tinhTong(int n)
    {
        int tong = 0;
        for (int i = 1; i <= n; i++)
        {
            tong += i;
        }
        return tong;
    }
    
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Nhập số nguyên n từ bàn phím
        System.out.print("Nhập n: ");
        int n = scanner.nextInt();

        // Tính tổng bằng vòng lặp
        int tong = tinhTong(n);
        System.out.println("Tổng từ 1 đến " + n + " là: " + tong);
    }
}

