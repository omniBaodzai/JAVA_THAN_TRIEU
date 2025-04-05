package baitapchuong01;

/**
 * Bài tập chương 01: Kỹ thuật lập trình Java
 * Bài tập 07: Cho ví dụ về các hàm đệ quy và không đệ quy trên Java
 */
public class BaiTap07
{
    // Hàm tính tổng không đệ quy (iterative)
    public static int tinhTongKhongDeQuy(int n)
    {
        int tong = 0;
        for (int i = 1; i <= n; i++)
        {
            tong += i;
        }
        return tong;
    }

    // Hàm tính tổng đệ quy (recursive)
    public static int tinhTongDeQuy(int n)
    {
        if (n == 1)
            return 1; // Điều kiện dừng
        else
            return n + tinhTongDeQuy(n - 1); // Đệ quy
    }

    public static void main(String[] args)
    {
        int n = 5;

        // Tính tổng bằng cách không đệ quy
        int ketQuaKhongDeQuy = tinhTongKhongDeQuy(n);
        System.out.println("Tổng từ 1 đến " + n + " (không đệ quy) là: " + ketQuaKhongDeQuy);

        // Tính tổng bằng cách đệ quy
        int ketQuaDeQuy = tinhTongDeQuy(n);
        System.out.println("Tổng từ 1 đến " + n + " (đệ quy) là: " + ketQuaDeQuy);
    }
}
