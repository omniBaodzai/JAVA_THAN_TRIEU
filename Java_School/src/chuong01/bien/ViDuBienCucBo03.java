package chuong01.bien;

/**
 * Chương 01: Kỹ thuật lập trình Java
 * Ví dụ: Biến cục bộ trong khối mã
 */
public class ViDuBienCucBo03
{
    public void blockViDuBienCucBo03()
    {
        // Biến cục bộ trong khối mã
        if (true)
        {
            int temp = 42;  // Biến cục bộ trong khối mã
            System.out.println("Temp inside block: " + temp);
        }
        // System.out.println(temp); // Lỗi: biến temp không thể truy cập ngoài khối if
    }

    public static void main(String[] args)
    {
        ViDuBienCucBo03 ViDuBienCucBo03 = new ViDuBienCucBo03();
        ViDuBienCucBo03.blockViDuBienCucBo03();
    }
}

