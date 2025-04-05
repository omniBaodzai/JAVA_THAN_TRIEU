package chuong02;

/**
 * Chương 02: Lập trình hướng đối tượng
 * Ví dụ: Từ khóa final với phương thức static
 * Phương thức static không thể được ghi đè (overridden) trong lớp con theo
 cách tương tự như phương thức instance, vì phương thức static thuộc về lớp,
 không phải đối tượng.
 * Khi khai báo một phương thức static trong lớp con với cùng tên và cùng tham
 số, đó là một sự che khuất (hiding), không phải ghi đè.
 */
class A2
{
    static void show()
    {
        System.out.println("Phương thức static của lớp A");
    }
}

class B2 extends A2
{
    // Lớp B không thể ghi đè phương thức static, chỉ che khuất
    // Không có từ khóa @Override
    static void show()
    {
        System.out.println("Che khuất phương thức static trong lớp B");
    }
}

public class ViDuFinal02d
{
    public static void main(String[] args)
    {
        // Không cần tạo đối tượng của 2 lớp A và B
        /*
        Phương thức static là phương thức thuộc về lớp chứ không phải thuộc về
        đối tượng, do đó có thể gọi trực tiếp phương thức static bằng cách sử
        dụng tên lớp.
         */
        A2.show();  // In ra: "Phương thức static của lớp A"
        B2.show();  // In ra: "Che khuất phương thức static trong lớp B"
    }
}

