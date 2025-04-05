package chuong01.bien;

/**
 * Chương 01: Kỹ thuật lập trình Java
 * Ví dụ: Biến cục bộ trong vòng lặp
 */
public class ViDuBienCucBo02
{
    public void loopViDuBienCucBo02()
    {
        // Biến cục bộ trong vòng lặp
        for (int i = 0; i < 5; i++)
        {
            int binhPhuong = i * i;  // Biến cục bộ trong vòng lặp
            System.out.println("Bình phương của: " + i + " là: " + binhPhuong);
        }
        // System.out.println(binhPhuong); // Lỗi: biến binhPhuong không thể truy cập ngoài vòng lặp
    }

    public static void main(String[] args)
    {
        ViDuBienCucBo02 ViDuBienCucBo02 = new ViDuBienCucBo02();
        ViDuBienCucBo02.loopViDuBienCucBo02();
    }
}

