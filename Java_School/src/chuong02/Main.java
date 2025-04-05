package chuong02;

/**
 * Chương 02: Lập trình hướng đối tượng
 * Bài tập final 05: Quản lý động vật trong vườn thú
 1. Tạo lớp DongVat với:
 - Một phương thức sound() để in ra tiếng động của động vật.
 - Một phương thức move() để in ra hành động di chuyển của động vật
 (ví dụ: "DongVat moves").
 - Một thuộc tính final là MAX_AGE để lưu tuổi thọ tối đa của động vật
 (giới hạn tuổi thọ của tất cả các động vật là 100 năm).
 2. Tạo lớp ConCho kế thừa từ lớp DongVat và ghi đè phương thức sound() để in
 ra "Woof woof!".
 3. Tạo lớp ConMeo kế thừa từ lớp DongVat và ghi đè phương thức sound() để in
 ra "Meow meow!".
 4. Cấm phương thức move() trong lớp DongVat bị ghi đè trong lớp con bằng từ
 khóa final.
 */

// Lớp DongVat có thể bị kế thừa
class DongVat
{  
    // Thuộc tính final
    public final int MAX_AGE = 100;

    // Phương thức sound() có thể được ghi đè
    public void sound()
    {
        System.out.println("Động vật phát ra tiếng động");
    }

    // Phương thức move() không thể bị ghi đè
    public final void move()
    {
        System.out.println("Động vật di chuyển");
    }
}

// Lớp ConCho kế thừa từ DongVat
class ConCho extends DongVat
{
    @Override
    public void sound()
    {
        System.out.println("Con chó sủa Woof woof!");
    }

    // Không cần ghi đè move() vì nó là final trong lớp cha
}

// Lớp ConMeo kế thừa từ DongVat
class ConMeo extends DongVat
{
    @Override
    public void sound()
    {
        System.out.println("Con mèo kêu Meow meow!");
    }

    // Không cần ghi đè move() vì nó là final trong lớp cha
}

public class Main
{
    public static void main(String[] args)
    {
        // Tạo đối tượng ConCho và ConMeo
        DongVat  cho = new ConCho();
        DongVat meo = new ConMeo();

        // Gọi các phương thức
        cho.sound();  // In ra "Woof woof!"
        cho.move();   // In ra "DongVat moves"
        meo.sound();  // In ra "Meow meow!"
        meo.move();   // In ra "DongVat moves"
    }
}
