package baitapchuong01;

/**
 * Bài tập chương 01: Kỹ thuật lập trình Java
 * Bài tập 05: Hàm trong Java
 */
public class BaiTap05
{
    // Hàm in ra lời chào đơn giản
    public static void xinChao()
    {
        System.out.println("Hello, World!");
    }

    // Hàm tính tổng hai số nguyên a và b
    public static int tinhTong(int a, int b)
    {
        return a + b;
    }
    public static void main(String[] args)
    {
        // Gọi hàm xinChao()
        xinChao();

        // In kết quả hàm tính tổng
        System.out.println("Tổng a và b là: " + tinhTong(5, 6));

    }
}
