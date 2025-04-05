package baitapchuong01;

import java.util.Scanner;

/**
 * Bài tập chương 01: Kỹ thuật lập trình Java
 * Bài tập 14: Lập trình hàm nhận vào họ tên, trả về Họ Tên dạng proper
 */
public class BaiTap14
{
    // Hàm chuyển đổi họ tên sang dạng Proper Case
    public static String chuyenDoiProperCase(String fullName)
    {
        // Tách các từ trong họ tên
        String[] words = fullName.trim().split("\\s+");

        StringBuilder properName = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0)
            {
                // Chuyển chữ cái đầu tiên thành chữ hoa và phần còn lại thành chữ thường
                properName.append(word.substring(0, 1).toUpperCase())  // Chữ cái đầu tiên viết hoa
                        .append(word.substring(1).toLowerCase())   // Phần còn lại viết thường
                        .append(" ");  // Thêm khoảng trắng giữa các từ
            }
        }

        // Loại bỏ khoảng trắng thừa ở cuối chuỗi
        return properName.toString().trim();
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Nhập họ tên từ người dùng
        System.out.print("Nhập họ tên: ");
        String fullName = scanner.nextLine();

        // Chuyển đổi họ tên sang dạng Proper Case
        String properName = chuyenDoiProperCase(fullName);
        System.out.println("Họ tên theo dạng Proper Case: " + properName);
    }
}

