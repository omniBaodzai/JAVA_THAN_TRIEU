package chuong02.lesson22;
/**
 * Chương 02: Nhập môn lập trình Java
 * Bài 2.2: Các kiểu dữ liệu trong Java
 * In ra kích thước và giá trị min - max của một kiểu dữ liệu
 */
public class Bai22a
{
    public static void main(String[] args)
    {
        // Nhân bản: Ctrl + D
        // Chọn vùng: Shift + Alt

        // 1. Kiểu byte
        System.out.println("1. Kiểu byte");
        System.out.println("Có kích thước: " + Byte.BYTES + " byte và " + (Byte.BYTES * 8) + " bit"); // Trả về byte
        System.out.println("Có kích thước: " + Byte.SIZE + " bit và " + (Byte.SIZE / 8) + " byte"); // Trả về bit
        System.out.println("Giá trị tối thiểu kiểu byte là: " + Byte.MIN_VALUE);
        System.out.println("Giá trị tối đa kiểu byte là: " + Byte.MAX_VALUE);

        // 2. Kiểu short
        System.out.println("2. Kiểu short");
        System.out.println("Có kích thước: " + Short.BYTES + " byte và " + (Short.BYTES * 8) + " bit"); // Trả về byte
        System.out.println("Có kích thước: " + Short.SIZE + " bit và " + (Short.SIZE / 8) + " byte"); // Trả về bit
        System.out.println("Giá trị tối thiểu kiểu short là: " + Short.MIN_VALUE);
        System.out.println("Giá trị tối đa kiểu short là: " + Short.MAX_VALUE);

        // 3. Kiểu int
        System.out.println("3. Kiểu int");
        System.out.println("Có kích thước: " + Integer.BYTES + " byte và " + (Integer.BYTES * 8) + " bit"); // Trả về byte
        System.out.println("Có kích thước: " + Integer.SIZE + " bit và " + (Integer.SIZE / 8) + " byte"); // Trả về bit
        System.out.println("Giá trị tối thiểu kiểu int là: " + Integer.MIN_VALUE);
        System.out.println("Giá trị tối đa kiểu int là: " + Integer.MAX_VALUE);

        // 4. Kiểu long
        System.out.println("4. Kiểu long");
        System.out.println("Có kích thước: " + Long.BYTES + " byte và " + (Long.BYTES * 8) + " bit"); // Trả về byte
        System.out.println("Có kích thước: " + Long.SIZE + " bit và " + (Long.SIZE / 8) + " byte"); // Trả về bit
        System.out.println("Giá trị tối thiểu kiểu long là: " + Long.MIN_VALUE);
        System.out.println("Giá trị tối đa kiểu long là: " + Long.MAX_VALUE);

        // 5. Kiểu float
        System.out.println("5. Kiểu float");
        System.out.println("Có kích thước: " + Float.BYTES + " byte và " + (Float.BYTES * 8) + " bit"); // Trả về byte
        System.out.println("Có kích thước: " + Float.SIZE + " bit và " + (Float.SIZE / 8) + " byte"); // Trả về bit
        System.out.println("Giá trị tối thiểu kiểu float là: " + Float.MIN_VALUE);
        System.out.println("Giá trị tối đa kiểu float là: " + Float.MAX_VALUE);

        // 6. Kiểu double
        System.out.println("6. Kiểu double");
        System.out.println("Có kích thước: " + Double.BYTES + " byte và " + (Double.BYTES * 8) + " bit"); // Trả về byte
        System.out.println("Có kích thước: " + Double.SIZE + " bit và " + (Double.SIZE / 8) + " byte"); // Trả về bit
        System.out.println("Giá trị tối thiểu kiểu double là: " + Double.MIN_VALUE);
        System.out.println("Giá trị tối đa kiểu double là: " + Double.MAX_VALUE);

        // 7. Kiểu char
        System.out.println("7. Kiểu char");
        System.out.println("Có kích thước: " + Character.BYTES + " byte và " + (Character.BYTES * 8) + " bit"); // Trả về byte
        System.out.println("Có kích thước: " + Character.SIZE + " bit và " + (Character.SIZE / 8) + " byte"); // Trả về bit
        System.out.println("Giá trị tối thiểu kiểu char là: " + (int)Character.MIN_VALUE);
        System.out.println("Giá trị tối đa kiểu char là: " + (int)Character.MAX_VALUE);
    }
}