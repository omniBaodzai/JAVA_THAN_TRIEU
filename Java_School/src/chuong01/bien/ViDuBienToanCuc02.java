package chuong01.bien;

/**
 * Chương 01: Kỹ thuật lập trình Java
 * Ví dụ: Biến toàn cục với constructor
 */
class Cars
{
    // Biến toàn cục (Instance Variable)
    String color;
    String model;

    // Phương thức khởi tạo (Constructor)
    public Cars(String color, String model)
    {
        this.color = color;
        this.model = model;
    }

    // Phương thức showColor để in ra màu của xe
    public void showColor()
    {
        System.out.println("The color of the Cars is " + color);
    }

    // Phương thức showModel để in ra kiểu xe
    public void showModel()
    {
        System.out.println("The model of the Cars is " + model);
    }
}

public class ViDuBienToanCuc02
{
    public static void main(String[] args)
    {
        // Tạo đối tượng Cars và truyền tham số vào phương thức khởi tạo
        Cars Cars1 = new Cars("Red", "Toyota");
        Cars Cars2 = new Cars("Blue", "Honda");

        // Hiển thị thông tin về xe
        Cars1.showColor();  // In ra "The color of the Cars is Red"
        Cars1.showModel();  // In ra "The model of the Cars is Toyota"

        Cars2.showColor();  // In ra "The color of the Cars is Blue"
        Cars2.showModel();  // In ra "The model of the Cars is Honda"
    }
}
