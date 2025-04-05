package chuong01.bien;

/**
 * Chương 01: Kỹ thuật lập trình Java
 * Ví dụ: Biến toàn cục
 */
class Car
{
    // Biến toàn cục (Instance Variable)
    String color; // Mỗi đối tượng Car sẽ có một bản sao riêng của biến này
    String model; // Biến toàn cục khác để lưu trữ kiểu xe

    // Phương thức setColor để gán giá trị cho biến color
    public void setColor(String color)
    {
        this.color = color;  // this.color là biến toàn cục (instance variable)
    }

    // Phương thức setModel để gán giá trị cho biến model
    public void setModel(String model)
    {
        this.model = model;
    }

    // Phương thức showColor để in ra màu của xe
    public void showColor()
    {
        System.out.println("The color of the car is " + color);
    }

    // Phương thức showModel để in ra kiểu xe
    public void showModel()
    {
        System.out.println("The model of the car is " + model);
    }
}

public class ViDuBienToanCuc01
{
    public static void main(String[] args)
    {
        // Tạo đối tượng Car đầu tiên
        Car car1 = new Car();
        car1.setColor("Red");
        car1.setModel("Toyota");

        // Tạo đối tượng Car thứ hai
        Car car2 = new Car();
        car2.setColor("Blue");
        car2.setModel("Honda");

        // Hiển thị thông tin về xe
        car1.showColor();  // In ra "The color of the car is Red"
        car1.showModel();  // In ra "The model of the car is Toyota"

        car2.showColor();  // In ra "The color of the car is Blue"
        car2.showModel();  // In ra "The model of the car is Honda"
    }
}

