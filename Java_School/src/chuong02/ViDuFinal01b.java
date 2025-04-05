package chuong02;

/**
 * Chương 02: Lập trình hướng đối tượng
 * Ví dụ: Từ khóa final với biến
 * Biến final có giá trị cố định, không thể thay đổi sau khi gán lần đầu tiên.
 */
public class ViDuFinal01b
{
        public static void main(String[] args)
        {
            final int myNum = 15;  // Khai báo biến hằng số
            System.out.println(myNum);
            // myNum = 20; // Lỗi: Cannot assign a value to a final variable
        }
}
