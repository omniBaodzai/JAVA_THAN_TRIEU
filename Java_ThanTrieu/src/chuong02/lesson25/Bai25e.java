package chuong02.lesson25;

/**
 * Chương 02: Nhập môn lập trình Java
 * Bài 2.5: Ép kiểu dữ liệu
 * Ép sang kiểu mở hộp
 */
public class Bai25e {
    public static void main(String[] args) {
        Integer xObject = 500; // xObject là kiểu tham chiếu
        System.out.println("Value xObject: " + xObject); // 500

        int x = xObject.intValue(); // x là kiểu nguyên thủy
        System.out.println("Value x: " + x); // 500

        // tương đương
        x = xObject;
        System.out.println("Value x: " + x); // 500

        Double dObject = 123.456;
        System.out.println("Value dObject: " + dObject); // 123.456

        double d = dObject.doubleValue();
        System.out.println("Value d: " + d); // 123.456
        // tương đương:
        d = dObject;
        System.out.println("Value d: " + d); // 123.456
    }
}
