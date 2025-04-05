package chuong01.bien;

/**
 * Chương 01: Kỹ thuật lập trình Java
 * Ví dụ: Biến cục bộ trong phương thức
 */
public class ViDuBienCucBo01
{
    public void myMethod()
    {
        // Biến cục bộ trong phương thức
        int x = 10;
        int b = 10;
        System.out.println("Giá trị của x bên trong phương thức myMethod: " + x); // In ra giá trị của x
    }

    public static void main(String[] args)
    {
        ViDuBienCucBo01 obj = new ViDuBienCucBo01();
        obj.myMethod();
        // System.out.println(x); // Lỗi: x không thể truy cập ngoài phương thức myMethod
    }
}
