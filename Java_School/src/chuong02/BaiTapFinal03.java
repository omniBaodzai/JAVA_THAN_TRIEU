package chuong02;

/**
 * Chương 02: Lập trình hướng đối tượng
 * Bài tập final 03: final với phương thức (Ngăn ghi đè)
 - Tạo lớp Animal có phương thức final void sound().
 - Tạo lớp Dog kế thừa Animal.
 - Thử ghi đè sound() trong Dog và xem lỗi biên dịch.
 */
// Lớp Animal
class Animal
{
    // Phương thức final, không thể bị ghi đè
    final void sound()
    {
        System.out.println("Animal makes a sound");
    }
}

// Lớp Dog kế thừa từ Animal
class Dog extends Animal
{
    // Cố gắng ghi đè phương thức sound() - sẽ gây lỗi biên dịch
    // @Override
    // void sound()
    // {
    //     System.out.println("Dog barks");
    // }
}
public class BaiTapFinal03
{
        public static void main(String[] args)
        {
            Dog dog = new Dog();
            // dog.sound(); // Lỗi sẽ xảy ra ở đây nếu phương thức sound() trong Dog được ghi đè
        }
}
