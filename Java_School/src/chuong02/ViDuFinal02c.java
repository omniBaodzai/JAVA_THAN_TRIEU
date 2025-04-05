package chuong02;

/**
 * Chương 02: Lập trình hướng đối tượng
 * Ví dụ: Từ khóa final với phương thức non-static
 * Phương thức final không thể bị ghi đè trong lớp con (subclass).
 */
class Parent
{
    final void show()
    {
        System.out.println("This is a final method in Parent class.");
    }
}

class Child extends Parent
{
    // Lỗi: Không thể ghi đè phương thức final
    // void show() {
    //     System.out.println("Trying to override final method.");
    // }
}

public class ViDuFinal02c
{
    public static void main(String[] args)
    {
        Child c = new Child();
        c.show();  // Luôn gọi phương thức của lớp cha
    }
}
