package chuong02;

/**
 * Chương 02: Lập trình hướng đối tượng
 * Ví dụ: Từ khóa final với phương thức non-static
 * Phương thức final không thể bị ghi đè trong lớp con (subclass).
 */
class A
{
    void show()
    {
        System.out.println("Phương thức show() của lớp A");
    }
}

class B extends A
{
    @Override
    void show()
    {
        System.out.println("Ghi đè phương thức show() trong lớp B");
    }
}

public class ViDuFinal02b
{
    public static void main(String[] args)
    {
        // Tạo đối tượng của lớp A
        A obj1 = new A();
        obj1.show(); // In ra: "Phương thức show() của lớp A"

        // Tạo đối tượng của lớp B
        B obj2 = new B();
        obj2.show();  // In ra: "Ghi đè phương thức show() trong lớp B"
    }
}
