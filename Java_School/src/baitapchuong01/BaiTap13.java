package baitapchuong01;

import java.util.Scanner;

/**
 * Bài tập chương 01: Kỹ thuật lập trình Java
 * Bài tập 13: Lập trình hàm kiểm tra số nguyên n có là số nguyên tố hay không
 */
public class BaiTap13 {
    // Hàm kiểm tra số nguyên tố
    public static boolean kiemTraSoNguyenTo(int n)
    {
        // Số nhỏ hơn 2 không phải là số nguyên tố
        if (n < 2)
            return false;

        // Kiểm tra các số từ 2 đến sqrt(n)
        for (int i = 2; i <= Math.sqrt(n); i++)
        {
            if (n % i == 0)
                return false;  // Nếu tìm thấy ước, thì không phải là số nguyên tố
        }

        return true;  // Nếu không chia hết cho số nào, là số nguyên tố
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Nhập số nguyên n từ bàn phím
        System.out.print("Nhập n: ");
        int n = scanner.nextInt();

        // Kiểm tra số nguyên tố
        if (kiemTraSoNguyenTo(n))
            System.out.println(n + " là số nguyên tố.");
        else
            System.out.println(n + " không phải là số nguyên tố.");
    }
}

