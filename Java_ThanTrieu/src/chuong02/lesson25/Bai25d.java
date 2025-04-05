package chuong02.lesson25;

/**
 * Chương 02: Nhập môn lập trình Java
 * Bài 2.5: Ép kiểu dữ liệu
 * Ép sang kiểu đóng hộp
 */
public class Bai25d {
    public static void main(String[] args) {
        int y = 10;

        // Tạo một đối tượng của lớp bao Integer
        Integer xObj = y;// xObject là kiểu tham chiếu

        System.out.println(xObj.longValue()); // 10
        System.out.println(xObj.doubleValue()); // 10.0
        System.out.println(xObj.compareTo(y)); // 0

        // Các thao tác sau sẽ gây lỗi
        // System.out.println(x.longValue())
        // System.out.println(x.compareto(300))
        // System.out.println(x.toString()) // error
        // System.out.println(x.compareTo(200)); // error

        int a = 200;
        Integer integer = a;
        System.out.println("Value integer: " + integer); // 200

        double d = integer.doubleValue();
        System.out.println("Value d: " + d); // 200.0
        System.out.println(integer.toString() + integer); // 200200

        // Giá trị 3.25 được đóng gọi lại và gán vào doubleX
        //Double doubleX = 3.25;
        //Double doubleX = d; Đưa một biến kiểu nguyên thủy về biến kiểu lớp bao tương ứng của nó
        // Từ biến kiểu double sang đối tượng Double

        // Kiểm tra xem có phải NaN hay không
        Double doubleX = Double.NaN;
        System.out.println(doubleX.isNaN()); // true

        int z = doubleX.intValue();
        System.out.println("Value z: " + z); // 0

        long l = doubleX.longValue();
        System.out.println("Value l: " + l); // 0

        float f = doubleX.floatValue();
        System.out.println("Value f: " + f); // NaN

        double dd = doubleX; // Ép kiểu mở hộp: đưa đối tượng doubleX về kiểu nguyên kiểu double
    }
}
