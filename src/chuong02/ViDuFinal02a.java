package chuong02;

/**
 * Chương 02: Lập trình hướng đối tượng
 * Ví dụ: Từ khóa final với phương thức non-static
 * Phương thức final không thể bị ghi đè trong lớp con (subclass).
 */
public class ViDuFinal02a
{
    public static void main(String[] args)
    {
        class A
        {
            final void show()
            {
                System.out.println("Phương thức final của lớp A");
            }
        }

        // Không ghi đè phương thức final show() trong lớp con B
        class B extends A
        {
            /*
            Cố gắng ghi đè phương thức final show() trong lớp con B

            @Override
            void show()
            {
                System.out.println("Không thể ghi đè phương thức final trong lớp B");
            }
            */

        }

        // Tạo đối tượng của lớp A
        A a = new A();
        a.show(); // In ra: "Phương thức final của lớp A"

        // Tạo đối tượng của lớp B
        B b = new B();
        b.show(); // Vẫn in ra: "Phương thức final của lớp A"
    }
}
