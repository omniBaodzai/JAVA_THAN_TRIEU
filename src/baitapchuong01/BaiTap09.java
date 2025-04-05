package baitapchuong01;

/**
 * Bài tập chương 01: Kỹ thuật lập trình Java
 * Bài tập 09: Cho ví dụ về các lớp bao trên Java
 */
public class BaiTap09
{
    public static void main(String[] args)
    {
        // Sử dụng lớp bao Integer (cho kiểu int)
        int a = 10;
        Integer aWrapper = Integer.valueOf(a); // Chuyển int thành Integer
        System.out.println("Integer value: " + aWrapper);

        // Sử dụng lớp bao Double (cho kiểu double)
        double b = 5.75;
        Double bWrapper = Double.valueOf(b); // Chuyển double thành Double
        System.out.println("Double value: " + bWrapper);

        // Sử dụng lớp bao Character (cho kiểu char)
        char c = 'A';
        Character cWrapper = Character.valueOf(c); // Chuyển char thành Character
        System.out.println("Character value: " + cWrapper);

        // Sử dụng lớp bao Boolean (cho kiểu boolean)
        boolean isTrue = true;
        Boolean boolWrapper = Boolean.valueOf(isTrue); // Chuyển boolean thành Boolean
        System.out.println("Boolean value: " + boolWrapper);

        // Chuyển đối tượng wrapper về giá trị nguyên thủy
        int aPrimitive = aWrapper.intValue(); // Chuyển Integer thành int
        double bPrimitive = bWrapper.doubleValue(); // Chuyển Double thành double
        System.out.println("Converted primitive values: " + aPrimitive + " and " + bPrimitive);
    }
}

