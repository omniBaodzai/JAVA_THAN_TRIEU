package baitapchuong01;

/**
 * Bài tập chương 01: Kỹ thuật lập trình Java
 * Bài tập 18: Biến đổi cấu trúc lệnh lặp for thành lệnh lặp điều kiện trước bằng ví dụ cụ thể
 */
public class BaiTap18
{
    public static void main(String[] args)
    {
        // Lệnh lặp for sau để in các số từ 1 đến 5
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // Chuyển lệnh for trên thành lệnh while
        int i = 1;
        while (i <=5)
        {
            System.out.println(i);
            i++;
        }
    }
}

