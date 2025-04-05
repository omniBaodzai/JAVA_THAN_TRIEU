package chuong02.lesson22;

/**
 * Chương 02: Nhập môn lập trình Java
 * Bài 2.2: Các kiểu dữ liệu trong Java
 * Chuyển đổi kiểu dữ liệu
 */
public class Bai22b
{
    public static void main(String[] args)
    {
        // 1. Chuyển từ int sang float với giá trị lớn nhất
        int intValue = Integer.MAX_VALUE;
        float floatFromInt = intValue; // Chuyển đổi int sang float
        System.out.println("Giá trị từ int chuyển sang float là: " + floatFromInt);

        // 2. Chuyển từ int sang float với giá trị nhỏ hơn
        int smallIntValue = 12345;
        float floatFromSmallInt = smallIntValue;
        System.out.println("Giá trị nhỏ từ int chuyển sang float là:" + floatFromSmallInt);

        // 3. Chuyển từ long sang float
        long longValue = 9223372036854775807L; // Giá trị lớn nhất của long
        float floatFromLong = longValue; // Chuyển đổi long sang float
        System.out.println("Giá trị từ long chuyển sang float: " + floatFromLong);

        // 4. Chuyển từ double sang float
        double doubleValue = 1.2345678901234567; // Một giá trị double có độ chính xác cao
        float floatFromDouble = (float) doubleValue; // Chuyển đổi double sang float
        System.out.println("Giá trị từ double chuyển sang float: " + floatFromDouble);

        // 5. Chuyển từ short sang float
        short shortValue = 32767; // Giá trị lớn nhất của short
        float floatFromShort = shortValue; // Chuyển đổi short sang float
        System.out.println("Giá trị từ short chuyển sang float: " + floatFromShort);
    }
}