package chuong02;

/**
 * Chương 02: Lập trình hướng đối tượng
 * Ví dụ: Lớp và Object
 */
public class ViDuClassObject01
{
    // Method (Phương thức/Hành động/Hành vi của chiếc xe
    // Phương thức di chuyển
    public void move()
    {
        System.out.println("Chiếc xe đang di chuyển...");
    }

    // Phương thức dừng lại
    public void stop()
    {
        System.out.println("Chiếc xe đã dừng lại");
    }

    static public void main(String[] args)
    {
        // Field (Trường/Thuộc tính/Trạng thái/Dữ liệu) của chiếc xe
        String color = "Đỏ";  // Màu sắc của chiếc xe
        int speed = 60; // Tốc độ của chiếc xe

        // Tạo đối tượng của lớp ViDuClassObject01
        ViDuClassObject01 car = new ViDuClassObject01();

        // Sử dụng các phương thức của đối tượng car
        System.out.println("Màu sắc của chiếc xe là: " + color);
        System.out.println("Tốc độ của chiếc xe là: " + speed + " km/h");

        // Gọi các phương thức di chuyển và dừng lại
        car.move();
        car.stop();
    }
}
