package chuong02;

/**
 * Chương 02: Lập trình hướng đối tượng
 * Ví dụ: Tạo một lớp Computer để mô tả một chiếc máy tính có:
 - Thuộc tính: Màu sắc, dung lượng RAM,...
 - Phương thức: Bật máy, tắt máy,...
 */
class Computer
{
    // Các thuộc tính của máy tính
    private String color; // Màu sắc của máy tính
    private int memorySize; // Dung lượng bộ nhớ
    private boolean isOn; // Trạng thái bật tắt của máy tính

    // Contructor để khởi tạo đối tượng ViDuLopComputer
    Computer(String color, int memorySize)
    {
        this.color = color; // Gán màu sắc cho máy tính
        this.memorySize = memorySize; // Gán dung lượng bộ nhớ cho máy tính
        this.isOn = false; // Mặc định máy tính ở trạng thái tắt
    }

    // Phương thức để bật máy tính
    public void turnOn()
    {
        if (!isOn)
        {
            isOn = true;
            System.out.println("Máy tính đã được bật");
        }
        else
        {
            System.out.println("Máy tính đã bật sẵn rồi");
        }
    }

    // Phương thức để tắt máy tính
    public void turnOff()
    {
        if(isOn)
        {
            isOn = false;
            System.out.println("Máy tính đã tắt");
        }
        else
        {
            System.out.println("máy tính đã tắt sẵn rồi");
        }
    }
    
    // Phương thức để hiện thị thông tin máy tính
    public void displayInfo()
    {
        System.out.println("Màu sắc: " + color);
        System.out.println("Dung lượng bộ nhớ: " + memorySize);
        System.out.println("Trạng thái máy tính: " + (isOn ? "Đang bật" : "Đang tắt"));
    }
}

public class ViDuLopComputer
{
    public static void main(String[] args)
    {
        // Tạo đối tượng máy tính thứ nhất với màu sắc và dung lượng bộ nhớ
        Computer myComputer1 = new Computer("Đen", 16);

        // Tạo đối tượng máy tính thứ thứ hai với màu sắc và dung lượng bộ nhớ
        Computer myComputer2 = new Computer("Đỏ", 32);
        
        // Hển thị thông tin của máy tính thứ nhất
        myComputer1.displayInfo();

        // Hển thị thông tin của máy tính thứ hai
        myComputer2.displayInfo();
        
        // Bật máy tính thứ nhất
        myComputer1.turnOn();
        
        // Tắt máy tính thứ nhất
        myComputer1.turnOff();

        // Bật máy tính thứ hai
        myComputer2.turnOn();

        // Tắt máy tính thứ hai
        myComputer2.turnOff();
    }
}
