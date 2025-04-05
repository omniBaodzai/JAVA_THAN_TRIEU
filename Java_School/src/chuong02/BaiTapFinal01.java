package chuong02;

/**
 * Chương 02: Lập trình hướng đối tượng
 * Bài tập final 01: Khai báo và sử dụng biến final
 - Khai báo một biến final có tên PI với giá trị 3.14159.
 - In giá trị của PI ra màn hình.
 - Thử gán giá trị mới cho PI và xem lỗi biên dịch.
 */
public class  BaiTapFinal01
{
    public static void main(String[] args)
    {
        final double PI = 3.14159;
        System.out.println("Giá trị của PI là: " + PI);
        // PI = 3.25; Lỗi
    }
}
